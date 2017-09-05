#include <stdio.h>
#include <stdlib.h>

/* run this program using the console pauser or add your own getch, system("pause") or input loop */

int main(int argc, char *argv[]) {
	char a[] = "aaa";
	char b[] = "bbb";
	int i = 0;
	/*for(i = 0; i < 10; i++){
		a[i] = "a";
	}
	
	for(i = 0; i < 10; i++){
		b[i] = "b";
	}*/
	
	printf("%s\n", a);
	printf("%s\n", b);
	
	&a = &b;
	printf("%s\n", a);
	printf("%s\n", b);
	return 0;
}
