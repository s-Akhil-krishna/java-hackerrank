//solution-1
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        int len = A.length();
        int i=0,j = len-1;
        boolean answer = true;
        while (i<j){
            if (A.charAt(i)!=A.charAt(j)){
                answer = false;
            }
            i+=1;
            j-=1;
        }
        System.out.println(answer==true?"Yes":"No");
        
    }
}



//solution2
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();

        int len = A.length();
        boolean answer = true;
        StringBuffer buffer = new StringBuffer(A);
        buffer.reverse();
        String B = buffer.toString(); 
        if (A.compareTo(B)!=0)
            answer = false;
    
        System.out.println(answer==true?"Yes":"No");
        
    }
}








