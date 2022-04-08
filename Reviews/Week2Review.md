# Week 2 Review

## Cloud Computing
- Abstracting IT infrastructure and architecture over the web.
  - Pros
    - Fast
    - Efficient and scalbility (pay only for what you need)
    - Much less set up and physically setting up the IT resourceses and server
  - Cons
    - You do need the internet
    - Reliance on a cloud vendor

## AWS
- The largest and oldest cloud vendor
- **Regions**
  - Geographic locations of their data centers
    - N.Virginia, Ohio, Syndney
- **Availability Zone**
  - The physical building in that region
  - Most regions have several AZs for redundancy purposes
- **Secruity Group**
  - Collection of firewall rules around your cloud resources 
  - Restrict traffic based on several criteria
    - IP Address
    - Type of traffic
    - Port
  - Best practice is to block everything that is non-essential to interact with that resource
- **RDS**
  - Relational Database Service
  - Create Databases servers in the cloud

## Creating a database
1. select RDS in the aws console
2. click create database
3. select postgres
4. public accessibility is yes
5. free tier
6. Database is deployed
7. Ensure that the security associated with the database allows you to communicate with it

## Relational Databases
- Any database stores information in a persistent *physical* medium
- **Relational Databases** store information in tables that can reference each other
- **RDBMS**
  - Relational Database Management System
    - Postgres
    - MySQL
    - MariaDB
    - Oracle
    - Microsoft SQL Server
- **Table**
  - Core unit of data storage
  - **Columns/Attributes**
    - vetical properties of the table
  - **Rows/Records**
    - Individual data records in that table
- **Schema**
  - The layout of your database 
    - Tables
    - Constraints
- **Constraints**
  - Restrictions on what data can go in a column
    - primary key
    - not null
    - unique
    - check
    - references *foreign key*
    - default
- **View**
  - Virtual table generated from a SELECT
  - It does not exist physically
- **ERD**
  - Entity Relationship Diagram
  - Visual representation of the tables in the database

## SQL
- **Structured Query Language**
  - It is a programming language
  - *Domain Specific Language* designed for database managament specifically
- **Sublanguage of SQL**
  - **DDL**
    - Data Definition Language
    - Anything changes the schema of the database
    - CREATE, ALTER, DROP
  - **DML**
    - Data manipulation language
    - Anything that changes the *data within* a table
    - INSERT, UPDATE, DELETE
  - **DQL**
    - Data Query Language
    - SELECT
  - **TCL**
    - Transaction Control language
    - Anything that invloves commiting or undoing transactions
    - COMMIT, ROLLBACK, SAVEPOINT
  - **DCL**
    - Data Control Lanuage
    - manage access the database
      - Create a user that can read anything from the database but nothing
    - GRANT, REVOKE

## Normalization
- Process of eliminating redundancy in a database
- Normalization is *NOT* inherently a good thing
  - Normalized is more efficient to store
  - Normalized is more efficient to make updates/insertions
  - Normalized is often hard to read
    - JOINS exist specifically to denormalize so we can make queries
## Normalized Forms
- **1NF**
  - Data is atomic
    - No columns that could be broken down into smaller columns
  - Each record is uniquely identifiable
    - Primary Key
  - No Column has array like information
- **2NF**
  - No Functional dependencies
  - No column could be calculated from the values of other columns
- **3NF**
  - No transitive dependencies
  - No data in a column could be found elsewhere in a database

## Multiplicites
- Tables can relate to each other in three ways
  - **one-one**
    - One record in one table is connnected to exactly one record in another table
      - Why is it not just one table at that point?
  - **Many-one**
    - Many records refer to one record
  - **Many-Many**
    - Many Records in one table refer to Many records in another table
    - Require a **join table**
      - Sometimes referred to as a *through table*

## Foreign key
- **Referential Integrity**
  - That foreign keys ALWAYS point to valid parent records
- Primary way of connecting and references between tables
- It ensures that there is not **orphan records**
  - Child records that refer to a parent that does not exist
- Child table has the foreign key
- Parent table is the one referenced by the foreign key
- **Cascade**
  - To prevent orphan records databases will not allow you to delete a parent that has children
  - Delete cascasde will remove the children when deleting the parent

## Joins and Set Operators
- normalized is not always queryable
- Joins and set operators combine tables to make them easy to query
- **Set Operators**
  - Vertically combine two tables.
  - Must be the same data types and column width
    - UNION
    - MINUS
    - INTERSECT
- **Joins**
  - Horizontally combine two tables based on join predication
    - on team.team_id = player.t_id
[Joins](https://www.dofactory.com/img/sql/sql-joins.png)
- **Theta join**
  - Combing based on something *other* than equality (*equi-join*)

## JDBC
- **Java Database Connectivity**
  - The Java library resposinble for interacting with a SQL database
  - *java.sql.* *
  - Does not come with drivers for interacting with the database
    - We had to explicitly add a postgres driver with Maven
- Imporant interfaces in JDBC
  - Connection
  - Statement *never use*
  - PreparedStatement
    - Does everytthing statement does and more
  - ResultSet

## SQL Injection
- You trick an application into executing a SQL statement you did not intend

## Maven
- Build tool for Java
- Dependency managager
  - Add dependencies (Java Libraries written by other people)
- Like a mod manager for your favorite game
  - Automatically installs your mods
  - Can do updates
  - Easily select what you want
- ***pom.xml***
  - The core configuraiton file for a maven project
  - List dependencies
  - name of the project
  - Author
  - Version of Java
  - etc..

# SQL Practice
There is a high chance you will be asked to write a SQL query. The chinook database is a practice database. Run the script here in your DB to get it.
https://raw.githubusercontent.com/lerocha/chinook-database/master/ChinookDatabase/DataSources/Chinook_PostgreSql.sql
- Querying practice
    - Select all records from the Employee table.
    - Select all records from the Employee table where last name is King.
    - Select all records from the Employee table where first name is Andrew and REPORTSTO is NULL.
    -  Select all albums in Album table and sort result set in descending order by title.
    - Select first name from Customer and sort result set in ascending order by city
    - Select all invoices with a billing address like “T%”
    - Select all invoices that have a total between 15 and 50
    - Select all employees hired between 1st of June 2003 and 1st of March 2004
- Insert practice
    - Insert two new records into Genre table
    - Insert two new records into Employee table
    - Insert two new records into Customer table
- Update Practice
    - Update Aaron Mitchell in Customer table to Robert Walter
    - Update name of artist in the Artist table “Creedence Clearwater Revival” to “CCR”
- Joins
    - Create an inner join that joins customers and orders and specifies the name of the customer and the invoiceId
    - Create an outer join that joins the customer and invoice table, specifying the CustomerId, firstname, lastname, invoiceId, and total.
    - Create a right join that joins album and artist specifying artist name and title.
    - Create a cross join that joins album and artist and sorts by artist name in ascending order.
    - Perform a self-join on the employee table, joining on the reportsto column.
- Set Operators
    - Use a unionall to create a table that has the name of all employees and customers

  