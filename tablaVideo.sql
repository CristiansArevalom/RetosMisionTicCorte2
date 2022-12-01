CREATE TABLE VIDEO(
 vid_id_video integer NOT NULL PRIMARY KEY AUTOINCREMENT,
 vid_anio int NOT NULL ,
 vid_resumen varchar(300) NOT NULL,
 cont_id_contenido INTEGER NOT NULL,
 vid_id_director INTEGER NOT NULL,
 FOREIGN KEY(vid_id_director) REFERENCES DIRECTOR(dir_id_director),
 FOREIGN KEY(cont_id_contenido) REFERENCES CONTENIDO(cont_id_contenido)
);
INSERT INTO VIDEO (vid_anio,vid_resumen,cont_id_contenido,vid_id_director) VALUES(
"1990","Video de superheroes basada en Marvel Comics. Nick Fury director de SHIELD recluta a Tony Stark, Steve Rogers, Bruce Banner y Thor para forma un equipo y evitar que Loki, hermano de Thor, se apodere de la tierra",
(SELECT cont_id_contenido FROM CONTENIDO WHERE cont_titulo ="Los Vengadores"),
(SELECT dir_id_director FROM DIRECTOR WHERE dir_nombre|| ' ' ||dir_apellido ="Joss Whedon")
); --dir_nombre|| ' ' ||dir_apellido es para concatenat
INSERT INTO VIDEO (vid_anio,vid_resumen,cont_id_contenido,vid_id_director) VALUES(
"2014","Video de ciencia fición, donde la humanidad lucha por sobrevivir. La pelicula cuenta una historia de un grupo de astronautas que viajana traves de un agujero de gusano en busca de un nuevo hogar. ",
(SELECT cont_id_contenido FROM CONTENIDO WHERE cont_titulo ="Interestelar"),
(SELECT dir_id_director FROM DIRECTOR WHERE dir_nombre|| ' ' ||dir_apellido ="Christopher Nolan")
);
INSERT INTO VIDEO (vid_anio,vid_resumen,cont_id_contenido,vid_id_director) VALUES(
"2001","Video de animación japonesa. Es la historia de una niña de 12 años, quien se ve atrapada por un mundo mágico y sobrenatural, teniendo como misión buscar su libertad y la de sus padres y regresar al mundo real.",
(SELECT cont_id_contenido FROM CONTENIDO WHERE cont_titulo ="El viaje de Chihiro"),
(SELECT dir_id_director FROM DIRECTOR WHERE dir_nombre|| ' ' ||dir_apellido ="Hayo Miyazaki")
);
INSERT INTO VIDEO (vid_anio,vid_resumen,cont_id_contenido,vid_id_director) VALUES(
"2019","Video de drama, suspenso y humor negro. Toca temas como las diferencias sociales y vulnerabilidad del espiritu humano",
(SELECT cont_id_contenido FROM CONTENIDO WHERE cont_titulo ="Parasitos"),
(SELECT dir_id_director FROM DIRECTOR WHERE dir_nombre|| ' ' ||dir_apellido ="Bong Joon-ho")
);
INSERT INTO VIDEO (vid_anio,vid_resumen,cont_id_contenido,vid_id_director) VALUES(
"1998","Libro de drama, narra una historia trágica de una familia, donde el padre va en busca de sus esposa al mas allá para recuperarla.",
(SELECT cont_id_contenido FROM CONTENIDO WHERE cont_titulo ="Mas alla de los sueños"),
(SELECT dir_id_director FROM DIRECTOR WHERE dir_nombre|| ' ' ||dir_apellido ="Vincent Ward")
);