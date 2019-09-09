CREATE TABLE `products`.`product` (
  `id` INT NOT NULL,
  `Name` VARCHAR(45) NULL,
  `Description` VARCHAR(45) NULL,
  `Category_id` INT NULL,
  `Size` VARCHAR(45) NULL,
  `Color` VARCHAR(45) NULL,
  `Discount` INT NULL,
  `ImageUrl` VARCHAR(200) NULL,
  `AvailableQuantity` INT NULL,
  `Price` VARCHAR(45) NULL,
  PRIMARY KEY (`id`));
  
  ALTER TABLE `products`.`product` 
CHANGE COLUMN `id` `id` INT(11) NOT NULL AUTO_INCREMENT ;

  
  CREATE TABLE `products`.`category` (
  `id` INT NOT NULL,
  `Name` VARCHAR(45) NULL,
  `Description` VARCHAR(45) NULL,
  `Active` VARCHAR(45) NULL,
  PRIMARY KEY (`id`));
