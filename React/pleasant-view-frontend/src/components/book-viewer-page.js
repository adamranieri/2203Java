
// 1. write the static JSX
// 2. use dummy data to dynamically generate the content
// 3. Where is the real data coming from?
    // from a parent component design it to use props
    // if it is coming from the backend useState() make an HTTP request

import { useEffect, useState } from "react";


export default function BookViewerPage(){
    
    const [books,setBooks] = useState([]);

    //get real data from backend
    async function getAllBooks(){
        const response = await fetch("https://bc16-2603-301f-1625-c000-e4ca-eb06-ff74-3db4.ngrok.io/books");
        const body = await response.json();
        setBooks(body)
    }

    //useEffect is a way to execute a snippet of code at various points in the component lifecycle
    // useEffect(()=>{},[]) the callback executes ONLY once when the component loads
    useEffect(()=>{
        getAllBooks();
    },[]);

    const bookRows = books.map(b =><tr key={b.id}>
        <td>{b.id}</td>
        <td>{b.title}</td>
        <td>{b.author}</td>
        <td>{b.returnDate === 0 ? "Available": new Date(b.returnDate).toDateString()}</td>
        </tr>)

    return(<>
        <h1>Book Viewer</h1>

        <table>
            <thead>
                <tr><th>ID</th><th>Title</th><th>Author</th><th>Return Date</th></tr>
            </thead>
            <tbody>
                {bookRows}
            </tbody>
        </table>
    </>)

}