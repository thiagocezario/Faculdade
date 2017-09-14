#include <stdio.h>
#include <stdlib.h>
#include <math.h>

/* run this program using the console pauser or add your own getch, system("pause") or input loop */

int main(int argc, char *argv[]) {
	float a, b, c;
	float x1, x2, delta;
	
	printf("Entre com os coeficientes de a, b e c: ");
	scanf("%f %f %f", &a, &b, &c);
	
	printf("%.0fx^2 + %.0fx + %.0f\n", a, b, c);
	
	delta = b*b-4*a*c;
	
	if(delta == 0){
		x1 = -b/(2*a);
		printf("x1 = x2 = %f\n", x1);
	}
	if(delta > 0){
		x1 = (-b + sqrt(delta))/(2*a);
		x2 = (-b - sqrt(delta))/(2*a);
		printf("x1 = %.2f\nx2= %.2f\n", x1, x2);
	}
	if(delta < 0){
		delta *= -1;
		printf("x1 = (-%.0f + %.0fv-1)/(2*%.0f)\n", b, delta, a);
		printf("x2 = (-%.0f - %.0fv-1)/(2*%.0f)\n", b, delta, a);
	}
	return 0;
}
