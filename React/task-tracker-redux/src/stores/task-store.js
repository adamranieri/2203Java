import { configureStore, createSlice } from "@reduxjs/toolkit"

// default value of state in your application
const initialState = {
    tasks:[
        {id:303, desc:"Shopping", isComplete:true},
        {id:404, desc:"Clean Fridge", isComplete:true},
        {id:101, desc:"Dishes", isComplete:false},
        {id:202, desc:"Laundry", isComplete:false},
        {id:505, desc:"a", isComplete:false},
        {id:606, desc:"b", isComplete:false},
        {id:707, desc:"c", isComplete:false},
        {id:808, desc:"Clean Fridge again", isComplete:true},
        {id:909, desc:"Buy new fridge", isComplete:true},
    ]
}

const taskSlice = createSlice({
    name:"tasks",
    initialState:initialState,
    reducers:{
        createTask(state, action){
            console.log(action)
            state.tasks.push(action.payload)
        },
        completeTask(state,action){
            const id = action.payload;
            state.tasks.forEach(t =>{
                if( t.id === id){
                    t.isComplete = true
                }
            })
        }
    }
});

export const taskStore = configureStore({reducer:taskSlice.reducer})