use db_bibiotecos;

create table livro(
IdLivro int primary key auto_increment,
Genero varchar (70),
Autor varchar (70),
Titulo varchar (70),
NotaMedia decimal (2,1),
FK_IdUser int,
foreign key (FK_IdUser) references Usuario (IdUser) 
);
