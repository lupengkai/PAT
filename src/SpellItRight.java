import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Created by tage on 2/24/16.
 */
public class SpellItRight {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        char[] in = s.toCharArray();
        Map map = new HashMap<>();
        map.put('0', "zero");
        map.put('1', "one");
        map.put('2', "two");
        map.put('3', "three");
        map.put('4', "four");
        map.put('5', "five");
        map.put('6', "six");
        map.put('7', "seven");
        map.put('8', "eight");
        map.put('9', "nine");
        int sum = 0;
        for (int i = 0; i < in.length; i++) {
            sum += Integer.parseInt(in[i] + "");
        }
       char[] out = (sum + "").toCharArray();
        for (int i = 0; i< out.length; i++) {
            System.out.print(map.get(out[i]));
            if (i != out.length-1) {
                System.out.print(" ");
            }
        }

    }
}
