drop table if exists book;
create table  book
(
    id   bigint auto_increment primary key,
    name varchar(50) default ''
);