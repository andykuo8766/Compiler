void main()
{
	int a;
	int b;
	a = 12;
	b = 22;	
	printf("Test3-2 start");
	if(a >= 11){
		printf("Run in if");
		a = 96 + 55 * b;
	}
	else{
		printf("Run in else");
	}
	printf("a is");
	printf("%d",a);
	printf("b is");
	printf("%d",b);
	printf("Test3-2 end");
}