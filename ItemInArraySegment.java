import java.util.*;
class ItemInArraySegment
{
    public boolean present(int[] array,int segment,int num)
    {
        int i;
        boolean present=false;
        int n=array.length;
        for(i=0;i<n;i=i+segment)
        {
            for (int j=0;j<=segment;j++)
            {
                if(i+j<n && array[i+j]==num) break;                
                if(j==segment) return false;
                if(i+j>=n) return false;
            }
        }
        if(i>=n) return true;
        else return present;
        
    }
    public static void main(String gg[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of array : ");
        int size=sc.nextInt();
        int[] arr=new int[size];
        for(int i=0;i<size;i++)
        {
            System.out.print("Enter the element : ");
            arr[i]=sc.nextInt();
        }
        System.out.print("Enter the array segment : ");
        int seg=sc.nextInt();
        System.out.print("Enter the number to be searched : ");
        int x=sc.nextInt();
        boolean pr=false;
        ItemInArraySegment ai=new ItemInArraySegment();
        pr=ai.present(arr,seg,x);
        if(pr) System.out.print("Present");
        else System.out.print("Not present");
        sc.close();
    }
}