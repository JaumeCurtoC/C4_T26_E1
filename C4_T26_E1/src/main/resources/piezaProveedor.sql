DROP DATABASE IF EXISTS piezaProveedor;
CREATE DATABASE piezaProveedor;

USE piezaProveedor;

DROP TABLE IF EXISTS piezas;

CREATE TABLE piezas (
  codigo int NOT NULL AUTO_INCREMENT,
  nombre varchar(100) DEFAULT NULL,
  PRIMARY KEY (codigo)
);

DROP TABLE IF EXISTS proveedores;

CREATE TABLE proveedores (
  id int NOT NULL AUTO_INCREMENT,
  nombre varchar(100) DEFAULT NULL,
  PRIMARY KEY (id)
);

DROP TABLE IF EXISTS suministra;

CREATE TABLE suministra (
  codigoPieza int NOT NULL,
  idProveedor int NOT NULL,
  precio int DEFAULT NULL,
  PRIMARY KEY (codigoPieza,idProveedor),
  FOREIGN KEY (codigoPieza) REFERENCES piezas (codigo) 
  ON DELETE CASCADE ON UPDATE CASCADE,
  FOREIGN KEY (idProveedor) REFERENCES proveedores (id) 
  ON DELETE CASCADE ON UPDATE CASCADE
);