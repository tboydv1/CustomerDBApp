
-- -----------------------------------------------------
-- Schema customer_db
-- -----------------------------------------------------
DROP SCHEMA IF exists `customer_db`;

CREATE SCHEMA IF NOT EXISTS `customer_db`;
USE `customer_db` ;

-- -----------------------------------------------------
-- Table `customer_db`.`Customer`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `customer_db`.`customer` (
  `customer_id` INT(11) NOT NULL AUTO_INCREMENT,
  `firstname` VARCHAR(45) NOT NULL,
  `lastname` VARCHAR(45) NOT NULL,
  `email` VARCHAR(45) NOT NULL,
  `phonenumber` VARCHAR(45) NULL,
  PRIMARY KEY (`customer_id`))
ENGINE = InnoDB;

