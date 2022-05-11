
export default function PendingList(props){

    const updateComplete = props.onUpdateComplete;
    const taskItems = props.pendingTasks.map(t => <li key={t.id}> {t.desc} <button onClick={()=>updateComplete(t.id)}>Mark Complete</button></li>)
    
    return(<>
    <h3>Pending List</h3>
    <ul>
        {taskItems}
    </ul>
    </>)
}