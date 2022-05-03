// Scopes in JS
// Scopes in JS are defined via keyword
// 1. global scope (almost never use) nothing
// 2. function scope (never use) var (friends do not let friends use var)
// 3. block scope (Almost always use) let, const

function intro(){
    if(true){
        let introduction = "Welcome to my program"; // the variable is confined the the curly brackets it was defined in
    }
    
    console.log(introduction); // not defined
}

function outro(){
    out = "I am a bad global variable"; // using global variables is just begging for your program's logic to become hard to follow
    console.log(out);
}

// intro();
// console.log(introduction);// not defined

outro();// exucutes outro and creates the global variable
console.log(out);//


function wassup(){
    // used to only be function and global scope
    if(true){
        var greeting = "wassup"; // var variables are accessible ANYWHERE in the function
    }
   
    console.log(greeting);
}
wassup()

