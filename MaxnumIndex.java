import java.lang.*;
import java.util.*;
class pr1
{
	public static void main(String arg[])
	{
		Scanner sobj= new Scanner(System.in);
		System.out.print("Enter number:");
		int isize=sobj.nextInt();
		
		
		int Arr[]=new int[isize];
		int icnt=0;
		int index=0;
		
		System.out.println("Enter Element in array:");
		for(icnt=0; icnt<Arr.length; icnt++)
		{
			Arr[icnt]=sobj.nextInt();
		}
		
		int iMax=Arr[0];
		for(icnt=0; icnt<Arr.length; icnt++)
		{
			if(iMax<Arr[icnt])
			{
				iMax=Arr[icnt];
				index=icnt;
			}
		}
		System.out.println("Maximum no is:"+iMax);
		System.out.println("Maximum no index is:"+index);
		
	}
}
