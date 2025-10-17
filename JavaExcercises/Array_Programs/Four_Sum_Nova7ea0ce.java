/* Modified: renamed identifiers to avoid direct copy. Original class: Four_Sum -> Four_Sum_Nova7ea0ce. Modified on 2025-10-17 */
package Striver.Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Four_Sum_Nova7ea0ce {
    public static void main(String[] args) {
        int[]arr = {2,2,2,2,1,3};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Target: ");
        int n = sc.nextInt();
        List<List<Integer>> help = fourSum(arr,n);
        for (List<Integer> list : help) {
            System.out.println(list);
        }
    }
    public static List<List<Integer>> fourSum(int []nums, int target) {
        // Write your code here.
        List<List<Integer>> list = new ArrayList<>();
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                for (int k = j+1; k < n; k++) {
                    for (int l = k+1; l < n; l++) {
                        if((nums[i]+nums[j]+nums[k]+nums[l])==target){
                            List<Integer> temp = Arrays.asList(nums[i], nums[j], nums[k], nums[l]);
                            list.add(temp);
                        }
                    }
                }
            }
        }
        return list;
    }
}
