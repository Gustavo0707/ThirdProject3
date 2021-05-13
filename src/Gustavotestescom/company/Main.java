package Gustavotestescom.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int age, wage;
        boolean valid = true;
        Scanner scanner = new Scanner(System.in);

        System.out.println("type you name ( your name may greater 3 characters )");
        String name = scanner.next();

            while(valid = true == name.length() < 3) {
                System.out.println("Your name is smaller, type again");
                name = scanner.nextLine();
            }

        System.out.println("type your age ( about 1 or 150 )");
        age = scanner.nextInt();

        while (valid = true == age > 150){
            System.out.println("type you age again");
            age = scanner.nextInt();
        }

        System.out.println("type your wage");
        wage = scanner.nextInt();

        while(valid = true == wage < 1){
            System.out.println("type you wage again");
            wage = scanner.nextInt();
        }

        System.out.println("type your sex (m or f)");
        String gender = scanner.next();

        while(valid = true == !gender.equalsIgnoreCase("m") & !gender.equalsIgnoreCase("f")){
            System.out.println("type your sex again");
             gender = scanner.next();
        }

        String status = scanner.next();
        System.out.println("type your marital status (single, married, widowed, divorced) ");
        String single, married, widowed, divorced = scanner.next();

        while(valid = true == (status.equalsIgnoreCase("single") & status.equalsIgnoreCase("married")
                & status.equalsIgnoreCase("widowed") & status.equalsIgnoreCase("divorced"))){
            System.out.println("type you marital status again");
            status = scanner.nextLine();
        }
        System.out.println("você terminou seu cadastro");
    }
}
