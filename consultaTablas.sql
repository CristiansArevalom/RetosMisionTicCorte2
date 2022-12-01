Select '	Consulta 1';
select cont_titulo from CONTENIDO AS CONT  
INNER JOIN VIDEO AS VID ON CONT.cont_id_contenido = VID.cont_id_contenido 
union select cont_titulo from CONTENIDO AS CONT 
INNER JOIN PODCAST AS POD ON CONT.cont_id_contenido = POD.cont_id_contenido
ORDER BY cont_titulo asc;

Select 'Consulta 2';
select cont_titulo, vid_resumen,vid_anio from CONTENIDO AS CONT
INNER JOIN VIDEO AS VID on CONT.cont_id_contenido = VID.cont_id_contenido
WHERE (vid_anio) > 2000
order by cont_titulo asc;

Select 'Consulta 3';
select cont_titulo AS "Titulos Vicent ward"from CONTENIDO AS CONT
INNER JOIN VIDEO AS VID on CONT.cont_id_contenido = VID.cont_id_contenido
INNER JOIN DIRECTOR AS DIR ON VID.vid_id_director = DIR.dir_id_director
WHERE ( dir_nombre || ' ' || dir_apellido = "Vincent Ward");

Select 'Consulta 4';
SELECT cont_titulo FROM CONTENIDO AS CONT
INNER JOIN PUBLICACION AS PUB ON CONT.cont_id_contenido = PUB.cont_id_contenido
WHERE PUB.usr_username="lucky"
ORDER BY cont_titulo ASC;

Select 'Consulta 5';
SELECT PUB.usr_username,usr_nombre,usr_apellido FROM PUBLICACION AS PUB
INNER JOIN USUARIO AS USR ON PUB.usr_username=USR.usr_username
INNER JOIN CONTENIDO AS CONT ON PUB.cont_id_contenido = CONT.cont_id_contenido
WHERE (cont_titulo="Interestelar")
ORDER BY PUB.usr_username ASC;

Select 'Consulta 6';
SELECT COUNT(*) FROM VIDEO
WHERE vid_anio >2000;