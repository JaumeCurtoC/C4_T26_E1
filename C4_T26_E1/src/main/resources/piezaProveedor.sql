DROP DATABASE IF EXISTS piezaProveedor;
CREATE DATABASE piezaProveedor;

USE piezaProveedor;

DROP TABLE IF EXISTS piezas;

CREATE TABLE piezas (
  id int NOT NULL AUTO_INCREMENT,
  nombre varchar(100) DEFAULT NULL,
  PRIMARY KEY (id)
);

DROP TABLE IF EXISTS proveedores;

CREATE TABLE proveedores (
  id int NOT NULL AUTO_INCREMENT,
  nombre varchar(100) DEFAULT NULL,
  PRIMARY KEY (id)
);

DROP TABLE IF EXISTS suministra;

CREATE TABLE suministra (
	id int NOT NULL AUTO_INCREMENT,
  codigo_pieza int NOT NULL,
  id_proveedor int NOT NULL,
  precio int DEFAULT NULL,
  PRIMARY KEY (id),
  FOREIGN KEY (codigo_pieza) REFERENCES piezas (id) 
  ON DELETE CASCADE ON UPDATE CASCADE,
  FOREIGN KEY (id_proveedor) REFERENCES proveedores (id) 
  ON DELETE CASCADE ON UPDATE CASCADE
);

CREATE TABLE usuario(
	id int AUTO_INCREMENT,
	username VARCHAR(100),
    password VARCHAR(255),
    role varchar(100),
    PRIMARY KEY (id)
);

insert into piezas (nombre) values
	("Pieza1"),
    ("Pieza2"),
    ("Pieza3"),
    ("Pieza4"),
    ("Pieza5"),
    ("Pieza6"),
    ("Pieza7"),
    ("Pieza8"),
    ("Pieza9"),
    ("Pieza10");
    
insert into proveedores (nombre) values
	("Proveedor1"),
    ("Proveedor2"),
    ("Proveedor3"),
    ("Proveedor4"),
    ("Proveedor5"),
    ("Proveedor6"),
    ("Proveedor7"),
    ("Proveedor8"),
    ("Proveedor9"),
    ("Proveedor10");
    
insert into suministra (codigo_pieza, id_proveedor, precio) values
	(1, 1, 10),
    (2, 2, 20),
    (3, 3, 30),
    (4, 4, 40),
    (5, 5, 50),
    (6, 6, 60),
    (7, 7, 70),
    (8, 8, 80),
    (9, 9, 90),
    (10, 10, 100);
    
INSERT INTO usuario (username, password, role) VALUES ('admin', '$2a$10$XURPShQNCsLjp1ESc2laoObo9QZDhxz73hJPaEv7/cBha4pk0AgP.','admin');