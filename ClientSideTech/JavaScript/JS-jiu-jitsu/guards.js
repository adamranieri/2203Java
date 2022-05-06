
//              true      falsy => "Hello"
// the || and && DO NOT RETURN boolean values. They return the truthy value

const result = "Hello" || 0;
console.log(result)

const adam = {fname:"Adam", lname:"Ranieri"}

function greet(person){


    // adam.mi = adam.mi || "No Middle Inital";
    // adam.mi = adam.mi ?? "No Middle Intial"; // undefiend and null only
    adam.mi ??= "No middle inital" // use the value if it is truthy else use the assigned value

    console.log(`Hello ${person.fname} ${person.mi}. ${person.lname}`)
}

greet(adam)

// && is often used to guard variables and code

const something = 6<5 && "Hello";
console.log(something)