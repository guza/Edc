package divideandconquer;

public class merge {
	
	public static void print(int[] target)
	{
		for ( int i=0; i<target.length; i++)
		{
			System.out.println(target[i]);
		}
	}
	
	public static void mergesort(int[] target, int start, int end)
	{
		int mid;
		if (end - start < 1)
		{
			return ; //Àç±Í ³¡.. 
		}
		mid = (start+end)/2;
		System.out.println(start + " " + mid + " " + end);
		//System.out.println(mid);
		mergesort(target,start,mid);
		mergesort(target,mid+1,end);
		merge(target,start,mid,end);
	}
	
	public static void merge(int[] target,int start,int mid , int end)
	{
		int i;
		int left = start;
		int right = mid+1;
		int dest = 0;
		int[] destination = new int[end-start+1];
		while(left <= mid && right <= end)
		{
			if(target[left] < target[right])
			{
				destination[dest] = target[left];
				left++;
			}
			else
			{
				destination[dest] = target[right];
				right++;
			}
			dest++;
		}
		while(left<= mid)
		{
			destination[dest++] = target[left++];
		}
		while(right <= end)
		{
			destination[dest++] = target[right++];
		}
		dest = 0;
		for( i = start; i<=end; i++)
		{
			target[i] = destination[dest++];
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] target = {334,6,4,2,3,1,5,117,12,34};
		mergesort(target,0,target.length-1);
		print(target);
		
	}

}
