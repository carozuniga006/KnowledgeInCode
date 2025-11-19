#include <stdio.h>

int main() {
    int matriz[2][7] = {
        {5, 8, 3, 1, 9, 2, 3},
        {0, 0, 0, 0, 0, 0, 0}
    };

    for (int i = 0; i < 7; i++) {
        matriz[1][i] = matriz[0][i] * matriz[0][i] * matriz[0][i]; }

    printf("La matriz resultante es:\n");
    for (int fila = 0; fila < 2; fila++) {
        for (int col = 0; col < 7; col++) {
            printf("%d ", matriz[fila][col]); }
        printf("\n"); }
    return 0;
}

