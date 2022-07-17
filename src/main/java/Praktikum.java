import java.util.Scanner;

public class Praktikum {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String name = console.nextLine();
        Account account = new Account(name);
        if (account.checkNameToEmboss()) {
            System.out.println("Данные удовлетворяют условиям");}
        else {
            System.out.println("Введены некорректные данные");}

    }

}
