#include <stdio.h>

float CelsiusAfarenheit(float c) {
	return (c * 9/5) + 32;
}

float CelsiusAkelvin(float c) {
	return c+273.15;
}

int main() {
	float celsius, resultado;
	int opcion;

	printf("\n==MENU DE CONVERSIONES==\n\n");
	printf("1. Convertir a Farenheit\n");
	printf("2. Convertir a Kelvin\n\n");

	printf("Elige una opcion:\n");
	scanf("%d", &opcion);

	switch (opcion) {
		case 1:
			printf("INgrese una cantidad de grados celsius:\n");
			scanf("%f", &celsius);
			resultado= CelsiusAfarenheit(celsius);
			printf("\n%.2f C equivalen a %.2f F\n", celsius, resultado);
			break;
		case 2:
			printf("Ingrese una cantidad de grados celsius:\n");
			scanf("%f", &celsius);
			resultado= CelsiusAkelvin(celsius);
			printf("\n%.2f C equivalen a %.2f K\n", celsius, resultado);
			break;
		default:
			printf("Opcion invalida. Debe elegir 1 o 2\n");
	}
	return 0;
}
