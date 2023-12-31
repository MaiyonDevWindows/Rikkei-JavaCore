Create Database QuanLyDiemSV CHARACTER SET utf8mb4 COLLATE utf8mb4_vietnamese_ci;
use QuanLyDiemSV;
/*=============DANH MUC KHOA==============*/
Create table DMKhoa(
	MaKhoa char(2) primary key,
	TenKhoa nvarchar(30)not null
);
/*==============DANH MUC SINH VIEN============*/
Create table DMSV(
MaSV char(3) not null primary key,
HoSV nvarchar(15) not null,
TenSV nvarchar(7)not null,
Phai nchar(7),
NgaySinh datetime not null,
NoiSinh nvarchar (20),
MaKhoa char(2),
HocBong float
);
/*===================MON HOC========================*/
create table DMMH(
MaMH char (2) not null,
TenMH nvarchar (25)not null,
SoTiet tinyint,
Constraint DMMH_MaMH_pk primary key(MaMH)
);
/*=====================KET QUA===================*/
Create table KetQua
(
MaSV char(3) not null,
MaMH char (2)not null ,
LanThi tinyint,
Diem decimal(4,2),
Constraint KetQua_MaSV_MaMH_LanThi_pk primary key (MaSV,MaMH,LanThi)
);
/*==========================TAO KHOA NGOAI==============================*/
Alter table dmsv
add Constraint DMKhoa_MaKhoa_fk foreign key (MaKhoa)
References DMKhoa (MaKhoa);
Alter table KetQua
add constraint KetQua_MaSV_fk foreign key (MaSV) references DMSV (MaSV);
Alter table KetQua
add constraint DMMH_MaMH_fk foreign key (MaMH) references DMMH (MaMH);
/*==================NHAP DU LIEU====================*/
/*==============NHAP DU LIEU DMMH=============*/
Insert into DMMH(MaMH,TenMH,SoTiet)
values('01','Cơ Sở Dữ Liệu',45);
Insert into DMMH(MaMH,TenMH,SoTiet)
values('02','Trí Tuệ Nhân Tạo',45);
Insert into DMMH(MaMH,TenMH,SoTiet)
values('03','Truyền Tin',45);
Insert into DMMH(MaMH,TenMH,SoTiet)
values('04','Đồ Họa',60);
Insert into DMMH(MaMH,TenMH,SoTiet)
values('05','Văn Phạm',60);
/*==============NHAP DU LIEU DMKHOA=============*/
Insert into DMKhoa(MaKhoa,TenKhoa)
values('AV','Anh Văn');
Insert into DMKhoa(MaKhoa,TenKhoa)
values('TH','Tin Học');
Insert into DMKhoa(MaKhoa,TenKhoa)
values('TR','Triết');
Insert into DMKhoa(MaKhoa,TenKhoa)
values('VL','Vật Lý');
/*==============NHAP DU LIEU DMSV=============*/
Insert into DMSV
values('A01','Nguyễn Thị','Hải','Nữ','1990-03-20','Hà Nội','TH',130000);
Insert into DMSV(MaSV,HoSV,TenSV,Phai,NgaySinh,NoiSinh,MaKhoa,HocBong)
values('A02','Trần Văn','Chính','Nam','1992-12-24','Bình Định','VL',150000);
Insert into DMSV(MaSV,HoSV,TenSV,Phai,NgaySinh,NoiSinh,MaKhoa,HocBong)
values('A03','Lê Thu Bạch','Yến','Nữ','1990-02-21','TP Hồ Chí Minh','TH',170000);
Insert into DMSV(MaSV,HoSV,TenSV,Phai,NgaySinh,NoiSinh,MaKhoa,HocBong)
values('A04','Trần Anh','Tuấn','Nam','1990-12-20','Hà Nội','AV',80000);
Insert into DMSV(MaSV,HoSV,TenSV,Phai,NgaySinh,NoiSinh,MaKhoa,HocBong)
values('B01','Trần Thanh','Mai','Nữ','1991-08-12','Hải Phòng','TR',0);
Insert into DMSV(MaSV,HoSV,TenSV,Phai,NgaySinh,NoiSinh,MaKhoa,HocBong)
values('B02','Trần Thị Thu','Thủy','Nữ','1991-01-02','TP Hồ Chí Minh','AV',0);
/*==============NHAP DU LIEU BANG KET QUA=============*/
Insert into KetQua(MaSV,MaMH,LanThi,Diem)
values('A01','01',1,3);
Insert into KetQua(MaSV,MaMH,LanThi,Diem)
values('A01','01',2,6);
Insert into KetQua(MaSV,MaMH,LanThi,Diem)
values('A01','02',2,6);
Insert into KetQua(MaSV,MaMH,LanThi,Diem)
values('A01','03',1,5);
Insert into KetQua(MaSV,MaMH,LanThi,Diem)
values('A02','01',1,4.5);
Insert into KetQua(MaSV,MaMH,LanThi,Diem)
values('A02','01',2,7);
Insert into KetQua(MaSV,MaMH,LanThi,Diem)
values('A02','03',1,10);
Insert into KetQua(MaSV,MaMH,LanThi,Diem)
values('A02','05',1,9);
Insert into KetQua(MaSV,MaMH,LanThi,Diem)
values('A03','01',1,2);
Insert into KetQua(MaSV,MaMH,LanThi,Diem)
values('A03','01',2,5);
Insert into KetQua(MaSV,MaMH,LanThi,Diem)
values('A03','03',1,2.5);
Insert into KetQua(MaSV,MaMH,LanThi,Diem)
values('A03','03',2,4);
Insert into KetQua(MaSV,MaMH,LanThi,Diem)
values('A04','05',2,10);
Insert into KetQua(MaSV,MaMH,LanThi,Diem)
values('B01','01',1,7);
Insert into KetQua(MaSV,MaMH,LanThi,Diem)
values('B01','03',1,2.5);
Insert into KetQua(MaSV,MaMH,LanThi,Diem)
values('B01','03',2,5);
Insert into KetQua(MaSV,MaMH,LanThi,Diem)
values('B02','02',1,6);
Insert into KetQua(MaSV,MaMH,LanThi,Diem)
values('B02','04',1,10);

