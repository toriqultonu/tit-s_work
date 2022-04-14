package NewProject;

import java.util.Scanner;

class Book {

    private int bookInstance, yearPublish;
    private String title, author;
    private double price;
    private double discount;

    static int count = 0;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        count++;
    }

    public void readInput(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the year publish of your book: ");
        yearPublish = scanner.nextInt();
        System.out.print("Enter the price of your book: ");
        price = scanner.nextDouble();
    }

    public double calcBookPrice(){

        if(yearPublish < 2005){
            discount = (price*50)/100;
        }
        else if(yearPublish >= 2005 && yearPublish < 2021){
            discount = (price*25)/100;
        }
        else
            discount = 0;

        return price - discount;
    }

    public String toString(){

        return "Book Name: "+title+"\nAuthor Name:"+author+"\nYear Publish: "+yearPublish+"\nBook Price: RM"+price+"\nBook Price after Discount: RM"+calcBookPrice();
    }

}

class TestBook{

    public static void main(String[] args){

        Book book1 = new Book("Java Programming", "Abu Bakar");
        Book book2 = new Book("Programming Technique", "Rafeah Ahmed");
        Book book3 = new Book("Happy Programming", "Sharif Hassan");

        book1.readInput();
        book2.readInput();
        book3.readInput();

        System.out.println(book1.toString()+"\n");
        System.out.println(book2.toString()+"\n");
        System.out.println(book3.toString()+"\n");

        System.out.println("The number of books purchased: "+ Book.count);
    }
}
