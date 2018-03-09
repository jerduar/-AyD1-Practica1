public int factorial(int num){
	if(num <= 0){ return 1;}
	int factorial = 1;
	for(int i = num; i > 0; i--){
		factorial = factorial * i;
	}
	return factorial;
}