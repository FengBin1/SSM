create table t_order
(
    id         int auto_increment
        primary key,
    t_number   varchar(100) null,
    createtime datetime     null,
    note       varchar(255) null,
    user_id    int          not null
)
    charset = utf8mb3;

INSERT INTO hsy.t_order (id, t_number, createtime, note, user_id)
VALUES (1, 'A00001', '2024-04-01 13:15:55', '张三的订单', 1);
INSERT INTO hsy.t_order (id, t_number, createtime, note, user_id)
VALUES (2, 'A00002', '2024-04-01 13:16:33', '张三的第二个订单', 1);
INSERT INTO hsy.t_order (id, t_number, createtime, note, user_id)
VALUES (3, 'A00003', '2024-04-01 13:16:51', '李四的第一个订单', 2);
