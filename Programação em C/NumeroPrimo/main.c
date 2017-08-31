#include <stdio.h>

int main()
{
    /*int n = 1;			// numero a ser lido e testado 
    int d = 2;				//candidato a divisor 
    int EhPrimo = 1;			// para indicar se o numero dado n 'e primo ou nao    
	// Convencao: EhPrimo = 1 se o numero dado 'e primo 
	// EhPrimo = 0 se o numero dado nao 'e primo       
	for(n = 1; n <= 100; n++)
	{
		EhPrimo = 1;
		if (n <= 1){
			EhPrimo = 0;	
		}
		while (EhPrimo == 1 && d <= n / 2) {
			if (n % d  == 0)
	    		EhPrimo = 0;
			d = d + 1;
		}
		if (EhPrimo == 1)
		printf("%d eh primo \n", n);
		
    	else
		printf("%d nao eh primo \n", n);
    }    
    return 0; */
    
    int n = 1;
    int d = 2;
    int EhPrimo = 1;
    
    for(n = 1; n <= 100; n++)
	{
    	EhPrimo = 1;
		d = 2;
		if(n <= 1)
		{
			EhPrimo = 0;
		}
		
		while(EhPrimo == 1 && d <= n/2)
		{
			if(n % d == 0)
			{
				EhPrimo = 0;
			}
			d += 1;
		}
		if(EhPrimo == 0){
			printf("%d nao eh primo \n", n);	
		}
		if(EhPrimo == 1){
			printf("%d eh primo \n", n);
		}
		
	}
}

