#include <stdio.h>
#include <math.h>

float distancia(float x1, float y1, float x2, float y2) {
	float dx= x2-x1;
	float dy= y2-y1;
	float d= sqrt(pow(dx, 2) + pow(dy, 2));
	return d;
}

int main() {
	float x1, y1, x2, y2, resultado;

	printf("Programa para calcular la distancia entre dos puntos en el plano\n\nIngresa las coordenadas correspondientes del primer punto (x1, y1):\n");
	scanf("%f %f", &x1, &y1);
	printf("\nIngresa las coordenadas correspondientes del segundo punto (x2, y2):\n");
	scanf("%f %f", &x2, &y2);
	resultado= distancia(x1, y1, x2, y2);
	printf("\n\nLa distancia entre los puntos (%.2f, %.2f) y (%.2f, %.2f) es: %.4f\n", x1, y1, x2, y2, resultado);

	return 0;
}
