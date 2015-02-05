package sort;

public class insertion2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] sort = new int[]{5,1,6,4,2,3};
		int tmp=0;
		for(int i=1;i<sort.length;i++)
		{
			if(sort[i-1]<=sort[i])
			{
				continue;
			}
			tmp = sort[i];
			for(int j=0;j<i;j++)
			{
				if(sort[i]>tmp)
				{
					//memmove
				}
			}
		}
	}

}
