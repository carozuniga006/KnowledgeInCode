#include <stdio.h>
int main() {
	int i=1;
	int resultado;
	int m;
	printf("Te mostrare la tabla de multiplicar de cualquier numero\nINgresalo aqui abajo\n");
	scanf("%d", &m);
	printf("   TABLA DE MULTIPLICAR   \n");
	do {
		resultado= i * m;
		printf("%d x %d = %d\n", i, m, resultado);
		i++;
	}while(i<=10);
	return 0;
}
