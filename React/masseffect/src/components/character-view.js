import { useState } from "react"


export default function CharacterViewer(){

    // useState returns an array that has two values
    // 1st readonly stateful variable. DO NOT try to to do assign values to this variable or edit the values
    // 2nd a function that will REPLACE the stateful variable
    const [teammate,setTeammate] = useState({name:"Garrus", species:"Turian"});

    // const result = useState();
    // const teammate = result[0];
    // const setTeammate = result[1];

    // Think REPLACEMENT not UPDATE
    function swapMordin(event){
        const mordin = {name:"Mordin", species:"Salarian"}
        setTeammate(mordin)
    }

    function swapLiara(event){
        const liara = {name:"Liara", species:"Asari"}
        setTeammate(liara)
    }

    function swapGarrus(event){
        const garrus = {name:"Garrus", species:"Turian"}
        setTeammate(garrus)
    }


    return(<>
    <h4>Character viewer</h4>
        <button onClick={swapGarrus}>Garrus</button>
        <button onClick={swapMordin}>Mordin</button>
        <button onClick={swapLiara}>Liara</button>
    <dl>
        <dt>Name</dt>
        <dd>{teammate.name}</dd>

        <dt>Species</dt>
        <dd>{teammate.species}</dd>
    </dl>
    </>)
}