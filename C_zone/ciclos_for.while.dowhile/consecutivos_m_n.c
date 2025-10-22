#include <stdio.h>
int main() {
	int M, N;
	printf("Vamos a mostrar los numeros consecutivamente de un punto M a un punto N\nPor favor, ingrese el valor de inicio que es M y el valor de final que es N\n!Recuerda que M debe ser menor a N!\n");
	printf("Valor para M:\n");
	scanf("%d", &M);
	printf("Valores para N:\n");
	scanf("%d", &N);
	printf("Te muestro tus valores:\nM=%d N=%d\n", M, N);
	if (M<N) {
		printf("Aqui esta tu listado\n");
		while (M<=N) {
			printf("%d", M);
			if (M+1==N+1) {
				printf("."); }
			else {
				(M+1!=N);
				printf(","); }
			M++; } }
	else {
		printf("ERROR\n");
		printf("Tu valor de M debe ser MENOR. Incorrecto. No se mostro el listado\n"); }
	return 0;
}
