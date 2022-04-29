package converter;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Objects;
import java.util.Scanner;

    class Convert {

        public void Conv (BigInteger num1, Double num2, int tg1) {
            BigInteger tg = new BigInteger(String.valueOf(tg1));
            StringBuilder convNum1 = new StringBuilder();
            StringBuilder convNum2 = new StringBuilder();
            StringBuilder elements = new StringBuilder().append("0123456789abcdefghijklmnopqrstuvwxyz");
            BigInteger ost = BigInteger.ONE.negate();
            while (num1 != BigInteger.ZERO)
            {
                ost = num1.remainder(tg);
                num1 = num1.divide(tg);
                int ostt = ost.intValue();
                convNum1 = convNum1.append(elements.charAt(ostt));
            }
            convNum1 = convNum1.reverse();
            int k = 0;
            Double part1 = num2;
            while (k != 5)
            {
                Double part = part1 * tg1;
                String[] parts = String.valueOf(part).split("\\.");
                parts[1] = "0." + parts[1];
                convNum2 = convNum2.append(elements.charAt(Integer.parseInt(parts[0])));
                part1 = Double.parseDouble(parts[1]);
                k++;
            }
            System.out.println("Conversion result: " + convNum1 + "." + convNum2);

        }

        public void Conv1 (int base, String n, int tg) {
            String[] mass = n.split("\\.");
            StringBuilder number1 = new StringBuilder(mass[0]);
            StringBuilder number2 = new StringBuilder(mass[1]);
            double convNum2 = 0.0;
            StringBuilder alph = new StringBuilder().append("0123456789abcdefghijklmnopqrstuvwxyz");
            BigInteger convnum1 = new BigInteger(number1.toString(), base);
            int index = 0;
            for (int i = -1; i > -(number2.length()) - 1 ; i--)
            {
                double num = alph.indexOf(Character.toString(number2.charAt(index))) * Math.pow(base, i);
                convNum2+=num;
                index++;
            }
            //System.out.println(convNum2);
            String convvnum2 = String.valueOf(convNum2);
            //System.out.println(convvnum2);
            double convnum2 = Double.parseDouble(convvnum2);
           // System.out.println(convnum1);
            Conv(convnum1,convnum2,tg);
        }


    public static void main(String[] args) {
        int src, target;
        String cmd, number;
        Scanner scanner = new Scanner(System.in);
        final String prompt = "Enter two numbers in format: {source base} {target base} (To quit type /exit) ";

        while (true) {
            System.out.print(prompt);
            cmd = scanner.nextLine();
            if (Objects.equals(cmd, "/exit")) {
                System.exit(0);
            }
            else {
                String[] nums = cmd.split(" ");
                src = Integer.valueOf(nums[0]);
                target = Integer.valueOf(nums[1]);
                while (true) {
                    System.out.print("Enter number in base " + src + " to convert to base " + target + " (To go back type /back) ");
                    number = scanner.nextLine();
                    if (number.contains("."))
                    {
                        Convert convert = new Convert();
                        convert.Conv1(src, number, target);
                    } else {
                        if (Objects.equals(number, "/back")) {
                            break;
                        } else {
                            {
                                BigInteger res = new BigInteger(number, src);
                                System.out.println("Conversion result: " + res.toString(target));
                            }
                        }
                    }
                }
            }

        }
    }
}
