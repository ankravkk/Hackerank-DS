import java.util.Scanner;
public class Hourglass
{
 public static void main(String[] args)
 {
     int sum=0;
     int min=-555;
     int i,j,c,d;
     int [][] mat = new int[6][6];
 Scanner input=new Scanner(System.in);
     for(i=0;i<6;i++)
     {
         for(j=0;j<6;j++)
         {
           mat[i][j] = input.nextInt();  
         }
     }
     for(i=0;i<4;i++)
     {
         for(j=0;j<4;j++)
         {
             sum=(mat[i][j]+mat[i][j+1]+mat[i][j+2])+
                      (mat[i+1][j+1])+
                  (mat[i+2][j]+mat[i+2][j+1]+mat[i+2][j+2]);
    
             if(sum>min)
             {
             min=sum;
                 
             }
            
         }
         
     }
        System.out.println(min);
 }
}