drop database if exists fresher_book_management;
create database if not exists fresher_book_management;
use fresher_book_management;

drop table if exists Book;
create table if not exists Book(
    id int primary key auto_increment,
    name varchar(100) not null unique,
    price float,
    title varchar(200),
    author varchar(50),
    book_status bit
);

delimiter &&
drop procedure if exists get_all_book;
create procedure if not exists get_all_book()
begin
    select * from book;
end &&

delimiter &&
drop procedure if exists create_book;
create procedure if not exists create_book(
    book_name varchar(100),
    book_price float,
    book_title varchar(200),
    book_author varchar(50),
    status bit
)
begin
    insert into Book(name, price, title, author, book_status)
        values (book_name, book_price, book_title, book_author, status);
end &&

delimiter &&
drop procedure if exists update_book;
create procedure if not exists update_book(
    book_id int,
    book_name varchar(100),
    book_price float,
    book_title varchar(200),
    book_author varchar(50),
    status bit
)
begin
    update book
        set name = book_name,
            price = book_price,
            title = book_title,
            author = book_author,
            book_status = status
        where id = book_id;
end &&

delimiter &&
drop procedure if exists delete_book;
create procedure if not exists delete_book(
    book_id int
)
begin
    delete from book where id = book_id;
end &&

delimiter &&
drop procedure if exists get_book_by_id;
create procedure if not exists get_book_by_id(book_id int, out cnt_book int)
begin
    set cnt_book = (select count(id) from book where id = book_id);
end &&

delimiter &&
drop procedure if exists get_by_id;
create procedure if not exists get_by_id(book_id int)
begin
    select * from book where id = book_id;
end &&

call get_book_by_id(2, @count);
select @count;