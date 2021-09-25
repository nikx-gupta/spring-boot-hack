drop table IF exists users;
drop table IF exists AUTHORITIES;

create table users
(
    username varchar_ignorecase(50)  not null primary key,
    password varchar_ignorecase(200) not null,
    enabled  boolean                 not null
);

create table AUTHORITIES
(
    username varchar_ignorecase(50) not null primary key,
    AUTHORITY     varchar_ignorecase(50) not null,
    constraint fk_auth_user foreign key (username) references users (username)
)