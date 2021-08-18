insert into t_funcionario  values
(null, "Lucas", "Desenvolvedor", "25", "5000"),
(null, "Julio", "Desenvolvedor", "26", "4000"),
(null, "João", "Desenvolvedor", "33", "1200"),
(null, "Maria", "Desenvolvedora", "28", "5000"),
(null, "Thabata", "Gerente Geral", "30", "5000");

select * from t_funcionario;
select * from t_funcionario where salario >2000;

update t_funcionario set salario = "7000" where idFuncionario = 3;




