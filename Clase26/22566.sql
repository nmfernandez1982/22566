use db22566;

drop table clientes;

create table if not exists clientes(
ID_CLIENTE INT NOT NULL auto_increment ,
NOMBRE VARCHAR(30) NULL,
APELLIDO VARCHAR(30) NULL,
DNI INT NOT NULL,
MAIL VARCHAR(30) unique,
ID_LOCALIDAD INT NOT NULL,
ID_PROVINCIA INT NOT NULL,
FECHA_ALTA DATE,
ESTADO BOOL NOT NULL,
primary key(ID_CLIENTE)
);

alter table clientes
add column DIRECCION varchar(30) null AFTER MAIL;

alter table clientes
drop column DIRECCION;


CREATE TABLE PROVINCIAS(
ID_PROVINCIA INT NOT NULL,
NOMBRE_PROVINCIA VARCHAR(30),
primary key(ID_PROVINCIA)
);

ALTER TABLE CLIENTES
ADD constraint CLIENTES_PROVINCIAS
foreign key(ID_PROVINCIA) references PROVINCIAS(ID_PROVINCIA);





insert into PROVINCIAS values (1,'CORDOBA');
insert into PROVINCIAS values (2,'SANTA FE');
insert into PROVINCIAS values (3,'Mendoza');

select * from PROVINCIAS;

insert into CLIENTES values (1,'Nicolas','Fernandez',29031734,'s1@gmail.com','Tacuari 334',88,2,'2022-10-27',1);


delete from PROVINCIAS where ID_PROVINCIA=2;

