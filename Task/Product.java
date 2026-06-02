import java.util.*;
class Product
{
    public static void main(String args[])
    {
       Scanner sc = new Scanner(System.in);
       int n=sc.nextInt();  
       int arr[]=new int[n];
       for(int i=0;i<n;i++)
       {
           arr[i]=sc.nextInt();
       }
       int product = 1;
       for(int i=0;i<n;i++)
       {
         for(int j=0;j<n;j++)
         {
             if(i!=j)
             {
                 product=product*arr[j];
             }
         }
       System.out.println(product);
        }
    }
}