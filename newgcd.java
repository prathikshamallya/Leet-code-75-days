import java.util.Scanner;

public class newgcd {
    public String gcds(String s1,String s2){
        int l1=s1.length();
        int l2=s2.length();
        if(!(s1+s2).equals(s2+s1))
            return "";
        String res=s1.substring(0, gcd(l1,l2));
        return res;
    }
    public static int gcd(int n1,int n2){
        if(n2==0){
            return n1;
        }
        return gcd(n2,n1%n2);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        newgcd n=new newgcd();
        System.out.println("Enter the String 1");
        String s1=sc.nextLine();
        System.out.println("Enter the String 2");
        String s2=sc.nextLine();
        String res=n.gcds(s1,s2);
        System.out.println(res);
    }
}
