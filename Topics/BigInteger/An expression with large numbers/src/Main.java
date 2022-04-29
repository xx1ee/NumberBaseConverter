import java.math.BigInteger;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BigInteger number1 = new BigInteger(sc.next());
        BigInteger number2 = new BigInteger(sc.next());
        BigInteger number3 = new BigInteger(sc.next());
        BigInteger number4 = new BigInteger(sc.next());
        System.out.println(number1.negate().multiply(number2).add(number3).subtract(number4));
    }
}