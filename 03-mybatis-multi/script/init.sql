create table hello_spring_boot.sys_user
(
    id           bigint unsigned auto_increment
        primary key,
    user_name    varchar(20)                         not null,
    group_id     bigint unsigned                     not null,
    password     varchar(50)                         not null,
    phone_number varchar(50)                         not null,
    c_time       timestamp default CURRENT_TIMESTAMP null,
    u_time       timestamp default CURRENT_TIMESTAMP null on update CURRENT_TIMESTAMP
);
create table hello_spring_boot_2.sys_user
(
    id           bigint unsigned auto_increment
        primary key,
    user_name    varchar(20)                         not null,
    group_id     bigint unsigned                     not null,
    password     varchar(50)                         not null,
    phone_number varchar(50)                         not null,
    c_time       timestamp default CURRENT_TIMESTAMP null,
    u_time       timestamp default CURRENT_TIMESTAMP null on update CURRENT_TIMESTAMP
);

INSERT INTO hello_spring_boot.sys_user (id, user_name, group_id, password, phone_number, c_time, u_time)
VALUES (1, 'tcoding1', 1, '12', '12', '2022-08-27 19:58:38', '2022-08-27 22:23:11');
INSERT INTO hello_spring_boot_2.sys_user (id, user_name, group_id, password, phone_number, c_time, u_time)
VALUES (1, 'tcoding2', 1, '12',
        '12', '2022-08-27 19:58:38', '2022-08-27 22:23:11');


