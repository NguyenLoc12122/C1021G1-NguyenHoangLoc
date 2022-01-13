use student_manager;

INSERT INTO Classroom1 (class_name,start_date,`status`)
VALUES ( 'A1', '2008-12-20', 1);
INSERT INTO Classroom1 (class_name,start_date,`status`)
VALUES ( 'A2', '2008-12-22', 1);
INSERT INTO Classroom1 (class_name,start_date,`status`)
VALUES ( 'B3', current_date, 0);

INSERT INTO Student (student_name, address, phone, `status`, class_id)
VALUES ('Hung', 'Ha Noi', '0912113113', 1, 1);
INSERT INTO Student (student_name, address, phone, `status`, class_id)
VALUES ('Hoa', 'Hai phong','', 1, 1);
INSERT INTO Student (student_name, address, phone, `status`, class_id)
VALUES ('Manh', 'HCM', '0123123123', 0, 2);

INSERT INTO `Subject` (sub_name,credit,`status`)
VALUES ( 'CF', 5, 1),
       ( 'C', 6, 1),
       ( 'HDJ', 5, 1),
       ( 'RDBMS', 10, 1);

INSERT INTO Mark (Sub_Id, Student_Id, Mark, ExamTimes)
VALUES (1, 1, 8, 1),
       (1, 2, 10, 2),
       (2, 1, 12, 1);	