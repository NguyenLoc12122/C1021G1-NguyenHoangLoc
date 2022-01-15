use furama_database;
-- Hiển Thị thông tin của tất cả nhân viên có trong hệ thống có tên bắt đầu là 1 trong các ký tự "H,T,K" và có tối đa 15 kí tự.
select * from nhan_vien
where (ho_ten like 'H%' or ho_ten like 'T%' or ho_ten like 'k%') 
and char_length(ho_ten) <= 15; 
-- Hiển thị thông tin của tất cả khách hàng có độ tuổi từ 18 đến 50 tuổi và có địa chỉ ở “Đà Nẵng” hoặc “Quảng Trị”.
select * from khach_hang
where (round(datediff(curdate(),khach_hang.ngay_sinh)/365,0)>=18
and round(datediff(curdate(),khach_hang.ngay_sinh)/365,0)<=50)
and ((khach_hang.dia_chi like '%Đà Nẵng%' )
or (khach_hang.dia_chi like '%Quảng Trị%'));
-- Đếm xem tương ứng với mỗi khách hàng đã từng đặt phòng bao nhiêu lần. 
-- Kết quả hiển thị được sắp xếp tăng dần theo số lần đặt phòng của khách hàng. 
-- Chỉ đếm những khách hàng nào có Tên loại khách hàng là “Diamond”.
select kh.ma_khach_hang	,
kh.ho_ten,
count(hd.ma_khach_hang) 'total'
from khach_hang kh join loai_khach lk on kh.ma_loai_khach = lk.ma_loai_khach
join hop_dong hd on hd.ma_khach_hang = kh.ma_khach_hang
where lk.ma_loai_khach=1
group by kh.ma_khach_hang
order by count(hd.ma_khach_hang);