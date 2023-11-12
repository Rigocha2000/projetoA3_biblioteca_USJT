CREATE DATABASE db_biblioteco;
use db_biblioteco;

create table tb_usuario(
idUser int primary key auto_increment,
nome varchar (70),
sexo varchar (40),
idade int,
login varchar (100),
senha varchar (100),
email varchar(100),
favRomance boolean,
favFiccao boolean,
favTecnico boolean,
constraint Usuario unique (login),
admin boolean
);

insert into tb_usuario (login, senha, admin) values ('admin', 'admin', true);

select * from tb_usuario;