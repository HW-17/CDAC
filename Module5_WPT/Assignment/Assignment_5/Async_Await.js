const fetchPokemon=()=>{
    return new Promise((resolve,reject)=>{
        setTimeout(() => {
           // resolve({data:{name:"pickachu",power:20}});
            reject(new Error("Denger, Denger!"));
        }, 2000);
    });
};
console.log("program starting...")
const usePokemon =async()=> {
    try{
    const data =await fetchPokemon();
    console.log(data);
    console.log("Done fetching...");
    }catch(error)
    {
        console.error(error)
        console.log("There was an error with our code but we're ok!");
    }
};
usePokemon();
console.log("program complete");