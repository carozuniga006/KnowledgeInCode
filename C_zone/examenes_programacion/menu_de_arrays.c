#include <stdio.h>
#include <math.h>

float areaCirculo (float r) {
	float area= 3.1416 * (pow (r, 2));
	return area;
}

void promedio5 () {
	float numeros [5];
	float suma= 0;
	for (int i= 0; i<5; i++) {
		printf("Ingrese el numero %d:\n", i);
		scanf("%f", &numeros[i]);
		if (numeros[i] <0) {
			printf("Error, Debe ser mayor a 0\n");
			i--; }
		else {
		suma+= numeros[i]; } }
	float promedio;
	promedio= suma / 5;
	printf("El promedio de los 5 numeros es: %.2f\n\n", promedio);
}
	       


int main() {
	int opc;
	do{
		printf("==MENU DE EJERCICIOS==\n\n");
		printf("1. Calcular el area de un circulo\n");
		printf("2. Calcular el promedio de 5 numeros\n");
		printf("3. Llenar y mostrar una matriz de 5x3\n");
		printf("4. Salir del programa\n\n");
		printf("Elige una opcion del menu:\n");
		scanf("%d", &opc);
		switch (opc) {
			case 1:
				float radio;
				float area;
				printf("\n==CALCULAR AREA DE UN CIRCULO==\n\n");
				printf("Ingrese el radio del circulo:\n");
				scanf("%f", &radio);
				if (radio<=0) {
					printf("Error. Debe ser mayor a 0\n"); }
				else {
					area= areaCirculo (radio);
					printf("Radio proporcionado= %.2f\n", radio);
					printf("Area Calculada= %.2f\n", area); }
				break;
			case 2:
				printf("\n==CALCULAR PROMEDIO DE 5 NUMEROS==\n\n");
				promedio5();
				break; 
			case 3:
				printf("\n==LLENAR Y MOSTRAR UNA MATRIZ DE 5x3\n\n");
				int matriz[5][3];
				for(int i= 0; i<5; i++) {
					for(int j= 0; j<3; j++) {
						printf("Ingrese el numero [%d][%d]: ", i, j);
						scanf("%d", &matriz[i][j]);
						printf("\n"); } }
				for(int k= 0; k<5; k++) {
					for(int l= 0; l<3; l++) {
						printf("%3d ", matriz[k][l]); } 
				       printf("\n");	}
				break;
			case 4:
				printf("Saliendo del programa\n\n");
				break;
			default:
				printf("Opcion invalida\n");
				break; }
	}while(opc!=4);
	return 0;
}
