import { useSelector } from "react-redux"


export default function CompletedList(){

    const completedTasks = useSelector(s => s.tasks).filter(t => t.isComplete)
    const taskItems = completedTasks.map(t => <li key={t.id}> {t.desc}</li>)

    return(<>
        <h3>Completed List</h3>
        <ul>
            {taskItems}
        </ul>
    
    </>)
}