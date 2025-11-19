#include <stdio.h>

int main() {
    int matriz[4][4] = {
        {4, 7, 5, 3},
        {6, 5, 1, 2},
        {7, 4, 8, 9},
        {0, 0, 0, 0}
    };
    for (int j = 0; j < 4; j++) {  
        int suma = 0;
        for (int i = 0; i < 3; i++) {
            suma += matriz[i][j]; }
        matriz[3][j] = suma;  }

    printf("Matriz resultante:\n");
    for (int i = 0; i < 4; i++) {
        for (int j = 0; j < 4; j++) {
            printf("%d ", matriz[i][j]); }
        printf("\n");  }
    return 0;
}

