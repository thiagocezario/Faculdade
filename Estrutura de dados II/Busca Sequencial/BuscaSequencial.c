#include <stdio.h>
#include <stdlib.h>

int main()
{
    int vetorOrdenado[100000]; //tamanho de 1 milhao nao roda no meu pc, stack nao aguenta
    int i = 0;
    int valor = 0;

    for(i; i<100000; i++) {
        vetorOrdenado[i] = i+1;
    }

    printf("Digite o valor que deseja pesquisar:\n");
    scanf("%d", &valor);

    i=0;
    int tamanhoVetor = sizeof(vetorOrdenado)/sizeof(int);
    int resultado = -1;
    for(i; i<tamanhoVetor; i++) {
        if(vetorOrdenado[i] == valor) {
            resultado = i;
            break;
        }
    }

    if (resultado == -1) {
        printf("Valor nao encontrado\n");
    }
    else {
        printf("Valor %d encontrado na posicao %d\n", valor, resultado);
    }

    return 0;
}
