import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        String str = sc.next();
        BigDecimal first = new BigDecimal(str);
        System.out.println((first.setScale(b, RoundingMode.FLOOR)).pow(a));
    }
}