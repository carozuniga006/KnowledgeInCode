#include <stdio.h>

void leer3Valores(float *a, float *b, float *c) {
	printf("Ingresa el primer valor:\n");
	scanf("%f", a);
	printf("Ingresa el segundo valor:\n");
	scanf("%f", b);
	printf("Ingresa el tercer valor:\n");
	scanf("%f", c);
}

void mostrarAsc(float a, float b, float c) {
	printf("\n==Numeros en orden ascendente==\n");

	if(a<= c && b<= c) {
		printf("%.2f, %.2f, %.2f\n\n", a, b, c); }
	else if(a<=c && c<= b) {
		printf("%.2f, %.2f, %.2f\n\n", a, c, b); }
	else if(b<= a && a<= c) {
		printf("%.2f, %.2f, %.2f\n\n", b, a, c); }
	else if(b<= c && c<= a) {
		printf("%.2f, %.2f, %.2f", b, c, a); }
	else if(c<= a && a<= b) {
		printf("%.2f, %.2f, %.2f", c, a, b); }
	else {
		printf("%.2f, %.2f, %.2f", c, b, a); }
}

void mostrarDesc(float a, float b, float c) {
	printf("\n==Numeros en orden descendientes==\n\n");
	
	if(a>= b && b>=c) {
		printf("%.2f, %.2f, %.2f", a, b, c); }
	else if(a>=c && c>= b) {
		printf("%.2f, %.2f, %.2f", a, c, b); }
	else if(b>= a && a>= c) {
		printf("%.2f, %.2f, %.2f", b, a, c); }
	else if(b>= c && c>= a) {
		printf("%.2f, %.2f, %.2f", b, c, a); }
	else if(c>= a && a>= b) {
		printf("%.2f, %.2f, %.2f", c, a, b); }
	else {
		printf("%.2f, %.2f, %.2f", c, b, a); }
}

int main() {
	float x, y, z;
	leer3Valores(&x, &y, & z);

	mostrarAsc(x, y, z);
	mostrarDesc(x, y, z);

	return 0;
}
	
	