-- 1.
SELECT MaSV, HoSV, TenSV, HocBong
    FROM DMSV
        ORDER BY MaSV;
-- 2.
SELECT MaSV, CONCAT(HoSV, ' ', TenSV) AS 'Họ và tên', Phai, NgaySinh
    FROM DMSV
        ORDER BY Phai;
-- 3.
SELECT CONCAT(HoSV, ' ', TenSV) AS 'Họ và tên', NgaySinh, HocBong
    FROM DMSV
        ORDER BY NgaySinh, HocBong DESC;
-- 4.
SELECT MaMH, TenMH, SoTiet
    FROM DMMH
        WHERE TenMH LIKE 'T%';
-- 5.
SELECT CONCAT(HoSV, ' ', TenSV) AS 'Họ và tên', NgaySinh, Phai
    FROM DMSV;
-- 6.
SELECT MaKhoa, TenKhoa
    FROM DMKhoa
        WHERE TenKhoa LIKE '_N%';
-- 7.
SELECT *
    FROM DMSV
        WHERE HoSV LIKE '%Thi%';
-- 8.
SELECT MaSV, CONCAT(HoSV, ' ', TenSV) AS 'Full name', MaKhoa, HocBong
    FROM DMSV
        WHERE HocBong > 100000
            ORDER BY MaKhoa DESC;
-- 9.
SELECT CONCAT(HoSV, ' ', TenSV) AS 'Full name', MaKhoa, NoiSinh, HocBong
    FROM DMSV
        WHERE HocBong > 150000 AND NoiSinh like 'Hà Nội';
-- 10.
SELECT MaSV, DK.MaKhoa, Phai
    FROM DMSV JOIN DMKhoa DK on DMSV.MaKhoa = DK.MaKhoa
        WHERE TenKhoa LIKE 'Anh Văn' OR TenKhoa LIKE 'Vật Lý';
-- 11.
SELECT MaSV, NgaySinh, NoiSinh, HocBong
    FROM DMSV
        WHERE NgaySinh BETWEEN '1991-01-01' AND '1992-06-05';
-- 12.
SELECT MaSV, NgaySinh, Phai, MaKhoa
    FROM DMSV
        WHERE HocBong BETWEEN 80000 AND 150000;
-- 13.
SELECT MaMH, TenMH, SoTiet
    FROM DMMH
        WHERE SoTiet > 30 AND SoTiet < 45;
-- 14.
SELECT MaSV, CONCAT(HoSV, ' ', TenSV) AS 'Full name', TenKhoa, Phai
    FROM DMSV JOIN DMKhoa DK on DMSV.MaKhoa = DK.MaKhoa
        WHERE Phai LIKE 'Nam' AND (TenKhoa LIKE 'Anh Van' OR TenKhoa LIKE 'Tin hoc');
-- 15.
SELECT * FROM DMSV
    WHERE Phai LIKE 'Nu' AND TenSV LIKE '%N%';
-- 16.
SELECT HoSV, TenSV, NoiSinh, NgaySinh
    FROM DMSV
        WHERE NoiSinh LIKE 'Ha Noi' AND MONTH(NgaySinh) = 02;
-- 17.
SELECT CONCAT(HoSV, ' ', TenSV) AS 'Full name',
       YEAR(CURRENT_DATE) - YEAR(NgaySinh) AS 'Age', HocBong
    FROM DMSV
        WHERE YEAR(CURRENT_DATE) - YEAR(NgaySinh) > 20;
-- 18.
SELECT CONCAT(HoSV, ' ', TenSV) AS 'Full name',
       YEAR(CURRENT_DATE) - YEAR(NgaySinh) AS 'Age', TenKhoa
    FROM DMSV JOIN DMKhoa DK on DMSV.MaKhoa = DK.MaKhoa
        WHERE YEAR(CURRENT_DATE) - YEAR(NgaySinh) BETWEEN 20 AND 25;
-- 19.
SELECT CONCAT(HoSV, ' ', TenSV) AS 'Full name', Phai, NgaySinh
    FROM DMSV
        WHERE (MONTH(NgaySinh) BETWEEN 1 AND 3) AND YEAR(NgaySinh) = 1990;
