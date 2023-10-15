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
 
 update tb_usuario set nome = "Tio Henrique"
 where id = 2;
 delete from tb_usuario where id = 1;
 delete from tb_usuario where id = 2;
 delete from tb_usuario where id = 5;
 
 create table Produtos (
 IDProduto Int Primary Key,
 NomeProduto varchar(100),
 Preco decimal(10,2)
 );
 
 insert into Produtos (IDProduto, NomeProduto,Preco) values (1, "Panela", 20.99);
 insert into Produtos (IDProduto, NomeProduto, Preco) values (2, "Garfo", 5.99);
 insert into Produtos (IDProduto, NomeProduto,Preco) values (3, "Faca", 7.99);
 insert into Produtos (IDProduto, NomeProduto,Preco) values (4, "Frigideira", 23.99);
 
 select all *  from Produtos;
  
 create table Vendas(
 IdVenda int primary key,
 DataVenda Date,
 IDProduto int,
 QuantidadedeVendida int
 );
 
 insert into Vendas (IdVenda, DataVenda,IDProduto, QuantidadedeVendida) values (1, "2023-05-10", 1, 1);
 insert into Vendas (IdVenda, DataVenda, IDProduto, QuantidadedeVendida) values (2, "2023-05-10", 2, 6);
 insert into Vendas (IdVenda, DataVenda,IDProduto, QuantidadedeVendida) values (3, "2023-05-10", 3,  6);
 insert into Vendas (IdVenda, DataVenda,IDProduto, QuantidadedeVendida) values (4, "2023-05-10", 4, 2);
 
 select all * from Vendas;
 

