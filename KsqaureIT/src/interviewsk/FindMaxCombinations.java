package interviewsk;

public class FindMaxCombinations {
	
	public static void main(String[] args)
	{
		int[] data = {1,3,6,8};
		int prod = 20;
		
		int result = 0;
		
		for(int numberOfElementsToGrab = 1; numberOfElementsToGrab<=data.length; numberOfElementsToGrab++)
		{
			for(int pos=0; pos<data.length; pos++)
			{
				long prodOfSequence = getProd(numberOfElementsToGrab, pos, data);
				if( prodOfSequence > 0 && prodOfSequence < prod)
				{
					System.out.println("prodOfSequence:" + prodOfSequence);
					result ++;
				}
			}
			System.out.println("-----------------------------");
		}
		
		System.out.println(result);
	}
	
	public static long getProd(int noetg, int pos, int[] data)
	{
		int boundry = pos+noetg;
		System.out.println("noetg:" + noetg + " pos:" +pos);
		int prod = 1;
		if(boundry > data.length)
		{
			return -1;
		}
		
		String combo = "[";
		
		for(int j=pos; j< boundry && boundry<=data.length; j++)
		{
			prod *= data[j];
			combo += data[j] + ",";
		}
		combo += "]";
		System.out.println(combo);
		return prod;
	}

}