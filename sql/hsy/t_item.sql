create table t_item
(
    id         int auto_increment
        primary key,
    name       varchar(100) not null,
    price      int          null,
    detail     varchar(255) null,
    createtime datetime     null
)
    charset = utf8mb3;

INSERT INTO hsy.t_item (id, name, price, detail, createtime)
VALUES (1, '笔记本电脑', 10000, '外星人', '2024-04-01 13:15:30');
INSERT INTO hsy.t_item (id, name, price, detail, createtime)
VALUES (2, '鼠标', 200, '外星人', '2024-04-01 13:15:43');
