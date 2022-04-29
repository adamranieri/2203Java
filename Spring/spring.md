# Spring
- A lightwight *framework* for building Java applications
- **Framework**
  - **IoC Inversion of Control**
    - Your code does NOT use another person's code
    - Your code is used *by* the framework/software
    - You are creating a *spring application*
      - You must abide by their rules
      - You must abude by their patterns
      - Failure to do will prevent the application from working at all
- EJB Entity Java Beans 
  - **not related to spring**
  - People hated them
  - They were proprietary and sold by oracle
  - Spring was *free* and *better*
    - No one paid for a worse version of something that was free
  - EJBs became extinct

## Dependency Injection, Application Context and Spring Beans
- **Application Context**
  - A big container that the Spring framework will manage
- **Bean**
  - Any object/class that will be managed in the application context
  - As a Spring developer your job is to create and configure these beans
- **Dependency Injection**
  - Programming design pattern where one object will be *composed/injected* with other objects
  - A bean will often be injected with other beans
- As you work on larger projects it is unrealistic to know what most of the application code looks like.
- Having configured beans will make it easier for you to set up and run the application
- **Decoupling**
  - Removing harcoded values and dependenies within the code
  - Configurable beans that inject each other are a good example of decoupling
  - makes code very scalable

## Spring Modules
- Spring is modular by design
- A module adds a set of features to your application
- ***Spring Core***
  - The essential module in all Spring applications
  - Without it you do not have a Spring Application
  - The IoC container/ Application Context
- **Spring Data**
  - A module that allows interacting with the database
  - It is an **ORM** 
    - Object relational mapping
    - You use annotations to *map* entitites to tables in the database
- **Spring WEB/MVC**
  - A module for creating web servers 
- **Spring AOP**
  - Aspect Oriented Programming
- **Spring Actuator**
  - Devtools for spring applications
  - Adds some debug endpoints for your web server
    - Remote shutdown
    - Memory Usage
    - HTTP logs

## Spring Boot
- ***Spring is not Spring Boot***
  - Spring boot is an opinionated version of Spring
  - It assumes a lot of best practices
  - Allows us to build applications quickly and with good design
- ***Spring Boot is not a module of Spring***
  - Has no functionality that could not be done manually in regular Spring
  - think of spring boot as a preconfigured project

- application.properties
  - application.yaml sometimes
  - A file that spring boot will read when you start the application
  - A configuration file for spring boot