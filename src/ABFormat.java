import java.util.Scanner;

/**
 * Created by tage on 2/24/16.
 */
public class ABFormat {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = a + b;
        int d = Math.abs(c);
        String s = String.valueOf(d);
        char[] tmp = s.toCharArray();
        char[] result = new char[10];
        int count = 0;
        for (int i = 0,j=0; i< tmp.length; i++) {
            result[j++] = tmp[i];
            if ((tmp.length-i-1)%3 == 0 ) {
                result[j++] = ',';
                count ++;
            }
        }

        if (c<0) {
            System.out.print("-");
            for (int i =0; i <tmp.length + count -1  ; i++) {
                System.out.print(result[i]);
            }
        } else {
            for (int i =0; i < tmp.length+ count-1; i++) {
                System.out.print(result[i]);
            }

        }



    }
}
