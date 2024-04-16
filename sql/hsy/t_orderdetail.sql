create table t_orderdetail
(
    id       int auto_increment
        primary key,
    order_id int not null,
    item_id  int not null,
    item_num int not null
)
    charset = utf8mb3;

INSERT INTO hsy.t_orderdetail (id, order_id, item_id, item_num)
VALUES (1, 1, 1, 1);
INSERT INTO hsy.t_orderdetail (id, order_id, item_id, item_num)
VALUES (2, 1, 2, 1);
INSERT INTO hsy.t_orderdetail (id, order_id, item_id, item_num)
VALUES (3, 2, 2, 1);
INSERT INTO hsy.t_orderdetail (id, order_id, item_id, item_num)
VALUES (4, 3, 1, 1);
