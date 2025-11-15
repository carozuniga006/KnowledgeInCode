#include <stdio.h>

void rellenarMultiplos(int array[], int N, int numero_pedido) {
    for(int i = 0; i < N; i++) {
        array[i] = numero_pedido * (i + 1); }
}

void mostrarArray(int array[], int N) {

    printf("\nEl array contiene:\n");
    for(int i = 0; i < N; i++) {
        printf("%d ", array[i]);  }
    printf("\n");
}

int main() {
    int array[20];
    int N, numero_pedido;

    printf("Ingresa la cantidad N de elementos a rellenar (max 20): ");
    scanf("%d", &N);

    if (N < 1 || N > 20) {
        printf("Error: N debe estar entre 1 y 20.\n");
        return 1; }

    printf("Ingresa el numero de los multiplos que quieres ver en tu arreglo: ");
    scanf("%d", &numero_pedido);

    
    rellenarMultiplos(array, N, numero_pedido);
    mostrarArray(array, N);

    return 0;
}

