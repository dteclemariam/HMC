
public class YourFirstBankTransfer {

    public static void main(String[] args) {
        // Do not touch the code in Account.java
        // write your program here
        Account account = new Account("Matthews account", 1000);
        Account accountTwo = new Account("My account", 0);

        account.withdrawal(100);
        accountTwo.deposit(100);

        System.out.println(account);
        System.out.println(accountTwo);
    }
}
