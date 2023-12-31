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
call getAccountByUName('Admin');

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