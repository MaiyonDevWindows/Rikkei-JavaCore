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