function Greet(greeting){
    return function(name) 
    {
        console.log(`${greeting}, ${name}`);
    };
}
const sayHello = Greet("Hello");
sayHello("Siya");
const sayHi = Greet("Hi");
sayHi("Ram");