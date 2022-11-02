use db22548;

drop table clientes;


create table clientes (
ID_CLIENTE int not null auto_increment ,
NOMBRE varchar(30) null,
APELLIDO varchar(30) null,
DNI int not null,
MAIL varchar(30) unique,
DIRECCION varchar(40),
ID_PROVINCIA int not null,
FECHA_ALTA date,
ESTADO bool not null,
primary key(ID_CLIENTE)
);

alter table clientes
add column DIRECCION varchar(40) after MAIL;

alter table clientes
drop column DIRECCION;

drop database db22548;


create table provincias(
ID_PROVINCIA INT NOT NULL,
NOMBRE_PROVINCIA VARCHAR(30),
primary key(ID_PROVINCIA)
);


alter table clientes
add constraint clientes_provincias
foreign key(ID_PROVINCIA) references provincias(ID_PROVINCIA);

insert into provincias values (1,'Cordoba');
insert into provincias values (2,'San Juan');
insert into provincias values (3,'Santa Fe');

select * from provincias;

insert into clientes values (1,'Nicolas','Fernandez',29031734,'s3@gmail.com','Sarmiento 344',2,'2022-10-28',1);
insert into clientes values (2,'Pedro','Juarez',29031734,'s4@gmail.com','Sarmiento 344',1,'2022-10-28',1);

select * from clientes;

delete from provincias where ID_PROVINCIA=1;


DML:
select
insert
update
delete

DDL:
alter
create
drop


SET FOREIGN_KEY_CHECKS=0;
SET FOREIGN_KEY_CHECKS=1;  

