package string;

public class brute {

	public static int brute(String target,String pattern)
	{
		int i,j=0;
		for(i=0; i<= target.length()-pattern.length(); i++)
		{
			for(j=0;j<pattern.length(); j++)
			{
				System.out.println(target.charAt(i)+" "+ target.charAt(j));
				if(target.charAt(i+j) != pattern.charAt(j)  )
				{
					break;
				}
				if( j >= pattern.length())
				{
					return i;
				}
				
				//System.out.println(target[i]);
				//아 자바처럼 생각해라.. 뭐든지 구현하지 말고 끌어쓸 생각으로. . 
			}
		}
		return -1;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String target = "ABCABADC";
		String pattern = "BA";
		//System.out.println(target.charAt(0));
		System.out.println(brute(target,pattern));
	}

}
