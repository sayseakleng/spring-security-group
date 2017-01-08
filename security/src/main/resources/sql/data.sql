insert into users(username, password, enabled) values ('user', '123', 1);
insert into groups values('USERS');
insert into group_authorities(group_id, authority) values (1, 'USER');
insert into group_members(group_id, username) values( 1, 'user');