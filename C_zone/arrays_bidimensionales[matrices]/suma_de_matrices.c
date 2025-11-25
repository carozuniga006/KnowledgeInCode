#include <stdio.h>

int main() {
    int A[5][5], B[5][5], C[5][5];
    
    printf("Ingrese los valores de la matriz A (5x5):\n");
    for (int i = 0; i < 5; i++) {
        for (int j = 0; j < 5; j++) {
            printf("A[%d][%d]: ", i, j);
            scanf("%d", &A[i][j]); }  }

    printf("Ingrese los valores de la matriz B (5x5):\n");
    for (int i = 0; i < 5; i++) {
        for (int j = 0; j < 5; j++) {
            printf("B[%d][%d]: ", i, j);
            scanf("%d", &B[i][j]); }  }

    for (int i = 0; i < 5; i++) {
        for (int j = 0; j < 5; j++) {
            C[i][j] = A[i][j] + B[i][j]; }  }

    printf("\nMatriz resultante C (A + B):\n");
    for (int i = 0; i < 5; i++) {
        for (int j = 0; j < 5; j++) {
            printf("%d\t", C[i][j]);  }
        printf("\n");    }

    return 0;
}

