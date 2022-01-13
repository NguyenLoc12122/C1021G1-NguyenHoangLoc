use student_manager;

-- Hiển thị tất cả các sinh viên có tên bắt đầu bảng ký tự ‘h’
select student.* from student where student.student_name like'h%';

-- Hiển thị các thông tin lớp học có thời gian bắt đầu vào tháng 12.
select classroom1.* from classroom1 where classroom1.start_date like '%-12-%';

-- Hiển thị tất cả các thông tin môn học có credit trong khoảng từ 3-5.
select `subject`.* from `subject` where credit between 3 and 5;

-- Thay đổi mã lớp(ClassID) của sinh viên có tên ‘Hung’ là 2.
update student set class_id = 2 where student_name ='Hung';

-- Hiển thị các thông tin: StudentName, SubName, Mark. Dữ liệu sắp xếp theo điểm thi (mark) giảm dần. nếu trùng sắp theo tên tăng dần.
insert into mark values (4,1,3,8,1);
select s.Student_Name,su.Sub_Name,m.Mark 
from student s join mark m on s.Student_Id=m.Student_Id join `subject` su on m.Sub_Id = su.Sub_Id
order by m.Mark desc ,s.Student_Name asc;