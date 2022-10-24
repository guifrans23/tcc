/*

	 village_market
@author:  guifrans
@version:1.0
*/
-- criar e usar banco
create database  village_market;
use  village_market;

/*================================================Tabela de usaarios======================*/

create table usuarios(
idusario int primary key auto_increment,
nomeusario varchar(100) not null unique,
senha  varchar (50) not null,
email varchar (255)not null unique,
nomecompleto varchar(255) not null,
cpf varchar(255) not null unique,
foto varchar (255) default "foto.png"
);
/*=================================================Tabela Produtos============================*/
create table produtos(
idproduto int primary key auto_increment,
nomeproduto varchar(100 )not null,
descricao text not null,
categoria varchar(30) not null,
quantidade int not null,
preco decimal(10,2) not null,
foto1 varchar(255) not null unique,
foto2 varchar(255) not null unique,
foto3 varchar(255) not null unique,
foto4 varchar(255) not null unique
);
/* ===================================================tabela Pedidos====================================================*/

create table pedido(
idpedido bigint auto_increment primary key,
idusuario bigint not null,
datahora timestamp default current_timestamp(),
situacao enum("Pendente","Finalizado","Cancelado"),
constraint `fk_pedido_pk_usuario`
foreign key(idusuario) 
references usuario(idusuario)) engine InnoDB;


