create database db_sistema_academico;
use db_sistema_academico;

create table tb_usuario (
	id int primary key auto_increment,
	nome varchar(200),
	senha varchar(200),
	email varchar(200),
    cidade varchar(200)
);
insert into tb_usuario (nome, senha, email) values ('admin', 'admin', 'admin@123');
insert into tb_usuario (nome, senha, email) values ('Tio Patinhas', 'moedas', 'patinhas@123');
insert into tb_usuario (nome, senha, email) values ('Jose', 'jose', 'jose@123');

 alter table tb_usuario add cidade varchar(200);
 select all * from tb_usuario;
 
 alter table tb_usuario rename column cidade 
 to cidade_nova;
 alter table tb_usuario drop column cidade_nova;
