#include <stdio.h>

void imprimir(int impares[], int tam) {
	printf("Numeros impares entre 1 y 90:\n");
	for (int i= 0; i<tam; i++) {
		printf("%d ", impares[i]); }
	printf("\n");
}

int main() {

	int impares[45]; 
	int index=0;

	for(int i=1; i<=90; i++) {
		if(i % 2 != 0) {
			impares[index]= i;
			index++; } }
	imprimir(impares, 45);
	return 0;
}
