-- create database db_pizzaria_legal

/*create table categoria (
id int primary key auto_increment,
tipo varchar (50),
cozimento varchar (50)
);

create table pizza (
nome varchar (50),
preco varchar(3),
tamanho varchar (1),
bordarecheada boolean,
queijoextra varchar (1),
id_categoria int not null,
foreign key (id_categoria) references categoria (id) 
);

insert into categoria (tipo, cozimento) values
("Portuguesa", "Forno a lenha"),
("Calabresa", "Microondas"),
("Abobrinha", "Microondas"),
("Anchova", "Forno a lenha"),
("Brigadeiro", "Forno a lenha");


insert into pizza (nome, preco, tamanho, bordarecheada, queijoextra, id_categoria) values
("Salgada", 20, "G", true, true, 1),
("Salgada", 50, "P", false, false, 4),
("Salgada", 60, "M", true, false, 3),
("Salgada", 50, "P", false, true, 2),
("Salgada", 50, "P", false, true, 1),
("Doce", 50, "P", false, false, 5),
("Doce", 50, "P", true, false, 5),
("Salgada", 50, "P", true, true, 4);*/


-- select * from pizza where preco > 45;

-- select * from pizza where preco > 29 and preco < 60;

-- select * from categoria where tipo like "%C%";

-- select * from categoria inner join pizza on categoria.id = pizza.id_categoria;

-- select * from categoria inner join pizza on categoria.id = pizza.id_categoria where tipo = "Brigadeiro";




