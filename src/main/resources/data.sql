INSERT INTO discs
(id, brand, capacity, design_feature, is_reusable, has_stem, model, name, rim_width, width, material, shape, firmness,
 is_available_in_nl, link_to_store, link_to_review, image)
VALUES (91, 'Flex', 30, 'geen steel', false, false, 'OS', 'Flex disc', 8, 70, 1, 'rond', 'hard', false, 'https://flexfits.com/',
        '', 'https://cupkiezer.nl/wp-content/uploads/2017/08/yuuki_cupbox-copy.jpg');

INSERT INTO discs
(id, brand, capacity, design_feature, is_reusable, has_stem, model, name, rim_width, width, material, shape, firmness,
 is_available_in_nl, link_to_store, link_to_review, image)
VALUES (92, 'Lumma', 30, 'Heeft een siliconen touwtje', true, true, 'S', 'Lumma Unique', 6, 53, 0, 'rond', 'zacht', false,
        'https://lummacups.com/?aff=28',
        'https://cupkiezer.nl/2020/08/review-lumma-menstruatiedisc-ervaring-van-katharina/',
        'https://cupkiezer.nl/wp-content/uploads/2018/06/goodlife-s-cup.jpg');

INSERT INTO discs
(id, brand, capacity, design_feature, is_reusable, has_stem, model, name, rim_width, width, material, shape, firmness,
 is_available_in_nl, link_to_store, link_to_review, image)
VALUES (93, 'Lumma', 55, 'Heeft een siliconen touwtje', true, true, 'M', 'Lumma Unique', 6, 63, 0, 'rond', 'zacht', false,
        'https://lummacups.com/?aff=28',
        'https://cupkiezer.nl/2020/08/review-lumma-menstruatiedisc-ervaring-van-katharina/',
        'https://cupkiezer.nl/wp-content/uploads/2017/08/yuuki_cupbox-copy.jpg');

INSERT INTO discs
(id, brand, capacity, design_feature, is_reusable, has_stem, model, name, rim_width, width, material, shape, firmness,
 is_available_in_nl, link_to_store, link_to_review, image)
VALUES (94, 'Lumma', 60, 'Heeft een siliconen touwtje', true, true, 'L', 'Lumma Unique', 6, 68, 0, 'rond', 'zacht', false,
        'https://lummacups.com/?aff=28',
        'https://cupkiezer.nl/2020/08/review-lumma-menstruatiedisc-ervaring-van-katharina/',
        'https://cupkiezer.nl/wp-content/uploads/2021/03/divinecup_s_soft_vierkleuren_witteachtergrond.jpg');

INSERT INTO discs
(id, brand, capacity, design_feature, is_reusable, has_stem, model, name, rim_width, width, material, shape, firmness,
 is_available_in_nl, link_to_store, link_to_review, image)
VALUES (95, 'Nixit', 45, 'erg zacht', true, false, 'OS', 'Nixit cup', 10, 70, 0, 'rond', 'zacht', false,
        'https://i.refs.cc/IqWu8nVq?smile_ref=eyJzbWlsZV9zb3VyY2UiOiJzbWlsZV91aSIsInNtaWxlX21lZGl1bSI6IiIsInNtaWxlX2NhbXBhaWduIjoicmVmZXJyYWxfcHJvZ3JhbSIsInNtaWxlX2N1c3RvbWVyX2lkIjo0NDI3MTM4Mjd9',
        '', 'https://cupkiezer.nl/wp-content/uploads/2017/08/yuuki_cupbox-copy.jpg');

INSERT INTO discs
(id, brand, capacity, design_feature, is_reusable, has_stem, model, name, rim_width, width, material, shape, firmness,
 is_available_in_nl, link_to_store, link_to_review, image)
