
export default function CompletedList(props){

    const taskItems = props.completedTasks.map( t => <li key={t.id}> {t.desc}</li>)

    return(<>
        <h3>Completed List</h3>
        <ul>
            {taskItems}
        </ul>
    </>)
}