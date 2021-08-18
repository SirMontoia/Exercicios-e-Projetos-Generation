/*Crie um banco de dados para um registro de uma escola, onde o sistema trabalhará com as
informações dos estudantes deste registro dessa escola.
Crie uma tabela estudantes e utilizando a habilidade de abstração e determine 5 atributos
relevantes dos estudantes para se trabalhar com o serviço dessa escola.

Popule esta tabela com até 8 dados;
Faça um select que retorne o/as estudantes com a nota maior do que 7.
Faça um select que retorne o/as estudantes com a nota menor do que 7.
Ao término atualize um dado desta tabela através de uma query de atualização.
salve as querys para cada uma dos requisitos o exercício em um arquivo .SQL ou texto e
coloque no seu GitHuB pessoal e compartilhe esta atividade.*/



/*create database registroEscola*/

create table estudantes (
idTurma int primary key auto_increment,
nome varchar (20),
sala int (3),
nota int (2),
professor varchar (20)
);

insert into estudantes values
(null, "Juca", "10", "8", "Thiago"),
(null, "Leonardo", "12", "9", "Thiago"),
(null, "Angela", "16", "7", "Mario"),
(null, "Fernando", "20", "4", "Fernanda"),
(null, "Fernanda", "19", "6", "Andreia"),
(null, "Vladimir", "9", "6", "Andreia"),
(null, "Yona", "18", "10", "Thiago"),
(null, "Ian", "11", "9", "Fernanda");

select * from estudantes;


select * from estudantes where nota >7;

select * from estudantes where nota<7;

update estudantes set sala = "9" where idTurma = "1";