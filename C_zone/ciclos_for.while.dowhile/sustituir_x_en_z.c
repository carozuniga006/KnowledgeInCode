#include <stdio.h>
#include <math.h>
int main() {
	float z, xf;
	float x=-10;
	printf("Vamos a sustituir un listado de valores de x en una funcion(z), por favor ingresa un valor final para x\nNOTA: el final de x no puede ser -5, ya que si no, nuestra division en la funcion quedaria en 0\n");
	scanf("%f", &xf);
	if (xf==-5) {
		printf("ERROR. Recuerda que el final de x no puede ser -5\nINtentalo de nuevo\n"); }
	else {
		printf("Sustituyendo los valores en la funcion: z=4x^4-3.5x^2/x+5 ... Los resultados quedarian asi:\n");
        	printf("x\t\tresultado\n");
		do {
			z=(4*pow(x, 4)-3.5*pow(x, 2))/x+5;
			printf("%.1f\t\t%.3f\n", x, z);
			x+=0.5; 
		}while(x<=xf); }
	return 0;
}
