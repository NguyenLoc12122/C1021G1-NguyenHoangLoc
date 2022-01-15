use student_manager;
--  Sử dụng hàm count để hiển thị số lượng sinh viên ở từng nơi
select address,count(student_id) as 'SL hoc vien'
from student
group by address;
-- Tính điểm trung bình các môn học của mỗi học viên bằng cách sử dụng hàm AVG va
select student.student_id,student.student_name,avg(mark)
from student join mark on student.student_id = mark.student_id
group by student.student_id,student.student_name
--  Hiển thị những bạn học viên co điểm trung bình các môn học lớn hơn 15
having AVG(Mark) > 15;
-- Hiển thị thông tin các học viên có điểm trung bình lớn nhất.
SELECT S.Student_Id, S.Student_Name, AVG(Mark)
FROM Student S join Mark M on S.Student_Id = M.Student_Id
GROUP BY S.Student_Id, S.Student_Name
-- Sử dụng Having và All để tìm học viên có điểm trung bình lớn nhất
HAVING AVG(Mark) >= ALL (SELECT AVG(Mark) FROM Mark GROUP BY Mark.Student_Id);
