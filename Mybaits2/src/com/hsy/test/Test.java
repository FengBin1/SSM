package com.hsy.test;

import java.io.IOException;
import java.util.List;

import com.hsy.mapper.OrderMapper;
import com.hsy.pojo.*;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.hsy.mapper.UserMapper;

public class Test {

    public static void main(String[] args) {
//        初振博
        try {
            SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(Resources.getResourceAsStream("config/SqlMapConfig.xml"));
            SqlSession session = factory.openSession();
            //获取订单的映射接口代理对象
            OrderMapper orderMapper = session.getMapper(OrderMapper.class);
            //调用方法查询订单并且关联查询该订单的用户
            List<TOrderCustomer> ocs = orderMapper.findOrderAndUser();
            //编写循环遍历集合
            System.out.println("订单信息:");
            for (TOrderCustomer oc : ocs) {
                System.out.println(oc);
            }

            List<TorderAndUser> taus = orderMapper.findOrderAndUserMap();
            for (TorderAndUser tau : taus) {
                System.out.println("订单信息:");
                System.out.println(tau);
                //获取该订单的用户信息
                TUser user = tau.getUser();
                System.out.println("产生该订单的用户：");
                System.out.println(user);
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
