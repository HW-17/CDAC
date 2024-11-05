console.log("program started");
const myPromise = new Promise((resolve,reject)=>{
    setTimeout(() => {
        resolve();
    }, 3000);
});
console.log(myPromise)
console.log("program in progress..");
myPromise.then(()=>{
    console.log("step 1 complete");


    return new Promise((resolve,reject)=>{
        setTimeout(() => {
            resolve("step 2 complete");
        }, 3000);
    });
}).then((val)=>{
    console.log(val);
});