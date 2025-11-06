#include <stdio.h>

int diasDelMes(int mes) {
	int dias;
	switch (mes) {
		case 1: case 3: case 5: case 7: case 8: case 10: case 12:
		       	dias= 31;
	       		break;
	 	case 4: case 6: case 9: case 11:
			dias= 30;
			break;
		case 2:
			dias= 28;
			break;
		default:
			dias= 0;
	}
	return dias;
}

int main() {
	int mes, dias;

	printf("Ingresa un numero de mes (1 al 12):\n");
	scanf("%d", &mes);
	if(mes<1 || mes>12) {
		printf("Error\n"); }
	else {
		dias= diasDelMes(mes);
		printf("El mes %d tiene %d dias\n", mes, dias); }

		return 0;
}	
