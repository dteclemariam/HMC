
public class Apartment {

    private int rooms;
    private int squares;
    private int princePerSquare;

    public Apartment(int rooms, int squares, int pricePerSquare) {
        this.rooms = rooms;
        this.squares = squares;
        this.princePerSquare = pricePerSquare;
    }

    public boolean largerThan(Apartment compared){
        return squares > compared.squares;
    }

    public int price(){
        return princePerSquare * squares;
    }

    public int priceDifference(Apartment compared){
        /* Math.abs returns the absolute value of an int value.
        If the argument is not negative, the argument is returned.
        If the argument is negative, the negation of the argument is returned.
        https://docs.oracle.com/javase/8/docs/api/java/lang/Math.html
        */

        return Math.abs(price() - compared.price());
    }

    public boolean moreExpensiveThan(Apartment compared){
        return price() > compared.price();
    }

}
