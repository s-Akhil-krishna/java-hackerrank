import java.util.Scanner;

public class Solution {

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = s.substring(0,k);
        String largest = "";
        String substring = "";
        for(int i=0;i<s.length()-k+1;i++){
            substring = s.substring(i,i+k);
            smallest = smallest.compareTo(substring)>0?substring:smallest;
            largest =  largest.compareTo(substring)>0?largest:substring;
        }

        return smallest + "\n" + largest;
    }

