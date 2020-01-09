CREATE TABLE iam_menu(id UUID PRIMARY KEY, parent_menu_id UUID, label VARCHAR(255), icon VARCHAR(255), sort_order INT, route VARCHAR(255));
CREATE TABLE role_menus(menu_id UUID, role VARCHAR(255));