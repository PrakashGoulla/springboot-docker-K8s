CREATE TABLE orders (
  id INT AUTO_INCREMENT PRIMARY KEY,
  product_id INT NOT NULL,
  amountpaid DOUBLE DEFAULT NULL,
  orderstatus VARCHAR(250) NOT NULL,
  paymentstatus VARCHAR(250) DEFAULT NULL,
  orderedDate DATE DEFAULT NULL
);

ALTER TABLE `orders`.`orders` 
CHANGE COLUMN `id` `id` INT(11) NOT NULL AUTO_INCREMENT ;

ALTER TABLE `orders`.`orders` 
ADD COLUMN `orderprice` DOUBLE NOT NULL;

ALTER TABLE orders MODIFY paymentstatus VARCHAR(255);
