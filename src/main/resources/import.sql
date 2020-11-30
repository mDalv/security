INSERT INTO app(id_app, descripcion) values(1, 'SISFIND');
INSERT INTO app(id_app, descripcion) values(2, 'E2VAULT');

INSERT INTO usuario(id_usuario, nombre, clave, estado, id_app) values (1, 'Admin', '$2a$10$ju20i95JTDkRa7Sua63JWOChSBc0MNFtG/6Sps2ahFFqN.HCCUMW.', true, 1);
INSERT INTO usuario(id_usuario, nombre, clave, estado, id_app) values (2, 'Gabriel', '12', true, 1);
INSERT INTO usuario(id_usuario, nombre, clave, estado, id_app) values (3, 'gafs@gmail.com', '$2a$10$ju20i95JTDkRa7Sua63JWOChSBc0MNFtG/6Sps2ahFFqN.HCCUMW.', true, 1);

INSERT INTO Rol (id_rol, nombre, descripcion) VALUES (1, 'ADMIN', 'Administrador');
INSERT INTO Rol (id_rol, nombre, descripcion) VALUES (2, 'USER', 'Usuario');
INSERT INTO Rol (id_rol, nombre, descripcion) VALUES (3, 'DBA', 'Adminsitrador de base de datos');

INSERT INTO usuario_rol (id_usuario, id_rol) VALUES (1, 1);
INSERT INTO usuario_rol (id_usuario, id_rol) VALUES (1, 3);
INSERT INTO usuario_rol (id_usuario, id_rol) VALUES (2, 2);
INSERT INTO usuario_rol (id_usuario, id_rol) VALUES (3, 2);

INSERT INTO menu(id_menu, nombre, icono, url) VALUES (1, 'Buscar', 'search', '/sisfind');
INSERT INTO menu(id_menu, nombre, icono, url) VALUES (2, 'Tramas', 'search', '/tramas');
INSERT INTO menu(id_menu, nombre, icono, url) VALUES (3, 'nada', 'nada', '/nada');

INSERT INTO menu_rol (id_menu, id_rol) VALUES (1, 1);
INSERT INTO menu_rol (id_menu, id_rol) VALUES (2, 1);
INSERT INTO menu_rol (id_menu, id_rol) VALUES (3, 2);

