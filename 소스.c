#include <stdio.h>
#include <stdlib.h>
#include <time.h> 

int main(void) {

	int p[10] = { 0,0,0,0,0,0,0,0,0,0 };
	int a;

	srand(time(NULL));

	for (int i = 0; i < 10; i++) {
		a = rand() % 10 + 1;
		p[i] = a;

		for (int j = 0; j < i; j++) {
			if (p[j] == a)
				i--;
		}
	}

	for (int i = 0; i < 10; i++) {
		printf("%d ", p[i]);
	}
}