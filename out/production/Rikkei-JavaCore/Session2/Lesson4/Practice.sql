-- 1. Tạo CSDL Shop.
-- 2. Tạo các bảng:
-- 2.1. Bảng danh mục gồm các thông tin: mã danh mục, tên danh mục, độ ưu tiên (priority - int), trạng thái.
-- 2.2. Bảng sản phẩm gồm các thông tin: Mã sản phẩm, tên sản phẩm, giá, số lượng sản phẩm, tiêu đề sản phẩm, mô tả sản phẩm, ngày tạo sản phẩm, trạng thái sản phẩm.
-- 3. Viết các procedure sau:
-- 3.1. Các procedure cho phép lấy tất cả thông tin danh mục, thêm mới, cập nhật, xóa danh mục.
-- 3.2. Các procedure cho phép lấy tất cả thông tin sản phẩm, thêm mới, cập nhật, xóa sản phẩm.
-- 3.3. Procedure cho phép lấy thông tin danh mục theo mã danh mục.
-- 3.4. Procedure cho phép lấy thông tin sản phẩm the mã sản phẩm.
-- 3.5. Procedure cho phép lấy thông tin sản phẩm theo tên sản phẩm (tìm gần đúng).
-- 3.6. Procedure thống kê số lượng sản phẩm theo các danh mục.

DROP DATABASE IF EXISTS Shop_Management;
CREATE DATABASE Shop_Management;
USE Shop_Management;

DROP TABLE IF EXISTS Categories;
CREATE TABLE Categories(
    category_id int auto_increment primary key,
    category_name varchar(50),
    priority int default(0),
    category_status bit default (0)
);
DROP TABLE IF EXISTS products;
CREATE TABLE products(
    product_id int auto_increment primary key,
    product_name varchar(50),
    price float,
    quantity int,
    product_title varchar(50),
    product_description text,
    product_created_date date,
    product_status bit default(0),
    category_id int not null
);
ALTER TABLE products ADD CONSTRAINT fk_products_categoryid
    FOREIGN KEY (category_id) REFERENCES Categories(category_id);

DELIMITER &&
DROP PROCEDURE IF EXISTS getAllCategories;
CREATE PROCEDURE getAllCategories()
BEGIN
   SELECT category_id, category_name, priority, category_status FROM Categories;
END &&
CALL getAllCategories();

DELIMITER &&
DROP PROCEDURE IF EXISTS addNewCategory;
CREATE PROCEDURE addNewCategory(
    CategoryId int,
    CategoryName varchar(50),
    PriorityValue int,
    CategoryStatus bit
)
BEGIN
    INSERT INTO categories VALUES (CategoryId, CategoryName, PriorityValue, CategoryStatus);
END &&
CALL addNewCategory(1,'Áo Quần',1,1);
CALL getAllCategories();

DELIMITER &&
DROP PROCEDURE IF EXISTS updateCategory;
CREATE PROCEDURE updateCategory(
    CategoryId int,
    CategoryName varchar(50),
    PriorityValue int,
    CategoryStatus bit
)
BEGIN
    UPDATE Categories
        SET category_name = CategoryName,
            priority = PriorityValue,
            category_status = CategoryStatus
        WHERE category_id = CategoryId;
END &&
CALL updateCategory(1, 'Quần áo', 1, 1);
CALL getAllCategories();

DELIMITER &&
DROP PROCEDURE IF EXISTS deleteCategory;
CREATE PROCEDURE deleteCategory(
    CategoryId int
)
BEGIN
    DELETE FROM Categories WHERE category_id = CategoryId;
END &&
CALL deleteCategory(1);
CALL getAllCategories();
CALL addNewCategory(1,'Áo Quần',1,1);

DELIMITER &&
DROP PROCEDURE IF EXISTS getAllProduct;
CREATE PROCEDURE getAllProducts()
BEGIN
    SELECT product_id, product_name,
           price, quantity,
           product_title, product_description, product_created_date, product_status,
           category_id FROM products;
END &&
CALL getAllProducts();

DELIMITER &&
DROP PROCEDURE IF EXISTS addNewProduct;
CREATE PROCEDURE addNewProduct(
    ProductId int,
    ProductName varchar(50),
    PriceValue float,
    QuantityValue int,
    ProductTitle varchar(50),
    ProductDescription text,
    ProductCreatedDate date,
    ProductStatus bit,
    CategoryId int
)
BEGIN
    INSERT INTO products VALUES (ProductId,ProductName, PriceValue, QuantityValue,
                                 ProductTitle, ProductDescription, ProductCreatedDate,
                                 ProductStatus, CategoryId);
END &&
CALL AddNewProduct(1, 'Áo thun', 100000, 100,
     'Áo thun', 'Áo thun', '2023-11-01', 1, 1);
CALL getAllProducts();

DELIMITER &&
DROP PROCEDURE if exists updateProduct;
CREATE PROCEDURE updateProduct(
    ProductId int,
    ProductName varchar(50),
    PriceValue float,
    QuantityValue int,
    ProductTitle varchar(50),
    ProductDescription text,
    ProductCreatedDate date,
    ProductStatus bit,
    CategoryId int
)
BEGIN
    UPDATE products
        SET product_name = ProductName,
            price = PriceValue,
            quantity = QuantityValue,
            product_title = ProductTitle,
            product_description = ProductDescription,
            product_created_date = ProductCreatedDate,
            product_status = ProductStatus,
            category_id = CategoryId
        WHERE product_id = ProductId;
END &&
CALL updateProduct(1, 'Áo sơ mi', 100000, 100,
     'Áo thun', 'Áo thun', '2023-11-01', 1, 1);
CALL getAllProducts();

DELIMITER &&
DROP PROCEDURE IF EXISTS deleteProduct;
CREATE PROCEDURE deleteProduct(ProductId int)
BEGIN
    DELETE FROM products WHERE product_id = ProductId;
END &&
CALL deleteProduct(1);
CALL getAllProducts();
CALL AddNewProduct(1, 'Áo thun', 100000, 100,
     'Áo thun', 'Áo thun', '2023-11-01', 1, 1);

-- getCategoryById
DELIMITER &&
DROP PROCEDURE IF EXISTS getCategoryById;
CREATE PROCEDURE getCategoryById(CategoryId int)
BEGIN
    SELECT category_id, category_name, priority, category_status FROM Categories
        WHERE category_id = CategoryId;
END &&
CALL getCategoryById(1);

-- getProductById
DELIMITER &&
DROP PROCEDURE IF EXISTS getProductById;
CREATE PROCEDURE getProductById(ProductID int)
BEGIN
    SELECT product_id, product_name,
           price, quantity,
           product_title, product_description, product_created_date, product_status,
           category_id FROM products
        WHERE product_id = ProductID;
END &&
CALL getProductById(1);

-- getProductByName
DELIMITER &&
DROP PROCEDURE IF EXISTS getProductByName;
CREATE PROCEDURE getProductByName(ProductName varchar(50))
BEGIN
    SELECT product_id, product_name,
           price, quantity,
           product_title, product_description, product_created_date, product_status,
           category_id FROM products
        WHERE product_name LIKE concat('%', CAST(ProductName as char ), '%');
END &&;
call getAllProducts();
CALL getProductByName('ao');