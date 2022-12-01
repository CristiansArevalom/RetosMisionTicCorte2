CREATE TABLE USUARIO(
 usr_username varchar(20)NOT NULL PRIMARY KEY,
 usr_nombre varchar(20) NOT NULL,
 usr_apellido varchar(20) NOT NULL,
 usr_email varchar(20) UNIQUE NOT NULL,
 usr_celular BIGINT NOT NULL,
 usr_contraseña varchar(40)NOT NULL,
 usr_fecha_nacimiento date NOT NULL
);
INSERT INTO usuario (usr_username,usr_nombre,usr_apellido,usr_email,usr_celular,usr_contraseña,usr_fecha_nacimiento)
VALUES("lucky","Pedro","Perez","correo1@gmail.com",3123456789,('1'),'1991-01-01');
INSERT INTO usuario (usr_username,usr_nombre,usr_apellido,usr_email,usr_celular,usr_contraseña,usr_fecha_nacimiento)
VALUES("malopez","Maria","Lopez","correo2@gmail.com",3123456791,('contrasena'),'1995-03-07');
INSERT INTO usuario (usr_username,usr_nombre,usr_apellido,usr_email,usr_celular,usr_contraseña,usr_fecha_nacimiento)
VALUES("diva","Ana","Diaz","correo3@gmail.com",3123456792,('contrasena1'),'1992-04-01');
INSERT INTO usuario (usr_username,usr_nombre,usr_apellido,usr_email,usr_celular,usr_contraseña,usr_fecha_nacimiento)
VALUES("dreamer","Luis","Rojas","correo4@gmail.com",3123456794,('contrasena2'),'1994-01-05');
INSERT INTO usuario (usr_username,usr_nombre,usr_apellido,usr_email,usr_celular,usr_contraseña,usr_fecha_nacimiento)
VALUES("ninja","Andres","Cruz","correo5@gmail.com",3123456795,('contrasena2'),'2001-06-09');
INSERT INTO usuario (usr_username,usr_nombre,usr_apellido,usr_email,usr_celular,usr_contraseña,usr_fecha_nacimiento)
VALUES("neon","Nelson","Ruiz","correo6@gmail.com",3123456796,('contrasena2'),'2011-11-19');
INSERT INTO usuario (usr_username,usr_nombre,usr_apellido,usr_email,usr_celular,usr_contraseña,usr_fecha_nacimiento)
VALUES("rose","Claudia","Mendez","correo7@gmail.com",3123456797,('contrasena2'),'2008-9-1');
INSERT INTO usuario (usr_username,usr_nombre,usr_apellido,usr_email,usr_celular,usr_contraseña,usr_fecha_nacimiento)
VALUES("green","Jorge","Rodriguez","correo8@gmail.com",3123456798,('contrasena2'),'2006-6-7');