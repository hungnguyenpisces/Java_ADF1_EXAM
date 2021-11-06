package Exercise1;

public class BankMain {
    public static void main(String[] args) {
        Bank br1 = new Bank(1000, 10);
        System.out.println(br1.calculateInterest());
        System.out.println();
        Bank br2 = new Bank();
        br2.inputToCalc();
        br2.showMonthlyInterest();
    }
}
