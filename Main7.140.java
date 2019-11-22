//7.140
import java.util.Scanner;
public class Main11 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int a;
        int min;
        int sec;
        a = sc.nextInt();
        min = a;
        sec = a;
        for (int i = 0; i < N-1; ++i)
        {
            a = sc.nextInt();
            if (a < min) {
                sec = min;
                min = a;
            }
            if (i != 0) {
                if (a > min && sec >= a) {
                    sec = a;
                }
            }
            else
                if (a > min)
                    sec = a;
            System.out.println(sec);
        }
        System.out.println(sec);
    }
}
