#include <stdio.h>

void sumar(int tam, int A[]) {
	int suma=0;
	for(int i= 0; i<tam; i++) {
		suma+=A[i]; }
	printf("La suma de los elementos del array es: %d\n", suma);
}

int main() {
	int P[100];

	for(int i= 0; i<100; i++) {
		P[i]= (i+1) * 2; }

	sumar(100, P);
	return 0;
}
