#include <stdio.h>

int contarCifras(int n) {
	int contador= 0;

	while(n>0) {
		n= n/10;
		contador++; }
	return contador;
}

int main() {
	int numero, cifras;
	printf("Ingrese un numero entero mayor que 0:\n");
	scanf("%d", &numero);

	if(numero<=0) {
		printf("El numero debe ser mayor a 0\n"); }
	else {
		cifras= contarCifras(numero);
		printf("%d tiene %d cifras.\n", numero, cifras); }
	return 0;
}
