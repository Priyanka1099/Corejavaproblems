
public class powerof2 {
	  public static boolean powerOfTwoGeneral(int n)
	{
		 while(n%2==0)
		 {
		 n=n/2;
		 }
		 if(n==1)
		 {
		 return true;
		 }
		 else
		 {
		 return false;
		 }
		 }
}


