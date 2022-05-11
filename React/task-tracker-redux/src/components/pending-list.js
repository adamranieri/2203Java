import { useDispatch, useSelector } from "react-redux"


export default function PendingList(){

    // s is that state of the store
    const pendingTasks = useSelector( s => s.tasks).filter( t => !t.isComplete)
    const dispatch = useDispatch();


    const listItems = pendingTasks.map(t => <li key={t.id}> {t.desc} 
    <button onClick={()=>dispatch({type:"tasks/completeTask",payload:t.id})}>Mark Complete</button></li>)

    return(<>
    <h3>Pending List</h3>
        <ul>
            {listItems}
        </ul>
    </>)
}