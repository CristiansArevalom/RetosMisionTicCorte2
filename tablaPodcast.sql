CREATE TABLE PODCAST(
 pod_id_podcast integer NOT NULL PRIMARY KEY AUTOINCREMENT,
 pod_numero_episodios INTEGER NOT NULL ,
 pod_numero_temporadas INTEGER NOT NULL,
 cont_id_contenido INTEGER NOT NULL,
 FOREIGN KEY(cont_id_contenido) REFERENCES CONTENIDO(cont_id_contenido)
);
INSERT INTO PODCAST (pod_numero_episodios,pod_numero_temporadas,cont_id_contenido)
VALUES(153,11,(SELECT cont_id_contenido FROM CONTENIDO WHERE cont_titulo ="The walking dead")
);
INSERT INTO PODCAST (pod_numero_episodios,pod_numero_temporadas,cont_id_contenido)
VALUES(80,3,(SELECT cont_id_contenido FROM CONTENIDO WHERE cont_titulo ="Viaje a las estrellas: la serie original")
);
INSERT INTO PODCAST (pod_numero_episodios,pod_numero_temporadas,cont_id_contenido)
VALUES(30,3,(SELECT cont_id_contenido FROM CONTENIDO WHERE cont_titulo ="Glow")
);
INSERT INTO PODCAST (pod_numero_episodios,pod_numero_temporadas,cont_id_contenido)
VALUES(31,4,(SELECT cont_id_contenido FROM CONTENIDO WHERE cont_titulo ="La casa de papel")
);
INSERT INTO PODCAST (pod_numero_episodios,pod_numero_temporadas,cont_id_contenido)
VALUES(236,10,(SELECT cont_id_contenido FROM CONTENIDO WHERE cont_titulo ="Friends")
);
INSERT INTO PODCAST (pod_numero_episodios,pod_numero_temporadas,cont_id_contenido)
VALUES(170,8,(SELECT cont_id_contenido FROM CONTENIDO WHERE cont_titulo ="Arrow")
);
INSERT INTO PODCAST (pod_numero_episodios,pod_numero_temporadas,cont_id_contenido)
VALUES(279,12,(SELECT cont_id_contenido FROM CONTENIDO WHERE cont_titulo ="The big bang theory")
);
INSERT INTO PODCAST (pod_numero_episodios,pod_numero_temporadas,cont_id_contenido)
VALUES(79,6,(SELECT cont_id_contenido FROM CONTENIDO WHERE cont_titulo ="Vikingos")
);