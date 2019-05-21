import java.util.Scanner;

public class TowerOfHanoi {

    static int c = 0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n");
        int n = sc.nextInt();
        towerOfHanoi(n, "A", "C", "B");
    }

    private static void towerOfHanoi(int n, String start, String end, String support) {
        if(n == 1)
        {
            c++;
            System.out.println(c +".\tMove Disk 1 from " + start + " to " + end);
            return;
        }
        towerOfHanoi(n-1, start, support, end);
        c++;
        System.out.println(c +".\tMove Disk " + n + " from " + start + " to " + end);
        towerOfHanoi(n-1, support, end, start);
    }
}
