#include <stdio.h>
int main() {
	int a=0, b=1;
	int sig;
	printf("%d, %d,", a, b);
	sig= a+b;
	while (sig<=100) {
		printf(" %d,", sig);
		a= b;
		b= sig;
		sig= a+b; }
	return 0;
}
