create database student_manager;
use student_manager;

create table classroom1(
class_id int auto_increment not null,
 class_name varchar(60),
 start_date datetime,
 `status` bit(1),
 primary key(class_id)
 );
 
 create table student(
 student_id int auto_increment not null,
 student_name varchar(60),
 address varchar(50),
 phone varchar(20),
 `status` bit(1),
 class_id int not null,
 primary key(student_id),
 foreign key(class_id) references classroom1(class_id)
 );
 
 create table `subject`(
 sub_id int auto_increment not null,
 sub_name varchar(30),
 credit tinyint NOT NULL DEFAULT 1 CHECK ( Credit >= 1 ),
 status bit(1),
 primary key(sub_id)
 );
 
 create table mark(
 Mark_Id    INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    Sub_Id     INT NOT NULL,
    Student_Id INT NOT NULL,
    Mark      FLOAT   DEFAULT 0 CHECK ( Mark BETWEEN 0 AND 100),
    ExamTimes TINYINT DEFAULT 1,
    UNIQUE (Sub_Id, Student_Id),
    FOREIGN KEY (Sub_Id) REFERENCES Subject (Sub_Id),
    FOREIGN KEY (Student_Id) REFERENCES Student (Student_Id)
 );
 