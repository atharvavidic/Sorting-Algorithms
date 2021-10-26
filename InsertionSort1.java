public class InsertionSort1{
    static void insertionsort(int a[]){
        int n = a.length;
        for(int i = 1; i < n; i++){
            if(a[i] < a[i-1]){
                int temp = a[i];
                for(int j = i - 1; j>=0; j--){
                    if (a[j] > temp){
                        a[j + 1] = a[j];
                    }
                    else {
                        a[j + 1] = temp;
                        break;
                    }
                    a[j] = temp;
                }
            }
        }
    }
    static void printArray(int[] arr, int size)
{
	for(int i = 0; i < size; i++)
		System.out.print(arr[i] + " ");
		
	System.out.println();
}
    public static void main(String[] args)
{
	int[] arr = { 8,33,56,23,57};
	int n = arr.length;
	printArray(arr, n);
	insertionsort(arr);
	System.out.println("Sorted array: ");
	printArray(arr, n);
}

}
