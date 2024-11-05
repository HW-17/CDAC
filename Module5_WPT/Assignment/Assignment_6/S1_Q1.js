const Tax_Rate = 0.07;// 7% tax rate
class ShoppingCart {
    constructor() {
        this.items = []; // using let here for a mutable collection
    }

    addItem(name, price, quantity) {
        const item = {
            name, price, quantity
        };
        this.items.push(item);
        console.log(`${quantity} x ${name} added to the cart.`);

    }
    calculateTotal() {
        let subtotal = 0; // using let for a variable that will change
        for (let item of this.items) {
            subtotal += item.price * item.quantity;
        }
        const tax = subtotal * Tax_Rate;// taxa is constant based on subtotal
        const total = subtotal + tax;
        return total.toFixed(2);// return total as a string with 22 decimal places
    }

    displayCart() {
        console.log("shopping cart items: ");
        for (let item of this.items) {
            console.log(`${item.quantity} x ${item.name} @ $${item.price.toFixed(2)} each`);
        }
        console.log(`Total(including tax ): $${this.calculateTotal()}`);
    }
}
const myCart = new ShoppingCart();
myCart.addItem("Apple", 0.99, 3);
myCart.addItem("Banana", 0.59, 5);
myCart.addItem("Orange", 1.29, 2);
myCart.displayCart();
