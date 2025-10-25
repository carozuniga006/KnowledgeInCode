#include <stdio.h>
int main() {
	int opc;
	do {
	printf("\n==MENU DE EJERCICIOS==\n");
	printf("1. simplificar fracciones\n");
	printf("2. calcular distancia\n");
	printf("3. convertir pulgadas a cm\n");
	printf("4. Mostrar salario de 120 empleados\n");
	printf("5. MOstrar nombre y promedio de 25 alumnos\n");
	printf("6. Salir del programa\n\n");
	printf("ELige una opcion:");
	scanf("%d", &opc);
	switch (opc) {
		case 1:
			printf("\nSIMPLIFICAR FRACCIONES\n\n");
			int nume, deno;
			printf("Ingrese el numerador:\n");
			scanf("%d", &nume);
			printf("Ingrese el denominador:\n");
			scanf("%d", &deno);
			if (deno==0) {
				printf("El denominador no puede ser 0\n"); }
			else {
				for (int i=2; i<=nume && i<=deno; i++) {
				       while(nume % i== 0 && deno % i== 0) {
				       nume /= i;
				       deno /= i; } }
				printf("\nLa fraccion simplificada es %d/%d\n", nume, deno); }
			break;
		case 2:
			printf("\nCALCULAR DISTANCIA\n\n");
			int vel, tm, dist, op;
			printf("Quieres calcular la distancia que recorriste? Usa 1 para SI y 2 para NO\n");
			scanf("%d", &op);
			if (op==1) {
				while (op==1) {
					printf("INgresa la velocidad a la que conducias en km/h (solo el numero)\n");
					scanf("%d", &vel);
					printf("Ingresa el tiempo que manejaste en horas (solo el numero)\n");
					scanf("%d", &tm);
					dist= vel * tm;
					printf("La distancia recorrida fue de: %d km\n\n", dist);
					int opcion;
					printf("Quieres volver a calcular la distancia? Usa 1 para SI y 2 para NO\n");
					scanf("%d", &opcion);
					if (opcion==1) {
						printf("Bien. Vamos de nuevo\n"); }
					else if (opcion==2) {
						printf("OK. Terminando programa...\n\n"); 
						break; }
					else {
						printf("ERROR. Usa 1 para SI y 2 para NO\nPrograma terminado\n");
					        break; } } }
			else if (op==2) {
				printf("Bien. Saliendo del programa...\n\n"); }
			else {
				printf("OPcion no valida. Usa 1 para SI y 2 para NO\n"); }	

			break;
		case 3:
			printf("\nCONVERTIR PULGADAS A CM\n\n");
			float p;
			float inch= 2.54;
			float cm;
			printf("Vamos a convertir pulgadas a centimetros\nSI ingresas 0, el programa se cerrara!\n\n");
			do {
				printf("Ingresa una cantidad de pulgadas (solo el numero)\n");
				scanf("%f", &p);
				cm= inch * p;
				if (p==0) {
					printf("NUmero invalido a convertir\nCerrando programa...\n"); }
				else {
					printf("%.1f pulgadas equivalen a %.2f centimetros\n", p, cm); }
			}while(p>0);
			break;
		case 4:
			printf("\nMOSTRAR SALARIO DE 120 EMPLEADOS\n\n");
			int i=1;
			char nombre [120] [50];
			float salario [120];
			printf("Vamos a mostrar el nombre y el salario semanal de 120 empleados, tomados de ellos mismos\n");
			while(i<=120) {
				printf("INgresa tu nombre:\n");
				scanf("%s", nombre[i]);
				printf("Ingresa tu salario semanal:\n$");
				scanf("%f", &salario[i]);
				i++; }
			printf("\nLISTADO DE EMPLEADOS\n\n");
			i=1;
			printf("EMPLEADOS\t\tSALARIO\n");
			printf("------------------------------------\n");
			while(i<=120) {
				printf("%s\t\t$%.2f\n", nombre[i], salario[i]);
				i++; }
			break;
		case 5:
			printf("\nMOSTRAR NOMBRE Y PROMEDIO DE 25 ALUMNOS\n\n");
			int j=1;
			char nombree [25] [50];
			float cal1, cal2, cal3;
			float promedio [25];
			while(j<=25) {
				printf("Ingrese tu nombre:\n");
				scanf("%s", nombree[j]);
				printf("Ingresa la calificacion de la materia 1:\n");
				scanf("%f", &cal1);
				printf("Ingresa la calificacion de la materia 2:\n");
				scanf("%f", &cal2);
				printf("Ingresa la calificacion de la materia 3:\n");
				scanf("%f", &cal3);
				printf("\n");
				promedio[j]= (cal1+cal2+cal3)/3;
				j++; }
			printf("LISTADO DE ALUMNOS\n");
			j=1;
			while (j<=25) {
				printf("Alumno %d: %s. Promedio: %.2f\n", j, nombree[j], promedio[j]);
				j++; }
			break;
		case 6:
			printf("OK. Saliendo del programa...\n");
			break;
		default:
			printf("OPcion no valida en el menu...\n");
			break; }
		}while(opc!=6);
		return 0;
}	
