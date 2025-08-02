INSERT INTO categories (id , name) VALUES (1, 'old stock');
INSERT INTO categories (id , name) VALUES (2, 'new stock');
INSERT INTO categories (id , name) VALUES (3, 'modern');
INSERT INTO categories (id , name) VALUES (4, 'commercial');
INSERT INTO categories (id , name) VALUES (5, 'recyclable');
INSERT INTO categories (id , name) VALUES (6, 'executive');
INSERT INTO categories (id , name) VALUES (7, 'superior');
INSERT INTO categories (id , name) VALUES (8, 'wood');
INSERT INTO categories (id , name) VALUES (9, 'super luxury');
INSERT INTO categories (id , name) VALUES (10, 'vintage');
  
INSERT INTO providers (id, name, street, city, state) VALUES (1, 'Henrique', 'Av Brasil', 'Rio de Janeiro', 'RJ');
INSERT INTO providers (id, name, street, city, state) VALUES (2, 'Marcelo Augusto',	'Rua Imigrantes', 'Belo Horizonte', 'MG');
INSERT INTO providers (id, name, street, city, state) VALUES (3, 'Caroline Silva', 'Av São Paulo', 'Salvador', 'BA');
INSERT INTO providers (id, name, street, city, state) VALUES (4, 'Guilerme Staff', 'Rua Central', 'Porto Alegre', 'RS');
INSERT INTO providers (id, name, street, city, state) VALUES (5, 'Isabela Moraes', 'Av Juiz Grande', 'Curitiba', 'PR');
INSERT INTO providers (id, name, street, city, state) VALUES (6, 'Francisco Accerr', 'Av Paulista',	'São Paulo', 'SP');
  
INSERT INTO products (id, name, amount, price, id_providers, id_categories) VALUES (1,'Two-door wardrobe', 100,	800, 6,	8);
INSERT INTO products (id, name, amount, price, id_providers, id_categories) VALUES (2, 'Dining table', 1000, 560, 1, 9);
INSERT INTO products (id, name, amount, price, id_providers, id_categories) VALUES (3, 'Towel holder', 10000, 25.50, 5, 1);
INSERT INTO products (id, name, amount, price, id_providers, id_categories) VALUES (4, 'Computer desk',	350, 320.50, 4,	6);
INSERT INTO products (id, name, amount, price, id_providers, id_categories) VALUES (5, 'Chair', 3000, 210.64, 3, 6);
INSERT INTO products (id, name, amount, price, id_providers, id_categories) VALUES (6, 'Single bed', 750, 460, 1, 2);