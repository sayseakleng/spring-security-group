create table users(
      username varchar(50) not null primary key,
      password varchar(50) not null,
      enabled bit not null);

create table groups (
  id bigint identity(1, 1) primary key,
  group_name varchar (50) not null);

create table group_authorities (
  group_id bigint not null,
  authority varchar(50) not null,
  constraint fk_group_authorities_group foreign key(group_id) references groups(id));

create table group_members (
  id  bigint identity(1, 1) primary key,
  username varchar(50) not null,
  group_id bigint not null,
  constraint fk_group_members_group foreign key(group_id) references groups(id));
        