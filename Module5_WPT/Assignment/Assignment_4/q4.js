function callback1(response)
{
    console.log(response);
}
const fetchData = (url,callback,response)=>{
    try{
        if(!url) throw new Error('missing url');
        console.log(`Fetching data from ${url}...`);
        setTimeout(() =>callback(response), 2000);
    }
    catch(error){
        console.log(error);
    }
}
fetchData('https://example.url/',(response) => callback1(response),'this is my response');
fetchData(``,(response) => callback1(response), 'this is my response');