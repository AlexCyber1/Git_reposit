import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int a;
        int b;
        Name();
    }

    public static void Name() {
        System.out.println("You name?");
        Scanner scan = new Scanner(System.in);
        String name = scan.nextLine();
        System.out.println("Hello " + name + "!");

    }
}