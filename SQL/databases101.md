# Database
- A database is some hardware/thing thta offers **persistent** data storage
  - If you turn off the power that data still exists
    - Hard Disk
    - SSD
    - Magnetic tape
    - Cuneiform Tablet
- **Relational Database**
  - Stores data in tables
  - These tables are often linked and refer to one another
    - The tables *relate* to each other
  - There are non-relationonal databases 
    - MongoDB
    - Redis
    - CosmosDB
    - GCP Datastore
- **RDBMS**
  - Relational Database Management System
  - Software that manages the relational database
    - MySQL
    - Microsoft SQL Server
    - PostgreSQL
    - MariaDB

- **RDS**
  - Relational Database Service
  - Cloud service provided by AWS
  - Allows you to create database servers/computers 
  - **Security Group**
    - Security rules regarding what type of traffic can interact with the  database
      - IP Address
      - Port
      - Protocol

# SQL
- **Structured Query Language**
- It is a programming language designed for usage on databases
  - **DSL**
    - Domain Specific Language
    - Lanugage Deisgned for one partiuclar purpose
    - SQL was designed for DB management and DB management only
    - CSS is designed for styling web pages
- Englishy syntax which makes it 'easy' to understand
- Scripting Language
  - A script is a program that tells a machine or piece of software what to do
  - You can selectively exucte parts of your script and it just does it to the database

## RDBMS Terminology
- **Table**
  - The main way of storing data in a relational database
  - **Rows/Records**
    - Adam and shelby and records
  - **Columns/attributes**
    - first_name last_name are attributes
- **Schema**
  - The sturctural organiazation of the database
    - The tables
    - How tables are connected to each other
    - Any constraints on the data in a table
- **Constraints**
  - Restrictions on what data can go in a column
    - Primary Key
      - Unqiue and not null
    - Unique
    - not null
    - default
    - check 
      - check that a the data is between a certain value
- **ERD**
  - Entity Relationship Diagram
  - A visual representation of how your data is connected

  
|employee_id| first_name|last_name| department|
|-----------|-----------|---------|-----------|
|101|Adam|Ranieri|Training|
|202|Shelby|LLoyd|Associate Experience|

## Normalization
- *Removing redundancy from your data*
- Normalized Forms
### 1NF
- Data in the table must be atomic
  - Columns CANNOT be broken down into smaller columns
- All records must be uniquely identifiable
      - Primary Key is a guaranted unique identifier
- Records should not contain array like informati
##### Poorly Designed table
|name|salary|phone_numbers|
|----|------|------------|
|Adam Ranieri|100000| 555-555-5555, 444-444-4444|

##### Table in 1nf

|emp_id|first_name|last_name|salary|
|------|----------|---------|------|
|101|Adam|Ranieri|1000000
-

### 2NF
- No functional dependencies
  - No columns that could be computed
  - Shooting percentage is redundant
   
|player_id|name|shots_attempted|shots_made|shooting_percentage|
|---------|----|---------------|----------|-------------------|
|101|Adam|200|180|90|

### 3NF
- No transitive Dependencies
  - Storing information in one table that could already be found in another table
    - If the player table had a column saying hometown

## Postgres
- Database is a collection of tables and a schema
  - You can have MULTIPLE databases on your single RDS postgres databases
- **Database Server**
  - The Actual RDS instance/computer that is running Postgres

## Multiplicites
- There are 3 ways in which tables can relate to each other (multiplicites)
- one-one relationship
  - A record in one table connects to exactly one record in another table
    - player_stats - player
  - Not very common to see
    - A 1-1 could be represented as a single table
- Many-one
  - A record in one may have many references in another table
  - Examples
    - Player -Team
      - Many players reference the same team
    - BankAccount - User
      - Many bank accounts belong to one user
- Many-Many 
  - Many records in one table refernce many records in another table
  - Usually achieved via a join table
  - Player - Game
    - Many players will play in many games

