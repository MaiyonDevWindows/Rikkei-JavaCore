drop schema if exists Project_Management;
create schema if not exists Project_Management;
use Project_Management;

drop table if exists product;
create table if not exists product
(
    product_id     char(5) primary key,
    product_name   varchar(150) not null unique,
    manufacturer   varchar(150) not null,
    created        DATE default null,
    batch          smallint     not null,
    quantity       int default (0) null,
    product_status bit default (1) null
);

drop table if exists employee;
create table if not exists employee
(
    emp_id       char(5) primary key,
    emp_name     varchar(100) not null unique,
    birth_of_day date null,
    email        varchar(100) not null,
    phone        varchar(100) not null,
    address      text         not null,
    emp_status   smallint     not null
);

drop table if exists account;
create table if not exists account
(
    acc_id     int auto_increment primary key,
    user_name  varchar(30) not null unique,
    password   varchar(30) not null,
    permission bit default (1) null,
    emp_id     char(5)     not null unique,
    acc_status bit default (1) null
);
alter table account
    add constraint fk_account_emp_id
        foreign key (emp_id) references employee(emp_id);

drop table if exists bill;
create table if not exists bill
(
    bill_id        bigint auto_increment primary key,
    bill_code      varchar(10) not null,
    bill_type      bit         not null,
    emp_id_created char(5)     not null,
    created        date null,
    emp_id_auth    char(5) not null,
    auth_date      date null,
    bill_status    smallint    not null default (0)
);
alter table bill
    add constraint fk_bill_emp_created
        foreign key (emp_id_created) references employee(emp_id);
alter table bill
    add constraint fk_bill_emp_auth
        foreign key (emp_id_auth) references employee(emp_id);

drop table if exists bill_detail;
create table if not exists bill_detail
(
    bill_detail_id bigint primary key auto_increment,
    bill_id        bigint    not null,
    product_id     char(5) not null,
    quantity       int     not null check ( quantity > 0 ),
    price          float   not null check ( price > 0 )
);
alter table bill_detail
    add constraint fk_bill_detail_bill
        foreign key (bill_id) references bill(bill_id);
alter table bill_detail
    add constraint fk_bill_detail_product
        foreign key (product_id) references product(product_id);

delimiter &&
drop procedure if exists checkDuplicateProductId;
create procedure if not exists checkDuplicateProductId(
    in ProductId char(5),
    out isDuplicate boolean
)
begin
    set isDuplicate = false;
    if exists (select 1 from product where product_id = ProductId) then
        set isDuplicate = false;
    end if;
end &&