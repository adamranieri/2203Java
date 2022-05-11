import { useState } from "react";
import CompletedList from "./completed-list";
import PendingList from "./pending-list";
import TaskForm from "./task-form";


export default function TaskManagementPage(){

    const [tasks, setTasks] = useState([
        {id:404, desc:"Pick Up kids", isComplete:true},
        {id:505, desc:"Grocery Shop", isComplete:true},
        {id:606, desc:"Prepare dinner", isComplete:true},
        {id:101, desc:"Dishes", isComplete:false},
        {id:202, desc:"Moar Dishes", isComplete:false},
        {id:303, desc:"Clean Patio", isComplete:false}
    ]) 

    const complete = tasks.filter(t => t.isComplete);
    const pending = tasks.filter(t => !t.isComplete);

    function addTask(task){
        const clonedArray = [...tasks];// clones the array. Makes a new array object with the elements of tasks array
        clonedArray.push(task);
        setTasks(clonedArray)
    }

    function updateComplete(id){
        const clonedArray = [...tasks];
        clonedArray.forEach(t  =>{
            if(t.id === id){
                t.isComplete = true
            }
        });
        setTasks(clonedArray);
    }


    return(<>
        <h1>Task Tracker</h1>
        <TaskForm onAddTask={addTask}/> {/**pass down a function that updates tasks */}
        <PendingList pendingTasks={pending} onUpdateComplete={updateComplete}/>
        <CompletedList completedTasks={complete} />
    </>)
}