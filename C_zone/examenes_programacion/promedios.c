#include <stdio.h>

int main() {
	int opc;
	do{
		printf("---MENU---\n\n");
		printf("1. CALCULAR PROMEDIO\n");
		printf("2. SALIR\n\n");
		printf("Elige una opcion del menu:\n");
		scanf("%d", &opc);
		switch (opc) {
			case 1:
				printf("\nCALCULAR PROMEDIO\n\n");
				float calif [7];
				float suma=0, promedio;
				printf("Ingresa 7 calificaciones para calcular el promedio\n");
				for (int i=0; i<7; i++) {
					scanf("%f", &calif[i]);
					if (calif[i]>10 || calif[i]<=0) {
						printf("Parametros de calificacion invalidos\n");
						i--; }
					suma+= calif[i]; }
					promedio= suma/7; 
				printf("\nEl promedio es de: %.2f\n", promedio);
				if(promedio==10) {
					printf("Felicidades!\n\n"); }
				if (promedio<10 && promedio>=8) {
					printf("Muy bien\n\n"); }
				if (promedio<8 && promedio>=6) {
					printf("sigue mejorando...\n\n"); }
				if (promedio<6) {
					int planas;
					printf("Promedio debajo de 6!, Ingrese un numero de planas:\n\n");
					scanf("%d", &planas);
					if(planas<0) {
						printf("Numero invalido, Planas no pueden ser 0\n"); }
					else {
						for(int j=1; j<=planas; j++) {
							printf("%d. Debo estudiar mas\n\n", j); } } }
				break;
			case 2:
				printf("Saliendo del programa...\n");
				break;
			default:
				printf("Opcion no valida en el menu");
				break;
			}
	}while(opc!=2);
	return 0;
}
