// JS does have objects
// unlike Java that are created without having a class
// The most common way to make objects is with an object literal
// objects are just key value pairs

const adam = {
    fname:"Adam", 
    lname:"Ranieri", 
    age:19, 
    isTrainer:true,
    sayHello: function(){
        console.log("Hello my name is " + this.fname)
    } // a method is a funtion defined ON an object
}; // JSONs are based off of JavaScript Objects

console.log(adam)
console.log(adam.fname)
// any values in an object can be reassigned
adam.fname = "Mike";
console.log(adam)

// objects are 100% mutable and can have properties added or removed whenever
adam.mi = "C";
console.log(adam)
delete adam.lname;
console.log(adam)

adam.sayHello();