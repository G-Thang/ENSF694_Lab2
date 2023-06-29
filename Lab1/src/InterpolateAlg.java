import java.util.Arrays;
import java.util.Scanner;
//interpolate search Algorithm 233




public class InterpolateAlg {
	
	 public static int interpolationSearch(int arr[], int lo,
             int hi, int x)
{
int pos;

if (lo <= hi && x >= arr[lo] && x <= arr[hi]) {

pos = lo
+ (((hi - lo) / (arr[hi] - arr[lo]))
* (x - arr[lo]));


if (arr[pos] == x)
return pos;

if (arr[pos] < x)
return interpolationSearch(arr, pos + 1, hi,
              x);

if (arr[pos] > x)
return interpolationSearch(arr, lo, pos - 1,
              x);
}
return -1;

}
	 

	public static void main(String[] args) {
	
	Scanner reader = new Scanner(System.in);
	System.out.println("Enter the number of elements in the array:");
	int a = reader.nextInt();
	int Arr[]= new int[a];
	System.out.println("Enter the elements in the array:");
	for(int i =0; i< Arr.length;i++)
	{
		Scanner r = new Scanner(System.in);
		int p = r.nextInt();
		Arr[i]= p;
	}
	System.out.println("Enter the search key:");
	Scanner search = new Scanner(System.in);
	int s = search.nextInt();
	int n = Arr.length;
	Arrays.sort(Arr);
	final long startTime = System.nanoTime();
	int index = interpolationSearch(Arr, 0, n-1, s);
	if (index != -1) {
        System.out.println("Search key FOUND at index "
                           + index);
	}
    else {
        System.out.println("Search key NOT FOUND");
        
}
	final long duration = System.nanoTime() - startTime;
	System.out.println("The running time is " +duration/1000);
	
}
	
	}
	


