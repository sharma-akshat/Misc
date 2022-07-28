import java.util.*;

public class killingMosters {
    public static void main(String gg[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of monsters : ");
        int n=sc.nextInt();
        System.out.print("Enter your initial experience : ");
        int exp=sc.nextInt();

        int monst[]=new int[n];
        int bonus[]=new int[n];

        for(int i=0;i<n;i++){
            System.out.print("Enter the power of monster "+(i+1)+" : ");
            monst[i]=sc.nextInt();
        }

        for(int i=0;i<n;i++){
            System.out.print("Enter the bonus for defeating the monster "+(i+1)+" : ");
            bonus[i]=sc.nextInt();
        }

        class Monster{
            private final int power, bonus;
            public Monster(int power, int bonus)
            {
                this.power=power;
                this.bonus=bonus;
            }
        }

        Monster[] monster=new Monster[n];

        for(int i=0;i<n;i++) monster[i]=new Monster(monst[i], bonus[i]);

        Arrays.sort(monster, Comparator.comparingInt(m->m.power));

        int count=0;
        for(Monster m:monster)
        {
            if(exp<m.power)break;
            exp+=m.bonus;
            ++count;
        }
        System.out.println();
        System.out.print("Number of monsters whom you can defeat is : "+count);
        sc.close();
    }
}