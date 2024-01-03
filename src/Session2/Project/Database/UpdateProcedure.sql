use Project_Management;

delimiter &&
drop procedure if exists updateProductById;
create procedure if not exists updateProductById(
    ProductId char(5),
    ProductName varchar(150),
    ManufacturerValue varchar(150),
    BatchValue smallint,
    in ProductStatus bit
)
begin
    update product
        set product_name = ProductName,
            manufacturer = ManufacturerValue,
            batch = BatchValue,
            product_status = ProductStatus
        where product_id = ProductId;
end &&

delimiter &&
drop procedure if exists updateEmployeeById;
create procedure if not exists updateEmployeeById(
    EmployeeId char(5),
    EmployeeName varchar(100),
    Bod date,
    EmailValue varchar(100),
    PhoneValue varchar(100),
    AddressValue text,
    EmployeeStatus smallint
)
begin
    update employee
    set emp_name     = EmployeeName,
        birth_of_day = Bod,
        email        = EmailValue,
        phone        = PhoneValue,
        address      = AddressValue,
        emp_status   =EmployeeStatus
    where emp_id = EmployeeId;
end &&