import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        Hero hero = new Hero("Hero", 32,200,2000, AttackHero.getByNumber(a));
        System.out.println(hero);
    }
}