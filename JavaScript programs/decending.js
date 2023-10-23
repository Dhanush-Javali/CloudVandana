//Sorting elements in decending order

let arr = [49, 80, 56, 11, 20];

function Comparison(val1, val2){
    return val2 - val1;
}

console.log(arr.sort(Comparison));