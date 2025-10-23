#include <stdio.h>
int main() {
	int n, i;
	int fac=1;
	printf("Voy a mostrarte la cifra factorial del numero que tu decidas (preferentemente no mayor a 10)\nINgresalo aqui:\n");
	scanf("%d", &n);
	printf("%d! = ", n);
	for (i=n; i>=1; i--) {
		printf("%d", i);
		if (i > 1) {
			printf(" * "); }
		fac*=i; }
		printf(" = %d\n", fac);
		return 0;
	}
