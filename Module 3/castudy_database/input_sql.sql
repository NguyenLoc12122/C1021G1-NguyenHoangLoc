use furama_database;
insert into furama_database.vi_tri
values
(1,'Quản Lý'),
(2,'Nhân Viên');
insert into furama_database.trinh_do
values
(1,'Trung Cấp'),
(2,'Cao Đẳng'),
(3,'Đại Học'),
(4,'Sau Đại Học');
insert into furama_database.bo_phan
values
(1,'Sale-Marketing'),
(2,'Hành chính'),
(3,'Phục vụ'),
(4,'Quản lý');
insert into furama_database.nhan_vien
values
(1,'Lê Phước Hoàng','1999-10-06','201616161',10000000,'0905999991','phuochoang@gmail.com','Đà Nẵng',1,3,1),
(2,'Nguyễn Minh Đông','1995-03-12','201616162',12000000,'0905999992','minhdong@gmail.com','Đà Nẵng',1,3,2),
(3,'Trần Bùm','2003-04-08','201616163',8000000,'0905999993','tranbum@gmail.com','Đà Nẵng',2,2,3),
(4,'Nguyễn Hùng Sơn','1994-05-10','201616164',17000000,'0905999994','hungson@gmail.com','Quảng Trị',1,4,4),
(5,'Trần Văn Linh','1998-01-01','201616165',11000000,'0905999995','vanlinh@gmail.com','Huế',1,3,2),
(6,'Hồ Linh Đan','1997-07-07','201616166',15000000,'0905999996','linhdan@gmail.com','Hà Nội',1,3,1),
(7,'Hoàng Ngọc Thắng','2002-05-06','201616167',7000000,'0905999997','ngocthang@gmail.com','Hội An',2,1,3),
(8,'Khúc Hạo','1993-08-09','201616168',8000000,'0905999998','khuchao@gmail.com','Quảng Trị',2,2,3),
(9,'Trần Thị Thảo','1994-12-12','201616169',20000000,'0905999999','thao@gmail.com','Đà Nẵng',1,4,4);

insert into furama_database.loai_khach
values
(1,'Diamond'),
(2,'Platinium'),
(3,'Gold'),
(4,'Silver'),
(5,'Member');

insert into furama_database.khach_hang
values
(1,1,'Nguyễn Thị Tô Hoài','1964-11-05',0,'207584321','0914380252','tohoai@gmail.com','Hà Nội'),
(2,3,'Phạm Nhật Cường','1993-12-12',1,'207584322','0954333333','nhatcuong@gmail.com','Quảng Trị'),
(3,1,'Trương Văn Định','1991-02-27',1,'207584323','0373213122','vandinh@gmail.com',' Vinh'),
(4,1,'Dương Quá','1985-07-08',1,'207584324','0490039241','duongqua@gmail.com','Đà Nẵng'),
(5,4,'Hoàng Trần Nhi Nhi','1987-04-08',0,'207584325','0312345678','nhinhi123@gmail.com','Gia Lai'),
(6,5,'Tôn Nữ Vỹ Linh','2005-12-06',0,'207584326','0988888844','tonvylinh@gmail.com','Đà Nẵng'),
(7,1,'Nguyễn Hoài Ly','1984-04-08',0,'207584327','0912345698','hoaily@gmail.com','Hồ Chí Minh'),
(8,1,'Nguyễn Quốc Hải','1959-10-18',1,'207584328','0905460999','quochai@gmail.com','Quy Nhơn'),
(9,3,'Trần Quốc Tuấn','1969-07-01',1,'207584329','0643343433','quoctuan@gmail.com','Quảng Ngãi'),
(10,2,'Hồ Nhật Hiếu','1989-07-07',1,'207584330','0987654321','nhathieu@gmail.com','Đà Nẵng');

insert into furama_database.kieu_thue
values
(1,'year'),
(2,'month'),
(3,'day'),
(4,'hour');

insert into furama_database.loai_dich_vu
values
(1,'Villa'),
(2,'House'),
(3,'Room');

insert into furama_database.dich_vu
values
(1,'Villa Beach Front',25000,10000000,10,3,1,'vip','Có hồ bơi',500,4),
(2,'House Princess 01',14000,5000000,7,2,2,'vip','Có thêm bếp nướng',null,3),
(3,'Room Twin 01',5000,1000000,2,4,3,'normal','Có tivi',null,null),
(4,'Villa No Beach Front',22000,9000000,8,3,1,'normal','Có hồ bơi',300,3),
(5,'House Princess 02',10000,4000000,5,3,2,'normal','Có thêm bếp nướng',null,2),
(6,'Room Twin 02',3000,900000,2,4,3,'normal','Có tivi',null,null);

insert into furama_database.hop_dong
values
(1,'2020-12-08','2020-12-08',0,3,1,3),
(2,'2020-07-14','2020-07-21',200000,7,3,1),
(3,'2021-03-15','2021-03-17',50000,3,4,2),
(4,'2021-01-14','2021-01-18',100000,7,5,5),
(5,'2021-07-14','2021-07-15',0,7,2,6),
(6,'2021-06-01','2021-06-03',0,7,7,6),
(7,'2021-09-02','2021-09-05',100000,7,4,4),
(8,'2021-06-17','2021-06-18',150000,3,4,1),
(9,'2020-11-19','2020-11-19',0,3,4,3),
(10,'2021-04-12','2021-04-14',0,9,3,5),
(11,'2021-04-25','2021-04-25',0,2,2,1),
(12,'2021-05-25','2021-05-27',0,7,10,1);

insert into furama_database.dich_vu_di_kem
values
(1,'Sân golt',15000000,'furama','Tốt'),
(2,'Xe Điện',200000,'Tiên Sa','Tốt'),
(3,'Hướng Dẫn Viên Du lịch',1000000,'Đà Nẵng','tốt');
insert	into furama_database.hop_dong_chi_tiet
values
(1,2,4,1),
(2,2,5,2),
(3,2,6,3),
(4,3,1,1),
(5,3,2,2),
(6,1,3,3),
(7,1,2,2),
(8,12,2,2);
