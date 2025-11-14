#include <stdio.h>

int main() {

	float A[7];
	float B[7];

	for(int i=0; i<7; i++) {
		printf("Ingrese el numero [%d]: ", i);
		scanf("%f", &A[i]); }
	for(int j= 0; j<7; j++) {
		B[j]= A[j] * 2.75; }

	printf("Mostrar valores de B en orden inverso:\n\n");
	for(int k=6; k>=0; k--) {
		printf("%.2f ", B[k]); }
	return 0;
}
