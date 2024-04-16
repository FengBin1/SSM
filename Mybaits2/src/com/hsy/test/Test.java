package com.hsy.test;

import java.io.IOException;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.hsy.mapper.UserMapper;
import com.hsy.pojo.TItem;
import com.hsy.pojo.TOrderAndOrderdetails;
import com.hsy.pojo.TOrderdetailAndItem;
import com.hsy.pojo.TUserAndOrders;

public class Test {

    public static void main(String[] args) {
        try {
            SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(Resources.getResourceAsStream("config/SqlMapConfig.xml"));
            SqlSession session = factory.openSession();
            //获取订单的映射接口代理对象
//			OrderMapper orderMapper = session.getMapper(OrderMapper.class);
//			//调用方法查询订单并且关联查询该订单的用户
//			List<TOrderCustomer> ocs = orderMapper.findOrderAndUser();
//			//编写循环遍历集合
//			System.out.println("订单信息:");
//			for(TOrderCustomer oc:ocs){
//				System.out.println(oc);
//			}

//			List<TorderAndUser> taus = orderMapper.findOrderAndUserMap();
//			for(TorderAndUser tau:taus){
//				System.out.println("订单信息:");
//				System.out.println(tau);
//				//获取该订单的用户信息
//				TUser user = tau.getUser();
//				System.out.println("产生该订单的用户：");
//				System.out.println(user);
//			}
//冒泡排序

            //获取用户的映射接口
            UserMapper userMapper = session.getMapper(UserMapper.class);
//			List<TUserAndOrders> taos = userMapper.findUserAndOrders();
//			for(TUserAndOrders tao:taos){
//				System.out.println("用户信息:");
//				System.out.println(tao);
//				//获取该用户产生的订单集合
//				List<TOrder> orders = tao.getOrders();
//				System.out.println("该用户产生的订单:");
//				for(TOrder order:orders){
//					System.out.println(order);
//				}
//			}

            List<TUserAndOrders> taos = userMapper.findUserAndOrderAndDetailsAndItem();
            for(TUserAndOrders tao:taos){
                System.out.println("用户信息:");
                System.out.println(tao);
                //获取该用户产生的订单
                List<TOrderAndOrderdetails> toaos = tao.getToaos();
                System.out.println("该用户产生的订单:");
                for(TOrderAndOrderdetails toao:toaos){
                    System.out.println(toao);
                    //获取每一个订单的详情
                    List<TOrderdetailAndItem> toais = toao.getToais();
                    System.out.println("该订单的详情信息：");
                    for(TOrderdetailAndItem toai:toais){
                        System.out.println(toai);
                        //获取该订单详情中的商品信息
                        TItem item = toai.getItem();
                        System.out.println("订单详情中的商品：");
                        System.out.println(item);
                    }
                }
            }
            session.close();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

}
