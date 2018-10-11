#include <stdio.h>
#include <stdlib.h>

#define tamanhoVetor 100000

int buscaBinaria(int vetorOrdenado[], int elem) {
    int fim = tamanhoVetor; //ta como 100000 pq o stack
    int inicio = 0;
    int meio = fim/2;

    while(inicio<=fim) {
        meio = (inicio + fim)/2;
            if (elem == vetorOrdenado[meio])
                return meio;
            if (elem < vetorOrdenado[meio]) {
                fim = meio-1;
            }
            else {
                inicio = meio+1;
            }
    }

    return -1;
}

int main()
{
    int vetorOrdenado[tamanhoVetor]; //tamanho de 1 milhao nao roda no meu pc, stack nao aguenta
    int i = 0;
    int valor = 0;

    for(i; i<tamanhoVetor; i++) {
        vetorOrdenado[i] = i+1;
    }

    printf("Digite o valor que deseja pesquisar:\n");
    scanf("%d", &valor);

    int resultado = buscaBinaria(vetorOrdenado, valor);

    if (resultado == -1) {
        printf("Valor nao encontrado\n");
    }
    else {
        printf("Valor %d encontrado na posicao %d\n", valor, resultado);
    }

    return 0;
}
