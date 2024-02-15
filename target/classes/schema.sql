create table student
(
   id integer not null,
   name varchar(255) not null,
   passport_number varchar(255) not null,
   primary key(id)
);

create table employee
(
   employee_id integer not null,
   employee_name varchar(50) not null,
   employeeaddress varchar(60) not null,
   mobile integer not null,
   primary key(employee_id)
);
