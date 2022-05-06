# Node
- node/node.js is a runtime environment for JavaScript
- JavaScript was originally designed as the programming language in web browsers
  - as JS became more popular developers wanted to use JS to write other kinds of applications as well 
    - Back-end Web Servers
      - Express
      - nest.js
    - Desktop application
      - Electron
    - Just about anything
- Created by Ryan Dahl
  - Google developer who was tasked with making a runtime environment that supported asynchronous programming
    - OH wait JS is excellent at that and is very popular
  - Node.js uses the same JS engine as chrome (V8)
    - V8 is very performants


## Node Project
- ***package.json***
  - Main Configuration file for any node project
  - npm version of the pom.xml for maven
  - npm is to package.json as maven is to pom.xml
    - The author 
    - The license
    - The Description
    - Name of the project
    - main
      - References a JS file
      - Typically the entrypoint first file run in your node application
      - Unlike java JS does not have a main method that signals the start of the program
        - by convention it is index.js
    - Tracks dependencies for a project
- node_modules
  - the source code of your dependencies is stored here
  - This folder gets massive

## CommonJS vs Modules
- JS used to use the CommonJS syntax for importing code from other other JS files
```JavaScript

// Common JS
const chalk = require("chalk")

//Module Syntax
import chalk from "chalk";

```