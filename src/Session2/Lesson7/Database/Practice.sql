-- Create database Shop_Management.
-- Tạo CSDL Shop_Management.
DROP DATABASE IF EXISTS Shop_Management;
CREATE DATABASE Shop_Management;
USE Shop_Management;

-- Tạo bảng Categories gồm các thông tin:
-- Mã danh mục, tên danh mục, trạng thái.

DROP TABLE IF EXISTS Categories;
CREATE TABLE Categories(
    category_id int auto_increment primary key,
    category_name varchar(50),
    category_status bit default 0
);

-- Tạo bảng Products gồm các thông tin:
-- Mã sản phẩm, tên sản phẩm, giá, ngày tạo, tiêu đề, mã danh mục, trạng thái.

DROP TABLE IF EXISTS Products;
CREATE TABLE Products(
    product_id int auto_increment primary key,
    product_name varchar(50),
    product_price float,
    created_date date,
    product_title varchar(50),
    category_id int not null,
    product_status bit default(0)
);
ALTER TABLE Products
    ADD CONSTRAINT fk_products_category_id
        FOREIGN KEY (category_id) REFERENCES Categories(category_id);

-- Tạo các Procedure.

-- Tạo ứng dụng Java console kết nối CSDL và thực hiện các chức năng.