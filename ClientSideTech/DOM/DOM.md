# DOM
- **Document Object Model**
  - Tree of nodes that make up an HTML page
![DOM](https://www.tutorialstonight.com/assets/js/dom-tutorial.webp)
- JavaScripts original purpose was **DOM Manipulation**
  - Dynamically updating and editing the DOM
    - Adding nodes
    - Removing nodes
    - Editing the content within a node
    - ETC....

## Event Driven
- JavaScript was designed as an Event Driven language
- Web Pages are essentially Event driven application
- An **Event** could be just about anything that occurs on a web page
  - Usually a user action
  - Examples
    - User clicks on a button
    - User mouses over a list item
    - Page finsished loading
- JavaScript was designed to *do something* in response to an event

```mermaid

    flowchart LR;
        Event--updates-->State
        State--render-->View

```

## Event Loop
- Web Browser contains many different pieces
  - JS Machine (V8)
  - HTTP Client 
  - HTML/CSS Render
  - All these pieces exist independently from each other
![Event Loop](https://miro.medium.com/max/1400/1*iHhUyO4DliDwa6x_cO5E3A.gif)
- JS is a single threaded language
  - And it can only process one event/function at anytime
- Every time an Event occurs it goes into *Event Queue*
- Event Loop will read the event queue and feed events into the JS engine for processing
  - This loop is always running
  - It is continually checking to see what the next event to process is
  - Blocking this event queue freezing JS

## Asynchronous Programming
- Async programming is an optimization for **IO** Input Output operations
  - IO operations are anything involving communicating with resources/programs *outside* of the runtime environment
    - Communicating with your database
    - Reading and writing from a file
    - Making http requests and waiting for the response
- Realistically there is **NOTHING** you can do to speed them up
  - There is no way to program your http request to be processed faster

## Thinking Asynchronously
- Imagine you were setting up a party 
- There are a bunch of things that you have to do
  - Get Plates and Paper towels out (synchronous)
  - Get Drinks on the table (synchronous)
  - Order a Pizza (aynchronous)
  - Clean up the bathroom (synchronous)
  - Replace a broken light in the living room  (synchronous)
    - Pizza arrived and I get it set up in the living room (Resolved)
  - Start the TV for a football game (synchronous)
  - Put some beers the fridge (synchronous)