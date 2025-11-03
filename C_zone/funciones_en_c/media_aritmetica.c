#include <stdio.h>

void leer3valores(float *a, float *b, float *c) {
	printf("Ingresa el primer valor:\n");
	scanf("%f", a);
	printf("Ingresa el segundo valor:\n");
	scanf("%f", b);
	printf("Ingresa el tercer valor:\n");
	scanf("%f", c);
}

float promedio3(float x, float y, float z) {
	float promedio= (x+y+z)/3;
	printf("\nLa media aritmetica de los 3 numeros es: %.2f\n", promedio);
	return promedio;
}

int main() {

	float num1, num2, num3;

	leer3valores(&num1, &num2, &num3);
	promedio3(num1, num2, num3);
	return 0;
}
