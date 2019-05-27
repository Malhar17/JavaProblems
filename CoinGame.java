import java.util.LinkedList;
import java.util.Scanner;

public class CoinGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n");
        int n = sc.nextInt();
        System.out.println("Enter coins values");
        LinkedList<Integer> coins = new LinkedList<>();
        for(int i=0;i<n;i++)
            coins.add(sc.nextInt());
        boolean flag = true;
        int maxValue = 0;
        while(!coins.isEmpty())
        {
            if(flag)
            {
                int x , y;
                x = y = 0;
                n = coins.size();
                for(int i=0;i<n;i++)
                    if(i%2 == 0)
                        x+=coins.get(i);
                    else
                        y+=coins.get(i);
                if(x>y)
                    maxValue += coins.pollFirst();
                else maxValue += coins.pollLast();
            }
            else
            {
                if(coins.getFirst() > coins.getLast())
                    coins.removeFirst();
                else coins.removeLast();
            }
            flag = !flag;
        }
        System.out.println("Max money is "+maxValue);
    }
}
