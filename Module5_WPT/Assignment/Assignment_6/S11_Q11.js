function AfterDelay(callback,delay){
    setTimeout(() =>{
        callback();
    },delay);
}
AfterDelay(() =>{
    console.log("this message appears after 2 seconds");
},2000);