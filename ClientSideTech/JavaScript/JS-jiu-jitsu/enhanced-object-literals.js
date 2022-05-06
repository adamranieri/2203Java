// es6 added more succinct syntax for common object literal operations

const adam ={
    fname:"Adam",
    lname:"Ranieri",
    sayHello:function(){
        console.log(`Hi my name is ${this.fname} `)
    }
}

//adam.sayHello()

const bill = {
    fname:"Bill",
    lname:"Smith",
    sayHello(){
        console.log(`Hi my name is ${this.fname} `)
    }
}
//bill.sayHello()

const owner = "Adam";
const petName = "Rover";
const age = 7;

// const doggo = {owner:owner, petName:petName, age:age};
// more succinct syntax
const doggo = {owner,petName,age};// directly put the variables in the object default the key value to the name of the variable
console.log(doggo)