public class BankAccount {
    public static void main(String[] args) {
        double balance = 2175.37; 
        balance -= 302.50; 
        balance += 50.03; 
        balance /= 2; 
        balance += 20.00;
        --balance;
        balance *= 2; 
        ++balance; 

        System.out.printf("Bob's new balance is: $%.2f\n" , balance);
    }
}
