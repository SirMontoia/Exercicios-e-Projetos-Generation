-- create database db_cidade_das_frutas
-- use db_cidade_das_frutas


/*create table categoria (
id int primary key auto_increment,
tipoproduto varchar (50),
origemproduto varchar (50)
);

create table produto (
nome varchar (50),
preco int (3),
estoque int (4),
descontocadastro boolean,
datadevalidade varchar (12),
relacional int not null,
foreign key (relacional) references categoria (id)
);

insert into categoria (tipoproduto, origemproduto) values
("Fruta", "importado"),
("Verdura", "caseiro"),
("Variado", "caseiro"),
("Prato pronto", "atacado"),
("Petisco de fruta", "caseiro");

insert into produto (nome, preco, estoque, descontocadastro, datadevalidade, relacional) values
("Alface", 30, 350, true, "12.05.2022", 2),
("Salada mista", 70, 10, false, "12.09.2018", 3),
("Rúcula", 10, 110, true, "09.03.2023", 2),
("Mix de frutas", 90, 12, true, "07.09.2021", 3),
("Salada Ceasar", 20, 17, true, "11.02.2022", 4),
("Beterraba", 27, 200, true, "10.02.2021", 2),
("Jabuticaba", 5, 100, false, "12.08.2022", 1),
("Banana chips", 20, 200, true, "12.05.2022", 5);

select * from produto where preco>50;

select * from produto where preco>3 and preco <60;

select * from produto where nome  like "%C%";*/

-- select * from categoria inner join produto on categoria.id = produto.relacional;

select * from categoria inner join produto on categoria.id = produto.relacional where tipoproduto = "Verdura";

