import java.util.Scanner;
public class LongestIncreasingSubsequence
{
    public static int lis(int arr[],int n ){  
        int lis[]=new int[n]; 
        lis[0] = 1;    
        for(int i=1; i<n; i++){ 
            lis[i] = 1; 
            for(int j=0; j<i; j++)   
                if(arr[i]>arr[j] && lis[i]<lis[j]+1)  
                    lis[i]=lis[j]+1;  
        } 
        int m=Integer.MIN_VALUE;
        for(int i=0; i<n; i++)
            if(m<lis[i])
                m=lis[i];
        return m;
    }  
    public static void main(String[] args){ 
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
          a[i]=s.nextInt();
        System.out.print(lis(a,n));
      }
  }
  