update video set vid_anio = 2012 where cont_id_contenido = (SELECT cont_id_contenido FROM CONTENIDO WHERE cont_titulo = "Los Vengadores");
update usuario set usr_celular ="3115678432" where usr_username = "ninja";
delete from publicacion where usr_username="green" and cont_id_contenido = (SELECT cont_id_contenido FROM CONTENIDO WHERE cont_titulo = "Parasitos");