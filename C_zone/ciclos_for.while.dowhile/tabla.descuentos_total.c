#include <stdio.h>
int main() {
	int i;
	float PU, C, totalPagar, descuento;
	float porcentaje;
	printf("Ingrese el precio unitario del producto:\n$");
	scanf("%f", &PU);
	printf("\nCantidad\tPU\t\tCosto\t\t%%D\tDescuento\tTotal a Pagar\n");
	printf("------------------------------------------------\n");
	for(i=1; i<=1000; i++) {
		C= PU * i;
		if (i<100) {
			porcentaje= 0; }
		else if (i<=200) {
			porcentaje= 5; }
		else if (i<= 500) {
			porcentaje= 10; }
		else {
			porcentaje= 18; }
		descuento= C * (porcentaje/100);
		totalPagar= C - descuento;
		printf("%4d\t\t%.2f\t\t%.2f\t\t%.0f%%\t%.2f\t\t%.2f\n", i, PU, C, porcentaje, descuento, totalPagar); }
	return 0;
}

