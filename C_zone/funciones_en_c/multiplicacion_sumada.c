#include <stdio.h>
int tablamultiplicar(int inicio, int fin, int multiplicador) {
	int i, resultado, suma=0;
	for(i=inicio; i<=fin; i++) {
		resultado= multiplicador * i;
		printf("%d * %d= %d\n", multiplicador, i, resultado);
		suma+=resultado; }
	return suma; }

int main() {
	int inicio, fin, multiplicador;
	int total;
	printf("Ingrese el valor de inicio:\n");
	scanf("%d", &inicio);
	printf("Ingrese el valor del final:\n");
	scanf("%d", &fin);
	printf("INgrese el multiplicador:\n");
	scanf("%d", &multiplicador);
	total= tablamultiplicar(inicio, fin, multiplicador);
	printf("La suma total es: %d\n", total);
	return 0;
}
