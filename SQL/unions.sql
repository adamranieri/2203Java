
select * from player;
select * from coach;
select * from team;

-- theta join
select * from player left join coach on player.salary < coach.salary ;

delete from player where player_id = 11 or player_id =12;

delete from team where team_id =4;
-- set operators combine tables vertically WITHOUT any predicate or qualification
-- Stack one table on top of another

select mascot from team
union
select name from player;
-- data in two seperate tables that is comprable

create table coach(
	coach_id serial primary key,
	name varchar(20),
	position varchar(20),
	salary int,
	t_id int references team(team_id) -- foreign key constraint
);

insert into coach values (default, 'Bill Murray', 'Head Coach', 1000000,1);
insert into coach values (default, 'Carter', 'Assistant Coach', 4000000,2);
insert into coach values (default, 'Phil Jackson', 'Apologist', 500000,2);

select * from coach;

-- what is the average salary in the league

select avg(salary) from (select salary from coach 
union
select salary from player) as x;
--------------------------------------------------------------------------------------


-- PL/SQL Procedural Language
-- SQL is a programming language, you can write functions in it
create function multiply(num1 int, num2 int ) returns  int as $$
	begin -- code block {
	
		return num1*num2;

	end;
	 $$ LANGUAGE plpgsql -- end code block }

select multiply(20,50);

update player set name = 'Adam 2' where player_id = 1;

select * from book ;
