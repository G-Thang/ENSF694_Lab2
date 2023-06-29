import java.util.Arrays;
import java.util.Scanner;
//Linear Search algorithm 200


/**Q2. 
 * 
 * The Runtime for the interpolation algorithm is longer. This is because there are more operations 
 * being used in the interpolation algorithm. Also because the input search is 11, the linear algorithm
 * is faster because the the inputed search number, 11, is near the beginning of the array.
 * 
 * 
 * 
 * 
 * Q3. To improve the runtime for the linear algorithm is to sort it before running the search algorithm
 * This will improve the runtime by making the search algorithm hit the search number, 11, earlier due to it being 
 * a low number.
 * 
 * 
 * 
 */
public class SearchAlg {

	

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
	Arrays.sort(Arr);
	int b = 0;
	final long startTime = System.nanoTime();
	for(int i = 0; i < Arr.length; i++)
	{
		if(Arr[i] ==s) {
			System.out.println("Search Key FOUND at index: ");
			System.out.println(i);
			b=1;
			break;
	
	}
		}

		if(b == 0) {
			System.out.println("Search key NOT FOUND");
			}
		
		final long duration = System.nanoTime() - startTime;
		System.out.println("The running time is " +duration/1000);
	}
	
	}

