// Arrow functions are a 2015 ES6 syntax for making functions
// slight difference between function and arrow functions
// this keyword in an arrow function is bound the context it was defined in (very techinal)
// if your function uses the this keyword you probably function keyword function
// if there is not this keyword in your function there is no difference

function hello(name){
    console.log("Hello " + name);
}

const hola = (nombre) => {
    console.log("Hola " + nombre);
}

hello("Adam");
hola("Jim");

// arrow functions have extra succinct syntax
// If the arrow function takes in 1 parameter you can omit the parentheses
const bonjour = nom =>{
    console.log("Bonjour " + nom);
}

const add = (num1,num2) =>{
    return num1 + num2;
}

const sum = add(10,20);
console.log(sum);

const mulitply = (num1,num2) => num1*num2;
const product = mulitply(5,4);
console.log(product)


// function isEven(number){
//     return number%2 === 0;
// }
// identical to
const isEven = number => number%2 === 0;

console.log(isEven(990))