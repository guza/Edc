package sort;

public class quick {
	
	public static int partition(int arr[], int left , int right)
	{
		int i= left , j = right;
		int tmp;
		int pivot = arr[(left+right)/2];
		while(i<=j)
		{
			while(arr[i]<pivot)
				i++;
			while(arr[j]>pivot)
			{
				j--;
			}
			if(i<=j)
			{
				tmp = arr[i];
				arr[i] = arr[j];
				arr[j]=tmp;
				i++;
				j++;
			}
		}
		return i;
	}
	
	public static void quickSort(int arr[], int left, int right)
	{
		int index = partition(arr,left,right);
		if(left<index-1)
			quickSort(arr,left,index-1);
		if(index<right)
			quickSort(arr,index,right);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] sort = new int[]{5,1,6,4,2,3,9};
		quickSort(sort,0,sort.length-1);
		print(sort);
	}
	
	public static void print(int sort[])
	{
		for(int i = 0 ; i<sort.length; i++)
			{
				System.out.println(sort[i]);
			}
	}

}
