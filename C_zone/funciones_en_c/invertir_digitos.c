#include <stdio.h>

int invertirNumero(int numero) {
	int invertido= 0;
	while(numero!=0) {
		int digito= numero % 10;
		invertido= invertido*10 + digito;
		numero/=10; }
	return invertido; }

int main() {
	int num;
	printf("Ingresa una cantidad para invertirla\n");
	scanf("%d", &num);
	int resultado= invertirNumero(num);
	printf("El numero invertido es: %d\n", resultado);
	return 0;
}
