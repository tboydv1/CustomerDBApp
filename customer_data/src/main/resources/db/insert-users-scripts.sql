/*--SET FOREIGN_KEY_CHECKS = 0;*/ 
TRUNCATE TABLE `customer_db`.`customer`;
/*--SET FOREIGN_KEY_CHECKS = 1-- */


INSERT INTO `customer_db`.`customer` (`customer_id`, `firstname`,`lastname`, `email`)

VALUES(7, 'Shola', 'makinde', 'shola@mail.com'),
(3, 'jonathan', 'maurice', 'john@mail.com'),
(6, 'blessing', 'shaul', 'blessing@mail.com');

