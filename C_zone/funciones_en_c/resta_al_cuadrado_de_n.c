#include <stdio.h>

int restaCuadrado(int n) {
	int resultado;
	resultado= (n*n) - (2*n);
	return resultado;
}

int main() {
	int num, rest;
	printf("Ingresa un numero para mostrar la resta del doble de su cuadrado:\n");
	scanf("%d", &num);

	rest= restaCuadrado(num);

	printf("El resultado de restar el doble de %d a su cuadrado es: %d\n", num, rest);

	return 0;

}
