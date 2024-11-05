console.log("program started")
const myPromise = new Promise((resolve,reject)=>{
    setTimeout(() => {
        resolve({data:"Hello,friend!",error:null});
        
    }, 5000);
});
console.log(myPromise)
console.log("program in progress...");

myPromise.then((val)=>{
    console.log(val);
    return new Promise((resolve, reject)=>{
        setTimeout(()=>{
            resolve("first promise cahin complete!");
        },2000);
    });
}).then((val)=>{
    console.log(val);
});
myPromise.then((val)=>{
    console.log(val);
        return new Promise((resolve, reject) => {
            setTimeout(() => {
            resolve("second promise chian complete!");
        },10000);
        
    });
   
}).then((val)=>{
    console.log(val);
})