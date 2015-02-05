package sort;

public class bubble {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] sort = new int[]{5,1,6,4,2,3};
		//마음에 안드네. 이런선언방식
		
		for ( int i=0;i<sort.length; i++)
		{
			for(int j=0;j<i;j++)
			{
				// < > 에 따라 리버스 
				if(sort[i]<sort[j])
				{
					int tmp=sort[i];
					sort[i]=sort[j];
					sort[j]=tmp;
				}
				
			}
			
		} // 본의 아니게 리버스..
		
		for( int i=0;i<sort.length;i++)
		{
			System.out.println(sort[i]);
		}
	}

}
