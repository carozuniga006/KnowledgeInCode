#include <stdio.h>

int par(int num) {
	if(num % 2== 0) {
		return 1; }
	else {
		return 0; }
}

int main() {
	int numero;

	printf("Ingresa un numero entero:\n");
	scanf("%d", &numero);

	if(par(numero)) {
		printf("El numero %d es PAR\n", numero); }
	else {
		printf("El numero %d es IMPAR\n", numero); }
	return 0;
}

