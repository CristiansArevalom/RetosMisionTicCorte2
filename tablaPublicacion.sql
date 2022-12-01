CREATE TABLE PUBLICACION (
pub_id_publicacion INTEGER PRIMARY KEY AUTOINCREMENT,
usr_username varchar(20)NOT NULL,
cont_id_contenido INTEGER NOT NULL,
pub_fecha DATETIME NOT NULL,
FOREIGN KEY(cont_id_contenido) REFERENCES CONTENIDO(cont_id_contenido),
FOREIGN KEY(usr_username) REFERENCES USUARIO(usr_username)
/*PRYMARY KEY(pub_id_publicacion) */
);
INSERT INTO PUBLICACION (usr_username,cont_id_contenido,pub_fecha) VALUES(
"lucky",(SELECT cont_id_contenido FROM CONTENIDO WHERE cont_titulo = "Los Vengadores"),
'2017-10-25 20:00:00'
);
INSERT INTO PUBLICACION (usr_username,cont_id_contenido,pub_fecha) VALUES(
"lucky",(SELECT cont_id_contenido FROM CONTENIDO WHERE cont_titulo = "Parasitos"),
'2019-03-15 18:30:00'
);
INSERT INTO PUBLICACION (usr_username,cont_id_contenido,pub_fecha) VALUES(
"lucky",(SELECT cont_id_contenido FROM CONTENIDO WHERE cont_titulo = "La casa de papel"),
'2019-05-20 20:30:00'
);
INSERT INTO PUBLICACION (usr_username,cont_id_contenido,pub_fecha) VALUES(
"malopez",(SELECT cont_id_contenido FROM CONTENIDO WHERE cont_titulo = "Los Vengadores"),
'2018-05-20 20:30:00'
);
INSERT INTO PUBLICACION (usr_username,cont_id_contenido,pub_fecha) VALUES(
"malopez",(SELECT cont_id_contenido FROM CONTENIDO WHERE cont_titulo = "La casa de papel"),
'2020-01-20 20:30:00'
);
INSERT INTO PUBLICACION (usr_username,cont_id_contenido,pub_fecha) VALUES(
"diva",(SELECT cont_id_contenido FROM CONTENIDO WHERE cont_titulo = "Interestelar"),
'2019-05-20 20:30:00'
);
INSERT INTO PUBLICACION (usr_username,cont_id_contenido,pub_fecha) VALUES(
"diva",(SELECT cont_id_contenido FROM CONTENIDO WHERE cont_titulo = "El viaje de Chihiro"),
'2018-06-22 21:30:00'
);
INSERT INTO PUBLICACION (usr_username,cont_id_contenido,pub_fecha) VALUES(
"diva",(SELECT cont_id_contenido FROM CONTENIDO WHERE cont_titulo = "The walking dead"),
'2020-03-17 15:30:20'
);
INSERT INTO PUBLICACION (usr_username,cont_id_contenido,pub_fecha) VALUES(
"dreamer",(SELECT cont_id_contenido FROM CONTENIDO WHERE cont_titulo = "The walking dead"),
'2020-03-17 15:30:20'
);
INSERT INTO PUBLICACION (usr_username,cont_id_contenido,pub_fecha) VALUES(
"dreamer",(SELECT cont_id_contenido FROM CONTENIDO WHERE cont_titulo = "Viaje a las estrellas: la serie original"),
'2020-04-10 18:30:20'
);
INSERT INTO PUBLICACION (usr_username,cont_id_contenido,pub_fecha) VALUES(
"ninja",(SELECT cont_id_contenido FROM CONTENIDO WHERE cont_titulo = "Glow"),
'2020-02-17 20:30:20'
);
INSERT INTO PUBLICACION (usr_username,cont_id_contenido,pub_fecha) VALUES(
"ninja",(SELECT cont_id_contenido FROM CONTENIDO WHERE cont_titulo = "La casa de papel"),
'2020-02-20 16:30:20'
);
INSERT INTO PUBLICACION (usr_username,cont_id_contenido,pub_fecha) VALUES(
"ninja",(SELECT cont_id_contenido FROM CONTENIDO WHERE cont_titulo = "Arrow"),
'2020-03-27 18:30:20'
);
INSERT INTO PUBLICACION (usr_username,cont_id_contenido,pub_fecha) VALUES(
"rose",(SELECT cont_id_contenido FROM CONTENIDO WHERE cont_titulo = "Friends"),
'2020-03-20 21:30:20'
);
INSERT INTO PUBLICACION (usr_username,cont_id_contenido,pub_fecha) VALUES(
"green",(SELECT cont_id_contenido FROM CONTENIDO WHERE cont_titulo = "Interestelar"),
'2020-01-10 17:30:20'
);
INSERT INTO PUBLICACION (usr_username,cont_id_contenido,pub_fecha) VALUES(
"green",(SELECT cont_id_contenido FROM CONTENIDO WHERE cont_titulo = "Parasitos"),
'2020-02-15 20:30:20'
);
INSERT INTO PUBLICACION (usr_username,cont_id_contenido,pub_fecha) VALUES(
"green",(SELECT cont_id_contenido FROM CONTENIDO WHERE cont_titulo = "Mas alla de los sueños"),
'2020-03-17 18:30:20'
);