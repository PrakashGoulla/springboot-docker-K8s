DROP TABLE IF EXISTS orders;
 
CREATE TABLE orders (
  id INT AUTO_INCREMENT  PRIMARY KEY,
  product_id INT NOT NULL,
  amountpaid DOUBLE DEFAULT NULL,
  orderstatus VARCHAR(250) NOT NULL,
  paymentstatus VARCHAR(250) NOT NULL,
  orderedDate DATE DEFAULT NULL
);
 
INSERT INTO orders (product_id, amountpaid, orderstatus, paymentstatus, orderedDate) VALUES
  (1, 2899, 'Delivered', 'paid', '2019-09-11'),
  (2, 29919, 'Pending', 'COD', '2019-09-11'),
  (3, 2993, 'Shipped', 'COD', '2019-09-11');