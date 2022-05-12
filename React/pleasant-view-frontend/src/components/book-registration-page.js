import { useEffect, useState } from "react"


export default function BookRegistrationPage(){

    // you can make HTTP requests whenever you need to
    const [publishers,setPublishers] = useState([]);

    async function getAllPublishers(){
        const response = await fetch("https://bc16-2603-301f-1625-c000-e4ca-eb06-ff74-3db4.ngrok.io/publishers");
        const body = await response.json();
        setPublishers(body);
    }

    // publishers will be populated once the http request completes
    useEffect(()=>{
        getAllPublishers()
    },[])


    // states for values in the input field
    const [title,setTitle] = useState("");
    const [author, setAuthor] = useState("");
    const [pid, setPid] = useState(0);

    //update state values
    function updateTitle(event){
        setTitle(event.target.value)
    }

    function updateAuthor(event){
        setAuthor(event.target.value)
    }

    function updatePublisher(event){
        setPid(event.target.value)
    }

    //

    async function createBook(){
        const book = {id:0,title:title,author:author,returnDate:0,publisherId:Number(pid)}
        console.log(book)
        const response = await fetch("https://bc16-2603-301f-1625-c000-e4ca-eb06-ff74-3db4.ngrok.io/books",{
            body:JSON.stringify(book),
            method:"POST",
            headers:{
                "Content-Type":"application/json"
            }     
        });

        if(response.status === 200){
            const body = await response.json();
            alert(`New book registered with id of ${body.id}`)
        }else{
            alert("FAILED TO CREATE A BOOK")
        }
    }

    return(<>
        <h1>Book Registration</h1>
        <fieldset>
            <legend>Register Book</legend>

            <label htmlFor="title">Title</label>
            <input onChange={updateTitle} name="title" type="text" placeholder="Frankenstein"/>
            <br/>

            <label htmlFor="author">Title</label>
            <input onChange={updateAuthor} name="author" type="text" placeholder="Author"/>
            <br/>

            <label htmlFor="pubId">Publisher ID</label>       
            <input onChange={updatePublisher} name="pubId" list="Publishers"/>
            <datalist id="Publishers">
                {publishers.map(p => <option value={p.id}> {p.name}</option>)}
            </datalist>

            <br/>

            <button onClick={createBook}>Submit</button>
        </fieldset>
       
    </>)
}