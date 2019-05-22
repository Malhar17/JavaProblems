import java.util.*;

import static java.lang.Math.cos;
import static java.lang.Math.max;

public class mazeProblem {

    private static int count = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n");
        int n = sc. nextInt();
        int [][]maze = new int[n][n];
        for(int i = 0; i<n;i++) {
            for (int j = 0; j < n; j++)
                maze[i][j] = sc.nextInt();
        }

        System.out.println(getMaxCost(maze, n, 0, 0)+ " " + count);
    }

    private static int getMaxCost(int[][] maze, int n, int i, int  j) {
        if(i>=n || j >=n)
            return 0;
        int cost = 0;
        if(i == n-1 && j == n-1)
        {
            count++;
            cost = maze[i][j];
        }
        else if(i == n-1 && j != n-1 && (maze[i][j] != 2))
        {
            int temp = getMaxCost(maze, n, i, j+1);
            cost = temp != 0 ? maze[i][j]+temp : 0;
        }
        else if(i != n-1 && j == n-1 && (maze[i][j] != 1))
        {
            int temp = getMaxCost(maze, n, i+1, j);
            cost = temp != 0 ? maze[i][j]+temp : 0;
        }
        else if(maze[i][j] == 1)
        {
            int temp = getMaxCost(maze , n, i, j+1);
            cost = temp != 0 ? maze[i][j]+temp : 0;
        }
        else if(maze[i][j] == 2)
        {
            int temp = getMaxCost(maze , n, i+1, j);
            cost = temp != 0 ? maze[i][j]+temp : 0;
        }
        else
        {
            int temp1 = getMaxCost(maze, n, i+1, j);
            int temp2 = getMaxCost(maze, n, i, j+1);
            cost = 3 + (temp1>temp2 ? temp1 : temp2);
        }
        return  cost;
    }
}
