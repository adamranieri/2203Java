import CompletedList from "./completed-list";
import PendingList from "./pending-list";
import TaskForm from "./task-form";
import { taskStore } from "../stores/task-store";
import { Provider } from 'react-redux'

export default function TaskManagementPage(){

    return(<>
        <h1>Task Management Page</h1>
        <Provider store={taskStore}>
            <TaskForm/>
            <PendingList/>
            <CompletedList/>
        </Provider>
    </>)
}