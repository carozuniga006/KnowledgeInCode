#include <stdio.h>
int main() {
	int n, i, j, impar;
	int suma=0;
	printf("Vamos a mostrar los numeros cuadrados  de un listado de numeros, utilizando la suma de sus impares\nNUestro listado comienza en 1, por favor ingresa el final del listado\n");
	scanf("%d", &n);
	for(i=1; i<=n; i++) {
		printf("%d= ", i);
		for(j=1; j<=i; j++) {
			impar= (2*j)-1;
			suma+=impar;
			printf("%d", impar);
			if(j<i) {
				printf(" + "); } }
		printf(" = %d\n", suma); }
	return 0;
}
