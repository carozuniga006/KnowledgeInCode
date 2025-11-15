#include <stdio.h>

void imprimirPares(int arr[], int tam) {
    printf("\nNumeros pares: ");
    for(int i = 0; i < tam; i++) {
        if(arr[i] % 2 == 0) {
            printf("%d ", arr[i]); } }
    printf("\n");
}

void imprimirImpares(int arr[], int tam) {
    printf("\nNumeros impares: ");
    for(int i = 0; i < tam; i++) {
        if(arr[i] % 2 != 0) {
            printf("%d ", arr[i]); } }
    printf("\n");
}


int main() {
    int numeros[20];
    int n, count = 0;

    printf("Ingresa numeros (0 para terminar):\n");

    while(count < 20) {
        printf("Numero %d: ", count);
        scanf("%d", &n);
        if(n == 0) {
            break;  }

        numeros[count] = n;
        count++; }
    imprimirPares(numeros, count);
    imprimirImpares(numeros, count);

    return 0;
}

