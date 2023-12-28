drop database if exists Student_Management;
create database Student_Management;
use Student_Management;
-- Tạo bảng lớp sinh viên gồm các thông tin: mã lớp, tên lớp, trạng thái.
drop table if exists class;
create table class(
	class_id BIGINT UNSIGNED primary key auto_increment,
    class_name varchar(20) not null unique,
    class_status bit default(1)
);
select * from Student_Management.class;
-- Tạo bảng Student gồm các cột mã sinh viên, tên sinh viên, tuổi, địa chỉ, giới tính, trạng thái.
drop table if exists student;
create table student(
	student_id char(5) primary key,
    student_name varchar(50) not null,
    age int check(age >= 18),
    address text,
    gender bit default(1),
    student_status bit default(1)
) ENGINE = INNODB;
drop table if exists class_student;
create table class_student(
	class_id BIGINT UNSIGNED,
    student_id char(5),
    foreign key (class_id) references class(class_id),
    foreign key (student_id) references student(student_id),
    primary key(class_id, student_id)
) ENGINE = INNODB;
-- Thêm 1 cột vào bảng.
alter table student add column email varchar(50);
-- Sửa kiểu dữ liệu cột email thành text.
alter table student modify column email text;
-- Xoá 1 cột trong bảng.
alter table student drop column email;
-- Thêm constraint cho 1 cột.
alter table student add constraint student_unique_name unique(student_name);
-- Xoá constraint cho 1 cột.
alter table student drop constraint student_unique_name;

-- Lesson 3: MySQL Query.
-- Thêm 1 sinh viên đầy đủ các thông tin.
INSERT INTO student
    VALUES ('SV004', 'Nguyễn Văn D', 22, 'Hà Nội', 1, 1);
-- Thêm 2 sinh viên đầy đủ thông tin.
INSERT INTO student
    VALUES ('SV005', 'Nguyễn Văn E', 22, 'Hà Nội', 0, 1),
        ('SV006', 'Nguyễn Văn F', 22, 'Hà Nội', 0, 0);
-- 3. Thêm sinh viên với các thông tin mã, tên, tuổi, địa chỉ.
INSERT INTO student(student_id, student_name, age, address)
    VALUES ('SV007', 'Hoàng Thị Thuỳ', 21, 'Hà Nội');
-- 4.  Cập nhật sinh viên có mã sinh viên SV003.
UPDATE student
    SET student_name = 'Trịnh Văn Chiến'
        WHERE student_id = 'SV003';
-- 5. Xoá sinh viên có tên là Nguyễn Văn F.
DELETE FROM student WHERE student_name = 'Nguyễn Văn F';
-- 6. SELECT *: lấy tất cả dữ liệu.
SELECT * FROM student;
-- 7. SELECT: COLUMNS: lấy thông tin sinh viên gồm mã, tên, tuổi, giới tính.
SELECT st.student_id, student_name, st.age, st.gender FROM student st;
-- 8. SELECT: FUNCTIONS: lấy thông tin đã được tính toán xử lý.
SELECT st.student_id, student_name, st.age * 2 FROM student st;

-- 12. WHERE: >, <, >=, <=, =: Lấy thông tin sinh viên có tuổi lớn hơn 21.
SELECT * FROM student st
    WHERE st.age > 21;
-- 13. WHERE: AND, OR.
SELECT * FROM student st
    WHERE st.age > 21 AND st.gender = 1;
-- 14. WHERE: BETWEEN 10 AND 20: lấy thông tin trong khoảng.
SELECT * FROM student st
    WHERE st.age BETWEEN 10 AND 20;
-- 15. WHERE: IN(10, 20, 30): lấy thông tin sinh vin có tuổi 10, 20 hoặc 30.
SELECT * FROM student st
    WHERE st.age in (10, 20, 30);
-- _: đại diện cho 1 ký tự.
-- %: đại diện cho nhiều ký tự.
-- 16. WHERE: LIKE: lấy thông tin sinh viên có ký bắt đầu là N.
SELECT * FROM student st
    WHERE st.student_name LIKE 'N%';
-- 17. Lấy thông tin sinh viên có ký tự thứ 3 là u.
SELECT * FROM student st
    WHERE st.student_name LIKE '__u%';
-- 18. Lấy thông tin sinh viên có chứa ký tự a.
SELECT * FROM student st
    WHERE st.address LIKE '%a%';
-- 19. Lấy 3 sinh viên.
SELECT * FROM student LIMIT 3;
-- 20. LIMIT 3 OFFSET 2: lấy 3 dữ liệu từ vị trí 2.
SELECT * FROM student LIMIT 3 OFFSET 2;
-- 21. GROUP BY: tính tuổi trung bình sinh viên theo giới tính.
SELECT st.gender, avg(st.age) as 'Tuổi trung bình'
    FROM student st
        GROUP BY st.gender;
-- 22. Lấy nhóm giới tính có tuổi trung bình lớn hơn 23.
SELECT st.gender, AVG(st.age) AS 'Tuổi trung bình'
    FROM student st
        GROUP BY st.gender
            HAVING AVG(st.age) > 23;
-- 23. ORDER BY: Lấy thông tin sinh viên theo tuổi tăng dần.
SELECT * FROM student st
    ORDER BY st.age ASC;
-- 24. Lấy thông tin sinh viên theo tuổi tăng dần
-- tuổi bằng nhau thì theo tên giảm dần.
SELECT * FROM student st
    ORDER BY st.age ASC, st.student_name DESC;
-- 25. Câu lệnh truy vấn lồng.