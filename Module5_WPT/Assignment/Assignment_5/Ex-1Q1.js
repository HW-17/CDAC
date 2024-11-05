console.log("program started")
const myPromise = new Promise((resolve,reject)=>{
    setTimeout(()=>{
        resolve();
    },3000)
    setTimeout(() => {
        reject();
    }, 2000);
});
console.log(myPromise)
console.log("program in progress..");

myPromise.then(()=>{
    console.log("program complete");
}).catch(()=>{
    console.log("program failure");
});