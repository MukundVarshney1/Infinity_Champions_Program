package Week_1;

public class Median_of_Two_Sorted_Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int[] nums1 = {1,2};
			int[] nums2 = {3,4};
			System.out.println(findMedianSortedArrays(nums1,nums2));
			System.out.println(findMedianSortedArraysopt(nums1,nums2));
	}
//	optimal O(log(m+n))
	public static double findMedianSortedArraysopt(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int m = nums2.length;
        int[] arr = new int[n+m];

        int i = 0;
        int j = 0;
        int k = 0;
        while(i < n && j < m) {
            if(nums1[i] <= nums2[j]) arr[k++] = nums1[i++];
            else arr[k++] = nums2[j++];
        }

        while(i < n) arr[k++] = nums1[i++];
        while(j < m) arr[k++] = nums2[j++];

        double ans = (n+m) % 2 == 0 ? (double)((arr[(n+m)/2] +  arr[(n+m)/2 -1]))/2 : arr[(n+m)/2];

        return ans;
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
