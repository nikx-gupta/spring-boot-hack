insert into USERS(USERNAME, PASSWORD, ENABLED) values('nikx','{noop}demo',true);
insert into USERS(USERNAME, PASSWORD, ENABLED) values('alien','{noop}demo',true);

insert into AUTHORITIES(USERNAME, AUTHORITY)values ('alien', 'GUEST');
insert into AUTHORITIES(USERNAME, AUTHORITY)values ('nikx', 'ADMIN');
