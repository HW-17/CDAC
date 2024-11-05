// regular function
function calculateArea(length, width) {
    return length * width;
}
const area = calculateArea(5, 2);
console.log(`Area : ${area}`);

//arrow function 
const calculateAreaArrow = (lenght, width) => lenght * width;
const Area = calculateAreaArrow(5, 2);
console.log(`Area(Arrow Function): ${Area}`); 