/*1.  Obtener el listado de los identificadores (id) de los materiales de construcción 
importados, incluyendo: sus nombres y precios (ordenados por nombre). Utilice los 
siguientes alias: ID_MATERIALCONSTRUCCION como ID, 
NOMBRE_MATERIAL como NOMBRE y PRECIO_UNIDAD como PRECIO.*/
select id_materialconstruccion as ID, nombre_material As nombre, precio_unidad AS precio
FROM MaterialConstruccion
order by nombre;
/***2.Se necesita conocer el listado de los proyectos, incluyendo la siguiente información: 
id del proyecto, constructora, ciudad, clasificación, estrato y nombre completo del 
líder de los proyectos que fueron financiados por el banco “Conavi”. Ordenados 
desde el proyecto más reciente hasta el más antiguo, por nombre de la ciudad (de 
forma ascendente) y por constructora. Para construir el listado mencionado, se debe 
realizar un JOIN entre las tablas Proyecto y Tipo, Proyecto Líder. Utilice los 
siguientes alias: ID_PROYECTO como ID y la unión del nombre + apellido del 
líder como LIDER, el resto, queda en su forma natural***/

SELECT p.id_proyecto AS ID, p.constructora, p.ciudad,p.clasificacion,tipo.estrato,
l.nombre||' '||l.primer_apellido||' '||l.Segundo_Apellido AS Nombre
FROM PROYECTO p
inner join Tipo  on p.ID_Tipo = Tipo.id_tipo
INNER JOIN Lider l on p.ID_Lider=l.ID_Lider
where p.banco_vinculado="Conavi";
/***
3. Se desea conocer por cada ciudad y clasificación: el total de proyectos, la fecha del 
proyecto más antiguo y la fecha del proyecto más reciente (ordenados por ciudad y 
clasificación). No se deben incluir los proyectos tipo “Casa Campestre” ni 
“Condominio”. Por ejemplo:
***/

SELECT CIUDAD,clasificacion,COUNT(id_proyecto) AS TOTAL,MIN(fecha_inicio) AS VIEJO,MAX(fecha_inicio) AS RECIENTE
FROM Proyecto
WHERE clasificacion =! "Casa Campestre" and clasificacion =! "Condominio"
GROUP BY CIUDAD,clasificacion;
/**
4. Se debe presentar el total adeudado en cada proyecto (por las compras no pagadas a 
los proveedores). Se debe agrupar los datos por el ID_proyecto y el valor total de la 
deuda, siempre y cuando esta última sea superior a $50.000. Ordene los datos de
mayor a menor deuda. Por ejemplo:
**/
select c.id_proyecto,SUM(c.cantidad*(m.precio_unidad)) AS VALOR
from Compra c
inner join MaterialConstruccion m
on c.id_materialconstruccion = m.id_materialconstruccion
where upper(c.pagado) = 'NO'
group by c.id_proyecto
HAVING VALOR > 50000
order by VALOR DESC;

/***
5. Seleccione los 10 líderes que han realizado más compras en sus proyectos. Se debe 
presentar el nombre completo del líder y el valor total de las compras realizadas. 
Para limitar el número de registros, usar al final de la consulta la instrucción LIMIT 
<numero>. Por ejemplo:
<numero>. Por ejemplo:
*/

SELECT p.ID_Proyecto,l.nombre||' '||l.primer_apellido||''||l.Segundo_Apellido as LIDER,
SUM(c.cantidad*mc.Precio_Unidad) as valor
FROM Lider l
inner join Proyecto p on l.id_lider = p.id_lider
inner join Compra c on p.id_proyecto = c.id_proyecto
inner join MaterialConstruccion mc on c.id_materialconstruccion = mc.ID_MaterialConstruccion
GROUP BY LIDER
ORDER BY VALOR DESC
LIMIT 10

