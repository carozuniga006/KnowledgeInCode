#include <stdio.h>

int producto(int N, int impares[]) {
	int prod=1;
	for(int i=0; i<N; i++) {
		prod*= impares[i]; }
	return prod; 
}

int main() {

	int N;
	printf("Ingresa el valor de numeros impares que quieres multiplicar entre si(maximo 20): ");
	scanf("%d", &N);
	if(N>20 || N<=0) {
		printf("ERROR: N debe ser entre 1 y 20.\n");
		return 0; } 
		int impares[20];
		for(int i=0; i<N; i++) {
			impares[i]= (2*i) +1; }
		int resultado= producto(N, impares);
		for(int i=0; i<N; i++) {
			printf("%d", impares[i]);
			if(i<N-1) 
				printf("*"); }
		printf(" = %d\n", resultado); 
	return 0;
}
