package Week_1;
import java.util.*;
public class _3Sum_Find_All_Unique_Triplets_That_Sum_to_Zero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[]nums = {-1, 0, 1, 2, -1, -4};
		Arrays.sort(nums);
//		brute force
		
		List<List<Integer>> ans=new ArrayList<>();
		for(int i=0;i<nums.length-2;i++) {
			if(i==0 ||nums[i]!=nums[i-1]) {
			for(int j=i+1;j<nums.length-1;j++) {
				if(nums[j]!=nums[j-1]) {
				for(int k=j+1;k<nums.length;k++) {
					if(nums[k]!=nums[k-1]) {
					if(nums[i]+nums[j]+nums[k]==0) {
						List<Integer> ll=new ArrayList<>();
						ll.add(nums[i]);
						ll.add(nums[j]);
						ll.add(nums[k]);
						ans.add(ll);
					}
					}
				}
				}
			}
			}
		}
		System.out.println(ans);
		
		
	}

}
