import java.util.*;
class StringCombinations
{
    public void printAllCombinations(char[] str,int start,int end)
    {
        int i,k;
        char g;
        if(start==end)
        {
            for(i=0;i<=end;i++) System.out.print(str[i]);
            System.out.println();
            return;
        }
        for(i=start;i<=end;i++)
        {
            for(k=start;k<i;k++) if(str[i]==str[k]) break;
            if(k<i) continue;
            g=str[start];
            str[start]=str[i];
            str[i]=g;
            printAllCombinations(str,start+1,end);
            g=str[start];
            str[start]=str[i];
            str[i]=g;
        }
    }
    public static void main(String gg[])
    {
        
        System.out.print("Enter a string : ");
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        char[] a=str.toCharArray();        
        StringCombinations s=new StringCombinations();
        s.printAllCombinations(a,0,a.length-1);
        sc.close();
    }
}