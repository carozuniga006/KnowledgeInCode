#include <stdio.h>
#include <string.h>
#include <ctype.h>

int esPalindromo(char texto[]) {
    int inicio = 0;
    int fin = strlen(texto) - 1;
    while (inicio < fin) {
        if (!isalnum(texto[inicio])) {
            inicio++;
            continue;  }
        if (!isalnum(texto[fin])) {
            fin--;
            continue;  }
        if (tolower(texto[inicio]) != tolower(texto[fin])) {
            return 0;  }
        inicio++;
        fin--; }
    return 1;
}

int main() {
    char texto[1000];
    printf("Ingrese un texto: ");
    fgets(texto, sizeof(texto), stdin);
    texto[strcspn(texto, "\n")] = 0;

    if (esPalindromo(texto)) {
        printf("Palíndromo\n"); } 
    else {
        printf("NO es palíndromo\n");    }

    return 0;
}

