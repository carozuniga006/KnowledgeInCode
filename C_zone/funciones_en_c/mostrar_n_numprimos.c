#include <stdio.h>

int esPrimo(int num) {
	if(num<=1)
		return 0;
	for(int i=2; i<=num/2; i++) {
		if(num % i==0)
			return 0; }
	return 1; }

void mostrarPrimos(int n) {
	int contador= 0;
	int numero=2;
	printf("Los %d primeros numeros primos son:\n", n);
	while(contador<n) {
		if(esPrimo(numero)) {
			printf("%d ", numero);
			contador++; }
		numero++; }
	printf("\n"); }

int main() {
	int n;
	printf("Ingresa la cantidad de numeros primos que deseas mostrar: ");
	scanf("%d", &n);
	if(n<=0) {
		printf("El valor debe ser mayor a cero\n"); }
	else {
		mostrarPrimos(n); }
	return 0;
}
