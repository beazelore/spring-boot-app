--liquibase formatted sql

--changeset User2:2
insert into test2 (id, name) values (1, 'User1');