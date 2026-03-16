class Book {
    String title;
    String author;
    int price;
    String publisherName;
}

class Literature extends Book {
    void display() {
        System.out.println("Category: Literature");
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
        System.out.println("Publisher: " + publisherName);
    }
}

class Fiction extends Book {
    void display() {
        System.out.println("Category: Fiction");
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
        System.out.println("Publisher: " + publisherName);
    }
}

public class Publisher {
    public static void main(String[] args) {

        Literature l = new Literature();
        l.title = "Pride and Prejudice";
        l.author = "Jane Austen";
        l.price = 500;
        l.publisherName = "Penguin";

        Fiction f = new Fiction();
        f.title = "Harry Potter";
        f.author = "J.K. Rowling";
        f.price = 700;
        f.publisherName = "Bloomsbury";

        l.display();
        System.out.println();
        f.display();
    }
}
