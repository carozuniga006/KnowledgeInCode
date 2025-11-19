#include <stdio.h>
#include <math.h>

float areaEsfera(float radio) {
	float area= (3.1416 * 4) * (pow(radio, 2));
	return area;
}

void tablaMultiplicar(int inicio, int final, int multiplicador) {
	for(int i= inicio; i<=final; i++) {
		printf("%d * %d= %d\n\n", multiplicador, i, i*multiplicador); }
}


int main() {
	int opc;
	do {
		printf("==MENU INTERACTIVO==\n\n");
		printf("1. Calcular el area de una esfera\n");
		printf("2. Tabla de multiplicar personalizada\n");
		printf("3. Matriz 3x5\n");
		printf("4. Salir\n\n");
		printf("Elige una opcion del menu:\n");
		scanf("%d", &opc);
		switch (opc) {
			case 1:
				printf("\n==CALCULAR AREA DE UNA ESFERA==\n\n");
				float radio, areaes;
				printf("Ingresa el radio de la figura: ");
				scanf("%f", &radio);
				if(radio<=0) {
					printf("Error, el radio debe ser mayor a 0\n\n"); }
				else {
				areaes= areaEsfera(radio);
				printf("El area de la esfera es: %.2f\n\n", areaes); }
				break; 
			case 2:
				printf("\n==TABLA DE MULTIPLICAR PERSONALIZADA==\n\n");
				int inicio, final, multi;
				printf("Ingresa el valor de inicio: ");
				scanf("%d", &inicio);
				printf("Ingresa el valor de final: ");
				scanf("%d", &final);
				printf("Ingresa el multiplicador: ");
				scanf("%d", &multi);
				if(inicio>final || inicio<=0 || final<=0 || multi<=0) {
					printf("Error de parametros\n\n"); }
				else {
				tablaMultiplicar(inicio, final, multi); }
				break;
			case 3:
				printf("\n==MATRIZ 3x5==\n\n");
				int i, j;
				int matriz [3][5];

				for(i=0; i<3; i++) {
					for(j=0; j<5; j++) {
						printf("Ingresa el valor [%d][%d]: ", i, j);
						scanf("%d", &matriz[i][j]); } }
				printf("\n");
				
				for(i=0; i<3; i++) {
                                        for(j=0; j<5; j++) {
						printf("%3d", matriz[i][j]); }
					printf("\n"); }
				printf("\n");
				break;
			case 4:
				printf("Saliendo del programa...\n\n");
				break;
			default:
				printf("opcion invalida. Intente otra vez\n\n");
				break; 
		}
	}while(opc!=4);
	return 0;
}
				
