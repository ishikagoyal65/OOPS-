
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
class Solution {
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int ar[]=new int[n];
        for(int i=0;i<n;i++)
        {
            ar[i]=sc.nextInt();
        }
        Solution ss=new Solution();
        ss.sort(ar, n);
//        int s[] = ss.sort(ar);
//        for(int i=0;i<n;i++)
//        {
//            System.out.println(s[i]);
//        }
        
    }
    public void sort(int[] nums,int n) {
        System.out.println("Inside sort");
      for(int i=0;i<nums.length-1;i++)
      {
        int min_index=i;
        for(int j=i+1;j<nums.length;j++)
        {
              if(nums[j]<nums[min_index])
              {
                min_index=j;
              }
        }
        int temp=nums[i];
        nums[i]=nums[min_index];
        nums[min_index]=temp;
      }
      for(int i=0;i<n;i++)
        {
            System.out.println(nums[i]);
        }
    }
    
}
