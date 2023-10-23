//Perfoming reverse of string

let str = "I Love You Universe";
let reverse="";

//Dividing string between space 
let peice = str.split(" ");

for(let i=0; i<peice.length; i++)
{
     let temp = peice[i]+" ";

     for(let j=temp.length; j>=0; j--){
    //Reversing an elements
     reverse += temp.charAt(j);
     
}}

console.log(reverse);

