#include <stdio.h>

void mostrarDeletreado(int numero) {
	switch(numero) {
		case 1: 
			printf("1= UNO\n");
			break;
		case 2: 
			printf("2= DOS\n");
			break;
		case 3:
			printf("3= TRES\n");
			break;
		case 4:
		       	printf("4= CUATRO\n");
			break;
		case 5:
			printf("5= CINCO\n");
			break;
		case 6:
			printf("6= SEIS\n");
			break;
		case 7:
			printf("7= SIETE\n");
			break;
		case 8:
			printf("8= OCHO\n");
			break;
		case 9:
			printf("9= NUEVE\n");
			break;
		case 10:
			printf("10= DIEZ\n");
			break;
		default:
			printf("NUmero fuera de rango\n");
			break; }
}

int main() {
	int num;
	printf("Ingresa un numero del 1 al 10\n");
	scanf("%d", &num);
	mostrarDeletreado(num);
	return 0;
}


