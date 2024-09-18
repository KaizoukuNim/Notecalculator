import java.util.Scanner;

public class notecalculator {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int money;
            System.out.println("Enter the amount");
            money = sc.nextInt();
            if (money >= 1000) {
                int temp1 = money / 1000;
                money = money - (temp1 * 1000);
                System.out.println("The 1000s you receive are" + temp1);
            }
            if (money >= 500) {
                int temp2 = money / 500;
                money = money - (temp2 * 500);
                System.out.println("The 500s you receive are" + temp2);
            }
            if (money >= 100) {
                int temp3 = money / 100;
                money = money - (temp3 * 100);
                System.out.println("The 100s you receive are" + temp3);
            }
            if (money >= 50) {
                int temp4 = money / 50;
                money = money - (temp4 * 50);
                System.out.println("The 50s you receive are" + temp4);
            }
            if (money >= 20) {
                int temp5 = money / 25;
                money = money - (temp5 * 25);
                System.out.println("The 20s you receive are" + temp5);
            }
            if (money >= 10) {
                int temp6 = money / 10;
                money = money - (temp6 * 10);
                System.out.println("The 10s you receive are:" + temp6);
            }
            if (money >= 5) {
                int temp7 = money / 5;
                money = money - (temp7 * 5);
                System.out.println("The 5s you receive are" + temp7);
            }
            if (money >= 2) {
                int temp8 = money / 2;
                money = money - (temp8 * 2);
                System.out.println("The 2s you receive are" + temp8);
            }
            if (money >= 1) {
                int temp9 = money;
                money = money - temp9;
                System.out.println("The 1s you receive are" + temp9);
            }
            sc.close();
        }

}
