package sort;

public class insertion {
	public static void main(String[] args)
	{
		int [] sort = new int[]{5,1,6,4,2,3};
		int tmp = 0;
		for (int i =1; i<sort.length; i++)
		{
			tmp = sort[i];
			System.out.println("tmp " + tmp);
			int j;
			for(j=i-1; j>=0 && tmp<sort[j]; j--)
			{
				sort[j+1]=sort[j]; // move right by 1
				System.out.println("(inner) j , sort[j+1]=sort[j];"+ j + " " + sort[j+1]+" "+sort[j]);
				
				for(int k=0;k<sort.length;k++)
				{
					System.out.print(sort[k]);
				}
				
			}
			sort[j+1]=tmp;
			System.out.println("(outer) j ,sort[j+1]=tmp;"+j+" "+sort[j+1]+" "+tmp);
			for(int k=0;k<sort.length;k++)
			{
				System.out.print(sort[k]);
			}
			
		}
		
		for(int i=0;i<sort.length;i++)
		{
			System.out.println(sort[i]);
		}
	}
}
