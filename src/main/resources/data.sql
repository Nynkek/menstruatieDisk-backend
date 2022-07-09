INSERT INTO images (file_name, content_type, url) 
VALUES ('goodlife', 'image/png', 'https://cupkiezer.nl/wp-content/uploads/2018/06/goodlife-s-cup.jpg');
INSERT INTO images (file_name, content_type, url)
VALUES ('claricup', 'image/png', 'https://cupkiezer.nl/wp-content/uploads/2019/07/Claricup-2_box_cup_sterilizer.jpg');
INSERT INTO images (file_name, content_type, url)
VALUES ('belladot', 'image/png', 'https://cupkiezer.nl/wp-content/uploads/2018/10/Belladot_evelina_small_m_box_pouch.jpg');
INSERT INTO images (file_name, content_type, url)
VALUES ('genialday', 'image/png', 'https://cupkiezer.nl/wp-content/uploads/2017/09/genial-day-l.jpg');
INSERT INTO images (file_name, content_type, url)
VALUES ('menstruatiedisk logo zwart.png', 'image/png', 'http://localhost:8080/download/menstruatiedisk%20logo%20zwart.png');


INSERT INTO discs
(id, brand, capacity, design_feature, is_reusable, has_stem, model, name, rim_width, width, material, shape, firmness,
 is_available_in_nl, link_to_store, link_to_review, image_file_name)
VALUES (91, 'Flex', 30, 'geen steel', false, false, 'OS', 'Flex disc', 8, 70, 1, 'rond', 'hard', false, 'https://flexfits.com/',
        '', 'belladot');

INSERT INTO discs
(id, brand, capacity, design_feature, is_reusable, has_stem, model, name, rim_width, width, material, shape, firmness,
 is_available_in_nl, link_to_store, link_to_review, image_file_name)
VALUES (92, 'Lumma', 30, 'Heeft een siliconen touwtje', true, true, 'S', 'Lumma Unique', 6, 53, 0, 'rond', 'zacht', false,
        'https://lummacups.com/?aff=28',
        'https://cupkiezer.nl/2020/08/review-lumma-menstruatiedisc-ervaring-van-katharina/', 'genialday');

INSERT INTO discs
(id, brand, capacity, design_feature, is_reusable, has_stem, model, name, rim_width, width, material, shape, firmness,
 is_available_in_nl, link_to_store, link_to_review, image_file_name)
VALUES (93, 'Lumma', 55, 'Heeft een siliconen touwtje', true, true, 'M', 'Lumma Unique', 6, 63, 0, 'rond', 'zacht', false,
        'https://lummacups.com/?aff=28',
        'https://cupkiezer.nl/2020/08/review-lumma-menstruatiedisc-ervaring-van-katharina/', 'goodlife');

INSERT INTO discs
(id, brand, capacity, design_feature, is_reusable, has_stem, model, name, rim_width, width, material, shape, firmness,
 is_available_in_nl, link_to_store, link_to_review, image_file_name)
VALUES (94, 'Lumma', 60, 'Heeft een siliconen touwtje', true, true, 'L', 'Lumma Unique', 6, 68, 0, 'rond', 'zacht', false,
        'https://lummacups.com/?aff=28',
        'https://cupkiezer.nl/2020/08/review-lumma-menstruatiedisc-ervaring-van-katharina/', 'claricup');

INSERT INTO discs
(id, brand, capacity, design_feature, is_reusable, has_stem, model, name, rim_width, width, material, shape, firmness,
 is_available_in_nl, link_to_store, link_to_review, image_file_name)
VALUES (95, 'Nixit', 45, 'erg zacht', true, false, 'OS', 'Nixit cup', 10, 70, 0, 'rond', 'zacht', false,
        'https://i.refs.cc/IqWu8nVq?smile_ref=eyJzbWlsZV9zb3VyY2UiOiJzbWlsZV91aSIsInNtaWxlX21lZGl1bSI6IiIsInNtaWxlX2NhbXBhaWduIjoicmVmZXJyYWxfcHJvZ3JhbSIsInNtaWxlX2N1c3RvbWVyX2lkIjo0NDI3MTM4Mjd9',
        '', 'belladot');

