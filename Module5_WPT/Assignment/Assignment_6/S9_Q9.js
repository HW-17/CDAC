function sum(...numbers){
    return numbers.reduce((total,current) => total + current);
}
const result = sum(1,2,3,10,5);
console.log(`The sum is: ${result}`);