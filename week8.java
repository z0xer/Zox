import java.util.*;
public class week8 {
    public static void main(String args[]){
      /*  Scanner s = new Scanner (System.in);
        int n = s.nextInt();
        int m = s.nextInt();
        int[][] a = new int[n][m];

        for(int i = 0; i < n ; i++)
            for(int j = 0; j < m; j++)
                a[i][j] = s.nextInt();




        int max = Integer.MIN_VALUE;
        int ii = -1; // что бы сохранить индексацу
        int jj = -1;
        for(int i = 0; i < n ; i++)
            for(int j = 0; j < m; j++)
                if(a[i][j] > max){
                    max = a[i][j];
                 ii= i;
                 jj = j;
                }
        System.out.println(max);
        System.out.println(ii + " "  + jj); */





































        Scanner s = new Scanner (System.in);
        int n = s.nextInt();
        int m = s.nextInt();
        int [][] a = new int[n][m];
        int temp = 0;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m ;j++){
                a[i][j] = s.nextInt();
                temp = a[i][j];
                a[i][j] = a[i][n - j - 1];
                a[i][n - j - 1] = temp;
            }
            System.out.println();
        }
        for(int i =0 ; i < n; i++){
            for(int j = 0; j < m;j++){
                System.out.print(a[i][j] + " ");

            }
            System.out.println();

        }









    }
}
