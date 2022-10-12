class MathUtil
{
	public static boolean  isEven(int num)
	{
		if(num%2==0)
		{
		         return true;
		}
		return false;
	}

	public static boolean isOdd (int num)
	{
		if(num%2!=0)
		{
			return true;
		}
		return false;
	}

	public static boolean isPrime(int num)
	{
		if(num <= 1){
			return false;
		}
		else if ( num == 2){
			return true;
		}
		else if (num % 2== 0){
			return false;
		}
	
		for (int i=3; i<=Math.sqrt(num); i+=2)
		{
			if (num% i==0)
				return false;			
		}
		return true;
	}

	
       public static int countPrime(int num)
       { 
	       int count=1;
	       for(int i=3; i<num;i+=2)
	       {
		       if(isPrime(i))
		       {
			       count++;
		       }
	       }
	       return count;
       }



	public static int reverse(int num)
	{
		int rev=0;
		while (num!=0)
		{
			int rem=num%10;
			rev=rev*10+rem;
			num=num/10;
		}
		return rev;
	}

	public static int countDigit(int num)
	{
		int count=0;
		while(num !=0)
		{
			num/=10;
			count++;
		}
		return count;
	}

        
	public static void main (String []args)
	{
		
		int a=Integer.parseInt(args[0]);
		int b=Integer.parseInt(args[1]);
		int c=Integer.parseInt(args[2]);
	        int d=Integer.parseInt(args[3]);
		int e=Integer.parseInt(args[4]);
		int f=Integer.parseInt(args[5]);
	//	int a=Integer.parseInt(args[6]);

		
		
		System.out.println(isEven(a));
		System.out.println(isOdd(b));
		System.out.println(isPrime(c));
	//	System.out.println(reverse(d));
		System.out.println(countPrime(d));
		System.out.println(reverse(e));
		System.out.println(countDigit(f));
	}


}
