package Week_1;

public class Count_Primes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=10;
		System.out.println(countPrimes(n));
	}
//	optimal(prime seive)
	public static int countPrimes(int n) {
	      int[] arr=new int[n];
	      for(int i=2;i*i<n;i++){
	        if(arr[i]==0){
	            for(int j=2;j*i<n;j++){
	                arr[i*j]=1;
	            }
	        }
	      }
	      int count=0;
	      for(int i=2;i<n;i++){
	        if(arr[i]==0){
	            count++;
	        }
	      }
	      return count;
	    }

}
