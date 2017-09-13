#include <stdio.h>
#include <stdlib.h>


int main( void ) {
int x=5, y=-10;
printf("x=%d y=%d\n",x,y);

/* E07 swap binário*/
x ^= y;
printf("x = %d\n", x);
y ^= x;
printf("y = %d\n", y);
x ^= y;
printf("x = %d\n", x);


/* E06 Swap */
x += y;
printf("x = %d\n", x);
y = x - y;
printf("y = %d\n", y);
x = x - y;
printf("x = %d\n", x);

printf("x=%d y=%d\n",x,y);
}
