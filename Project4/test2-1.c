void main()
{
	float a;
	float b;
	a = 12.0f;
	b = 22.0f;	
	printf("Test2-1 start");
	if(a < 13.0f){
		printf("Run in if");
		a = b;
	}
	else{
		printf("Run in else");
	}
	printf("a is");
	printf("%f",a);
	printf("b is");
	printf("%f",b);
	printf("Test2-1 end");
}
