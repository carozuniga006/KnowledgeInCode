#include <stdio.h>

int main() {
    int matriz[2][8] = {
        {7, 4, 1, 3, 8, 7, 4, 0},
        {9, 6, 3, 7, 2, 9, 3, 0}
    };

    for (int i = 1; i >= 0; i--) {
        int suma = 0;
        for (int j = 0; j < 7; j++) {
            suma += matriz[i][j]; }
        matriz[i][7] = suma; }

    printf("Matriz resultante:\n");
    for (int i = 0; i < 2; i++) {
        for (int j = 0; j < 8; j++) {
            printf("%d ", matriz[i][j]); }
        printf("\n"); }
    return 0;
}

