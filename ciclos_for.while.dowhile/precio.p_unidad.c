#include <stdio.h>
int main() {
	int i=1;
	int precio, total;
	printf("Ingresa el precio unitario de tu producto\n$");
	scanf("%d", &precio);
	while (i<=1000) {
		total= i * precio;
		printf("%d x %d= %d\n", i, precio, total);
		i++; }
	return 0;
}
