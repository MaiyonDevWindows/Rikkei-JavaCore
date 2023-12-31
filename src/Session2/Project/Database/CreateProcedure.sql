use Project_Management;

-- Add new product.
delimiter &&
drop procedure if exists addNewProduct;
create procedure if not exists addNewProduct(
    ProductId char(5),
    ProductName varchar(150),
    ManufacturerValue varchar(150),
    CreatedDate DATE,
    BatchValue smallint,
    QuantityValue int,
    ProductStatus bit
)
begin
    if CreatedDate is null
        then set @InsertDate = DATE(CURRENT_DATE);
    else set @InsertDate = CreatedDate;
    end if;
    if QuantityValue is null
        then set @InsertQuantity = 0;
    else set @InsertQuantity = QuantityValue;
    end if;
    if ProductStatus is null
        then set @InsertStatus = 1;
    else set @InsertStatus = ProductStatus;
    end if;
    insert into product
    values (ProductId, ProductName, ManufacturerValue,
            @InsertDate, BatchValue, @InsertQuantity, @InsertStatus);
end &&

-- Test add new product.
delete from product where true;
call addNewProduct('P0001', 'Áo thun', 'Uniqilo', null, 1, null, null);
select * from product;

delimiter &&
drop procedure if exists addNewEmployee;
create procedure if not exists addNewEmployee(
    EmployeeId char(5),
    EmployeeName varchar(100),
    BoD date,
    EmailValue varchar(100),
    PhoneValue varchar(100),
    AddressValue text,
    EmployeeStatus smallint
)
begin
    insert into employee
        values(EmployeeId, EmployeeName, BoD, EmailValue, PhoneValue, AddressValue, EmployeeStatus);
end &&

-- Test add new employee.
delete from employee where true;
call addNewEmployee('E0001','Nguyễn Văn A', '1999-10-02',
                    'maiyoinaisu1102@gmail.com', '0822206919', 'Something', 0);
select * from employee;

-- Add new account.
delimiter &&
drop procedure if exists addNewAccount;
create procedure if not exists addNewAccount(
    AccountId int,
    UName varchar(30),
    Pwd varchar(30),
    PermissionValue bit,
    EmployeeId char(5),
    AccountStatus bit
)
begin
    if PermissionValue is null
        then set @InsertPermission = 1;
    else set @InsertPermission = PermissionValue;
    end if;
    if AccountStatus is null
        then set @InsertStatus = 1;
    else set @InsertStatus = AccountStatus;
    end if;
    insert into account values (AccountId, UName, Pwd, @InsertPermission, EmployeeId, @InsertStatus);
end &&

-- Test add new Account.
delete from account where true;
call addNewAccount('1', 'Admin', 'Admin', null, 'E0001', null);
select * from account;

-- Add new Bill.
delimiter &&
drop procedure if exists addNewBill;
create procedure if not exists addNewBill(
    BillId bigint,
    BillCode varchar(10),
    BillType bit,
    EmployeeIdCreated char(5),
    CreatedDate date,
    EmployeeIdAuth char(5),
    AuthDate date,
    BillStatus smallint
)
begin
    if BillStatus is null
        then set @InsertStatus = 0;
    else set @InsertStatus = BillStatus;
    end if;
    insert into bill
        values (BillId, BillCode, BillType, EmployeeIdCreated, CreatedDate,
                EmployeeIdAuth, AuthDate, @InsertStatus);
end &&

-- Test add new bill.
delete from bill where true;
call addNewBill('1', 'BillCode1', 1, 'E0001', date(current_date),
                'E0001', date(current_date), null);
select * from bill;

-- Add new bill detail.
delimiter &&
drop procedure if exists addNewBillDetail;
create procedure if not exists addNewBillDetail(
    BillDetailId bigint,
    BillId bigint,
    ProductId char(5),
    QuantityValue int,
    PriceValue float
)
begin
    insert into bill_detail
        values (BillDetailId, BillId, ProductId, QuantityValue, Pricdelete from bill_detail where true;
call addNewBillDetail(1, 1, 'P0001', 10, 50);
select * from bill_detail;