#include <stdio.h>
int main() {
	int i=1, j=1;
	printf("TABLAS DE MULTIPLICAR DEL 4 Y 5\n");
	printf("\n");
	printf("TABLA DEL 4\n");
	while (i<=10) {
		printf("%dx4=%d\n", i, i*4);
		i++; }
	printf("\n"); 
	printf("TABLA DEL 5\n");
	while (j<=10) {
		printf("%dx5=%d\n", j, j*5);
		j++; }
	return 0;
}
