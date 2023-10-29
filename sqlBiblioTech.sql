create database db_biblioteco;
use db_biblioteco;

create table tb_login(
    id int primary key auto_increment,
    login varchar(200),
    senha varchar(200),
    email varchar(200),
    isAdmin boolean
);

insert into tb_login (login, senha, email, isAdmin) values ('admin', 'admin', 'admin@biblioteco.com', true);

select * from tb_login;