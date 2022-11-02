/*DML*/


/*
insert
delete
update

select
*/


use db22566;

insert into clientes values (2,'Cecilia','Perez',28123456,'cecilia@gmail.com','Sarmiento 644 14A',1,2,now(),true);
insert into clientes values (3,'Paula','Hernandez',28123456,'paula@gmail.com','Sarmiento 644',1,2,now(),true);
insert into clientes values (4,'Juana','Fernandez',28123456,'juana@gmail.com','Sarmiento 644',1,2,now(),false);
insert into clientes values (5,'Pedro','Gomez',28123456,'pedro@gmail.com','Sarmiento 644',1,2,now(),false);


select * from clientes;


delete from clientes where ID_CLIENTE=3 ;


update clientes set ESTADO=0 where ID_CLIENTE=3;
update clientes set DIRECCION='Cordoba 644' where ID_CLIENTE=3;

update clientes set DIRECCION='Alem 644' where ID_CLIENTE=5;


select * from clientes;

select ID_CLIENTE,NOMBRE,MAIL from clientes;


select * from clientes where ID_CLIENTE=3;

select * from clientes where DIRECCION like 'Cordoba 644';

select * from clientes where DIRECCION like '%644';

select * from clientes where DIRECCION like '%644%';

select * from clientes where ESTADO=1 and ID_CLIENTE=5;

select * from clientes where ESTADO=1 and (APELLIDO like 'Perez' or APELLIDO like 'Hernandez');

select * from clientes where ESTADO=1 or APELLIDO like 'FERNANDEZ';

select * from clientes where FECHA_ALTA between '2022-11-01' and now();

select * from clientes where FECHA_ALTA not between '2022-11-01' and now();

select * from clientes where year(FECHA_ALTA)=2022;

select * from clientes where month(FECHA_ALTA)=10;

select * from clientes where day(FECHA_ALTA)=01 and month(FECHA_ALTA)=11;

select * from clientes where ID_CLIENTE in (2,4,5);

select distinct(ID_LOCALIDAD) from clientes;

select distinct(FECHA_ALTA) from clientes;















