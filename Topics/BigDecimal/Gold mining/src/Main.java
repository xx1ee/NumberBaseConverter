import java.math.BigDecimal;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String d = sc.next();
        String b = sc.next();
        String t = sc.next();
        BigDecimal dv = new BigDecimal(d);
        BigDecimal bv = new BigDecimal(b);
        BigDecimal tor = new BigDecimal(t);

        System.out.println(dv.add(bv).add(tor));
    }
}