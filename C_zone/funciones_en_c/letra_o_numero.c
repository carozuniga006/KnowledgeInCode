#include <stdio.h>

int esNumero(char c) {
	if( c>='0' && c<='9') {
		return 1; }
	else {
		return 0; }
}

int esLetraDelAlfabeto(char c) {
	if((c>='A' && c<='Z' || c>='a' && c<='z'))
		return 1;
	else {
		return 0; }
}

int main() {
	char caracter;

	printf("Ingresa un caracter:\n");
	scanf("%c", &caracter);

	if(esNumero(caracter)) {
		printf("El caracter %c, es un NUMERO.\n", caracter); }
	else if(esLetraDelAlfabeto(caracter)) {
		printf("El caracter %c, es una LETRA DEL ALFABETO\n", caracter); }
	else {
		printf("El caracter %c, es OTRO tipo de caracter\n", caracter); }
	return 0;
}
