#include <stdio.h>

int main() {

	int array7 [7];

	for(int i= 0; i<7; i++) {
		printf("Ingrese el valor [%d]: ", i);
		scanf("%d", &array7[i]); }
	for(int j=0; j<7; j++) {
		printf(" %d ", array7[j]); }
	return 0;
}
