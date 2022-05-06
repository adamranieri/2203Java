
const temps = [71,73,65,91]

// const t1 = temps[0];
// const t2 = temps[1];

const [t1,t2] = temps;// An alternate syntax for getting specific elements from an array

console.log(t1,t2)

function analyze(numbers = [0]){
    
    let total = 0;

    for(const n of numbers){ 
        total+= n;
    }  
    let average = total/numbers.length;
    
    const results = [total,average];
    return results
}

const answers = analyze([10,20,40,90,15])

const [totalTemp] = answers;