import java.util.*;
class Reverse
{
    public static void main(String args[])throws Exception
    {
        int i,n=0,j,t=0,p=0;
        
        Scanner scanner=new Scanner(System.in);
        n=scanner.nextInt();
        int array[]=new int[1000000];
        for(i=0;i<n;i++)
        {
            array[i]=scanner.nextInt();
        }
        for(j=n-1;j>=0;j--)
        {    
            System.out.print(array[j]+" ");
        }
    }
}