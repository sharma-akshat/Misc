import java.util.*;
class MinimumAndMaximum
{
    public int findMaxNumber(int[] x)
    {
        int maximum=x[0];
        for(int i=1;i<x.length;i++)
        {
            if(x[i]>maximum) maximum=x[i];
        }
        return maximum;
    }
    public int findMinNumber(int[] y)
    {
        int minimum=y[0];
        for(int i=1;i<y.length;i++)
        {
            if(y[i]<minimum) minimum=y[i];
        }
        return minimum;
    }
    public static void main(String gg[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of array : ");
        int size=sc.nextInt();
        int array[]=new int[size];
        for(int i=0;i<size;i++)
        {
            System.out.print("Enter the element : ");
            array[i]=sc.nextInt();
        }
        MinimumAndMaximum mm=new MinimumAndMaximum();
        int max=mm.findMaxNumber(array);
        int min=mm.findMinNumber(array);
        System.out.println("Maximum number is : "+max);
        System.out.println("Minimum number is : "+min);
        sc.close();
    }
}