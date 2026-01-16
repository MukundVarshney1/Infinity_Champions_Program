package Week_1;
import java.util.*;
public class _3Sum_Find_All_Unique_Triplets_That_Sum_to_Zero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[]nums = {-1, 0, 1, 2, -1, -4};
		Arrays.sort(nums);
//		brute force O(n**4)
		
		List<List<Integer>> ans=new ArrayList<>();
		for(int i=0;i<nums.length-2;i++) {
			for(int j=i+1;j<nums.length-1;j++) {
				for(int k=j+1;k<nums.length;k++) {
					if(nums[i]+nums[j]+nums[k]==0) {
						if(isitpossible(ans,nums[i],nums[j],nums[k])) {
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
			System.out.println(ans);
			System.out.println(threeSum(nums));
		}

	public static boolean isitpossible(List<List<Integer>> ans,int a,int b,int c) {
		if(ans.size()==0) {
			return true;
		}
		for(int i=0;i<ans.size();i++) {
			if(ans.get(i).get(0)==a && ans.get(i).get(1)==b && ans.get(i).get(2)==c) {
				return false;
			}
		}
		return true;
		
	}
	
//	optimal O(n**2)
	    public static List<List<Integer>> threeSum(int[] nums) {
	        Arrays.sort(nums);
	        List<List<Integer>> res=new ArrayList<>();
	        for(int i=0;i<nums.length;i++){
	            if(i>0 && nums[i]==nums[i-1]){
	                continue;//to avoid duplicates
	            }
	            int k=nums.length-1;
	            for(int j=i+1;j<k;){
	                if(nums[i]+nums[j]+nums[k]==0){
	                    res.add(Arrays.asList(nums[i], nums[j], nums[k]));
	                    j++;
	                    while(nums[j]==nums[j-1] && j<k){
	                        j++;// to avoid duplicates
	                    }
	                }
	                else if(nums[i]+nums[j]+nums[k]>0){
	                    k--;
	                }
	                else{
	                    j++;
	                }
	            }
	        }
	        return res;
	    }
	}

