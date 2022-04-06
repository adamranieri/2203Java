# How to approach building an application
1. Analyze the requirements
   1. What is it you client wants?
   2. What are your user stories/ bussiness requirements
2. Design the application to support these user stories
   1. Create your **entities**
      1. Entities are your objects that STORE your data
      2. Ultimately entities are saved to a table in your database
   2. Create tables that support your entities
   3. Design the layers of your application
      1. Persistence/Data layer
         1. Saving retrieving data from the database
      2. Service layer for business logic
         1. implementing any bussiness logic
      3. API (Appplication program interface)
         1. How your user user will actually use/*interface* with the application
3. Implement/test
   1. You should be doing TDD
   2. Really you need to
4. Refactor as needed
   1. If something is not working or is poorly designed you should change it

# Anatomy of an application
- **Single Responsibility Principle**
  - Each part of the application should foucs on one thing
- API Layer
  - Taking user inputs
  - Displaying information to the user
- Service Layer
  - Bussiness logic
  - Real world requirements of the application
- Data layer
  - Saving objects to the database
  - Retrieving objects to the database
- Database
  - The ultimate storage locaiton of your data

### Pleasantview Library
We have been contracted to build a library book management system for the pleasantview community library.
The library uses an honor system for donating and checking out bookd
- Requirements
  - Register new books
  - Remove books from the library
  - Check-in and check-out books
    - When books are checked out it is for 2 weeks
  - The library always wants at least one copy of a book unavailable for checkout