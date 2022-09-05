create table sys_user
(
    id             bigint unsigned auto_increment
        primary key,
    user_name      varchar(20)                         not null,
    user_detail_id bigint unsigned,
    group_id       bigint unsigned                     not null,
    password       varchar(50)                         not null,
    phone_number   varchar(50)                         not null,
    c_time         timestamp default CURRENT_TIMESTAMP null,
    u_time         timestamp default CURRENT_TIMESTAMP null on update CURRENT_TIMESTAMP
);

create table sys_role
(
    id        bigint unsigned auto_increment
        primary key,
    role_name varchar(20)                         not null,
    c_time    timestamp default CURRENT_TIMESTAMP null,
    u_time    timestamp default CURRENT_TIMESTAMP null on update CURRENT_TIMESTAMP
);


create table sys_user_role
(
    id      bigint unsigned auto_increment
        primary key,
    role_id bigint unsigned                     not null,
    user_id bigint unsigned                     not null,
    c_time  timestamp default CURRENT_TIMESTAMP null,
    u_time  timestamp default CURRENT_TIMESTAMP null on update CURRENT_TIMESTAMP
);

create table user_file
(
    id        bigint unsigned auto_increment
        primary key,
    user_id   bigint unsigned                     not null,
    file_name varchar(20)                         not null,
    c_time    timestamp default CURRENT_TIMESTAMP null,
    u_time    timestamp default CURRENT_TIMESTAMP null on update CURRENT_TIMESTAMP
);

create table user_detail
(
    id          bigint unsigned auto_increment
        primary key,
    detail_info varchar(20)                         not null,
    c_time      timestamp default CURRENT_TIMESTAMP null,
    u_time      timestamp default CURRENT_TIMESTAMP null on update CURRENT_TIMESTAMP
);

