import java.util.Scanner;

public class reverseString {

    public String reverseStr(String s){
        String[] st=s.split("\\s+");
        StringBuilder res=new StringBuilder();
        for(int i=st.length-1;i>=0;i--){
            res.append(st[i]);
            if(i>0){
                res.append(" ");
            }
        }
        return res.toString().trim();
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        reverseString r=new reverseString();
        System.out.println("Enter the String");
        String s=sc.nextLine();
        String res=r.reverseStr(s);
        System.out.println("result is: "+res);
    }
    
}
