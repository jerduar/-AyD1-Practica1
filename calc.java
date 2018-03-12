import Math.*;

/* funcion suma validada*/
public int suma(int a, int b){
	return a+b;	
}

/* funcion resta multiplicacion*/
public int multiplicar(int a, int b){
	return a*b;
}

/* funcion resta validada */
public int resta(int a, int b){
	return a - b;
}

/* función division validada */
public double division(int a, int b){
	return a / b;
}

/* funcion raiz validada */
public double raiz(int a, int b){
	while(b>0){
		a=a/a;
		b--;
	}
	return a;
}

/*función potencia validada */
public double potencia(int a, int b){
	
	return Math.pow(a,b);
}

public int multiplicacion2 (int num1, int num2){
	return num1 * num2;
}