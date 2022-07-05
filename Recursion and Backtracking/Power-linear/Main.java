import java.util.*;

public class Main {

    /**
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        try (Scanner scn = new Scanner(System.in)) {
            int x = scn.nextInt();
            int n = scn.nextInt();
            System.out.println(power(x , n));
        }

    }

    public static int power(int x, int n){
        if (n == 0) return 1;
        int pow = power(x , n-1);
        pow *= x;
        return pow;
    }

}
