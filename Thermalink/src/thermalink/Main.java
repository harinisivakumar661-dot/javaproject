package thermalink;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        IndustryManager im = new IndustryManager();
        HeatManager hm = new HeatManager();
        ExchangeManager em = new ExchangeManager();

        int choice = 0;

        while (choice != 6) {

            System.out.println("\n==========================");
            System.out.println("       THERMALINK");
            System.out.println("==========================");
            System.out.println("1. Add Industry");
            System.out.println("2. View Industries");
            System.out.println("3. Add Waste Heat");
            System.out.println("4. Request Heat");
            System.out.println("5. View Exchange History");
            System.out.println("6. Exit");
            System.out.println("==========================");

            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            if (choice == 1) {

                System.out.print("Enter ID: ");
                int id = sc.nextInt();

                sc.nextLine();

                System.out.print("Enter name: ");
                String name = sc.nextLine();

                System.out.print("Enter type: ");
                String type = sc.nextLine();

                System.out.print("Enter location: ");
                String location = sc.nextLine();

                Industry i =
                    new Industry(id, name, type, location);

                im.add(i);
            }

            else if (choice == 2) {

                im.showAll();
            }

            else if (choice == 3) {

                System.out.print("Enter industry ID: ");
                int id = sc.nextInt();

                if (im.find(id) == null) {
                    System.out.println("Industry not found.");
                }
                else {

                    System.out.print("Enter waste heat: ");
                    double h = sc.nextDouble();

                    hm.addHeat(id, h);
                }
            }

            else if (choice == 4) {

                System.out.print("Enter consumer ID: ");
                int id = sc.nextInt();

                System.out.print("Enter required heat: ");
                double h = sc.nextDouble();

                em.match(id, h, im, hm);
            }

            else if (choice == 5) {

                em.showExchanges();
            }

            else if (choice == 6) {

                System.out.println("Thank you!");
            }

            else {

                System.out.println("Invalid choice.");
            }
        }

        sc.close();
    }
}
