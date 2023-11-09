use db_biblioteco;

create table Usuario(
IdUser int primary key auto_increment,
Nome varchar (70),
Sexo varchar (40),
idade int,
Login varchar (100),
Senha varchar (100),
Email varchar(100),
FavRomance boolean,
FavFiccao boolean,
FavTecnico boolean,
constraint Usuario unique (Login),
Admin boolean
);

insert into Usuario (Login, Senha, Admin) values ('admin', 'admin', true);

select * from Usuario;