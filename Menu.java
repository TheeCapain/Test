import java.util.Scanner;

public class Menu {
    private String menuHeader;
    private String leadText;
    private String[] menuItems;

    public void setMenu(String menuHeader, String leadText, String[] menuItems) {
        this.menuHeader = menuHeader;
        this.leadText = leadText;
        this.menuItems = menuItems;

    }

    public void printMenu() {
        setMenu("August's Pizzeria 2.0", "MENU: ", new String[]{"Pizza", "Burger", "Soda"});
        System.out.println(menuHeader + "\n" + leadText);
        for (int i = 0; i < menuItems.length; i++) {
            System.out.println((i + 1) + ". " + "Choose " + menuItems[i]);
        }
        System.out.println("Press 9 to quit");
    }

    public void readChoice() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Choose between 1-3");
        int choice = scan.nextInt();
        switch (choice) {
            case 1 -> {
                System.out.println("You chose Pizza");
                System.out.println("Do you want anything else? Yes/No");
                scan.nextLine();
                if (!scan.nextLine().equals("Yes")) {
                    System.out.println("Have a nice day");
                } else {
                    System.out.println("What else would you like?");
                    printMenu();
                    readChoice();

                }
            }
            case 2 -> {
                System.out.println("You chose Burger");
                System.out.println("Do you want anything else?Yes/No");
                scan.nextLine();
                if (!scan.nextLine().equals("Yes")) {
                    System.out.println("Have a nice day");
                } else {
                    System.out.println("What else would you like?Yes/No");
                    printMenu();
                    readChoice();

                }
            }
            case 3 -> {
                System.out.println("You chose Soda");
                System.out.println("Do you want anything else? Yes/No");
                scan.nextLine();
                if (!scan.nextLine().equals("Yes")) {
                    System.out.println("Have a nice day");
                } else {
                    System.out.println("What else would you like?");
                    printMenu();
                    readChoice();

                }
            }
            case 9 -> System.out.println("See you next time!");
            default -> {
                System.out.println(choice + " is not an option");
                printMenu();
                readChoice();
            }
        }
    }

}
