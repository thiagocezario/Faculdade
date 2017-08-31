#include <stdio.h>
#include <stdlib.h>

/* run this program using the console pauser or add your own getch, system("pause") or input loop */

/*int main(int argc, char *argv[]) {
	float a = 1.66666;
	sizeof(a);
	
	return a;
}*/

int main(int argc, char *argv[]) {
char x=126;
char x1 = x+1;
char x2 = x+2;
char x10 = x+10;
printf("x=%d x+1=%d x+2=%d x+10=%d\n",
x,x1,x2,x10);
printf("tamanho do int %d\n",sizeof(int));
return 0;
}
