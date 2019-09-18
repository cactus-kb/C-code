#define _CRT_SECURE_NO_WARNINGS 1
#include<stdio.h>
#include<windows.h>
int main() {
	int a = 10;
	int b = 20;
	if (a > b) {
		printf("%d\n", a);
	}
	else {
		printf("%d\n", b);
	}
	system("pause");
	return 0;
}