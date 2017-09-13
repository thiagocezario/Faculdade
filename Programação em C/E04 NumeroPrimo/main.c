#include <stdio.h>

int main()
{
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

