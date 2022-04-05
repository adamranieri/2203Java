# Maven
- Maven means wise woman
- A dependency management and build software for Java applications

## Maven Reposity
- An enormous online/open source collection of Java Code
- Almost any software related feature you can find a Java Libary on maven reposity that does it

## The problem
- Almost all software has dependencies
  - Code written by other people that you want to include in your application
- There is no in-built Java feature for incorporating dependencies
  - Most languages do not have an in built way to do this
- A **dependency** manager is software that can do this for your language
  - Java
    - Maven
    - Gradle
  - JavaScript
    - npm
  - Python
    - pip

### XML
- eXtensible Markup Language
  - Similar to HTML
- Commonly used for configuration files

## Maven Project anatomy
- ***pom.xml***
  - Project Object model
  - **Configuration file** for a Maven project
  - Name of the project
  - The author
  - *dependencies*
  - What version of Java to compile to
  - etc...
- src folder
  - The location for all your Java code
  - Main Folder
    - Core Java application code is written
    - Resources Folder
      - Any NON-Java files that your application uses
  - Test Folder
    - Where you write your JUnit tests