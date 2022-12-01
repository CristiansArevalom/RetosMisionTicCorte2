CREATE TABLE DIRECTOR(
 dir_id_director INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT,
 dir_nombre varchar(20)NOT NULL,
 dir_apellido varchar(20)NOT NULL,
 dir_nacionalidad varchar(20)NOT NULL
);
INSERT INTO DIRECTOR (dir_nombre,dir_apellido,dir_nacionalidad) VALUES ("Hayo","Miyazaki","japones");
INSERT INTO DIRECTOR (dir_nombre,dir_apellido,dir_nacionalidad) VALUES ("Joss","Whedon","estadounidense");
INSERT INTO DIRECTOR (dir_nombre,dir_apellido,dir_nacionalidad) VALUES ("Christopher","Nolan","estadounidense");
INSERT INTO DIRECTOR (dir_nombre,dir_apellido,dir_nacionalidad) VALUES ("Bong","Joon-ho","coreano");
INSERT INTO DIRECTOR (dir_nombre,dir_apellido,dir_nacionalidad) VALUES ("Vincent","Ward","neozelandes");