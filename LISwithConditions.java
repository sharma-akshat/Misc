import java.util.*;

public class LISwithConditions {
    public static int LIS(int[] arr, int i, int n, int prev)
    {
        if(i==n) return 0;

        int excl=LIS(arr, i+1, n, prev);

        int incl=0;
        if(arr[i]>prev){
            incl=1+LIS(arr, i+1, n, arr[i]);
        }
        return Integer.max(incl, excl);
    }

    public static void main(String gg[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the length of array: ");
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            System.out.print("Enter the element: ");
            arr[i]=sc.nextInt();
        }
        System.out.println("The length of the LIS is "+LIS(arr, 0, arr.length, Integer.MIN_VALUE));
        sc.close();
    }
}
