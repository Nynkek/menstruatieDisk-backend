INSERT INTO discs
(id, brand, capacity, design_feature, is_reusable, model, name, rim_width, width, material, shape, firmness,
 is_available_in_nl, link_to_store, link_to_review, image)
VALUES (1, 'Flex', 30, 'geen steel', false, 'OS', 'Flex disc', 8, 70, 2, 'rond', 'hard', false, 'https://flexfits.com/',
        '', 'https://cupkiezer.nl/wp-content/uploads/2017/08/yuuki_cupbox-copy.jpg');

INSERT INTO discs
(id, brand, capacity, design_feature, is_reusable, model, name, rim_width, width, material, shape, firmness,
 is_available_in_nl, link_to_store, link_to_review, image)
VALUES (2, 'Lumma', 30, 'Heeft een siliconen touwtje', true, 'S', 'Lumma Unique', 6, 53, 1, 'rond', 'zacht', false,
        'https://lummacups.com/?aff=28',
        'https://cupkiezer.nl/2020/08/review-lumma-menstruatiedisc-ervaring-van-katharina/',
        'https://cupkiezer.nl/wp-content/uploads/2017/08/yuuki_cupbox-copy.jpg');

INSERT INTO discs
(id, brand, capacity, design_feature, is_reusable, model, name, rim_width, width, material, shape, firmness,
 is_available_in_nl, link_to_store, link_to_review, image)
VALUES (3, 'Lumma', 55, 'Heeft een siliconen touwtje', true, 'M', 'Lumma Unique', 6, 63, 1, 'rond', 'zacht', false,
        'https://lummacups.com/?aff=28',
        'https://cupkiezer.nl/2020/08/review-lumma-menstruatiedisc-ervaring-van-katharina/',
        'https://cupkiezer.nl/wp-content/uploads/2017/08/yuuki_cupbox-copy.jpg');

INSERT INTO discs
(id, brand, capacity, design_feature, is_reusable, model, name, rim_width, width, material, shape, firmness,
 is_available_in_nl, link_to_store, link_to_review, image)
VALUES (4, 'Lumma', 60, 'Heeft een siliconen touwtje', true, 'L', 'Lumma Unique', 6, 68, 1, 'rond', 'zacht', false,
        'https://lummacups.com/?aff=28',
        'https://cupkiezer.nl/2020/08/review-lumma-menstruatiedisc-ervaring-van-katharina/',
        'https://cupkiezer.nl/wp-content/uploads/2017/08/yuuki_cupbox-copy.jpg');

INSERT INTO discs
(id, brand, capacity, design_feature, is_reusable, model, name, rim_width, width, material, shape, firmness,
 is_available_in_nl, link_to_store, link_to_review, image)
VALUES (5, 'Nixit', 45, 'erg zacht', true, 'OS', 'Nixit cup', 10, 70, 1, 'rond', 'zacht', false,
        'http://i.refs.cc/IqWu8nVq?smile_ref=eyJzbWlsZV9zb3VyY2UiOiJzbWlsZV91aSIsInNtaWxlX21lZGl1bSI6IiIsInNtaWxlX2NhbXBhaWduIjoicmVmZXJyYWxfcHJvZ3JhbSIsInNtaWxlX2N1c3RvbWVyX2lkIjo0NDI3MTM4Mjd9',
        '', 'https://cupkiezer.nl/wp-content/uploads/2017/08/yuuki_cupbox-copy.jpg');

INSERT INTO discs
(id, brand, capacity, design_feature, is_reusable, model, name, rim_width, width, material, shape, firmness,
 is_available_in_nl, link_to_store, link_to_review, image)
VALUES (6, 'Ziggy', 76, 'doordat de disk niet rond is kan je hem maar op een manier indoen.', true, 'OS', 'Ziggy disc',
        7, 76, 1, 'ovaal', 'zacht', true,
        'https://partner.bol.com/click/click?p=2&t=url&s=49589&f=TXL&url=https%3A%2F%2Fwww.bol.com%2Fnl%2Fp%2Fintimina-ziggy-cup%2F9200000130869965%2F&name=Intimina%20-%20Ziggy%20Cup&subid=blog',
        '', 'https://cupkiezer.nl/wp-content/uploads/2017/08/yuuki_cupbox-copy.jpg');

INSERT INTO discs
(id, brand, capacity, design_feature, is_reusable, model, name, rim_width, width, material, shape, firmness,
 is_available_in_nl, link_to_store, link_to_review, image)
VALUES (7, 'Bamboozy', 50, 'Nederlands merk', true, 'M', 'Bamboozy disk', 7, 65, 1, 'rond', 'medium', true, '',
        'https://cupkiezer.nl/2022/04/nederlandse-disk-bamboozy-verkoopt-eigen-menstruatiedisks/',
        'https://cupkiezer.nl/wp-content/uploads/2017/08/yuuki_cupbox-copy.jpg');

INSERT INTO discs
(id, brand, capacity, design_feature, is_reusable, model, name, rim_width, width, material, shape, firmness,
 is_available_in_nl, link_to_store, link_to_review, image)
VALUES (8, 'Bamboozy', 65, 'Nederlands merk', true, 'L', 'Bamboozy disk', 7, 70, 1, 'rond', 'medium', true, '',
        'https://cupkiezer.nl/2022/04/nederlandse-disk-bamboozy-verkoopt-eigen-menstruatiedisks/',
        'https://cupkiezer.nl/wp-content/uploads/2017/08/yuuki_cupbox-copy.jpg');


INSERT INTO users (username, email_adress, password, role)
VALUES ('Nynke', 'info@email.nl', 'geheim0', 'ADMIN');
INSERT INTO users (username, email_adress, password, role)
VALUES ('User', 'info@email.nl', 'geheim1', 'gebruiker');
INSERT INTO users (username, email_adress, password, role)
VALUES ('Pim', 'info@email.nl', 'geheim2', 'diskToevoeger');


INSERT INTO brands (id, name, website, description)
VALUES (1, 'Bamboozy', 'https://website.com', 'Bamboozy heeft twee disks: een M (65mm) en een grotere L (70mm).');
INSERT INTO brands (id, name, website, description)
VALUES (2, 'Ziggy', 'https://website.com', 'Ziggy heeft veel discs');
INSERT INTO brands (id, name, website, description)
VALUES (3, 'Lumma', 'https://website.com', 'Lumma is een merk cup');


INSERT INTO pending_discs
(created_date, username, id, brand, capacity, design_feature, is_reusable, model, name,
 rim_width, width, material, shape, firmness, is_available_in_nl, link_to_store,
 link_to_review, image)
VALUES ('10-10-1988', 'Nynke', 1, 'Intimina', 20, 'geen steel', true, 'OS', 'Ziggy', 40, 40, 1, 'a', 'b', true, 'c',
        'd', 'e');

