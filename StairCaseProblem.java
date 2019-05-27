import java.util.Scanner;

public class StairCaseProblem {

    private static int count = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n");
        int n = sc.nextInt();
        getTotalWays(n);
        System.out.println("Total number of ways is: " + count);
    }

    private static void getTotalWays(int n) {
        if(n == 0)
            count++;
        else if(n == 1)
            count++;
        else if(n == 2)
            count += 2;
        else if(n == 3)
            count += 4;
        else
        {
            getTotalWays(n-1);
            getTotalWays(n-2);
            getTotalWays(n-3);
        }
    }
}
