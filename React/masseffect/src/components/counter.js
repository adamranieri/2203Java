import { useState } from "react"

export default function Counter(){

    const [value,setValue] = useState({num:0})

    function increment(event){
        const newObject = {}
        newObject.num = value.num +1;
        setValue(newObject) 
        // YOU SHOULD NEVER pass in the read only variable into the setter function
        // you must pass in a brand new object
    }

    function decrement(event){
        const clonedNewObject = {...value}; // short syntax to make a brand new object but with the same properties of the old object
        clonedNewObject.num = value.num -1;
        setValue(clonedNewObject)
    }

    return(<>
        <h3>The number is {value.num}</h3>
        <button onClick={increment}>Increment</button>
        <button onClick={decrement}>Decrement</button>
    
    </>)
}