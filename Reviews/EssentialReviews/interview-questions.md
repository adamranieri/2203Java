# Preamble
This is a guide for the upcoming interivews. I do not know the format or interview questions. However, it is for a ***Java Full Stack*** postion within InfoSys. You need to be ready for ***Java***. Clients also loving asking about ***SQL***. 
## Core Technologies
I think these are the core technologies you will be asked.
- ***Java***
    - Scopes
    - OOP
    - **Collections Framework/Data Structures**
- ***SQL***
    - Queries
    - Normalization
    - Constraints
- ***Spring***
    - Modules of Spring
    - Spring core features
## Coding Challenges
Interviewers might ask you to code for them. Typically these involve a Java Challenge or writing a SQL Query. It is important that you actually ***code*** these to get practice.
### Java Coding challenges 
  - Write a function that returns a the nth iteration of a fibonnaci sequence
  - Implement a collection
    - Stack
    - List
    - Queue
    - Map
    - Set
  - Reverse a string 
    - without using StringBuilder or a collection
  - Check a string to see if it is a palindrome
  - Sort a list of integers
    - Without using a sorting utility
###  SQL Coding Challenges
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

## Interview Questions
These are questions you ***NEED*** to be able to answer.

- **Java**
    - Scopes in Java?
    - 4 pillars of OOP?
      - Now them off the back of your hand
      - Exmplain each and be able to provide examples as well as analogies
    - What is the Collections Framework?
        - What is a List?
        - What are some implementations of a list?
        - What is a Set?
        - What is a queue
        - What is a Map?
        - Difference between a List and a Set?
        - Is a Map a collection?
        - What is the root class of collection hierarchy?
        - Collection interface vs Collections class
    - Access Modifiers 
    - What is the entry point of a Java program?
    - What is the method signature of the main method?
    - What does the static keyword do?
    - Can you tell me keywords that are not access modifiers?
    - What is a constructor and how do I make one?
    - Errors vs Exceptions?
    - Checked vs Unchecked Exceptions?
    - How do I do error handling in Java?
    - JDK vs JRE vs JVM?
    - Tell me about Java?
    - What is an algorithm?
    - Abstract classes vs interfaces?
    - How do I make a lambda in Java?
    - Give me an example of where you used lambdas?  
    - What is a thread?
    - How do I make a thread?
    - What is deadlock?
    - What is a Java Bean?
    - What is a singleton?
- **SQL**
    - What is SQL?
    - How can I join a table on a column?
    - What are the sublanguages of SQL?
    - What is normalization?
    - When is a table in 1NF?
    - When is a table in 2NF?
    - When is a table in 3NF?
    - Tell me SQL constraints.
    - What is a primary key?
    - How do I make a Foreign key?
    - What is a scalar function?
      - Examples?
    - What is an aggreate function?
      - Examples?
    - How would you create your own function?
    - What is a transaction?
    - What are the ACID properties of transatcions?
- **Spring**
  - What is Spring?
  - What is Depenedency Injection?
  - Type of dependency injection?
  - What is a framework?
  - Tell me about Inversion of Control
  - What is the IoC containers?
  - What is the ApplicationContext/BeanFactory 
  - What is a Spring bean?
  - What are the scopes of a bean?
  - What are stereotypes?
  - How do you configure Spring?
  - Spring vs Spring Boot.
  - Spring dispatcher servlet?
  - What is the Spring Bean Lifecycle.
  - Know all your annotations!
- **Cloud/DevOps**
  - What DevOps have you done?
  - What is your expeience with the cloud?
  - What cloud services have you used?
  - What is Maven?
  - How have you used Maven in your project?
  - What experience do you have with CI?
  - How did you set up Continous Integration/Delivery?


## Essential Soft Skill Questions
- Tell me about yourself?
- What are you interested in?
- What do you like about development?
- What do you like about testing?
- What was your favorite thing to learn?
- What have you been learning?
- Where do you see yourself in a few years?
- How do you get into a good work mindset?
- How did you communicate in your project?
- What was your last project?
- Walk me through the technology stack of your last project.
- What did you do on your last project?
- What was something you learned on your last project?
- How did you stay agile?
- What agile ceremonies did you do?