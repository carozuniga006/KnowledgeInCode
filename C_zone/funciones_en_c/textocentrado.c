#include <stdio.h>
#include <string.h>

void mostrarCentrado(char texto[]) {
	int columnas= 80;
	int renglones= 24;

	int largoTexto= strlen(texto);
	int espacioIzquierdo= (columnas-largoTexto) / 2;
	int renglonCentral= renglones/2;
	for (int i=0; i<renglonCentral; i++) {
	printf("\n"); }
	for (int i=0; i<espacioIzquierdo; i++) {
		printf(" "); }
	printf("%s\n", texto); }

int main() {
	mostrarCentrado("Carolina Zuniga!");
	return 0;
}
