import java.util.*;
import java.math.*;

public class mergestr {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string 1: ");
        String s1=sc.nextLine();
        int m=s1.length();
        System.out.println("Enter the string 2: ");
        String s2=sc.nextLine();
        int n=s2.length();
        StringBuilder res=new StringBuilder();
        int min=Math.min(m, n);
        int i;
        for(i=0;i<min;i++){
            res.append(s1.charAt(i)).append(s2.charAt(i));
        }
        if(m>n){
            res.append(s1.substring(i));
        }
        else if(n>m){
            res.append(s2.substring(i));
        }

        System.out.println(res);
    }
}

