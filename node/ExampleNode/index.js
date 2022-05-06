import chalk from "chalk";
import figlet from 'figlet';

console.log(chalk.blue.bold("Wassup!!!!!"))
figlet("Hello Everyone", (err,data)=>{
    console.log(chalk.green(data));
})