const adam = {fname:"Adam", lname:"Ranieri", age:19, isTrainer:true};

// const fname = adam.fname;
// const lname = adam.lname;
// Equivalent to
// propeties must be named the same for it to work
const {fname, age, lname} = adam;

console.log(`Hello ${fname} ${lname} you are ${age} years old`)