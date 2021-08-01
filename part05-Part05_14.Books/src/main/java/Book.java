
public class Book {

    private String name;
    private int publicationYear;

    public Book(String name, int publicationYear) {
        this.name = name;
        this.publicationYear = publicationYear;
    }

    public String getName() {
        return name;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    //Solving it by comparing the toString methods for fun, and see if the to String returns identical strings
    public String toString(){
        return name + " ," + publicationYear;
    }

}
