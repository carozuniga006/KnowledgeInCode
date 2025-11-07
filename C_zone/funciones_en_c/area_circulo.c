#include <stdio.h>
#include <math.h>

float areaCirculo(float r) {
	return 3.1416*(pow(r, 2));
}

int main() {
	float radio, area;
	printf("Ingresa el radio de un circulo para calcular su area:\n");
	scanf("%f", &radio);

	area= areaCirculo(radio);
	printf("Tomando en cuenta el radio(%.2f), el area del circulo es: %.2f\n", radio, area);
	return 0;
}

