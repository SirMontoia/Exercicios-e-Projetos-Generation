/*create table personagem(
id int primary key auto_increment,
nome varchar (500),
hpMax int (3),
ataque int (8),
defesa int (8),
classe_id int,
foreign key (classe_id) references classe (idClasse)
);*/

/*create table classe(
idClasse int primary key auto_increment,
Espécie varchar (50),
passiva varchar (50)
);*/

/*insert into classe (Espécie, passiva)  values 
( "Orc", "Fervor"),
( "Elfo", "Valsa lunar"),
( "Humano", "Constituição"),
( "Skeelag", "Rabo venenoso"),
( "Phyrlax", "Mecânica amaldiçoada")*/

/*insert into personagem (nome, hpMax, ataque, defesa, classe_id) values
("Vartimarthras", 30, 3000, 4000, 5),
("DOOK", 50, 2500, 6000, 1),
("Vlanis", 25, 7500, 1500, 2),
("Phry'nax", 30, 3000, 5600, 4),
("Vartimarthras2", 30, 3000, 4000, 5),
("Rogério", 35, 1000, 6500, 3),
("Maria", 30, 3000, 4400, 3),
("Tru'na", 45, 1000, 9000, 2);*/

/*select * from personagem where ataque >2000;*/

/*select * from personagem where defesa >1000 and defesa <2000;*/

/*select * from personagem where nome like "%C%"*/

/*select * from classe inner join personagem on classe.idClasse = personagem.classe_id;*/

/*select * from classe inner join personagem on classe.idClasse = personagem.classe_id where Espécie = "Humano";*/