VALUES (96, 'Ziggy', 76, 'doordat de disk niet rond is kan je hem maar op een manier indoen.', true, false, 'OS', 'Ziggy disc',
        7, 76, 0, 'ovaal', 'zacht', true,
        'https://partner.bol.com/click/click?p=2&t=url&s=49589&f=TXL&url=https%3A%2F%2Fwww.bol.com%2Fnl%2Fp%2Fintimina-ziggy-cup%2F9200000130869965%2F&name=Intimina%20-%20Ziggy%20Cup&subid=blog',
        '', 'https://cupkiezer.nl/wp-content/uploads/2021/03/divinecup_s_soft_vierkleuren_witteachtergrond.jpg');

INSERT INTO discs
(id, brand, capacity, design_feature, is_reusable, has_stem, model, name, rim_width, width, material, shape, firmness,
 is_available_in_nl, link_to_store, link_to_review, image)
VALUES (97, 'Bamboozy', 50, 'Nederlands merk', true, false, 'M', 'Bamboozy disk', 7, 65, 0, 'rond', 'medium', true, '',
        'https://cupkiezer.nl/2022/04/nederlandse-disk-bamboozy-verkoopt-eigen-menstruatiedisks/',
        'https://cupkiezer.nl/wp-content/uploads/2019/07/Claricup-1_box_cup_sterilizer.jpg');

INSERT INTO discs
(id, brand, capacity, design_feature, is_reusable, has_stem, model, name, rim_width, width, material, shape, firmness,
 is_available_in_nl, link_to_store, link_to_review, image)
VALUES (98, 'Bamboozy', 65, 'Nederlands merk', true, false, 'L', 'Bamboozy disk', 7, 70, 0, 'rond', 'medium', true, '',
        'https://cupkiezer.nl/2022/04/nederlandse-disk-bamboozy-verkoopt-eigen-menstruatiedisks/',
        'https://cupkiezer.nl/wp-content/uploads/2017/08/yuuki_cupbox-copy.jpg');


INSERT INTO users (username, email_adress, password)
VALUES ('nynke', 'info@email.nl', '$2a$12$/DQeORgROLU36hixj4tMJO1MSx3uxwscCHtGhoL6ZQ9DMf/Pj/TYm');
INSERT INTO users (username, email_adress, password)
VALUES ('user', 'info@email.nl', '$2a$12$/DQeORgROLU36hixj4tMJO1MSx3uxwscCHtGhoL6ZQ9DMf/Pj/TYm');
INSERT INTO users (username, email_adress, password)
VALUES ('admin', 'info@email.nl', '$2a$12$/DQeORgROLU36hixj4tMJO1MSx3uxwscCHtGhoL6ZQ9DMf/Pj/TYm');


INSERT INTO brands (id, name, website, description)
VALUES (1, 'Bamboozy', 'https://website.com', 'Bamboozy heeft twee disks: een M (65mm) en een grotere L (70mm).');
INSERT INTO brands (id, name, website, description)
VALUES (2, 'Ziggy', 'https://website.com', 'Ziggy heeft veel discs');
INSERT INTO brands (id, name, website, description)
VALUES (3, 'Lumma', 'https://website.com', 'Lumma is een merk cup');


INSERT INTO pending_discs
(created_date, added_by, id, brand, capacity, design_feature, is_reusable, has_stem, model, name,
 rim_width, width, material, shape, firmness, is_available_in_nl, link_to_store,
 link_to_review, image)
VALUES ('10-10-1988', 'nynke', 1000, 'Intimina', 20, 'geen steel', true, true, 'OS', 'Ziggy', 40, 40, 1, 'vierkant', 'medium', true, 'http://website.nl',
        'http://website.nl', 'https://cupkiezer.nl/wp-content/uploads/2017/08/yuuki_cupbox-copy.jpg');

INSERT INTO authorities (username, authority)
VALUES ('user', 'ROLE_USER');
INSERT INTO authorities (username, authority)
VALUES ('admin', 'ROLE_USER');
INSERT INTO authorities (username, authority)
VALUES ('admin', 'ROLE_ADMIN');
INSERT INTO authorities (username, authority)
VALUES ('nynke', 'ROLE_USER');
INSERT INTO authorities (username, authority)
VALUES ('nynke', 'ROLE_ADMIN');
