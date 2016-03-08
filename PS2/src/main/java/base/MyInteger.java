package base;

public class MyInteger {
	private int iValue;
		
	public MyInteger(int iValue)
	{
		this.iValue = iValue;
		
	}
	public boolean isEven(){
		if (iValue % 2  == 0){
			return true;
		}else{
			return false;
		}
	}
	
	public boolean isOdd()
	{
		return !isEven();
		
	}
	public boolean isPrime(){
		for(int n = 2;2 * n < iValue;n++){
			if(iValue % n == 0){
				return false;
			}
		}
		return true;
		
	}
	
	public static boolean isEven(int iValue)
	{
		MyInteger myInt = new MyInteger(iValue);
		return myInt.isEven();
	}
	public static boolean isOdd(int iValue)
	{
		MyInteger myInt = new MyInteger(iValue);
		return myInt.isOdd();
	}	
	public static boolean isPrime(int iValue)
	{
		MyInteger myInt = new MyInteger(iValue);
		return myInt.isPrime();
	}

	
	public static boolean isEven(MyInteger myInt)
	{
		return myInt.isEven();
	}
	public static boolean isOdd(MyInteger myInt)
	{
		return myInt.isOdd();
	}
	public static boolean isPrime(MyInteger myInt)
	{
		return myInt.isPrime();
	}
	public boolean equals(int iValue)
	{
		if(iValue == iValue){
			return true;
		}else{
			return false;
		}
	}
	public boolean equals(MyInteger myInt)
	{
		return myInt.isEven();
	}
}
