//Accept the number and display factor

//input: 10
//output: 1	2 5

//input:  9
//output:  1 3

//input:  17
//output:  1	


#include<stdio.h>

void DisplayFactor(int iNo)
{
	
	
	int icnt=0;
	
	if(iNo<0)		///////Updator
	{
		iNo=-iNo;
		
	}
	
	for(icnt=1; icnt<=iNo/2; icnt++)			////Reduced time complicity icnt=ino/2;
	{
		if((iNo%icnt)==0)
		{
			printf("%d\n",icnt);
		}
		
	}
	
	
}

int main()
{
	
	int ivalue=0;
	printf("Enter the number:");
	scanf("%d",&ivalue);
	
	DisplayFactor(ivalue);
	return 0;
}


//// Time complicity:  O(N/2)