create database basketballdb;

-- Basketball ABA (American Basketball Association)

create table team(
	team_id serial primary key,
	name varchar(30) unique,
	hometown varchar(50) not null,
	mascot varchar (30) 
);

create table player(
	player_id serial primary key,
	name varchar(30), 
	salary int check (salary> 0),
	t_id int references team(team_id) -- column saying what team the player plays for
	-- genreates a foreign key that prevents orphan records
);

create table game(
	game_id serial primary key,
	location varchar(50)
);

-- create a link between a game and a player
create table player_game(
	pg_id serial primary key,
	player_id int references player(player_id),
	game_id int references game(game_id)
)

insert into  player_game values (default, 1, 1);
insert into player_game values (default,1, 2);
insert into player_game values (default,4,3 );

select * from player_game;

insert into game values(default, 'Funky Town');
insert into game values(default, 'Madison Square Garden');
insert into game values(default, 'Morgantown');


insert into team values (default, 'Grand Dunk Railroad', 'Funky Town', 'The Conductor');
insert into team values (default, 'Monstars', 'Moron Mountain', 'The Monster');
insert into team values (default, 'Muttonchop Moutaineers', 'Morgantown', 'The Mountaineer');
insert into team values (default, 'The Utah Jazz', 'Salt Lake City', null);


insert into player values (default, 'Adam',10000000,1);
insert into player values (default, 'Billy',50000,1);

insert into player values (default, 'Chucky',60000,2);
insert into player values (default, 'Ursula',70000,2);
insert into player values (default, 'Dracula',90000,2);

insert into player values (default, 'Jerry West',1000000,3);
insert into player values (default, 'Will Grier',50000,3);

select * from player;
select  * from team;
select * from game;
-- Having data in many tables intrisically spreads out your data and makes it harder to look at 
-- Who are are all the players on monstars?
-- You can use JOINS when you have a query that requires multiple tables to answer. This happens ALL the time
-- Join is DENORMALIZING your database but generated a new temporary virtual table to view and make queries on 
-- Denormalized data takes up more disk space but is easier to read

select * from player left join team on player.t_id = team.team_id;
-- left join, right join, inner join  + a join predicate
-- left join take all records on the left and connect it to a record on the right table 'on' two columns that serve as a connection 

select * from player right join team on player.t_id = team.team_id;
-- right join take all records on the right and connect it to a record on the left table 'on' two columns that serve as a connection 

select * from player inner join team on player.t_id = team.team_id;
-- inner join will only show records where there is a match

--Get the hometown of every player
select player.name, team.hometown from player left join team on player.t_id = team.team_id;

-- Orphan records. A record that referenes a record in another table that DOES NOT exist
-- this is bad from a data integrity perspective
-- you want a constraint that would prevent adding a record as an orphan
-- a Foreign key is a constraint that prevents orphan records
insert into player values (default, 'Kim',40000, 10);


-- Scalar functions
-- functions in postgres that take a single input and give a single output 
-- upper, round, lower,  
select * from upper('hi everyone!') ;

select upper(name) from player;

-- Aggregate functions
-- functions that requrie multiple inputs/records to give a meaningful output
-- max, avg, min, count

-- what is the average salary of a player?
select avg(salary) from player;

-- aggregate functions can have a group by clause
-- what is the averarage salary PER team. 
select avg(salary), t_id from player group by t_id;

-- Display the average salary per team
select avg(salary),team.name from player left join team on t_id = team_id group by team.name;

-- In most relational database the core unit of database interaction is the transaction
-- 1-several sql statements executed together

select * from player ;

insert into player values (default, 'Mike', 100000, 4);
insert into player values (default, 'Edward', 100000, 4);

commit; -- physically persist any data changes to the database
rollback; -- undo any sql staments since the last commit
-- A transaction is the series of  sql statements in between commits

-- Sub queries/ nested queires are just two or more selects in a single statement
-- Nested queries canb inefficient and often there is a different more efficient syntax for the same result
select name from (select * from player where salary >90000) as x;


