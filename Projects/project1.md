# Project 1

## Overview
You will be creating a REST API for a rental car agency. You can decide the exact properties on the car. so long as you meet all requirements

## Routes
- POST /cars 
  - returns a 201
- GET /cars
- GET /cars?available=true
- GET /cars?
- GET /cars/12
  - returns a 404 if car not found
- PUT /cars/15
- PATCH /cars/20/checkin
- PATCH /cars/20/checkout
- DELETE /cars/19
  - returns a 404 if car not found

- GET /rentals
- GET /cars/90/rentals
- 
## ORM
- You will create an *object relational mapper* to save your entities. An ORM is able to read an entity class and abstract away needing to write individualized DAO methods per entity object.
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


## Testing Requirements
- You must have JUnit tests for all DAO methods
- You must have mocking or stub implementations for testing service methods
- You must have a postman test for each endpoint

## Deployment Requirements
- The app must be containerized and on dockerhub
- The app must be deployed on an EC2 for your presentation