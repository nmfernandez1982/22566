use db22566;

select * from clientes;



select NOMBRE,APELLIDO,provincias.ID_PROVINCIA,NOMBRE_PROVINCIA from clientes
inner join provincias on clientes.ID_PROVINCIA=provincias.ID_PROVINCIA; 

select NOMBRE,APELLIDO,provincias.ID_PROVINCIA,NOMBRE_PROVINCIA from clientes
join provincias on clientes.ID_PROVINCIA=provincias.ID_PROVINCIA; 


select NOMBRE,APELLIDO,provincias.ID_PROVINCIA,NOMBRE_PROVINCIA from clientes
left join provincias on clientes.ID_PROVINCIA=provincias.ID_PROVINCIA; 

select * from provincias;

insert into provincias values (3,'San Juan');
insert into provincias values (4,'Mendoza');


select NOMBRE,APELLIDO,provincias.ID_PROVINCIA,NOMBRE_PROVINCIA from clientes
right join provincias on clientes.ID_PROVINCIA=provincias.ID_PROVINCIA; 

select NOMBRE,APELLIDO,DNI as 'Nro. Doc.',FECHA_ALTA as 'Alta' from clientes;

/*Campos Calculados*/

select * from clientes;

select sum(DNI) from clientes;

select count(*) from clientes;

select max(ID_CLIENTE) from clientes;

select min(ID_CLIENTE) from clientes;

select avg(DNI) from clientes;


start transaction;
update provincias set NOMBRE_PROVINCIA='Rio Negro' where ID_PROVINCIA=4;
rollback;
commit;
select * from provincias;



select * from clientes;

Select DNI,NOMBRE,APELLIDO,replace(ESTADO,0,'No Habilitado') as 'Estado' from clientes where ESTADO=0;


select DNI,concat(NOMBRE,",",APELLIDO),replace(ESTADO,0,'No Habilitado') as 'Estado' from clientes where ESTADO=0;

select DNI,concat( lower(NOMBRE),",",UPPER(APELLIDO)),replace(ESTADO,0,'No Habilitado') as 'Estado' from clientes where ESTADO=0;

select DNI,reverse(  concat( lower(NOMBRE),",",UPPER(APELLIDO))  )  ,replace(ESTADO,0,'No Habilitado')   as 'Estado' from clientes where ESTADO=0;


select reverse("Nicolas");


select NOMBRE,length(NOMBRE) from clientes;
