void main(){
		int a = 1;
		int b = 2 ;
		int x = 3;
		int y = 4;
		a = b+1;
		if (a > 0) { 
			a = (2+4)-3; 
		}
		else {
			a = 6+5-3; 
		}
		for (a = 0 ; a < 10 ; a++){
			
			printf("This is for-loop");
			
		}
		
		
		while (a) {
			printf("This is while");
			
		}
		
		switch (a){
			case b :
				printf("This is case1");
				break;
			case x :
				printf("This is case2");
				break;
			case y :
				printf("This is case3");
				break;
			default :
				printf("This is default");
		}
		
		do {
			y = a;
			x = 1;
			printf("This is do-while");
		} while ( x > 0 );
		
		printf(" a is %d ",a);
}
