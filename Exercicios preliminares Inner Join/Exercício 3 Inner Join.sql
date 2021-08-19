-- create database db_farmacia_do_bem

 -- use db_farmacia_do_bem;
 
/*create table categoria(
 id int primary key auto_increment,
 tipoGenerico boolean,
 tipoRemédio varchar (50)
 );
 
 create table produto (
 nome varchar (50),
 estoque int (3),
 preco int (3),
 comorbidade varchar (50),
 Via varchar (50),
 id_categoria int not null,
 foreign key (id_categoria) references categoria (id)
 );
 
 
 insert into categoria (tipoGenerico, tipoRemédio) values
 (true, "Ativo"),
 (true, "Fora de Mercado"),
 (false, "Fora de Mercado"),
 (true, "Ativo"),
 (true, "Ativo")*/
 
 /*insert into produto (nome, estoque, preco, comorbidade, Via, id_categoria) values
 ("Tylenol", "5", "100", "Dor de cabeça", "Oral", 3),
 ("Paracetamol", "10", "10", "Dor nas costas", "Cápsula", 3),
 ("Tylenol", "13", "50", "Dor de cabeça", "Oral", 1),
 ("Tylenol", "5", "100", "Dor de cabeça", "Oral", 4),
 ("Tylenol", "130", "1000", "Dor de cabeça", "Gel", 3),
 ("Tylenol", "5", "100", "Dor de cabeça", "Oral", 2),
 ("Buscopan", "5", "100", "Dor abdominal", "Oral", 1),
 ("Clonazepam", "20", "1", "Remédio para dormir", "Cápsula", 2);*/
 
 -- select * from produto where preco >50;
 
 -- select *  from produto where preco>3 and preco<60;	
 
 -- select * from produto where nome  like  "%B%";
 
 -- select * from categoria inner join produto on categoria.id = produto.id_categoria;
 
 -- select * from categoria inner join produto on categoria.id = produto.id_categoria where comorbidade = "Dor de Cabeça";
 
 
 
 
 
 
 
 
 

 