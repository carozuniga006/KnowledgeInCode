#include <stdio.h>

void unidades(int n) {
	switch(n) {
		case 1: 
			printf("I"); 
			break;
		case 2:
			printf("II");
			break;
		case 3: 
			printf("III");
			break;
		case 4:
			printf("IV");
			break;
		case 5:
			printf("V");
			break;
		case 6:
			printf("VI");
			break;
		case 7:
			printf("VII");
			break;
		case 8:
			printf("VIII");
			break;
		case 9:
			printf("IX");
			break; }
}


void decenas(int n) {
	switch(n) {
		case 1:
			printf("X");
			break;
		case 2:
			printf("XX");
			break;
		case 3:
			printf("XXX");
			break;
		case 4:
			printf("XL");
			break;
		case 5:
			printf("L");
			break;
		case 6:
			printf("LX");
			break;
		case 7:
			printf("LXX");
			break;
		case 8:
			printf("LXXX");
			break;
		case 9:
			printf("XC");
			break; }
}

void centenas(int n) {
	switch (n) {
		case 1:
			printf("C");
			break;
		case 2:
			printf("CC");
			break;
		case 3:
			printf("CCC");
			break;
		case 4:
			printf("CD");
			break;
		case 5:
			printf("D");
			break;
		case 6:
			printf("DC");
			break;
		case 7:
			printf("DCC");
			break;
		case 8:
			printf("DCCC");
			break;
		case 9:
			printf("CM");
			break; }
}

int main() {
	int numero;
	int c, d, u;
	
	printf("Ingresa un numero del 1 al 999 para convertir a numeros romanos: ");
	scanf("%d", &numero);

	if(numero <0 || numero>999) {
		printf("Error de parametros\n"); }
	else if (numero==0) {
		printf("El numero 0 no tiene equivalente en numeros romanos\n"); }
	else {
		c= numero/100;
		d= (numero/10) % 10;
		u= numero % 10; 
	printf("El numero %d en numeros romanos es: ", numero);
	centenas(c);
	decenas(d);
	unidades(u);
	printf("\n"); }
	return 0;
}
