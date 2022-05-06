// spread operator can take an iterable and break it into the individual elements
const fullName = ["Adam","C","Ranieri"];

function printName(firstName, mi, lastname){
    console.log(`Hello ${firstName} ${mi}, ${lastname}`)
}

printName(fullName[0], fullName[1], fullName[2])
// equivalent to
printName(...fullName);//

console.log(Math.max(10,20,3123,-84))
const nums = [10,30,-4,90,15]
console.log(Math.max(...nums))

// turn a string into an array of characters
const phrase = "Hello World";
const characters = [...phrase]
console.log(characters)

