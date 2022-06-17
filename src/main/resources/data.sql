INSERT INTO discs (id, brand, capacity, design_feature, is_reusable, model, name, rim_width, width, material, shape, firmness, is_available_in_nl, link_to_store, link_to_review, image) VALUES (1, 'Intimina', 20, 'geen steel', true, 'OS', 'Ziggy', 40, 40, 1, 'a','b', true,'c','d','e');

INSERT INTO users (username, email_adress, password, role) VALUES ('Nynke','info@email.nl','geheim','ADMIN');

INSERT INTO brands (id, name, website, description) VALUES ('4','pimnynkeprint','https://website.com','een leuke webshop goed merk');
INSERT INTO brands (id, name, website, description) VALUES ('1','meluna','https://meluna.com','meluna is een merk cup');
INSERT INTO pending_discs (id, created_date, username) VALUES ('1','10-10-1988','Nynke');