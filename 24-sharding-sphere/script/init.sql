create table hello_spring_boot.sys_user
(
    id             bigint unsigned                     not null
        primary key,
    user_name      varchar(20)                         not null,
    user_detail_id bigint unsigned                     null,
    group_id       bigint unsigned                     not null,
    password       varchar(50)                         not null,
    phone_number   varchar(50)                         not null,
    c_time         timestamp default CURRENT_TIMESTAMP null,
    u_time         timestamp default CURRENT_TIMESTAMP null on update CURRENT_TIMESTAMP
);

create table hello_spring_boot_2.sys_user
(
    id             bigint unsigned                     not null
        primary key,
    user_name      varchar(20)                         not null,
    user_detail_id bigint unsigned                     null,
    group_id       bigint unsigned                     not null,
    password       varchar(50)                         not null,
    phone_number   varchar(50)                         not null,
    c_time         timestamp default CURRENT_TIMESTAMP null,
    u_time         timestamp default CURRENT_TIMESTAMP null on update CURRENT_TIMESTAMP
);