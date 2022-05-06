

// default argument
function greet(name = "Nobody"){
    console.log(`Hello pleasure to meet you ${name}`)
}

greet("Adam");
greet();

function add(num1 = 0, num2 =0){
    return num1 + num2;
}

const hola = (nombre = "Juan") =>{
    console.log(`Hola ${nombre}`)
}
// default arguments must be at the END of a function

// quick intellisense which is kinda nice
function repeatePhrase(phrase = "", times = 1){
    for(let i = 0; i < times;i++){
        console.log(phrase);
    }
}