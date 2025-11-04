#include <stdio.h>

float calcularTotal(int unidades, float precio) {
	float total= unidades * precio;
	float descuento= 0;
	if(unidades>=12) {
		descuento= total * 0.10; }
	else if(unidades>=6) {
		descuento= total * 0.04; }
	total= total - descuento;
	return total;
}

int main() {
	int cantidad;
	float precio, total;
	printf("Ingresa la cantidad de unidades:\n");
	scanf("%d", &cantidad);
	printf("INgresa el precio unitario del producto:\n");
	scanf("%f", &precio);
	total= calcularTotal(cantidad, precio);

	if(cantidad>=12) {
		printf("Descuento aplicado: 10%%\n"); }
	else if(cantidad>=6) {
		printf("Descuento aplicado: 4%%\n"); }
	else {
		printf("Descuento aplicado: 0%%\n"); }
	printf("Total a pagar= %.2f\n", total);
	return 0;
}
