INSERT INTO regiones (id, nombre) VALUES(1,'Asia');
INSERT INTO regiones (id, nombre) VALUES(2,'Centroamérica');
INSERT INTO regiones (id, nombre) VALUES(3,'Europa');
INSERT INTO regiones (id, nombre) VALUES(4,'Oceanía');
INSERT INTO regiones (id, nombre) VALUES(5,'Antártida');
INSERT INTO regiones (id, nombre) VALUES(6,'Sudamérica');
INSERT INTO regiones (id, nombre) VALUES(7,'Norteamérica');
INSERT INTO regiones (id, nombre) VALUES(8,'África');
INSERT INTO clientes (region_id, nombre, apellido, email, create_at) VALUES (1, 'Rocio', 'Martinez', 'rocio@gmail.com', '2024-01-08');
INSERT INTO clientes (region_id, nombre, apellido, email, create_at) VALUES (2, 'Abigail', 'Doe', 'abigail@gmail.com', '2024-01-12');
INSERT INTO clientes (region_id, nombre, apellido, email, create_at) VALUES (2, 'Rosario', 'Gamma', 'rosario@gmail.com', '2024-01-23');
INSERT INTO clientes (region_id, nombre, apellido, email, create_at) VALUES (3, 'Magali', 'Alfa', 'magali@gmail.com', '2024-01-11');
INSERT INTO clientes (region_id, nombre, apellido, email, create_at) VALUES (4, 'Graciela', 'Flores', 'graciela@gmail.com', '2024-01-21');
INSERT INTO clientes (region_id, nombre, apellido, email, create_at) VALUES (5, 'Edith', 'Roe', 'edith@gmail.com', '2024-01-23');
INSERT INTO clientes (region_id, nombre, apellido, email, create_at) VALUES (6, 'Roque', 'Ribba', 'roque@gmail.com', '2024-01-06');
INSERT INTO clientes (region_id, nombre, apellido, email, create_at) VALUES (7, 'Luis', 'Perez', 'luis@gmail.com', '2024-01-02');
INSERT INTO clientes (region_id, nombre, apellido, email, create_at) VALUES (8, 'Maria', 'Diaz', 'maria@gmail.com', '2024-01-30');
INSERT INTO clientes (region_id, nombre, apellido, email, create_at) VALUES (6, 'Noel', 'Gomez', 'noel@gmail.com', '2024-01-08');

INSERT INTO usuarios (username, password, enabled, nombre, apellido, email) VALUES ('rocio','$2a$10$fNdozwT4KUnqetsFf9Lzn.mWZsP2PmjrrFUIe3TMF2OutSdKWKmrS',1, "Rocio", "Martinez", "rocio@gmail.com");
INSERT INTO usuarios (username, password, enabled, nombre, apellido, email) VALUES ('admin','$2a$10$kjCYPLL18RZAvSqVHXdUPuGbF4I/r5IVOunEJSPZJe8OrZ/vkqZDe',1, "adminname", "adminapellido", "admin@gmail.com");

INSERT INTO roles (nombre) VALUES ('ROLE_USER');
INSERT INTO roles (nombre) VALUES ('ROLE_ADMIN');

INSERT INTO usuarios_roles (usuarios_id, roles_id) VALUES (1,1);
INSERT INTO usuarios_roles (usuarios_id, roles_id) VALUES (2,2);
INSERT INTO usuarios_roles (usuarios_id, roles_id) VALUES (2,1);