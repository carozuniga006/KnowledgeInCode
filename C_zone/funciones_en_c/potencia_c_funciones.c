#include <stdio.h>

double potencia(double x, int y) {
	double resultado= 1.0;
	if(y>=0) {
		for(int i=0; i<y; i++) {
			resultado*=x; } }
		else {
			for(int i=0; i< -y; i++) {
				resultado*=x; }
			resultado= 1.0/resultado; }
		return resultado; }

int main() {
	double base;
	int exponente;
	printf("Ingresa la base(x): ");
	scanf("%lf", &base);
	printf("Ingresa el exponente(y): ");
	scanf("%d", &exponente);
	double resultado= potencia(base, exponente);
	printf("%.2f elevado a la %d es: %.4f\n", base, exponente, resultado);
	return 0;
}
