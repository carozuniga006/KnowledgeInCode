#include <stdio.h>
#include <math.h>
int main() {
	int i=0;
	float sq;
	printf("A continuacion se mostrara una lista del 1 al 20 con su perspectivo cuadrado\n");
	while (i<=20) {
		sq= pow (i, 2);
		printf("Numero: %d. Cuadrado: %.1f\n", i, sq);
       		i++;	}
	return 0;
}
