import { useEffect, useState } from "react"


export default function PublisherPage(){

    const [publishers,setPublishers] = useState([])

    async function getAllPublishers(){
        const response = await fetch("https://bc16-2603-301f-1625-c000-e4ca-eb06-ff74-3db4.ngrok.io/publishers");
        const body = await response.json();
        setPublishers(body);
    }

    useEffect(()=>{
        getAllPublishers()
    },[])

    

    const listItems = publishers.map(p => <div key={p.id}>
        <dt>{p.name}</dt>
        <dd>{p.id}</dd>
        <dd>{p.location}</dd>
    </div>)


    return(<>
    <h1>Registered Publishers</h1>
        <dl>
            {listItems}
        </dl>
    </>)

}