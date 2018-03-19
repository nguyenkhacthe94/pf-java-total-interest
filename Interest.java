import java.util.Scanner;

public class Interest {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter investment amount: ");
        double money = input.nextDouble();
        System.out.print("Enter number of months: ");
        int month = input.nextInt();
        System.out.print("Enter annual interest rate (in percentage): ");
        double interestRate = input.nextDouble();
        double monthInterest;
        double totalInterest = 0;
        for (int i = 0; i < month; i++) {
            monthInterest = money * (interestRate / 100) / 12;
            money = money + monthInterest;
            totalInterest = totalInterest + monthInterest;
        }
        System.out.println("Total interest: " + totalInterest);
        System.out.println("Total money: " + money);
    }
}
