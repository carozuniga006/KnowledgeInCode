#include <stdio.h>
#include <math.h>
int main() {
	float x=2.0;
	double f;
	printf("Vamos a sustituir x por un listado de valores en la funcion f(x)=2x^4-3x^3-x^2+3\nTe presento a continuacion una tabla donde al lado izquierda veras los valores de x, y a la derecha el resultado a sustituirlos en la funcion\n\n");
	printf("x\t\tresultado\n");
	printf("-----------------------------------------------------------------------\n");
	while (x<=10) {
		f= 2.0*pow (x, 4)-3.0*pow (x, 3)-pow (x, 2)+3.0;
		printf("%.1f\t\t%.3f\n", x, f); 
		x++; }
	return 0;
}

	

