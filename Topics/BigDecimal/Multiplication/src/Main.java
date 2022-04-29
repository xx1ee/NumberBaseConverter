import java.math.BigDecimal;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        BigDecimal n = new BigDecimal(a);
        BigDecimal n1 = new BigDecimal(b);
        System.out.println(n.multiply(n1));
    }
}