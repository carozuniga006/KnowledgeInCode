#include <stdio.h>

int main() {
	int opc;
	do{
		printf("==MENU DE EJERCICIOS==\n\n");
		printf("1. NUMEROS PRIMOS DEL 1 AL 500\n");
		printf("2. CALCULAR PERIMETRO DE UN TRIANGULO\n");
		printf("3. BUCLE DE CALCULAR PERIMETROS DE TRIANGULOS\n");
		printf("4. COMBINACIONES PARA COMPRAS CON $87\n");
		printf("5. MOSTRAR DIVISORES DE UN NUMERO N\n");
		printf("6. SALIR DEL PROGRAMA\n\n");
		printf("Ingrese una opcion:\n");
		scanf("%d", &opc);
		switch (opc) {
			case 1:
				printf("\nNUMEROS PRIMOS DEL 1 AL 500\n");
				int num=2, p, esPrimo;
				while(num<500) {
					esPrimo= 1;
					p=2;
					while(p* p<=num) {
						if(num % p== 0) {
							esPrimo= 0;
							break; }
						p++; }
					if(esPrimo) printf("%d ", num);
					num++; }
				printf("\n");
				break;
			case 2:
				printf("\nCALCULAR PERIMETRO DE UN TRIANGULO\n\n");
				float l_a, l_b, l_c, prm;
				do{
					printf("\nPara calcular el perimetro, por favor ingresa los lados (3) del triangulo. OJO: si ingresas uno de los lados como 0, el programa terminara despues de la conversion\n");
					printf("\nLado a: ");
					scanf("%f", &l_a);
					printf("\nLado b: ");
					scanf("%f", &l_b);
					printf("\nLado c: ");
					scanf("%f", &l_c);
					printf("\nConsiderando que:\nP= L1+L2+L3\n\n");
					prm= l_a + l_b + l_c;
					printf("El perimetro es de: %.2f\n\n", prm);
					}while(l_a!=0 && l_b!=0 && l_c!=0);
					printf("EL programa se terminara porque uno de los lados es 0\n\n");
					break;
			case 3:
				printf("\nBUCLE DE CALCULAR PERIMETROS DE TRIANGULOS\n\n");
				float lado_a, lado_b, lado_c, peri;
				char decision;
				do{
					printf("Para poder hacer el calculo, por favor ingresa los lados (3) del triangulo\n");
					printf("Lado a: ");
					scanf("%f", &lado_a);
					printf("Lado b: ");
					scanf("%f", &lado_b);
					printf("Lado c: ");
					scanf("%f", &lado_c);
					printf("Considerando que:\nP= L1+L2+L3\n\n");
					peri= lado_a + lado_b + lado_c;
					printf("El perimetro es: %.2f\n\n", peri);
					printf("Desea volver a calcular el perimetro?\nUse S para SI y N para NO\n");
					scanf(" %c", &decision);
				}while(decision== 'S' || decision== 's');
				printf("OK. Programa terminado\n\n");
				break;
			case 4:
				printf("\nCOMBINACIONES PARA COMPRAS CON $87\n\n");
				int a_5, b_7, c_19;
				printf("Simula que existen productos de $5, $7 y $19 en una tienda, tu solo tienes $87. Te mostrare todas as combinaciones de productos segun su precio que podrias adquirir (unidades)\n");
				for(a_5=0; a_5<=87/5; a_5++) {
					for(b_7=0; b_7<=87/7; b_7++) {
						for(c_19=0; c_19<=87/19; c_19++) {
							if((5*a_5 + 7*b_7 + 19*c_19)==87) {
								printf("5x%d + 7x%d + 19x%d= 87\n\n", a_5, b_7, c_19);
							} } } }
				break;
			case 5:
				printf("\nMOSTRAR DIVISORES DE UN NUMERO\n\n");
				int i, number, SN;
				do{
					printf("Ingresa un numero para mostrarte todos sus divisores\n");
					scanf("%d", &number);
					printf("\nLos divisores de %d son:\n", number);
					for(i=1; i<=number; i++) {
						if(number % i== 0) {
							printf(" %d ", i); } }
					printf("QUieres volver a calcular los divisores de un numero?\nUSE 1 PARA SI Y 2 PARA NO\n");
					scanf("%d", &SN);
					if(SN==1) {
						printf("Vamos de nuevo!\n"); }
					else if(SN==2) {
						printf("OK. Terminando programa...\n");
						break; }
					else {
						printf("Opcion INvalida\nSaliendo del programa\n\n");
						break; }
				}while(number);
				break;
			case 6:
				printf("SALIENDO DEL PROGRAMA...\n\n");
				break;
			default:
				printf("Opcion no valida en el menu\nINtente de nuevo:\n");
				break;
			}
	}while(opc!=6);
	return 0;
}


