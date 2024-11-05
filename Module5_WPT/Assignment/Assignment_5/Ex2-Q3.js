const goGetCandies = () => {
    return new Promise((resolve, reject) => {
        setTimeout(() => {

            resolve({ candy: "sour keys", quantity: 10 });
        }, 2000);
    });
};
const sellCndies = (candy) => {
    return new Promise((resolve, reject) => {
        setTimeout(() => {
            resolve(25 * candy.quantity);
        }, 3000);
    });
};

const useCandies = async () => {
    const candy = await goGetCandies();
    const result = await sellCndies(candy);
    console.log(result);
    const time2 = new Date();
    console.log(`${time2 - time1}ms passed`);

};
console.log("program starting...");
const time1 = new Date();
useCandies();
/*
// vanilla promises
const candy = goGetCandies();

candy.then((result) => { 
    const sellvalue = sellCndies(result);
    console.log(sellvalue);
    sellvalue.then((value)=> {
        console.log(value);
        const time2 = new Date();
        console.log(`${time2 - time1}ms passed`);
    });
});
*/
console.log("program complete!");