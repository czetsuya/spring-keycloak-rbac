insert into iam_menu (id, parent_menu_id, label, sort_order, route) values (100, null, 'Trading', 1, null);
insert into role_menus (menu_id, role) values (100, 'ROLE_TRADINGMANAGER');

insert into iam_menu (id, parent_menu_id, label, sort_order, route) values (101, 100, 'Trading Region', 1, null);
insert into role_menus (menu_id, role) values (101, 'ROLE_TRADINGMANAGER');
insert into iam_menu (id, parent_menu_id, label, sort_order, route) values (103, 100, 'Trading Province', 3, null);
insert into role_menus (menu_id, role) values (103, 'ROLE_TRADINGMANAGER');
insert into iam_menu (id, parent_menu_id, label, sort_order, route) values (102, 100, 'Trading Branch', 2, null);
insert into role_menus (menu_id, role) values (102, 'ROLE_TRADINGMANAGER');

--

insert into iam_menu (id, parent_menu_id, label, sort_order, route) values (1, null, 'Product Management', 2, null);
insert into role_menus (menu_id, role) values (1, 'ROLE_CATALOGMANAGER');

insert into iam_menu (id, parent_menu_id, label, sort_order, route) values (2, 1, 'Dealers', 1, null);
insert into role_menus (menu_id, role) values (2, 'ROLE_CATALOGMANAGER');
insert into iam_menu (id, parent_menu_id, label, sort_order, route) values (3, 1, 'Dealer Groups', 2, null);
insert into role_menus (menu_id, role) values (3, 'ROLE_CATALOGMANAGER');

--

insert into iam_menu (id, parent_menu_id, label, sort_order, route) values (200, null, 'Sales', 3, null);
insert into role_menus (menu_id, role) values (200, 'ROLE_SALESMANAGER');
insert into role_menus (menu_id, role) values (200, 'ROLE_PROMOTER');

insert into iam_menu (id, parent_menu_id, label, sort_order, route) values (201, 200, 'Sellout', 1, null);
insert into role_menus (menu_id, role) values (201, 'ROLE_SELLOUTMANAGER');