-- 20.
SELECT MaSV, MaKhoa,
    IF(HocBong > 500000, 'Học bổng cao', 'Mức trung bình') AS 'Mức học bổng'
        FROM DMSV;
-- 21.
SELECT COUNT(*) AS 'Tổng số sinh viên' FROM DMSV;
-- 22.
SELECT COUNT(*) AS 'Tổng số sinh viên',
       COUNT(CASE WHEN Phai LIKE 'Nu' THEN 1 END) AS 'Tổng sinh viên nữ'
FROM DMSV;
-- 23.
SELECT COUNT(MaSV) AS 'Tổng sinh viên', TenKhoa
    FROM DMSV JOIN DMKhoa DK on DMSV.MaKhoa = DK.MaKhoa
        GROUP BY DK.MaKhoa;
-- 24.
SELECT COUNT(DMSV.MaSV) AS 'Tong sinh vien', TenMH
    FROM DMSV JOIN KetQua KQ on DMSV.MaSV = KQ.MaSV
        JOIN DMMH D on KQ.MaMH = D.MaMH
            GROUP BY D.MaMH;
-- 25.
SELECT D.MaSV, TenSV, COUNT(KQ.MaMH) AS 'Tong mon da hoc' FROM DMMH
    JOIN KetQua KQ on DMMH.MaMH = KQ.MaMH
    JOIN DMSV D on KQ.MaSV = D.MaSV
        GROUP BY D.MaSV;
-- 26.
SELECT D.MaKhoa, TenKhoa, COUNT(MaSV) AS 'Tổng số học bổng' FROM DMKhoa
    JOIN DMSV D on DMKhoa.MaKhoa = D.MaKhoa
        WHERE HocBong > 0
            GROUP BY D.MaKhoa;
-- 27.
SELECT D.MaKhoa, TenKhoa, MAX(HocBong) AS 'Học bổng cao nhất' FROM DMKhoa
     JOIN DMSV D on DMKhoa.MaKhoa = D.MaKhoa
        GROUP BY D.MaKhoa;
-- 28.
-- Sum * (ByCondition).
SELECT SUM(Phai LIKE 'Nam') AS 'Tổng số nam',
       SUM(PHAI LIKE 'Nu') AS 'Tổng số nữ'
    FROM DMSV;
-- 29.
SELECT YEAR(CURRENT_DATE) - YEAR(NgaySinh) AS 'Age',
       COUNT(MaSV) AS 'Số lượng sinh viên'
        FROM DMSV
            GROUP BY Age;
-- 30.
SELECT YEAR(NgaySinh) AS 'Năm sinh',
    COUNT(MaSV) AS 'Số lượng sinh viên'
        FROM DMSV
            GROUP BY YEAR(NgaySinh) HAVING COUNT(MaSV) = 2;
-- 31.
SELECT NoiSinh AS 'Nơi sinh',
    COUNT(MaSV) AS 'Số lượng sinh viên'
        FROM DMSV
            GROUP BY NoiSinh HAVING COUNT(MaSV) = 2;

SELECT HoSV, TenSV, TenKhoa, YEAR(CURDATE()) - YEAR(NgaySinh) AS 'TUOI' FROM DMSV sv, DMKhoa k
    WHERE sv.MaKhoa = K.MaKhoa
        AND k.TenKhoa LIKE 'ANH VAN'
        AND YEAR(CURDATE()) - YEAR(NgaySinh) = (SELECT MAX(YEAR(CURDATE()) - YEAR(NgaySinh)) FROM DMSV);

SELECT DMSV.MaSV, HoSV, TenSV, COUNT(Diem) FROM DMSV
    JOIN KetQua KQ on DMSV.MaSV = KQ.MaSV
        WHERE LanThi > 1
            GROUP BY DMSV.MaSV HAVING COUNT(DMSV.MaSV) >= 2;

SELECT DMSV.MaSV, HoSV, TenSV, count(MaMH) FROM DMSV
    JOIN KetQua KQ on DMSV.MaSV = KQ.MaSV
        WHERE LanThi > 1
            GROUP BY DMSV.MaSV;

SELECT DMSV.MaSV, HoSV, TenSV, KQ.LanThi, COUNT(Diem) AS 'Số môn thi rớt' FROM DMSV
    JOIN KetQua KQ on DMSV.MaSV = KQ.MaSV
        WHERE KQ.LanThi = 1 AND Diem <= 5
            GROUP BY DMSV.MaSV HAVING COUNT(Diem) >= 2;

select sv.HoSV as 'Họ sinh viên' ,
       sv.TenSV as 'Tên sinh viên',
       k.TenKhoa as 'Tên khoa',
       year(curdate()) - year(sv.NgaySinh) as 'Tuổi lớn nhất'
from DMSV sv, DMKhoa k
where sv.MaKhoa = k.MaKhoa and k.TenKhoa like 'Anh văn' and year(curdate()) - year(sv.NgaySinh) = (select max(year(curdate()) - year(sv.NgaySinh)) from DMSV);