
-- creating a table
-- Singular named tables
create table employee(
	employee_id serial primary key , -- by making the field a primary key that value must always be unique. The main identifier for a record
	first_name varchar(20) not null, 
	last_name varchar(20) default 'None Provided', 
	salary int check (salary > 0) 
);

insert into employee values (default,'Adam','Ranieri',1000000);
insert into employee values (default,'Andrea', 'Ranieri', 99999);
insert into employee values (default,'Bill','Howardson', 60000);
insert into employee (employee_id, last_name,salary,first_name) values (default,'Smith',40000,'Jason');
insert into employee values(default,'Hank','Hill', 80000);
insert into employee values(default,'Bill',null,900);


insert into employee (employee_id,salary,first_name) values (505,40000,'Jason');

-- SQL queries are how you get infomration from your tables
-- Start with select

-- select first_name,last_name,salary from employee;
-- the * is a shorthand for everything
select * from employee;
-- select  what columns you want to view from table where filter on what records you see
select first_name,last_name from employee;

select * from employee where last_name = 'Ranieri';
-- return only the first name of every record where the salary is less than 100000
select first_name from employee where  salary < 100000;

-- delete (only affects data in the table not the table itself)
delete from employee ;
delete from employee where first_name = 'Adam';

-- update 
update employee set salary = 70000 where last_name = 'Howardson';
-- CRUD Create, Read, Update, Delete core data operations
-- Create = insert
-- Read = select
-- Update = update
-- Delete = delete

insert into employee values ('Jason', 'Smith', 40000);

drop table employee; -- will remove the table 

