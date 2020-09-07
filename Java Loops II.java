import java.util.*;
import java.io.*;

class Solution{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            int two = 1;
            int prev = a;
            for(int j=0;j<n;j++){
                int cur = prev+two*b;
                System.out.printf("%s ",cur);
                two = two*2;
                prev = cur;
            }
            System.out.println();
        }
        in.close();
    }
}
