
public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {

        if (cents > 99) {
            euros = euros + cents / 100;
            cents = cents % 100;
        }

        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return this.euros;
    }

    public int cents() {
        return this.cents;
    }

    public String toString() {
        String zero = "";
        if (this.cents < 10) {
            zero = "0";
        }

        return this.euros + "." + zero + this.cents + "e";
    }

    public Money plus(Money addition){
        //Lets the constructor take care of the cents above 99
        Money newMoney = new Money((this.euros + addition.euros), (this.cents + addition.cents));

        return newMoney;
    }

    public boolean lessThan(Money compared){
        if (this.euros < compared.euros){
            return true;
        }

        if (this.euros > compared.euros){
            return false;
        }

        if (this.cents < compared.cents){
            return true;
        }

        if (this.cents > compared.cents){
            return false;
        }
        return false;

        /* How it's solved in suggestion solution
            return (100 * this.euros + this.cents) < (100 * compared.euros() + compared.cents());
         */
    }

    public Money minus(Money decreaser){
        Money newMoney;
        if (this.euros >= decreaser.euros && this.cents >= decreaser.cents){
            newMoney = new Money(this.euros - decreaser.euros, this.cents - decreaser.cents);
        }else if((this.euros - decreaser.euros) > 1 && this.cents < decreaser.cents){
            newMoney = new Money((this.euros - decreaser.euros) - 1, (100 + this.cents) - decreaser.cents);
        }else {
            newMoney = new Money(0,0);
        }

        return newMoney;

        /* How it's solved in the suggestion solution
            int euros = this.euros - decreaser.euros();
        int cents = this.cents - decreaser.cents();

        if (cents < 0) {
            cents = cents + 100;
            euros = euros - 1;
        }

        // if the value becomes negative, return zero
        if (euros < 0) {
            return new Money(0, 0);
        }

        return new Money(euros, cents);
         */
    }

}
