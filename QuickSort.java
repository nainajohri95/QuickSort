public class QuickSort
{
public static QuickSort(int arr[],int low,int high)
{
	if(low < high)
	{
		int pi = partition(arr,low,high);
	
		quicksort(arr,low,pi-1);
		quicksort(arr,pi+1,high);
	}
}
public satic int partition(int arr[],int low,int high)
{
	int pivot = arr[high];
	int i = low-1;
	
	for(int j=low;j<high;j++)
	{
		if(arr[j] < pivot)
		{
			i++;
			int temp = arr[i];
			arr[i] = a[j];
			arr[j] = temp;
		}
	}
	i++;
	int temp = arr[i];
	arr[i] = pivot;
	arr [high] = temp;
	return i;
}
public static void main(String args[])
{
	int arr[] = {6,3,9,5,2,8};
	int n = arr.length;

	quicksort(arr,0,n-1);

	for(int i=o0;i<n;i++)
	{
		System.out.println(arr[i]+" ");
	}
	System.out.println();
}

}