create table tb_avaliacao(
fk_IdUser int,
foreign key (FK_IdUser) references tb_usuario (IdUser),
fk_IdLivro int,
foreign key (FK_IdLivro) references tb_livro (IdLivro),
nota decimal (2,1),
idAvaliacao int primary key auto_increment
);
