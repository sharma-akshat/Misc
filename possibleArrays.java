import java.util.*;

public class possibleArrays {
    public static void main(String gg[])
    {
        Scanner sc=new Scanner(System.in);
        int k, n;
        System.out.print("Enter the range of numbers: ");
        n=sc.nextInt();
        System.out.print("Enter the lenght of array needed: ");
        k=sc.nextInt();
        System.out.println(count(n, k));
        sc.close();
    }

    public static int count(int n, int k)
    {
        if(k==1) return n;
        if(k==2) return counter(n, k);
        int mid=k/2;
        int x=count(n, k-mid);
        int y=counter(n, mid);
        return x+y-1;
    }

    public static int counter(int n, int k)
    {
        int count=0;
        if(k==1) return n;
        else{
            for(int i=1;i<n;i++)
            {
                for(int j=1;j<=n;j++)
                {
                    if(j%i==0) count++;
                }
            }
        }
        return count;
    }
}
