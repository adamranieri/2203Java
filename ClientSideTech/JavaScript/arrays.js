// JS doesn't have anywhere near the amount of collections or depth that Java does
// By far 99% of 'collections' in JS are arrays
// An array is a dynamicallly resizing collection
// elements are stored via the order of insertion.
// elements can be of any type

const ray = [];// creates an array

//add
ray.push("Adam");
ray.push("Bill");
ray.push(10);

console.log(ray);

// accessing an element
console.log(ray[1]);

// remove
ray.pop();
console.log(ray)

const numbers = [10,20,30,40,50];
numbers.length =1000;
console.log(numbers)

// traditional for loop
// for(let i = 0; i < numbers.length; i++){
//     console.log(numbers[i]);
// }

// for of loop is like the Java Enhanced for loop
// for(const element of numbers){
//     console.log(element);
// }

// arrays are nothing more than objects where the keys are numeric auto incremetning values