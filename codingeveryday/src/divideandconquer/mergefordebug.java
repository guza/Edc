package divideandconquer;

public class mergefordebug {
	
	static int depth = 0;
	
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
			return ; //재귀 끝.. 
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
		depth++;
		int i;
		int left = start;
		int right = mid+1;
		int dest = 0;
		int[] destination = new int[end-start+1];
		while(left <= mid && right <= end)
		{
			System.out.println("left <= mid && right <= end");
			System.out.println("left : " + left + "right :" + right );
			if(target[left] < target[right]) // 쪼갠거 비교. 경우 .
			{
				System.out.println("target[left] < target[right]");
				destination[dest] = target[left];
				System.out.println("destination[dest] : " + destination[dest] + "target[left] : " + target[left]);
				left++;
			}
			else // 반대경우 
			{
				System.out.println("else ");
				destination[dest] = target[right];
				System.out.println("destination[dest++] : " + destination[dest] + "target[right] : " + target[right]);
				right++;
				System.out.println("right++;");
				// 비교 가 끝났으니까 다음걸로. 인덱스는 전역 
			}
			dest++;
		}
		while(left<= mid)
		{
			System.out.println("left<= mid");
			destination[dest++] = target[left++];
			System.out.println("target[left++]" + target[left]);
			//System.out.println("destination[destpp] : " + destination[dest] + "target[leftpp] : " + target[left]);
		}
		while(right <= end)
		{
			System.out.println("right <= end");
			destination[dest++] = target[right++];
			//System.out.println("target[right++]" + target[right]);
			//System.out.println("destination[dest++] : " + destination[dest] + "target[right++] : " + target[right]);
			
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
