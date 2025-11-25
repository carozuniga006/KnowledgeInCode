#include <stdio.h>

int main() {
    int primos[100];
    int contador = 0;

    for (int i = 2; i <= 100; i++) {
        int divisores = 0;
        for (int j = 1; j <= i; j++) {
            if (i % j == 0) {
                divisores++; } }
        if (divisores == 2) {
            primos[contador] = i;
            contador++;  } }

    printf("Números primos entre 1 y 100:\n");
    for (int i = 0; i < contador; i++) {
        printf("%d ", primos[i]);  }
    printf("\n");

    return 0;
}

