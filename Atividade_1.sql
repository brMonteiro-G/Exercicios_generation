create database tb_rh ;

use tb_rh ; 

create table tb_funcionarios (

Id bigint (5) auto_increment, 
Nome varchar(20) not null, 
Salario bigint(6) not null, 
Funcao varchar(20) not null, 
area varchar(20) not null,
Formacao varchar(20) not null, 
primary key(Id)
);

select * from tb_funcionarios;

insert into tb_funcionarios(Nome,Salario,Funcao,area,Formacao) values
( "Gabriel Monteiro" , 5400 , "Gerente de projetos" , "Engenharia" , "Superior" ),
( "Victor Ubatuba " , 12000 , "CEO" , "Executivo" , "Pós graduação" ),
( "Natália Del rey " , 7000 , "Gerente de projetos" , " Finanças" , "Superior" ),
( "Gabriel Sousa" , 1500 , "Estagiário" , "Administração" , "Superior" );

select * from tb_funcionarios;

select * from tb_funcionarios where Salario > 2000;
select * from tb_funcionarios where Salario < 2000;