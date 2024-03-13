import java.util.Scanner;

public class ovel {
    public String reverseVowels(String s){
        int i=0;
        int j=s.length()-1;
        char[] c=s.toCharArray();
        while(i<j){
            if(isvowel(c[i])&&isvowel(c[j])){
                char temp=c[i];
                c[i]=c[j];
                c[j]=temp;
                i++;
                j--;
            }

            if(!isvowel(c[i]))
                i++;
            if(!isvowel(c[j]))
                j--;
        }
        return new String(c);
    }

    public boolean isvowel(char c){
        boolean res;
        if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||c=='A'||c=='E'||c=='I'||c=='O'||c=='U')
            res=true;  
        else
            res=false;  

        return res;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ovel r=new ovel();
        System.out.println("Enter the String");
        String s=sc.nextLine();
        String res=r.reverseVowels(s);
        System.out.println("result is"+res);
    }
}
