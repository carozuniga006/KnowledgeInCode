#include <stdio.h>

float xalcubo(float x) {
	float resultado= x*x*x;
	printf("El numero %.2f al cubo es: %.2f\n", x, resultado);
	return resultado; }

int main() {
	float numero;
	printf("INgresa un numero:\n");
	scanf("%f", &numero);
	xalcubo(numero);
	return 0;
}
