import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        int b = sc.nextInt();
        BigDecimal big = new BigDecimal(a);
        System.out.println(big.setScale(b, RoundingMode.HALF_DOWN));
    }   
}