INSERT INTO discs
(id, brand, capacity, design_feature, is_reusable, has_stem, model, name, rim_width, width, material, shape, firmness,
 is_available_in_nl, link_to_store, link_to_review, image_file_name)
VALUES (96, 'Ziggy', 76, 'doordat de disk niet rond is kan je hem maar op een manier indoen.', true, false, 'OS', 'Ziggy disc',
        7, 76, 0, 'ovaal', 'zacht', true,
        'https://partner.bol.com/click/click?p=2&t=url&s=49589&f=TXL&url=https%3A%2F%2Fwww.bol.com%2Fnl%2Fp%2Fintimina-ziggy-cup%2F9200000130869965%2F&name=Intimina%20-%20Ziggy%20Cup&subid=blog',
        '', 'goodlife');

INSERT INTO discs
(id, brand, capacity, design_feature, is_reusable, has_stem, model, name, rim_width, width, material, shape, firmness,
 is_available_in_nl, link_to_store, link_to_review, image_file_name)
VALUES (97, 'Bamboozy', 50, 'Nederlands merk', true, false, 'M', 'Bamboozy disk', 7, 65, 0, 'rond', 'medium', true, '',
        'https://cupkiezer.nl/2022/04/nederlandse-disk-bamboozy-verkoopt-eigen-menstruatiedisks/', 'claricup');

INSERT INTO discs
(id, brand, capacity, design_feature, is_reusable, has_stem, model, name, rim_width, width, material, shape, firmness,
 is_available_in_nl, link_to_store, link_to_review, image_file_name)
VALUES (98, 'Bamboozy', 65, 'Nederlands merk', true, false, 'L', 'Bamboozy disk', 7, 70, 0, 'rond', 'medium', true, '',
        'https://cupkiezer.nl/2022/04/nederlandse-disk-bamboozy-verkoopt-eigen-menstruatiedisks/', 'genialday');


INSERT INTO users (username, email_adress, password)
VALUES ('nynke', 'info@nynke.nl', '$2a$12$/DQeORgROLU36hixj4tMJO1MSx3uxwscCHtGhoL6ZQ9DMf/Pj/TYm');
INSERT INTO users (username, email_adress, password)
VALUES ('user', 'info@user.nl', '$2a$12$/DQeORgROLU36hixj4tMJO1MSx3uxwscCHtGhoL6ZQ9DMf/Pj/TYm');
INSERT INTO users (username, email_adress, password)
VALUES ('admin', 'info@admin.nl', '$2a$12$/DQeORgROLU36hixj4tMJO1MSx3uxwscCHtGhoL6ZQ9DMf/Pj/TYm');
INSERT INTO users (username, email_adress, password)
VALUES ('brand', 'info@brand.nl', '$2a$12$/DQeORgROLU36hixj4tMJO1MSx3uxwscCHtGhoL6ZQ9DMf/Pj/TYm');


INSERT INTO pending_discs
(created_date, added_by, id, brand, capacity, design_feature, is_reusable, has_stem, model, name,
 rim_width, width, material, shape, firmness, is_available_in_nl, link_to_store,
 link_to_review, image_file_name)
VALUES ('10-10-1988', 'nynke', 1000, 'Intimina', 20, 'geen steel', true, true, 'OS', 'Ziggy', 40, 40, 1, 'vierkant', 'medium', true, 'http://website.nl',
        'http://website.nl', 'goodlife');

INSERT INTO authorities (username, authority)
VALUES ('user', 'ROLE_USER');
INSERT INTO authorities (username, authority)
VALUES ('admin', 'ROLE_USER');
INSERT INTO authorities (username, authority)
VALUES ('admin', 'ROLE_ADMIN');
INSERT INTO authorities (username, authority)
VALUES ('admin', 'ROLE_BRAND');
INSERT INTO authorities (username, authority)
VALUES ('nynke', 'ROLE_USER');
INSERT INTO authorities (username, authority)
VALUES ('nynke', 'ROLE_ADMIN');
INSERT INTO authorities (username, authority)
VALUES ('nynke', 'ROLE_BRAND');
INSERT INTO authorities (username, authority)
VALUES ('brand', 'ROLE_BRAND');