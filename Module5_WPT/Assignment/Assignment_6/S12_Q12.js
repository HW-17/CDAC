const myPromise = new Promise((resolve) => { 
    setTimeout(() => {
         resolve("promise resolved after 3 seconds! ");
    },3000);
   
});
myPromise.then((message) => {
    console.log(message);
});