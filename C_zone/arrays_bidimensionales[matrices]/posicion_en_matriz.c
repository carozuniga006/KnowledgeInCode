#include <stdio.h>

int main() {
    int matriz[3][3] = {
        {21, 43, 64},
        {35, 76, 13},
        {27, 97, 88}
    };
	
    printf("Matriz 3x3:\n");
    for(int i = 0; i < 3; i++) {
        for(int j = 0; j < 3; j++) {
            printf("%d\t", matriz[i][j]);  }
        printf("\n"); }
    printf("\n");

    int max = matriz[0][0];
    int min = matriz[0][0];

    int i_max = 0, j_max = 0;
    int i_min = 0, j_min = 0;

    for(int i = 0; i < 3; i++) {
        for(int j = 0; j < 3; j++) {
            if(matriz[i][j] > max) {
                max = matriz[i][j];
                i_max = i;
                j_max = j; }
            if(matriz[i][j] < min) {
                min = matriz[i][j];
                i_min = i;
                j_min = j; } } }
    printf("Valor maximo = %d en posicion (%d, %d)\n", max, i_max, j_max);
    printf("Valor minimo = %d en posicion (%d, %d)\n", min, i_min, j_min);

    return 0;
}

