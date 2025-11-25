#include <stdio.h>
#include <string.h>
#include <ctype.h>

void contarVocales(char frase[], int *a, int *e, int *i, int *o, int *u) {
    *a = *e = *i = *o = *u = 0; 
    for (int j = 0; j < strlen(frase); j++) {
        char c = tolower(frase[j]);
        if (c == 'a') {
            (*a)++; } 
	else if (c == 'e') {
            (*e)++;  } 
	else if (c == 'i') {
            (*i)++;  } 
	else if (c == 'o') {
            (*o)++;  } 
	else if (c == 'u') {
            (*u)++;
        } } 
}

int main() {
    char frase[1000];
    int a, e, i, o, u;
    printf("Ingrese una frase: ");
    fgets(frase, sizeof(frase), stdin);
    frase[strcspn(frase, "\n")] = 0;
    contarVocales(frase, &a, &e, &i, &o, &u);
    printf("Cantidad de vocales:\n");
    printf("a: %d\n", a);
    printf("e: %d\n", e);
    printf("i: %d\n", i);
    printf("o: %d\n", o);
    printf("u: %d\n", u);
    return 0;
}

