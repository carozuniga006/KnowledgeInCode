#include <stdio.h>

float  media(float array[], float tam) {
	float media=0, resultado;
	int i;

	for(i=0; i<tam; i++) {
		printf("Ingresa el valor [%d]: ", i);
		scanf("%f", &array[i]);
		media+=array[i]; }
	resultado= media/tam;
	for(i=0; i<tam; i++) {
		printf("%.1f ", array[i]);
		if (i<tam-1) {
			printf("+"); } }
	printf(" = %.2f\n", resultado);
	return resultado;
}

int main() {

	float array[5];
	media(array, 5);
	return 0;
}


	
