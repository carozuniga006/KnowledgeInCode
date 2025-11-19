#include <stdio.h>

int main() {
    int matriz[5][3] = {
        {2, 3, 0},
        {3, 4, 0},
        {8, 6, 0},
        {1, 3, 0},
        {0, 0, 0}  
    };

    int sumaTotal = 0;
    for (int i = 0; i < 4; i++) {
        int sumaFila = 0;
        for (int j = 0; j < 2; j++) {
            sumaFila += matriz[i][j]; }
        matriz[i][2] = sumaFila;
        sumaTotal += sumaFila;    }

    for (int j = 0; j < 2; j++) { 
        int sumaColumna = 0;
        for (int i = 0; i < 4; i++) {
            sumaColumna += matriz[i][j];
        }
        matriz[4][j] = sumaColumna; }

    matriz[4][2] = sumaTotal;

    printf("Matriz resultante:\n");
    for (int i = 0; i < 5; i++) {
        for (int j = 0; j < 3; j++) {
            printf("%d ", matriz[i][j]); }
        printf("\n"); }
    return 0;
}

