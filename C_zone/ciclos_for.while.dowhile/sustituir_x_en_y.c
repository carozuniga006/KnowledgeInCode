#include <stdio.h>
#include <math.h>
int main() {
	float x=0.5;
	double y;
	printf("Vamos a sustituir x por un listado de valores en la funcion y=3.5x^6-9.536x^4+2.3\nTe presento a continuacion una tabla donde al lado izquierda veras los valores de x, y a la derecha el resultado a sustituirlos en la funcion\n\n");
	printf("x\t\tresultado\n");
	printf("-----------------------------------------------------------------------\n");
	while (x<=10) {
		y= 3.5*pow (x, 6)-9.536*pow (x, 4)+2.3;
		printf("%.1f\t\t%.3f\n", x, y); 
		x+=0.5; }
	return 0;
}

	

