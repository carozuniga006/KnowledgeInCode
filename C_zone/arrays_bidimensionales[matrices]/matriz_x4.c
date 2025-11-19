#include <stdio.h>

int main() {

    int x[3][3] = { 
	    {7, 3, 9}, 
	    {4, 0, 5}, 
	    {1, 8, 2} 
    };
    int y[3][3];
    int i, j;

    for(i = 0; i < 3; i++) {
        for(j = 0; j < 3; j++) {
            y[i][j] = x[i][j] * 4; }  }

    printf("Matriz original X:\n");
    for(i = 0; i < 3; i++) {
        for(j = 0; j < 3; j++) {
            printf("%d\t", x[i][j]);  }
        printf("\n");  }

    printf("\nMatriz resultante Y (X * 4):\n");
    for(i = 0; i < 3; i++) {
        for(j = 0; j < 3; j++) {
            printf("%d\t", y[i][j]);  }
        printf("\n"); }

    return 0;
}

