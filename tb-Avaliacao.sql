use db_bibliotecos;

create table Avaliacao(
FK_IdUser int,
foreign key (FK_IdUser) references Usuario (IdUser),
FK_IdLivro int,
foreign key (FK_IdLivro) references Livro (IdLivro),
Nota decimal (2,1),
IdAvaliacao int primary key auto_increment
);
