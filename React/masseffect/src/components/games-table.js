
export default function GamesTable(){

    const games = [
        {title:"Mass Effect", year:2007},
        {title:"Mass Effect 2", year:2010}, 
        {title:"Mass Effect 3", year:2012}, 
        {title:"Mass Effect Legendary Edition", year:2021}
    ]

    // generate a bunch of JSX elements
    // dynamically creating the elements then interpolating the JSX into the return JSX
    // If you dynamically generate a component react will want you to put a key property on it
    // This is an optimization from Reacts's perspective. Does not directly impact functionality
    // the key should be unique.
    const gameRows = games.map(g => <tr key={g.title} ><td>{g.title}</td><td>{g.year}</td></tr>);
    
    return(<>
        <table>
            <thead>
                <tr><th>Game</th><th>Release Date</th></tr>          
            </thead>
            <tbody>
              {gameRows}
            </tbody>
        </table>
    </>)
}