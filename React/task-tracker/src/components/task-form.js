import { useState } from "react";

export default function TaskForm(props){

    const addTask = props.onAddTask;// get that function that was passed down

    const [desc,setDesc] = useState("")

    function updateDesc(event){
        setDesc(event.target.value)
    }

    function createTask(event){
        const task ={id:Math.random(), desc:desc, isComplete:false};
        addTask(task);
    }

    return(<>
    
    <input onInput={updateDesc} type="text" placeholder="Clean Sheets"/>
    <button onClick={createTask}>Add Task</button>
    
    </>)
}