void main()
{
	float a;
	float b;
	a = 12.0f;
	b = 22.0f;
	printf("Test1-1 start");
	if(a == 13.0f){
		printf("Run in if");
		a = 96.6f + 55.2f * b;
	}
	else{
		printf("Run in else");
	}
	printf("a is");
	printf("%f",a);
	printf("b is");
	printf("%f",b);
	printf("Test1-1 end");
}
