function Book(title,author,yearofpublish){
this.title = title;
this.author = author;
this.yearofpublish = yearofpublish;

this.displayDetails = function()
{
    console.log(`Title: ${this.title}`);
    console.log(`Authour: ${this.author}`);
    console.log(`Year of published: ${this.yearofpublish}`);
};
}
const myBook = new Book("DO Epic Shit", "Ankur Warikoo",2021);
myBook.displayDetails();