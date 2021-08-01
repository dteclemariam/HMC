
public class Main {

    public static void main(String[] args) {
        // you can write code here to try out your program
        SimpleDate date = new SimpleDate(24, 3, 2017);
        SimpleDate date2 = new SimpleDate(23, 7, 2017);
        SimpleDate date3 = new SimpleDate(1,1,1);
        SimpleDate date4 = new SimpleDate(1,1,1);

        Person leo = new Person("Leo", date, 62, 9);
        Person lily = new Person("Lily", date2, 65, 8);
        Person equals = new Person("Test", date3, 1,1);
        Person equals2 = new Person("Test", date3, 1,1);
        Person equals3 = equals2;

        if (leo.equals(lily)) {
            System.out.println("Is this quite correct?");
        }

        Person leoWithDifferentWeight = new Person("Leo", date, 62, 10);

        if (leo.equals(leoWithDifferentWeight)) {
            System.out.println("Is this quite correct?");
        }

        if (!(leo.equals(lily))){
            System.out.println("Returns false when comparing to different persons");
        }

        if (!(leo.equals(leoWithDifferentWeight))){
            System.out.println("Returns false when comparing to different persons with same name but different weight");
        }

        if (equals.equals(equals2)){
            System.out.println("Returns true if two different objects has the same values");
        }

        if (equals.equals(equals2)){
            System.out.println("Returns true if two object variables point to the same object");
        }


        
    }
}
