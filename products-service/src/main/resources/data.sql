DROP TABLE IF EXISTS product;
 
CREATE TABLE product (
  id INT AUTO_INCREMENT  PRIMARY KEY,
  name VARCHAR(250) NOT NULL,
  availableQuantity INT DEFAULT NULL,
  price DOUBLE DEFAULT NULL,
  productCode VARCHAR(250) NOT NULL,
  productDescription VARCHAR(250) NOT NULL,
  productCategory VARCHAR(250) NOT NULL,
  imageUrl VARCHAR(250) NOT NULL
);
 
INSERT INTO product (name, availableQuantity, price, productCode, productDescription, imageUrl, productCategory) VALUES
  ('iPhone', 10, 28000, '128893', 'iphone test description', 'http://testImage.com/', 'electronics'),
  ('Lee', 10, 2500, '329873099', 'Lee test description', 'http://testImage.com/', 'Clothing'),
  ('Pressure Cooker', 10, 1000, '5748843', 'cooker test description', 'http://testImage.com/', 'Kitchen');