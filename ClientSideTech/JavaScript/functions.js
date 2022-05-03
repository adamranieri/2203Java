// JS allows you to create functions independent of a class
// up until 2015 JS didn't even have classes

// defines a function does not execute the function
function hello(){
    console.log("Hello");
}

function hola(name){
    console.log("Hola " + name);
}

hola("Steven");// actually executes the function

const bill = "Bill";
hola("Bill"); 

// JS is very flexible and does not like to throw errors or tell you you messed up
hola();// missing parameters will get that default value of undefined

hola("jake","Billy","Mike");// you can also call a functions with more arguments than it takes in and the extra ones are just ignored
hola(9)

