drop database if exists Supplies_Management;
create database Supplies_Management;
use Supplies_Management;
-- Tạo bảng vật tư.
drop table if exists supplies;
create table supplies(
	supplies_id int auto_increment primary key,
    supplies_name varchar(50) not null unique
) ENGINE = INNODB;
-- Tạo bảng nhà cung cấp.
drop table if exists supplier;
create table supplier(
	supplier_id int auto_increment primary key,
    supplier_name varchar(50) not null unique,
    address text
) ENGINE = INNODB;
-- Tạo bảng cung cấp.
drop table if exists supply;
create table supply(
	supplier_id int not null primary key,
    phone_number varchar(20) not null
) ENGINE = INNODB;
alter table supply
    add constraint fk_supply_supplier_id
        foreign key (supplier_id) references supplier(supplier_id);
-- Tạo bảng đơn đặt hàng.
drop table if exists orders;
create table orders(
	order_id int auto_increment primary key,
    order_date date,
    supplier_id int not null
) ENGINE = INNODB;
alter table orders
    add constraint fk_orders_supplier
        foreign key (supplier_id) references supplier(supplier_id);
-- Tạo bảng chi tiết đơn đặt hàng.
drop table if exists order_detail;
create table order_detail(
	order_id int not null,
    supplies_id int not null,
    primary key (order_id, supplies_id)
) ENGINE = INNODB;
alter table order_detail
    add constraint fk_order_detail_orders
        foreign key (order_id) references orders(order_id);
alter table order_detail
    add constraint fk_order_detail_supplies
        foreign key (supplies_id) references supplies(supplies_id);
-- Tạo bảng phiếu nhập.
drop table if exists import_bill;
create table import_bill(
    import_bill_id int auto_increment primary key,
    import_date date
) ENGINE = INNODB;
drop table if exists import_detail;
create table import_detail(
    import_bill_id int not null,
    supplies_id int not null,
    primary key (import_bill_id, supplies_id)
) ENGINE = INNODB;
alter table import_detail
    add constraint fk_import_detail_bill
        foreign key (import_bill_id) references import_bill(import_bill_id);
alter table import_detail
    add constraint fk_import_detail_supplies
        foreign key (supplies_id) references supplies(supplies_id);
-- Tạo bảng phiếu xuất.
drop table if exists export_bill;
create table export_bill(
    export_bill_id int auto_increment primary key,
    export_date date
) ENGINE = INNODB;
drop table if exists export_detail;
create table export_detail(
    export_bill_id int not null,
    supplies_id int not null,
    primary key (export_bill_id, supplies_id)
) ENGINE = INNODB;
alter table export_detail
    add constraint fk_export_detail_bill
        foreign key (export_bill_id) references export_bill(export_bill_id);
alter table export_detail
    add constraint fk_export_detail_supplies
        foreign key (supplies_id) references supplies(supplies_id);