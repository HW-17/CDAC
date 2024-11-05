function processnum(numbers){
    return numbers.filter(num => num % 2 === 0)
    .map(num => num * 2)
    .reduce((total,current) => total+current, 0);
}
const nums = [1,22,3,4,5,66,7,8,9,10];
const total = processnum(nums);
console.log(`Total of doubled even numbers: ${total}`);