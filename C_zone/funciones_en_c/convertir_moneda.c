#include <stdio.h>
#include <string.h>

float convertir_a_pesos(float cantidad, char monedaorigen[]) {
	float dolar= 18.55;
	float euro= 21.43;
	float libra= 24.36;
	float yen= 0.1206;
	float bitcoin= 2000658.0;
	float pesos= 0.0;
	if(cantidad<=0) {
		printf("La cantidad debe ser positiva\n");
       		return 0;	}
	if(strcmp(monedaorigen, "USD") ==0 || strcmp(monedaorigen, "usd") ==0)
		pesos= cantidad * dolar;
	else if(strcmp(monedaorigen, "EUR") ==0 || strcmp(monedaorigen, "eur") ==0)
		pesos= cantidad * euro;
	else if(strcmp(monedaorigen, "GBP") ==0 || strcmp(monedaorigen, "gbp") ==0)
		pesos= cantidad * libra;
	else if(strcmp(monedaorigen, "JPY") ==0 ||strcmp(monedaorigen, "jpy") ==0) 
		pesos= cantidad * yen;
	else if(strcmp(monedaorigen, "BTC") ==0 || strcmp(monedaorigen, "btc") ==0)
		pesos= cantidad * bitcoin;
	else {
		printf("Moneda NO reconocida\n");
		return 0; }
	printf("COnversion realizada:\n");
	printf("%.2f %s equivalen a %.2f pesos mexicanos\n", cantidad, monedaorigen, pesos);
	return pesos;
}

int main() {

	float cantidad;
	char moneda[10];
	printf("Introduce la cantidad a convertir:\n");
	scanf("%f", &cantidad);
	printf("Introduce el tipo de moneda de origen usando las siglas:\nUSD para dolares\nEUR para euros\nGBP para libras\nJPY para yenes\nBTC para bitcoin\n");
	scanf("%s", moneda);

	convertir_a_pesos(cantidad, moneda);

	return 0;
}	
