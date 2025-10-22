#include <stdio.h>
int main() {
	int i=1;
	printf("Vamos a mostrar una tabla donde en la primera columna se mostraran los numeros pares del 2 al 200; en la segunda, los multiplos de 3 del 3 al 300; y en la ultima, multiplos de 4 del 4 al 400\n\n");
	printf("PARES\t\tMT3\t\tMT4\n");
	printf("-----------------------------------------------------------------\n");
	while (i<=100) {
		printf("%d\t\t%d\t\t%d\n", i*2, i*3, i*4);
		i++; }
	return 0;
}
