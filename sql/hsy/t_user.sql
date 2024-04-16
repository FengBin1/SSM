create table t_user
(
    id       int auto_increment
        primary key,
    name     varchar(32)  not null,
    birthday date         null,
    sex      varchar(6)   null,
    address  varchar(255) null
)
    charset = utf8mb3;

INSERT INTO hsy.t_user (id, name, birthday, sex, address)
VALUES (1, '张三', '2024-04-01', '男', '哈尔滨');
INSERT INTO hsy.t_user (id, name, birthday, sex, address)
VALUES (2, '李四', '2024-04-01', '女', '哈尔滨');
