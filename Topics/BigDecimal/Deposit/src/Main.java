import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        BigDecimal d = new BigDecimal(str);
        String a = sc.next();
        int b = sc.nextInt();
        BigDecimal per = new BigDecimal(a);
        BigDecimal skob = BigDecimal.ONE.add(per.divide(BigDecimal.TEN.multiply(BigDecimal.TEN))).pow(b);
        System.out.println("Amount of money in the account: " + d.multiply(skob).setScale(2, RoundingMode.CEILING));
    }
}