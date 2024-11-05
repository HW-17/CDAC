console.log("progrm started")
const myPromise = new Promise((resolve,reject)=> {
    setTimeout(() => {
        resolve("program complete");
    },3000);
});
console.log(myPromise);
console.log("program in progress..");

myPromise.then((value) =>{
  console.log(value);  
});