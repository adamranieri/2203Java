import { useState } from "react"
import { useNavigate } from "react-router-dom"


export default function EmployeeLoginPage(){

    const [username,setUsername] = useState("")
    const [password,setPassword] = useState("")
    const navigate = useNavigate()

    function updateUsername(event){
        setUsername(event.target.value)
    }

    function updatePassword(event){
        setPassword(event.target.value)
    }

    async function sendLoginInfo(){
        const loginInfo = {username,password}
        const response = await fetch("http://localhost:8080/login", {
            method:"POST", 
            body:JSON.stringify(loginInfo),
            headers:{
                "Content-Type":"application/json"
            }
        });
        const employeeInfo = await response.json()
        sessionStorage.setItem("employee", JSON.stringify(employeeInfo));// store our employee in session storage
        navigate("/bookcreator")
    }

    return(<>

        <label htmlFor="username"> Username</label>
        <input onChange={updateUsername} name="username" type="text" placeholder="adamGator"/>

        <label htmlFor="password">Password</label>
        <input onChange={updatePassword} name="password" type="password"/>

        <button onClick={sendLoginInfo}>Login</button>
    </>)
}