
export default function AlienGreeter(){

    function hanarGreet(event){
        alert("By the Enkindlers this one is pleased to meet you");
    }

    function elcorGreet(event){
        console.log(event)
        alert("With Much Happines: It is great to meet you");
    }

    function gethGreet(event){
        alert("We have come to the consesus to offer a welcome")
    }


    return(<>
        <h3>Alien Greeter</h3>
        <p>Press a button to get a species-specifc greeting</p>
        <button onClick={hanarGreet}>Hanar Greeting</button>
        <button onClick={elcorGreet}>Elcor Greeting</button>
        <button onClick={gethGreet}>Geth Greeting</button>
    </>)
}