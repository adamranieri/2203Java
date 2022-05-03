
const names = ["Adam", "Mark", "Steve"];

function printThing(thing){
    console.log(thing);
}

names.forEach(printThing);//

const nums = [11,12,90,15,100,50];

const isEven = num => num %2 === 0;

const evenNums = nums.filter(isEven);// will return a new array where each element has been passed through that isEven callback function
// only elements that return true will be in the new array

console.log(evenNums)

const oddNums = nums.filter(num => num%2 === 1);
console.log(oddNums)

//the map function will take in each element and return a new element 
const distancesKM = [45,53,97,15];
const distancesMiles = distancesKM.map(d => `${d*0.62} miles`);
console.log(distancesMiles)
// it can be any datatype you return

// create an array of all NON freezing temperatures in farenheit
const celciusTemps = [0,100,50,-30,-45,50]
const fTemps = celciusTemps.filter(t => t > 0).map(t => (t*9/5)+32)
console.log(fTemps)

const stuff = ["Tim", "Kim", "Mike", null, "Jason", null, null, "Matt", "Harvey"];

const noNulls = stuff.filter(e => e);
console.log(noNulls)