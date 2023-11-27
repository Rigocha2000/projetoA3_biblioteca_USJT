create table tb_livro(
idLivro int primary key auto_increment,
genero varchar (70),
autor varchar (70),
titulo varchar (70),
notaMedia decimal (3,1),
fk_IdUser int,
foreign key (FK_IdUser) references tb_usuario (IdUser) 
);
