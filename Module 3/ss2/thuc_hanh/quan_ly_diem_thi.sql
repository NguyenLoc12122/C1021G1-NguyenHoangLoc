use point_manager;
create table student(
id_student int,
`name` varchar(50),
birthday date,
grade varchar(50),
sex bit(1),
primary key(id_student)
);

create table `subject`(
id_subject int,
name_subject varchar(50),
id_teacher int,
primary key(id_subject),
foreign key(id_teacher) references teacher(id_teacher)
);

create table `point`(
`point` int,
test_day date,
id_student int,
id_teacher int,
primary key(test_day),
foreign key(id_student) references student(id_student),
foreign key(id_teacher) references teacher(id_teacher)
);

create table teacher(
id_teacher int,
name_teacher varchar(50),
phone varchar(50),
primary key(id_teacher) 
);
