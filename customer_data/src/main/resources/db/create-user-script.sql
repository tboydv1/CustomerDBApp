DROP USER 'springapp_user'@'localhost';

CREATE USER 'springapp_user'@'localhost' IDENTIFIED BY 'mypassword';

GRANT ALL PRIVILEGES ON customer_db.* TO 'springapp_user'@'localhost';

FLUSH PRIVILEGES;