create database db_biblioteco;
use db_biblioteco;

create table tb_login(
    id int primary key auto_increment,
    login varchar(200),
    senha varchar(200),
    email varchar(200),
    isAdmin boolean,
    isSuperAdmin boolean
);

insert into tb_login (login, senha, email, isAdmin, isSuperAdmin) values ('admin', 'admin', 'admin@biblioteco.com', true, true);

select * from tb_login;

#update tb_login
#set isSuperAdmin = false 
#where id=1;