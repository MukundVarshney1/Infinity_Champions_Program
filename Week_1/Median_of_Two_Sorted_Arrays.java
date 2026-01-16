package Week_1;

public class Median_of_Two_Sorted_Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int[] nums1 = {1,2};
			int[] nums2 = {3,4};
			System.out.println(findMedianSortedArrays(nums1,nums2));
			System.out.println(findMedianSortedArraysopt(nums1,nums2));
	}
//	optimal O(log(min(m,n)))
	public static double findMedianSortedArraysopt(int[] nums1,int[] nums2) {
		int n=nums1.length;
		int m=nums2.length;
		if(n>m) {
			return findMedianSortedArraysopt(nums2,nums1);
		}
		int lo=0;
		int hi=n;
		while(lo<=hi) {
			int mid=(lo+hi)/2; // partition in nums1
			int ypartition=(n+m+1)/2-mid;
			int xmin=mid==0?Integer.MIN_VALUE:nums1[mid-1];// the smaller element in x partition
			int xmax=mid>n-1?Integer.MAX_VALUE:nums1[mid]; // the bigger value in x partition
			
			
			int ymin=ypartition==0?Integer.MIN_VALUE:nums2[ypartition-1];// the smaller element in y partition
			int ymax=ypartition>m-1?Integer.MAX_VALUE:nums2[ypartition];// the bigger value in y partition
			if(xmin<=ymax && ymin<=xmax) { // if we partition x than  the largest in left of x must be less than the smaller in y partition in right and viceverse
				if((n+m)%2==0) {
					return (double)(Math.max(xmin, ymin)+Math.min(xmax,ymax))/2;
				}
				else {
					return (double)Math.max(xmin, ymin);
				}
			}
			else if(xmin>ymax) {
				hi=mid-1;
			}
			else {
				lo=mid+1;
			}
		}
		return -1;
	}
	
//	brute force(extra space and O(n+m))
	public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] arr=new int[nums1.length+nums2.length];
        int i=0;
        int j=0;
        int c=0;
        while(i<nums1.length && j<nums2.length){
            if(nums1[i]<nums2[j]){
                arr[c++]=nums1[i++];
            }
            else{
                arr[c++]=nums2[j++];
            }
        }
        while(i<nums1.length ){
            arr[c++]=nums1[i++];
        }
        while(j<nums2.length ){
            arr[c++]=nums2[j++];
        }
        if(arr.length%2!=0){
            return arr[arr.length/2];
        }
        return(arr[arr.length/2]+arr[arr.length/2-1])/2.0;
    }

}
