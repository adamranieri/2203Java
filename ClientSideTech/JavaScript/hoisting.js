
function hoist(){
    console.log(x);
    var x = 100; // var varibles are assigned the default value of undefined BEFORE the function actualy executes
}

hoist()//