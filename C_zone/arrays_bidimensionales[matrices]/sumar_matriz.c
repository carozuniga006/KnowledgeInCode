#include <stdio.h>

int sumarPositivos(int matriz[3][3]) {
    int suma = 0;
    for(int i = 0; i < 3; i++) {
        for(int j = 0; j < 3; j++) {
            if (matriz[i][j] > 0) {
                suma += matriz[i][j]; } }  }
    return suma;
}
int sumarNegativos(int matriz[3][3]) {
    int suma = 0;
    for(int i = 0; i < 3; i++) {
        for(int j = 0; j < 3; j++) {
            if (matriz[i][j] < 0) {
                suma += matriz[i][j]; } } }
    return suma;
}

int main() {
    int matriz[3][3] = {
        {-22, 23, 32},
        {45, 56, -13},
        {-25, 78, 89}
    };
    printf("Matriz 3x3:\n");
    for(int i = 0; i < 3; i++) {
        for(int j = 0; j < 3; j++) {
            printf("%d\t", matriz[i][j]); }
        printf("\n"); }
    printf("\n");
    int suma_pos = sumarPositivos(matriz);
    int suma_neg = sumarNegativos(matriz);
    printf("Suma de positivos: %d\n", suma_pos);
    printf("Suma de negativos: %d\n", suma_neg);
    return 0;
}

