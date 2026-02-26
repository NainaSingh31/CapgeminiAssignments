package DigitalCom;

import java.util.List;
import java.util.Scanner;

public class DigitalcomProcess {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        User user = new User();
        GameService service = new GameService();

        boolean isLoggedIn = false;
        int choice;

        while (true) {

            System.out.println("\n-- Digitalcom menu-------");
            System.out.println("1) RegisterUser");
            System.out.println("2) Login");
            System.out.println("3) ViewGames");
            System.out.println("4) SearchByAuthor");
            System.out.println("5) Exit");
            System.out.print("Enter choice: ");

            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    System.out.print("Enter UserID: ");
                    String userid = sc.nextLine();

                    System.out.print("Enter Password: ");
                    String password = sc.nextLine();

                    user.addUser(userid, password);
                    break;

                case 2:
                    System.out.print("Enter UserID: ");
                    String loginId = sc.nextLine();

                    System.out.print("Enter Password: ");
                    String loginPass = sc.nextLine();

                    if (user.IsAuthenticated(loginId, loginPass)) {
                        isLoggedIn = true;
                        System.out.println("Login Successful!");
                    } else {
                        System.out.println("Invalid Credentials!");
                    }
                    break;

                case 3:
                    if (!isLoggedIn) {
                        System.out.println("Please login first!");
                        break;
                    }

                    List<Game> gameList = service.viewAll();
                    for (Game g : gameList) {
                        System.out.println(g);
                    }
                    break;

                case 4:
                    if (!isLoggedIn) {
                        System.out.println("Please login first!");
                        break;
                    }

                    System.out.print("Enter Author Name: ");
                    String author = sc.nextLine();

                    String result = service.authorSearch(author);
                    System.out.println("Result: " + result);
                    break;

                case 5:
                    System.out.println("Thank You!");
                    System.exit(0);

                default:
                    System.out.println("Invalid Choice!");
            }
        }
    }
}