const shoppingcart = [{item:"Apple", price:1.5, quantity: 3},
{item:"Banana", price:1.0, quantity:5},
{item:"Orange",price:2.0, quantity:2},];

const totalPrice = shoppingcart.reduce((total,currentItem) =>{
    return total + (currentItem.price * currentItem.quantity);
},0);
console.log(`Total Price: $${totalPrice.toFixed(2)}`);