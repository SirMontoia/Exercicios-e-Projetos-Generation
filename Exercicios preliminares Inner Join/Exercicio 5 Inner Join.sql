-- create database db_construindo_a_nossa_vida;
-- use db_construindo_a_nossa_vida;

/*create table categoria (
id int primary key auto_increment,
tipoproduto varchar (50),
lojadisponivel int (2)
);

create table produto (
areauso varchar (30),
preco decimal (30),
estoque int (4),
pesoemkg int (4),
descontodiario boolean,
relacional int not null,
foreign key (relacional) references categoria (id)
);

insert into categoria (tipoproduto, lojadisponivel) values
("Azulejo", 02),
("Ácido para construção", 02),
("Ácido para construção", 01),
("Azulejo", 01),
("Fiação", 01);

insert into produto (areauso, preco, estoque, pesoemkg, descontodiario, relacional) values
("Banheiro", 0.80, 100, 0.1, true, 1),
("Cozinha", 0.50, 120, 0.2, true, 4),
("Cozinha", 0.20, 50, 0.1, false, 5),
("Banheiro", 70, 27, 10, true, 1),
("Cozinha", 0.80, 75, 0.1, true, 3),
("Portão de saída", 1.20, 50, 1, false, 5),
("Banheiro", 100, 25, 0.1, true, 2),
("Cozinha", 0.80, 100, 0.1, true, 1);

select * from produto where preco>50;

select * from produto where preco>3 and preco<60;

select * from produto where areauso like "%C%";

select * from categoria inner join produto on categoria.id = produto.relacional*/

select * from categoria inner join produto on categoria.id = produto.relacional where tipoproduto = "Fiação";







