import { useState } from "react"
import { useDispatch } from "react-redux";


export default function TaskForm(){

    const [desc,setDesc] = useState('');
    // the only way to update the store is to dispatch and action and have a reducer update the state
    const dispatch = useDispatch();

    function updateDesc(event){
        setDesc(event.target.value);
    }

    function addTask(){
        const task = {id:Math.random(), desc:desc, isComplete:false};
        dispatch({type:"tasks/createTask", payload:task})
    }

    return(<>
        <input onChange={updateDesc} type="text" placeholder="Dishes"/>
        <button onClick={addTask}>Add Task</button>
    </>)
}