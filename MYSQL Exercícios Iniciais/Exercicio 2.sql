create table produtos (
idProduto int primary key auto_increment,
nome varchar (20),
categoria varchar (20),
preço decimal (20),
estoque int (3)
);

insert into produtos values 
(null, "Alface", "Hortifruti", "3", "50"),
(null, "Cookies", "Doces", "5", "20"),
(null, "Lâmpada", "Eletrônicos", "3.50", "60"),
(null, "Escada", "Casa e afins", "10  ", "10"),
(null, "Escova", "Higiene", "7", "20"),
(null, "CremeFacial", "Cosméticos", "20", "15"),
(null, "Guiness", "Entretenimento", "600", "15"),
(null, "Sekiro", "Entretenimento", "130 ", "2");

select * from produtos;

select * from produtos where preço>500;

select * from produtos where preço<500;

update produtos set nome = "Escova de Dente" where idProduto= "5";