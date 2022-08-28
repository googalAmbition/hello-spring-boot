create table sys_user
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



