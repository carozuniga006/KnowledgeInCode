#include <stdio.h>

int factorial(int n) {
	int i;
	int facto=1;
	printf("El factorial de %d es: ", n);
	for(i=n; i>=1; i--) {
		facto *= i;
		printf("%d", i);
		if(i>1) {
			printf(" * "); } }
	printf(" = %d\n", facto);
	return facto;
}

int main() {
	int num;
	printf("INgresa un numero para mostrar su factorial:\n");
	scanf("%d", &num);
	if(num<=0) {
		printf("El numero debe ser positivo y mayor a 0\n"); }
	else {
		factorial(num); }
	return 0;
}
