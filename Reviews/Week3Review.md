# Week 3 Review

## Lambdas
- A lambda is a standalone **function** object in Java.
- To create a custom lambda you need a functional interface
```java
@FunctionalInterface
public interface Greet{

    void hello(String name);
}
//

Greet englishGreet = n -> {
    System.out.println("Hello " + n);
};

Greet frenchGreet = (String n) -> {
    System.out.println("Bonjour " + n);
};

englishGreet.greet()
frenchGreet.greet()
```
- Functional programming
  - Another paradigm of programming like OOP
  - Dynamically creating functions
  - **Callback function**
    - A function passed as an argument to another method/function

## Collections
- Data Structures in Java designed to store Objects
![Collections Framework](https://www.ictdemy.com/images/1/java/collections/java_collection_api_diagram.svg)
- ***Collections come up on interviews CONSTANTLY***
- **Collection** interface is the root class of *most* collections in the collection framework
  - Collection does extend from the Iterable interface
- **List**
  - Allows duplicates
  - Maintains order of insertion
  - Elements are numerically indexed
  - Implementations
      - **ArrayList**
      - **LinkedList**
- **Set**
  - Does not allow duplicates
  - Does not maintain order of insertion
  - Implementations
    - **TreeSet**
      - Organizes a set based on it *natural ordering*
      - The order defined by the comparable interface
    - **HashSet**
      - Organizes a set based on the hashcode of the elements
- **Queue**
  - First In First Out
  - outdated
  - Implementations
    - **LinkedList**
- **Dequeue**
  - FIFO
  - LIFO (last in first out)
  - Implementations
    - LinkedList
    - **LinkedList**
- **Map**
  - Stores elements as Key Value pairs
  - Does not implement Iterable or Collection
  - Implementations
    - **HashMap**
    - **Hashtable**
      - Miscapitalized 
    - **TreeMap**

- Collection vs Collections vs Collections Framework
  - Collection is an Interface
  - Collections is a utility class
    - Bunch of helpful methods for dealing with collections
  - Collections Framework
    - The grouping of interfaces and classes that store objects

```java
        List<String> names = new ArrayList();
        names.add("Tim");
        names.add("Mike");
        names.add("Jason");

        Collections.addAll(names, "Alex","Bob", "Nancy", "Nancy");

        Collections.reverse(names);

        System.out.println(names);
        Collections.frequency(names, "Nancy");
```

- Comparable
  - Interface that you can implement on classes
  - It determines the natural ordering of that class
  - Often used in collections to define how to sort

- Web Application
  - **A program that can respond to HTTP Requests**
- Web Server
  - Is computer that is **running** a web application
  - They are used interchangably a lot

# HTTP
- ***Hyper Text Tansfer Protocol***
  - The main way in which information travels on the web
  - HTTP HTTP(S)
    - HTTP(S) is secure but does not make it official
- HTTP is a request Response system
  - A **Client** makes an HTTP Request
    - Web Browser is an HTTP Client
    - Postman is an HTTP Client specifically for developers
      - Allows you to save your requests and some extra features like highlighting etc...
  - A **Server** responds with an HTTP Response

## HTTP Request
- **HTTP Version**
  - What version of HTTP 
- **URL**
  - *Uniform Resource Locator*
  - Where is the request going?
    - amazon.com/prodcuts
    - localhost:7000/hello
  - *Uniform Reource Identifier*
    - The path *after* the domain
    - amazon.com/products/games
      - URL: amazon.com/products/games
      - URI: /products/games
      - Domain: amazon.com
- **Body**
  - Optional
  - Some content that you are sending in the request
    - Could be a file
    - Could be text
    - Could be anything
- **Verb/Method**
  - What type of http request
  - This is an entirely semantic term
  - For the most part the verb does not have ANY real affect
  - Verbs are just conventions so deveoplers have an idea of what a request does
    - GET => requests that are *getting* infromation
      - Your browser search at the top is a GET request
    - POST => requests that are sending infromation *posting*
    - DELETE => requests that *delete* some information 
    - PUT => requests that *replace* information
    - PATCh => requests that *update* information
- **Headers**
  - Key value pairs 
  - Contain *meta* information about the request
    - Additional information about the request
  - Examples
    - Authorization keys
    - Sender credentials
    - The format of the content in the body

## HTTP Response
- **HTTP Version**
- **Headers**
  - Key value pairs
  - meta information about the response
- **Body**
  - *optional*
  - The content of a response
- **Status Codes**
  - How the response tells you the request was processed
  - 100's
    - Information 
  - 200's
    - Success
    - 200 general success message
    - 201 something was successfully created
  - 300's
    - redirects
  - 400's
    - Client side errors
    - The request is wrong 
    - 403: Forbidden you do not have permission to view this route
    - 404: you request a route that does not exist on the web app
    - 401: Unauthorized you do not have permission but its because you are not logged in and I do not know who you are
    - 418: Server is teapot
    - 451: Unavailable due to governement restrtion
  - 500's
    - Server side error
    - The *response* could not be generated/processed
    - 500's are usually indictative of bad programming
  - Status codes are NOT magical. They have to be manually assigned



## JSON
- Web Servers by their nature are programming lanauge agnostic.
  - Every single web server communicates with HTTP
  - A web server could be written in ANY lanugae
    - Java
    - Ruby
    - Python
    - .NET
    - node.js
- If a web server can be written in any programming language. How can we reliably send data to and from web servers?
  - If I tried returing a Java object that would be meaningless to a python program
  - If you tried returning an int is it signed or unsiged
- Every programming language has it's own datatypes
- **JavaScript Object Notation**
  - A *lingua franca* data type was needed to standardize communication over the web
  - What datatype is supported in every programming language?
    - **string**
    - Every programming language has some data type for storing characters
  - What is that string going to look like?
    - A format that makes it look like a JavaScript object was an easy choice
      - **JavaScript** is the langauge in web browsers
        - The most common http client

## JSON formatting
- A JSON considers of key value pairs
  - "key":value
- The keys are in quotes
- if the value is a string datatype it is in quotes
- if the value is a number it does not have quotes
- if the value is the boolean true or false it does not have quotes
```json
// firstName=Adam lastName=Ranieri age=19 isTrainer=true
{"firstName":"Adam", "lastName":"Ranieri", "age":19, "isTrainer":true}

// make,model,year
// Subaru,Crosstrek,2018
{"make":"Subaru", "model":"Crosstrek", "year":2018}

```
# REST
- **API**
  - Application program interface
    - How you can actually interaact with the software
      - Console app => keyboard that takes in inputs and text printed on the screen
      - Video Game => controller that takes in inputs images are displayed on a screen
      - *Web App* => HTTP requests are your inputs, HTTP responses are returned
- **REST API**
  - Style/Architecture of Web Application.
  - It is 100% HTTP based
  - it is defined a set of 6 constraints
## Constraints
1. **Stateless**
   1. There is no internal state about the client on the server
   2. There no user sessions
2. **Client Server Architecture**
   1. The REST web server is not directly connected to a specific web page
3. **Layered**
   1. RESTful web servers can call other RESTful applications
4. **Cacheable**
   1. Information from the database *could* be temporaily stored on the server
   2. An optimization more than anything else
5. ***Uniform Interface***
   1. URI is used to Identify a **resource**
   2. the HTTP verb defines what you are doing to that resource
6. **Code on Demand**
   1. *optional*
   2. I have never actually seen it used
- REST API's main purpose is to track *something*. could be anything
  - Could be books in a library
  - patients in a healthcare system
  - cars at a rental agency
  - etc....
- That collection of what you are tracking is called a **resource**
  - books
  - pets
  - cars
- **RE**presentational **S**tate **T**ranser
  - You can interact with the resources via **representations** of them
  - The representation can be any format
    - JSON 99%
    - XML
    - PNG
    - Plain text
- REST APIs generally support CRUD operations on the resources
  - GET /books => gets all  books
  - GET /books/15 => get the book with ID of 15
  - POST /books => create a new book 
  - DELETE /books/16 => remove the book with ID 16
  - PUT /books/3 => replace the book with ID of 3
  - PATCH /books/6/checkout => checkout book with id 6
    - PATCH vs PUT
      - PUT will be a replacement of the all the values in a object
      - PATCH specific update or instruction to perform
- *Query params*
  - Usually Optional attributes you can add to routes to filter results
  - GET /books?title=Frankenstein
  