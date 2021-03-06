import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int x = scn.nextInt();
        int n = scn.nextInt();
        System.out.println(power(x , n));
        scn.close();
    }

    public static int power(int x, int n){
        if (n == 0) return 1;
        int xn1 = power(x , n/2);
        int xn = xn1 * xn1;
        if (n % 2 == 1) xn = xn * x;
        return xn;
    }

}