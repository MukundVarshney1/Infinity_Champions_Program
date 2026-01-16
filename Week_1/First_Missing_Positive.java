package Week_1;

public class First_Missing_Positive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {3,4,-1,1};
		System.out.println(firstMissingPositive(nums));
		
	}
//	bruteforce(using extra array)
	public int firstMissingPositivebrute(int[] nums) {
        boolean[] extra=new boolean[nums.length];
        for(int i=0;i<nums.length;i++){
            if(nums[i]>0 && (nums[i])<=nums.length){
                extra[nums[i]-1]=true;
            }
        }
        for(int i=0;i<extra.length;i++){
            if(extra[i]==false){
                return i+1;
            }
        }
        return nums.length+1;
    }
	
//	optimal(o(n)
	public static int firstMissingPositive(int[] nums) {
        int c=0;
        // to check 1 is present or not and to avoid all negative and numbers out of n
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1){
                c=1;
            }
            if(nums[i]<=0|| nums[i]>nums.length){
                nums[i]=1;
            }
        }
        if(c!=1){
            return 1;
        }
        for(int i=0;i<nums.length;i++){
            int x=Math.abs(nums[i]);
            x-=1;
            if(nums[x]>0){
                nums[x]*=-1;
            }
        }
        for(int i=0;i<nums.length;i++){
            if(nums[i]>0){
                return i+1;
            }
        }
        return nums.length+1;

    }
	

}
