import java.util.Scanner;

public class flowers {
    public boolean canPlaceFlowers(int[] flowerbed, int n){
        int i;
        if(n==0){
            return true;
        }
        for(i=0;i<flowerbed.length;i++){
            boolean left=(i==0)||(flowerbed[i-1]==0);
            boolean right=(i==flowerbed.length-1)||(flowerbed[i+1]==0);
            if(flowerbed[i]==0&&left&&right){
                flowerbed[i]=1;
                n-=1;
                
                
            }
            if(n==0){
                return true;
            }
        }
        return false;
    }


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        flowers p=new flowers();
        System.out.println("Enter no of elements");
        int n=sc.nextInt();
        System.out.println("enter array elements");
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        System.out.println("Enter the value of k");
        int k=sc.nextInt();
        boolean res=p.canPlaceFlowers(a, k);
        System.out.println(res);
    }
}
