use Project_Management;

-- Product table.
delimiter &&
drop procedure if exists getAllProducts;
create procedure if not exists getAllProducts()
begin
    select product_id, product_name, manufacturer, created, batch, quantity, product_status
    from product;
end &&

delimiter &&
drop procedure if exists getProductByPage;
create procedure if not exists getProductByPage(
    numPager int
)
begin
    declare limitValue int;
    declare offsetValue int;
    set @countProduct = (select count(product.product_id) from product);
    if (numPager * 10) < @countProduct
    then
        set limitValue = 10;
        set offsetValue = (numPager - 1) * 10;
    else
        set limitValue = @countProduct - (numPager - 1) * 10;
        set offsetValue = (numPager - 1) * 10;
    end if;
    select product_id, product_name, manufacturer, created, batch, quantity, product_status
        from product order by product_id
            limit limitValue offset offsetValue;
end &&

delimiter &&
drop procedure if exists searchForProductNameByPage;
create procedure if not exists searchForProductNameByPage(
    in ProductName varchar(150),
    numPager int
)
begin
    declare limitValue int;
    declare offsetValue int;
    set ProductName = concat('%', ProductName, '%');
    set @countProduct = (select count(product_id) from product
                         where product_name like ProductName);
    if (numPager * 10) < @countProduct
    then
        set limitValue = 10;
        set offsetValue = (numPager - 1) * 10;
    else
        set limitValue = @countProduct - (numPager - 1) * 10;
        set offsetValue = (numPager - 1) * 10;
    end if;
    select product_id, product_name, manufacturer, created, batch, quantity, product_status
        from product
            where product_name like ProductName
                order by product_id limit limitValue offset offsetValue;
end &&

delete from product where true;
call addNewProduct('P0001', 'Áo thun', 'Az shirt', null, 10, 50, true);
call addNewProduct('P0002', 'Áo thun dài tay', 'Az shirt', null, 10, 50, true);
call addNewProduct('P0003', 'Áo thun ngắn tay', 'Az shirt', null, 10, 50, true);
call addNewProduct('P0004', 'Áo thun màu', 'Az shirt', null, 10, 50, true);
call addNewProduct('P0005', 'Áo thun cổ tròn', 'Az shirt', null, 10, 50, true);
call addNewProduct('P0006', 'Áo thun in hình', 'Az shirt', null, 10, 50, true);
call addNewProduct('P0007', 'Áo thun cổ tim', 'Az shirt', null, 10, 50, true);
call addNewProduct('P0008', 'Áo khoác kéo dây', 'Az shirt', null, 10, 50, true);
call addNewProduct('P0009', 'Áo khoác gió', 'Az shirt', null, 10, 50, true);
call addNewProduct('P0010', 'Áo khoác bông', 'Az shirt', null, 10, 50, true);
call addNewProduct('P0011', 'Áo lông vũ', 'Az shirt', null, 10, 50, true);
call addNewProduct('P0012', 'Áo ba lỗ', 'Az shirt', null, 10, 50, true);
call addNewProduct('P0013', 'Áo len', 'Az shirt', null, 10, 50, true);
call addNewProduct('P0014', 'Áo len cổ lọ', 'Az shirt', null, 10, 50, true);
call addNewProduct('P0015', 'Áo len đan tay', 'Az shirt', null, 10, 50, true);
call addNewProduct('P0016', 'Áo sơ mi trắng', 'Az shirt', null, 10, 50, true);
call addNewProduct('P0017', 'Áo sơ mi trơn', 'Az shirt', null, 10, 50, true);
call addNewProduct('P0018', 'Áo sơ mi công sở', 'Az shirt', null, 10, 50, true);
call addNewProduct('P0019', 'Quần short', 'Az shirt', null, 10, 50, true);
call addNewProduct('P0020', 'Quần jean', 'Az shirt', null, 10, 50, true);
call addNewProduct('P0021', 'Quần âu', 'Az shirt', null, 10, 50, true);
call addNewProduct('P0022', 'Quần thể thao', 'Az shirt', null, 10, 50, true);
call addNewProduct('P0023', 'Quần unisex', 'Az shirt', null, 10, 50, true);
select * from product;

delimiter &&
drop procedure if exists getProductById;
create procedure if not exists getProductById(
    ProductId char(5)
)
begin
    select product_id, product_name, manufacturer, created, batch, quantity, product_status
        from product
            where BINARY(product_id) = BINARY(ProductId);
end &&

