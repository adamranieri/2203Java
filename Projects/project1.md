# Project 1

## Overview
You will be creating a REST API for an expense reimbursement system. The system will will allow the company to track expenses and analyze spending. You will design the entities. 

## Timeline of deliverables
- TUE 4/19
  - Skeleton code in GitHub repository
  - Interfaces and ERD approved by me
- MON 4/25
  - Employee functionality complete
  - Employee code functiionality on GitHub
- MON 5/2
  - App runs locally
- WED 5/4
  - ***DUE***
  - Will Be presneting to batch

## Bussiness Rules
- All expenses have a single employee as the issuer
- Expenses start as pending and must then be approved or denied
  - Once approved or denied they CANNOT be deleted or edited
- Negative expenses are not allowed

## Routes

### Employee Routes
- POST /employees 
  - returns a 201
- GET /employees
- GET /employees/120
  - returns a 404 if employee not found
- PUT /employees/150
  - returns a 404 if employee not found
- DELETE /employees/190
  - returns a 404 if employee not found


### Expenses routes
- POST /expenses 
  - returns a 201
- GET /expenses
- GET /expenses?status=pending
  - also can get status approved or denied
- GET /expenses/12
  - returns a 404 if expense not found
- PUT /expenses/15
  - returns a 404 if expense not found
- PATCH /expenses/20/approve
  - returns a 404 if expense not found
- PATCH /expenses/20/deny
  - returns a 404 if expense not found
- DELETE /expenses/19
  - returns a 404 if car not found

It is common for REST routes to be nested 
- GET /employees/120/expenses
  - returns expenses for employee 120
- POST /employees/120/expenses
  - adds an expense to employee 120

## ORM BONUS
### DO LAST
- Create an *object relational mapper* to save your entities. An ORM is able to read an entity class and abstract away needing to write individualized DAO methods per entity object.
```java
interface CrudDAO<T>{
    //use reflection to read the annotations on the class
    // to try and implement the default interface methods

    default T createEntity(T entity){

    }; // creates an entity

    default T getEntityById(int id){
        
    }; // Get an entity by ID

    default List<T> getAllEntities(){

    };// get all instances of the entity

    default T updateEntity(T entity){

    };// update an instance 
}

@Entity
class Person{

    @Id("p_id")
    private int pId;

    @Column("fname")
    private String fname;

}

class PersonDAO implements CrudDAO<T>{  

}

//create a person
Person p = new Person(0,"Adam");
CrudDAO<Person> personDao = new PersonDAO();
```
## Technical Requirements
- Use log4j or cusomt logger for logging
- Javalin should be used for the API layer

## Testing Requirements
- You must have JUnit tests for all DAO methods
- You must have a postman test for each endpoint
- you *should* have mocking or stub implementations to test services

## Deployment Requirements
- The app must be containerized and on dockerhub
- The app must be deployed on an EC2 for your presentation
- The database should be a PostgreSQL on an AWS RDS

## TIPS
- If you are stuck on a bug for more than an hour *get help*
- Work on vertical slices of functionality not by layer
  - Compelete one route at time
- ***TDD***
- ***TDD***
- ***Also TDD***
  - I will not help you debug if you do not have tests
- Start early
  - The sooner you start the sooner you will run into issues me and batchmates can help with
- Get your entities approved by me.
  - Your entities should have a 1-1 with the fields in your table
  - DO NOT try and make composite entities
    - i.e. put a list in your entity
- Keep your DAO simple to start
  - I Included an example base interface
  - Build service methods from the DAO to assist you