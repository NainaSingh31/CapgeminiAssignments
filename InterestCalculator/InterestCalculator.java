package InterestCalculator;

import java.util.Scanner;

public class InterestCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice = 0;

        while (choice != 4) {
            System.out.println("Select the type of account:");
            System.out.println("1. FD");
            System.out.println("2. SB");
            System.out.println("3. RD");
            System.out.println("4. Exit");

            if (sc.hasNextInt()) {
                choice = sc.nextInt();
            } else {
                sc.next();
                continue;
            }

            try {
                switch (choice) {
                    case 1: {
                        System.out.println("Enter the FD amount:");
                        double fdAmount = sc.nextDouble();
                        System.out.println("Enter the no. of days:");
                        int days = sc.nextInt();
                        System.out.println("Enter your age:");
                        int fdAge = sc.nextInt();
                        FDAccount fd = new FDAccount(fdAmount, days, fdAge);
                        System.out.printf("Interest gained is: %.0f ", fd.calculateInterest());
                        break;
                    }
                    case 2: {
                        System.out.println("Enter the Average amount in your account:");
                        double sbAmount = sc.nextDouble();
                        System.out.println("Enter account type (Normal/NRI):");
                        String type = sc.next();
                        SBAccount sb = new SBAccount(sbAmount, type);
                        System.out.printf("Interest gained: %.0f", sb.calculateInterest());
                        break;
                    }
                    case 3: {
                        System.out.println("Enter the RD monthly amount:");
                        double rdAmount = sc.nextDouble();
                        System.out.println("Enter the number of months:");
                        int months = sc.nextInt();
                        System.out.println("Enter your age:");
                        int rdAge = sc.nextInt();
                        RDAccount rd = new RDAccount(rdAmount, months, rdAge);
                        System.out.printf("Interest gained is: %.0f", rd.calculateInterest());
                        break;
                    }
                    case 4: {
                        return;
                    }
                    default:
                        System.out.println("Invalid option.");
                }
            } catch (Exception e) {
                System.out.println("Invalid input.");
            }
            System.out.println();
        }
    }
}