delimiter &&
drop procedure if exists getProductByName;
create procedure if not exists getProductByName(
    ProductName varchar(150)
)
begin
    select product_id, product_name, manufacturer, created, batch, quantity, product_status
        from product
            where BINARY(product_name) = BINARY(ProductName);
end &&

-- Employee table.
delimiter &&
drop procedure if exists getAllEmployees;
create procedure if not exists getAllEmployees()
begin
    select emp_id, emp_name, birth_of_day, email, phone, address, emp_status
    from employee;
end &&

delimiter &&
drop procedure if exists getEmployeeById;
create procedure if not exists getEmployeeById(
    EmployeeId char(5)
)
begin
    select emp_id, emp_name, birth_of_day, email, phone, address, emp_status
    from employee
    where BINARY(emp_id) = BINARY(EmployeeId);
end &&

delimiter &&
drop procedure if exists getEmployeeByName;
create procedure if not exists getEmployeeByName(
    EmployeeName varchar(100)
)
begin
    select emp_id, emp_name, birth_of_day, email, phone, address, emp_status
    from employee
    where BINARY(emp_name) = BINARY(EmployeeName);
end &&

delimiter &&
drop procedure if exists getEmployeeByPage;
create procedure if not exists getEmployeeByPage(
    numPager int
)
begin
    declare limitValue int;
    declare offsetValue int;
    set @countEmployee = (select count(emp_id) from employee);
    if (numPager * 10) < @countEmployee
    then
        set limitValue = 10;
        set offsetValue = (numPager - 1) * 10;
    else
        set limitValue = @countEmployee - (numPager - 1) * 10;
        set offsetValue = (numPager - 1) * 10;
    end if;
    select emp_id, emp_name, birth_of_day, email, phone, address, emp_status
    from employee order by emp_name
    limit limitValue offset offsetValue;
end &&

delimiter &&
drop procedure if exists searchForEmployeeNameByPage;
create procedure if not exists searchForEmployeeNameByPage(
    in EmployeeName varchar(150),
    numPager int
)
begin
    declare limitValue int;
    declare offsetValue int;
    set EmployeeName = concat('%', EmployeeName, '%');
    set @countEmployee = (select count(emp_id) from employee
                          where employee.emp_name like EmployeeName);
    if (numPager * 10) < @countEmployee
    then
        set limitValue = 10;
        set offsetValue = (numPager - 1) * 10;
    else
        set limitValue = @countEmployee - (numPager - 1) * 10;
        set offsetValue = (numPager - 1) * 10;
    end if;
    select emp_id, emp_name, birth_of_day, email, phone, address, emp_status
    from employee
    where employee.emp_name like EmployeeName
    order by emp_name limit limitValue offset offsetValue;
end &&

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
            where binary(user_name) = binary(Username);
end &&

delimiter &&
drop procedure if exists searchAccountByEmployeeId;
create procedure if not exists searchAccountByEmployeeId(
    EmployeeId char(5)
)
begin
    select acc_id, user_name, password, permission, emp_id, acc_status
    from account where emp_id = EmployeeId;
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

delimiter &&
drop procedure if exists getAccountByPage;
create procedure if not exists getAccountByPage(
    numPager int
)
begin
    declare limitValue int;
    declare offsetValue int;
    set @countAccount = (select count(acc_id) from account);
    if (numPager * 10) < @countAccount
    then
        set limitValue = 10;
        set offsetValue = (numPager - 1) * 10;
    else
        set limitValue = @countAccount - (numPager - 1) * 10;
        set offsetValue = (numPager - 1) * 10;
    end if;
    select acc_id, user_name, password, permission, emp_id, acc_status
    from account order by acc_id
    limit limitValue offset offsetValue;
end &&

delimiter &&
drop procedure if exists searchForAccountByPage;
create procedure if not exists searchForAccountByPage(
    in UName varchar(150),
    numPager int
)
begin
    declare limitValue int;
    declare offsetValue int;
    set UName = concat('%', UName, '%');
    set @countAccount = (select count(account.acc_id) from account
                        join project_management.employee e on e.emp_id = account.emp_id
                         where account.user_name like UName or e.emp_name like UName);
    if (numPager * 10) < @countAccount
    then
        set limitValue = 10;
        set offsetValue = (numPager - 1) * 10;
    else
        set limitValue = @countAccount - (numPager - 1) * 10;
        set offsetValue = (numPager - 1) * 10;
    end if;
    select acc_id, user_name, password, permission, e.emp_id, acc_status from account
        join project_management.employee e on e.emp_id = account.emp_id
            where account.user_name like UName or e.emp_name like UName
                order by acc_id limit limitValue offset offsetValue;
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
