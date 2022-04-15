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