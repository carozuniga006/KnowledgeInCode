#include <stdio.h>

void binario(int numero) {
	printf("Ingresa un numero del 0 al 15 para convertirlo a binario:\n");
	scanf("%d", &numero);
	printf("Convirtiendo numero...\n\n");
	if(numero==15) {
		printf("DECIMAL= 15\nHEXADECIMAL= F\nBINARIO= 1111\n"); }
	else if(numero==14) {
		printf("DECIMAL= 14\nHEXADECIMAL= E\nBINARIO= 1110\n"); }
	else if(numero==13) {
		printf("DECIMAL= 13\nHEXADECIMAL= D\nBINARIO= 1101\n"); }
	else if(numero==12) {
		printf("DECIMAL= 12\nHEXADECIMAL= C\nBINARIO= 1100\n"); }
	else if(numero==11) {
		printf("DECIMAL= 11\nHEXADECIMAL= B\nBINARIO= 1011\n"); }
	else if(numero==10) {
		printf("DECIMAL= 10\nHEXADECIMAL= A\nBINARIO= 1010\n"); }
	else if(numero==9) {
		printf("DECIMAL= 9\nHEXADECIMAL= 9\nBINARIO= 1001\n"); }
	else if(numero==8) {
		printf("DECIMAL= 8\nHEXADECIMAL= 8\nBINARIO= 1000\n"); }
	else if(numero==7) {
		printf("DECIMAL= 7\nHEXADECIMAL= 7\nBINARIO= 0111\n"); }
	else if(numero==6) {
		printf("DECIMAL= 6\nHEXADECIMAL= 6\nBINARIO= 0110\n"); }
	else if(numero==5) {
		printf("DECIMAL= 5\nHEXADECIMAL= 5\nBINARIO= 0101\n"); }
	else if(numero==4) {
		printf("DECIMAL= 4\nHEXADECIMAL= 4\nBINARIO= 0100\n"); }
	else if(numero==3) {
		printf("DECIMAL= 3\nHEXADECIMAL= 3\nBINARIO= 0011\n"); }
	else if(numero==2) {
		printf("DECIMAL= 2\nHEXADECIMAL= 2\nBINARIO= 0010\n"); }
	else if(numero==1) {
		printf("DECIMAL= 1\nHEXADECIMAL= 1\nBINARIO= 0001\n"); }
	else if(numero==0) {
		printf("DECIMAL= 0\nHEXADECIMAL= 0\nBINARIO= 0000\n"); }
	else {
		printf("PARAMETROS INVALIDOS\n\n"); }
}

int main() {
	
	int num;

	binario(num);

	return 0;
}
