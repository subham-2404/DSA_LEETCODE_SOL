import java.util.Scanner;
public class MajorityElement {
    public static int majorityElement(int[] nums) {
        int count;
        int element=-1;
        int n=nums.length;
        for(int i=0;i<n;i++)
        {
            element=nums[i];
            count =0;
            for(int j=0;j<n;j++)
            {
                if(nums[i]==nums[j])
                {
                    count++;
                }
            }
            if(count>(n/2))
                {
                break;
            }
        }
        return element;
    }
    public static void main(String args[])
    {
     Scanner sc =new Scanner(System.in);
     System.out.println("Enter the length of the array ");
     int n =sc.nextInt();
     int nums[]=new int[n];
     System.out.println("Enter the elements of the array");
     for(int i =0;i<n;i++)
     {
       nums[i]=sc.nextInt();         
     }
     int z=majorityElement(nums);
     if(z!=-1)
     {
         System.out.println("The majority element is "+z);
     }
     else
     {
         System.out.println("The majority element is not found ");
     }
    }
}
