package sort;

public class bubble {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] sort = new int[]{5,1,6,4,2,3};
		//������ �ȵ��. �̷�������
		
		for ( int i=0;i<sort.length; i++)
		{
			for(int j=0;j<i;j++)
			{
				// < > �� ���� ������ 
				if(sort[i]<sort[j])
				{
					int tmp=sort[i];
					sort[i]=sort[j];
					sort[j]=tmp;
				}
				
			}
			
		} // ���� �ƴϰ� ������..
		
		for( int i=0;i<sort.length;i++)
		{
			System.out.println(sort[i]);
		}
	}

}
