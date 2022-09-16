//Calculate the power
#include<stdio.h>
unsigned long int power(int iNo1, int iNo2)
{
	unsigned long int mult=1; 
	register int icnt=0;
	
	for(icnt=1; icnt<=iNo2; icnt++)
	{
		mult=mult*iNo1;
	}
	return mult;
}
int main()
{
	
	auto int ivalue1=0, ivalue2=0;
	auto unsigned long int lRet=0;
	
	printf("Enter Number");
	scanf("%d",&ivalue1);
	
	printf("Enter Number");
	scanf("%d",&ivalue2);
	
	lRet=power(ivalue1,ivalue2);
	printf("Result is:%ld",lRet);
	return 0;
}