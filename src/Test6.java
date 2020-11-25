
public class Test6 {

    public static void swap(int[] input, int i, int j){
        int temp =  input[i];
        input[i] = input[j];
        input[j] = temp;
    }
 
    public static void dutchNationalFalgAlgorithm(int [] input){
 
        //initialize all variables
        int reader = 0;
        int low = 0;
        int high = input.length - 1;
 
        while(reader <= high){
            /*
              input always holds a permutation of the original data with input(0..(lo-1)) =0, input(lo..(reader-1))=1, input(reader..hi) is
              untouched, and input((hi+1)..(input.length-1)) = 2
            */
            if(input[reader] == 0){
                /*When element at reader is 0, swap
                element at reader with element at index
                low and increment reader and low*/
                swap(input, reader, low);
                reader++;
                low++;
            }
            else if(input[reader] == 1){
                /* if element at reader is just
                increment reader by 1 */
                reader++;
            }
            else if(input[reader] == 2){
                /* If element at reader is 2, swap
                 element at reader with element at
                 high and decrease high by 1 */
                swap(input, reader, high);
                high--;
            }
            else{
               System.out.println("Bad input");
               break;
            }
        }
 
    }
    public static void main(String[] args) {
        int[] input = {2,2,1,1,0,0,0,1,1,2};
 
        dutchNationalFalgAlgorithm(input);
 
        for(int i=0; i<input.length; i++){
            System.out.print(" " + input[i]);
        }
    }
}

//	static void sort012(int a[], int arr_size)
//	{
//		int lo = 0;
//		int hi = arr_size - 1;
//		int mid = 0,temp=0;
//		while (mid <= hi)
//		{
//			switch (a[mid])
//			{
//			case 0:
//			{
//				if( a[lo] != a[mid]) {
//				  temp = a[lo];
//				  a[lo] = a[mid];
//				  a[mid] = temp;
//				}
//				lo++;
//				mid++;
//				break;
//			}
//			case 1:
//				mid++;
//				break;
//			case 2:
//			{
//			    if( a[mid] != a[hi]) {
//    				temp = a[mid];
//    				a[mid] = a[hi];
//    				a[hi] = temp;
//			    }	
//				hi--;
//				break;
//			}
//			}
//		}
//		
//	}
//
//	/* Utility function to print array arr[] */
//	static void printArray(int arr[], int arr_size)
//	{
//		int i;
//		for (i = 0; i < arr_size; i++)
//			System.out.print(arr[i]+" ");
//		System.out.println("");
//	}
//
//	/*Driver function to check for above functions*/
//	public static void main (String[] args)
//	{
//		int arr[] = {0, 1, 1,  2,  0, 1, 2};
//		int arr_size = arr.length;
//		sort012(arr, arr_size);
//		System.out.println("Array after seggregation ");
//		printArray(arr, arr_size);
//	}
//}
//
