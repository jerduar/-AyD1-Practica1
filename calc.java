public int suma(int a, int b){
	return a+b;	
}

public int multiplicar(int a, int b){
	return a*b;
}
public int resta(int a, int b){
	return a - b;
}

public double division(int a, int b){
	return a / b;
}

public double raiz(int a, int b){
	while(b>0){
		a=a/a;
		b--;
	}
	return a;
}

