class Book {
    String type;
    String name;
    String filename;

    void startReading() {
        System.out.println(filename + ".pdf is opening...");
    }
}

public class ArrayOfObjects {
    public static void main(String[] args) {
        Book[] bookList = new Book[3];
        bookList[0] = new Book();
        bookList[1] = new Book();
        bookList[2] = new Book();
        
        bookList[0].type = "Sahitto";
        bookList[1].type = "Biggan";
        bookList[2].type = "Jiboni";

        bookList[0].name = "Shesher Kobita";
        bookList[1].name = "Boigganik Goppo";
        bookList[2].name = "Humayun Ahmed Er Jiboni";

        bookList[0].filename = "ShesherKobita";
        bookList[1].filename = "BoigganikGoppo";
        bookList[2].filename = "HumayunAhmedErJiboni";

        for(int i=0; i<bookList.length; i++) {
            System.out.println("Book Type: " + bookList[i].type);
            System.out.println("Book Name: " + bookList[i].name);
            bookList[i].startReading();
            System.out.println("\n");
        }
    
    }
}
