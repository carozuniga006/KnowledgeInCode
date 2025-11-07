#include <stdio.h>
#include <string.h>

void encriptar(char mensaje[]) {
	int i;
	for(i= 0; i< strlen(mensaje); i++) {
		mensaje[i]+=2; }
}

void desencriptar(char mensaje[]) {
	int i;
	for(i= 0; i< strlen(mensaje); i++) {
		mensaje[i]-=2; }
}

int main() {
	char mensaje[100];

	printf("Ingresa un mensaje:\n");
	fgets(mensaje, sizeof(mensaje), stdin);

	size_t len= strlen(mensaje);
	if(mensaje[len-1]== '\n') {
		mensaje[len-1]= '\0'; }
	encriptar(mensaje);
	printf("Mensaje encriptado: %s\n", mensaje);
	desencriptar(mensaje);
	printf("Mensaje desencriptado: %s\n", mensaje);
	return 0;
}
