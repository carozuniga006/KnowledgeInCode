#include <stdio.h>
int main() {
	int a=0, b=1;
	int sig;
	int n=100;
	printf("Vamos a mostrar los primeros 100 numeros del metodo Finobacci, empezando desde el cero\n\n");
	printf("%d, %d,", a, b);
	for (int i=3; i<=n; i++) {
		sig= a+b;
		printf("%d,", sig);
		a= b;
		b= sig; }
	printf("\n");
	return 0;
}
