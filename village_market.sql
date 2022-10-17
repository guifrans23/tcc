/*
@author: guifrans
@data: 17/10/2022
@version: 1.0

@describe: 
*/
-- criar banco
create database village_market;
-- usar banco 
use village_market;
/* ====================tabel usuario======================*/

create table usuarios(
idusu int primary key auto_increment,
usuario varchar (50) not null,
login varchar (10) not null unique,
senha varchar (255) not null,
perfil varchar (255) not null
);

-- descrever tabela 
describe usuarios;

-- add user na tabela
insert into  usuarios(usuario,login,senha,perfil)
values('Administrador','admin',md5('admin'),'admin');

insert into  usuarios(usuario,login,senha,perfil)
values('gabriel','gabriel',md5('123@senac'),'user');

insert into  usuarios(usuario,login,senha,perfil)
values('july','july',md5('123@senac'),'user');

insert into  usuarios(usuario,login,senha,perfil)
values('gabriela','alex',md5('123@senac'),'user');

insert into  usuarios(usuario,login,senha,perfil)
values('guilherme','guifrans',md5('123@senac'),'admin');

insert into  usuarios(usuario,login,senha,perfil)
values('emanoel','emanoel',md5('123@senac'),'user');

-- selecionar usuarios
select * from usuarios;

/* ======================= fornecedores =====================*/

create table fornecedores (
	idfor int primary key auto_increment,
    cnpj varchar(20) not null unique,
    ie varchar(20) unique,
    im varchar(20) unique,
    razao varchar(50) not null,
    fantasia varchar(50) not null,
    site varchar(50),
    fone varchar(15) not null,
    contato varchar(50),     
	email varchar(50),
    cep varchar(9) not null,
    endereco varchar(100) not null,
    numero varchar(10) not null,
    complemento varchar(20),
    bairro varchar(50) not null,
    cidade varchar(50) not null,
    uf char(2) not null,
    obs varchar(255)
);

-- selecionar fornecedores
select * from fornecedores;

-- add fornecedorores na tabela 

insert into fornecedores
(cnpj,razao,fantasia,fone,cep,endereco,numero,bairro,cidade,uf)
values ('214.124.123-03/0001-50','coca cola Ltda','coca',
'(11)3346-9966','03307-005','Rua Tuiuti','2516','Tatuapé','São Paulo','SP');


/* ========================= Produtos =======================*/

-- criar tabela
create table produtos(
codigo int primary key auto_increment,
barcode varchar(255) unique,
produto varchar(100) not null,
descricao varchar(255) not null,
fabricante varchar(100) not null,
datacad timestamp default current_timestamp,
dataval date not null,
estoque int not null,
estoquemin int not null,
unidade varchar(50) not null,
localizacao  varchar(50),
custo decimal(10,2) not null,
lucro decimal(10,2),
idfor int not null,
foreign key (idfor) references fornecedores (idfor)
);

-- selecionar produtos
select * from produtos;

-- add produto na tabela

insert into produtos(barcode,produto,descricao,fabricante,dataval,
estoque,estoquemin,unidade,localizacao,custo,lucro,idfor)
values
('12345678912','Coca-Cola','Refrigerante cola, Coca-Cola  ','coca-cola',
20210525,25,50,'UN','Prateleira 5',2,50,1);

/*============================================================== Relatorio ========================================================================*/

