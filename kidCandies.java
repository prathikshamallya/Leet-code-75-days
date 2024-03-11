import java.util.*;

class kidCandies {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> res=new ArrayList<>();
        int result;
        int maxs=0;
        int i;
        for(i=0;i<candies.length;i++){
            maxs=Math.max(maxs,candies[i]);
        }
        System.out.println("Max is"+maxs);
        for(i=0;i<candies.length;i++){
            result=candies[i]+extraCandies;
            if(result>=maxs){
                res.add(true);
            }
            else{
                res.add(false);
            }
        }
        return res;
    }
    

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        kidCandies k=new kidCandies();
        System.out.println("Enter the no of elements");
        int n=sc.nextInt();
        System.out.println("Enter elemnts");
        int ab[]=new int[n];
        for(int i=0;i<n;i++)
        {
            ab[i]=sc.nextInt();
        }
        System.out.println("Enter the candies");
        int e=sc.nextInt();
        List<Boolean> res=k.kidsWithCandies(ab, e);
        for(Boolean resu:res){
            System.out.println(resu);
        }
    }
}