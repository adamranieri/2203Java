// Callback functions are functions passed as parameters into other functions
// In JS all functions ARE objects and thus can be stored in variables and passed around
// Just like lambdas in Java

function hello(){
    console.log("Hello");
}

function hola(){
    console.log("Hola");
}

// func is the callback function
function doTwice(func){
    func();
    func();
}

doTwice(hello);// I AM NOT INVOKING HELLO AT THIS LINE
// I am passing in an object that contains the code
doTwice(hola);