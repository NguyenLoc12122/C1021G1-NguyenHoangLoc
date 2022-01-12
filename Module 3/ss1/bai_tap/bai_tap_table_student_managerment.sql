drop database if exists student_management;

create database student_management;
use student_management;

CREATE TABLE student (
    id INT NOT NULL,
    name VARCHAR(45) NULL,
    age INT NULL,
    country VARCHAR(45) NULL,
    PRIMARY KEY (id)
);
CREATE TABLE teacher (
    id INT NOT NULL,
    name VARCHAR(45) NULL,
    age INT NULL,
    country VARCHAR(45) NULL,
    PRIMARY KEY (id)
);
create table class(
id int auto_increment,
`name` varchar(40),
primary key(id)
);
insert into student
values (1,'loc',31,'Viet Nam'),(2,'hoang',25,'Viet Nam');
insert into class
values ('loc');