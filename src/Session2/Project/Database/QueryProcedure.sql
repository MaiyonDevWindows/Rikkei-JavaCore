use Project_Management;

-- Product table.
delimiter &&
drop procedure if exists getAllProducts;
create procedure if not exists getAllProducts()
begin
    select product_id, product_name, manufacturer, created, batch, quantity, product_status
    from product;
end &&
call getAllProducts();

delimiter &&
drop procedure if exists getProductById;
create procedure if not exists getProductById(
    ProductId char(5)
)
begin
    select product_id, product_name, manufacturer, created, batch, quantity, product_status
    from product
    where product_id = ProductId;
end &&
call getProductById('P0001');

-- Employee table.
delimiter &&
drop procedure if exists getAllEmployees;
create procedure if not exists getAllEmployees()
begin
    select emp_id, emp_name, birth_of_day, email, phone, address, emp_status
    from employee;
end &&
call getAllEmployees();

delimiter &&
drop procedure if exists getEmployeeById;
create procedure if not exists getEmployeeById(
    EmployeeId char(5)
)
begin
    select emp_id, emp_name, birth_of_day, email, phone, address, emp_status
    from employee
    where emp_id = EmployeeId;
end &&
call getEmployeeById('E0001');

-- Account table.
delimiter &&
drop procedure if exists getAllAccounts;
create procedure if not exists getAllAccounts()
begin
    select acc_id, user_name, password, permission, emp_id, acc_status
    from account;
end &&
call getAllAccounts();

delimiter &&
drop procedure if exists getAccountById;
create procedure if not exists getAccountById(
    AccountId int
)
begin
    select acc_id, user_name, password, permission, emp_id, acc_status
    from account
    where acc_id = AccountId;
end &&
call getAccountById('1');

delimiter &&
drop procedure if exists getAccountByUName;
create procedure if not exists getAccountByUName(
    Username varchar(30)
)
begin
    select acc_id, user_name, password, permission, emp_id, acc_status
    from account
    where user_name = Username;
end &&

delimiter &&
drop procedure if exists getAccountByUnameNPwd;
create procedure if not exists getAccountByUnameNPwd(
    UName varchar(30),
    Pwd varchar(30)
)
begin
    select acc_id, user_name, password, permission, emp_id, acc_status
    from account
    where BINARY(user_name) = BINARY(UName) and BINARY(password) = BINARY(Pwd);
end &&

-- bill.
delimiter &&
drop procedure if exists getAllBills;
create procedure if not exists getAllBills()
begin
    select bill_id, bill_code, bill_type, emp_id_created, created, emp_id_auth, auth_date, bill_status
    from bill;
end &&
call getAllBills();

delimiter &&
drop procedure if exists getBillById;
create procedure if not exists getBillById(
    BillId bigint
)
begin
    select bill_id, bill_code, bill_type, emp_id_created, created, emp_id_auth, auth_date, bill_status
    from bill
    where bill_id = BillId;
end &&
call getBillById('1');

-- Bill details.
delimiter &&
drop procedure if exists getAllBillDetails;
create procedure if not exists getAllBillDetails()
begin
    select bill_detail_id, bill_id, product_id, quantity, price
    from bill_detail;
end &&
call getAllBillDetails();

delimiter &&
drop procedure if exists getBillDetailById;
create procedure if not exists getBillDetailById(
    BillDetailId bigint
)
begin
    select bill_detail_id, bill_id, product_id, quantity, price
    from bill_detail
    where bill_id = BillDetailId;
end &&
call getBillDetailById('1');



-- Login account.
-- Check account exists.
delimiter &&
drop procedure if exists checkAccountExists;
create procedure if not exists checkAccountExists(
    uname varchar(30),
    pwd varchar(30),
    out result boolean
)
begin
    if (select count(*) from account where user_name = uname and password = pwd)
        then set result = true;
    else set result = false;
    end if;
end &&
-- Check account status (active/inactive).
delimiter &&
drop procedure if exists checkAccountStatus;
create procedure if not exists checkAccountStatus(
    uname varchar(30),
    out result boolean
)
begin
    if (select acc_status from account where user_name = uname)
        then set result = true;
    else set result = false;
    end if;
end &&

-- Check account permission (user/admin).
delimiter &&
drop procedure if exists checkAccountPermission;
create procedure if not exists checkAccountPermission(
    uname varchar(30),
    out result boolean
)
begin
    if (select permission from account where user_name = uname)
        then set result = true;
    else set result = false;
    end if;
end &&

delete from bill_detail where true;
delete from bill where true;
delete from product where true;
delete from account where true;
delete from employee where true;
-- Samples data
insert into employee (emp_id, emp_name, birth_of_day, email, phone, address, emp_status)
    values ('E0001', 'Nguyễn Hồng Quân', '1999-10-02', 'maiyonaisu1102@gmail.com', '0822206919', 'something', 0),
    ('E0002', 'Nguyễn Văn A', '2002-10-02', 'nva0210@gmail.com', '0913052666', 'something', 0),
    ('E0003', 'Nguyễn Văn B', '2002-10-03', 'nvb0210@gmail.com', '0913052789', 'something', 0);
insert into account (acc_id, user_name, password, permission, emp_id, acc_status)
    values (1, 'Admin', 'Admin', 0, 'E0001', 1),
    (2, 'user_normal', '123456', 1, 'E0002', 1),
    (3, 'user_blocked', '123456', 1, 'E0003', 0);
