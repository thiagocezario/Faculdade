#include <stdio.h>
#define MAX_VETOR 5

typedef struct Vetor {
    int dados[MAX_VETOR];
    int inicio, fim;
} Tipo_Lista;

int insere_inicio_lista(Tipo_Lista *v, int dado)
{
    int posicao = (v->fim);

    if(posicao < MAX_VETOR){
        
        if(posicao > 0){
            for (; posicao > 0; posicao--){
                v->dados[posicao] = v->dados[posicao - 1];
            }
        }
        
        v->dados[posicao] = dado;

        v->inicio = 0;

        (v->fim)++;
        
        return 1;
    } 

    return 0;
}

int insere_ordenada(Tipo_Lista *v, int posicao, int dado)
{
	int final = (v->fim);

    if(final < MAX_VETOR){

        if(posicao < final){

            for (; final > posicao; final--){
                v->dados[final] = v->dados[final - 1];
            }

            v->dados[posicao] = dado;

            (v->fim)++;
        }else{

            v->dados[posicao] = dado;
        	
        	v->fim = posicao + 1;
        }

        return 1;
    }

    return 0;
}

int exclui_inicio_lista(Tipo_Lista *v, int *dado)
{
    if((v->inicio) > -1){

        *dado = v->dados[0];

        for (int i = 0; i < (v->fim) - 1; i++){
            v->dados[i] = v->dados[i + 1];
        }

        v->dados[(v->fim) - 1] = '\0';

        (v->fim)--;

        if((v->fim) == 0){
        	v->inicio = -1;
        }
        
        return 1;
    } 

    return 0;
}

int exclui_fim_lista(Tipo_Lista *v, int *dado)
{
    if((v->fim) > 0){
   
        *dado = v->dados[(v->fim) - 1];

        v->dados[(v->fim) - 1] = '\0';
        
        (v->fim)--;

        if((v->fim) == 0){
        	v->inicio = -1;
        }
        
        return 1;
    } 

    return 0;
}

int insere_fim_lista(Tipo_Lista *v, int dado){
    if(v->fim < MAX_VETOR){
        v->dados[v->fim] = dado;
        (v->fim)++;
        return 1;
    }
    return 0;
}

int exclui_elem_lista(Tipo_Lista *v, int indice){
    int i, dado;
    if(v->fim != 0){/*verifica se a lista esta vazia*/
        if((indice >=0) && (indice < v->fim)){//verifica se o indice esta correto
            if(indice == 0){//verifica se exclui o primeiro elemento
                if(exclui_inicio_lista(v, &dado)==1)
                    printf("\nO elemento excluido da posicao %d foi: %d", indice, dado);
                return 1;
            }
            else{
                if(indice == v->fim-1){//verifica se exclui o ultimo elemento
                    if(exclui_fim_lista(v, &dado)==1)
                        printf("\nO elemento excluido da posicao %d foi: %d", indice, dado);
                    return 1;
                }
                else{
                    dado = v->dados[indice];
                    for(i=indice; i < v->fim; i++)
                        v->dados[i] = v->dados[i+1];
                    (v->fim)--;
                    printf("\nO elemento excluido da posicao %d foi: %d", indice, dado);
                    return 1;
                }
            }
        }
        return -1;
    }
    return 0;
}

int busca_lista(Tipo_Lista v, int dado, int *indice){
    int i, achou = 0;
    for(i=0; i < v.fim-1; i++){
        if(v.dados[i] == dado){
            *indice = i;
            achou = 1;
            break;
        }
    }
    if(achou)
        return 1;
    return 0;
}

int imprime_lista(Tipo_Lista V){
    int i;
    printf("\nLista");
    if(V.fim != 0){
        for(i=0; i < V.fim; i++)
            printf("\n%d", V.dados[i]);
        return 1;
    }
    return 0;
}

int main()
{
	int operacao, dado, posicao, resposta, loop = 1;
	Tipo_Lista lista;

	lista.inicio = -1;
	lista.fim = 0;

	printf ("\nPrograma Iniciado");

    while (loop) {

	    printf ("\n\n==============================\n");
	    printf ("1 - Inserir no inicio\n2 - Inserir de forma ordenada\n3 - Exclui inicio\n4 - Excluir fim\n5 - Sair");
	    printf ("\n\nEscolha sua Operacao: ");
	    scanf ("%i", &operacao);

	    switch (operacao) {
	        case 1:
	            printf ("\nDigite um valor: ");
	            scanf("%i", &dado);
	            resposta = insere_inicio_lista(&lista, dado);
	            if(resposta) {
	            	printf ("\nOk! Dado inserido.");
	            }else{
	            	printf ("\nOps! A fila esta cheia.");
	            }
	            break;
	        case 2:
	            printf ("\nDigite a posicao: ");
	            scanf("%i", &posicao);
	            printf ("\nDigite um valor: ");
	            scanf("%i", &dado);
	            resposta = insere_ordenada(&lista, posicao, dado);
	            if(resposta) {
	            	printf ("\nOk! Dado inserido.");
	            }else{
	            	printf ("\nOps! A fila esta cheia.");
	            }
	            break;
	        case 3:
	            resposta = exclui_inicio_lista(&lista, &dado);
	            if(resposta) {
	            	printf ("\nOk! Dado [%d] deletado.", dado);
	            }else{
	            	printf ("\nOps! A lista esta vazia.");
	            }
	            break;
	        case 4:
	            resposta = exclui_fim_lista(&lista, &dado);
	            if(resposta) {
	            	printf ("\nOk! Dado [%d] deletado.", dado);
	            }else{
	            	printf ("\nOps! A lista esta vazia.");
	            }
	            break;
	        case 5:
	            printf ("\nPrograma Encerrado");
	        	loop = 0;
	        	break;
	    }

	    imprime_lista(lista);
	}

	printf ("\n\n");
}