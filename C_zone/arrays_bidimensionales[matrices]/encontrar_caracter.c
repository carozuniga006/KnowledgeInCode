#include <stdio.h>
#include <string.h>

int buscarLetra(char texto[], char letra) {
    int contador = 0;
    for (int i = 0; i < strlen(texto); i++) {
        if (texto[i] == letra) {
            contador++; } }
    return contador;
}

int main() {
    char texto[1000];
    char letra;
    int veces;
    printf("Ingrese un texto: ");
    fgets(texto, sizeof(texto), stdin);
    texto[strcspn(texto, "\n")] = 0;
    printf("Ingrese un carácter a buscar: ");
    scanf(" %c", &letra);
    veces = buscarLetra(texto, letra);
    printf("El carácter '%c' se encontró %d veces.\n", letra, veces);
    return 0;
}


