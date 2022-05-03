// JS has extremely aggressive type coercion
// JS will compares apples to oranges even if they are both bananas

console.log(9 == "9");// true string 9 will be coerced into a number and the 9 == 9 true
console.log(true == 1);// true the boolean true will be coerced into the number 1 and then 1 == 1
console.log(10*false == 0);// true false will be coerced into 0 and then 10*0 == 0 
console.log(10*false == "")// true
console.log(true == "true")// false
console.log(10/0 == 100/0)// true
// the coercion rules ARE NOT transitive
0=="0"// true 
0==""// true
""=="0"// false
let a = 100/"hello";// NOT AN ERROR
let b = 100/"Hola";
console.log(a) // NaN
console.log(b) // NaN
console.log(a == b);// false
console.log(a == a); // NaN is ALWAYS false in any equivalency even against itself
console.log(typeof a); // NaN is of type number

// There are Falsy values in JS
// values that are defined to be coerced into false 
console.log(Boolean("")); // empty string
console.log(Boolean(0));  // zero
console.log(Boolean(-0));
console.log(Boolean(false));// false
console.log(Boolean(null));
console.log(Boolean(undefined));
console.log(Boolean(NaN));

// ANY other value is considered true
console.log(Boolean("0"));

// type coercion is a total mess in JS 
// so never use == . 
// 2015 introduced === compares both the data type and the value
console.log(9 === "9")// false

