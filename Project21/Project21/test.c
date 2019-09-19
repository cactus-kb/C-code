#define _CRT_SECURE_NO_WARNINGS 1
#include<stdio.h>
#include<windows.h>
int main() {
	int i;
	//int j;
	int ret = 1;
	int sum = 0;
	for (i = 1; i <= 5; i++) {
		ret = ret * i;
		//for (j = 1; j <= i; j++) {
			//ret = ret * j;
			//sum = sum + ret;
		//}
		sum = sum + ret;
	}
	printf("%d\n", sum);
	system("pause");
	return 0;
}