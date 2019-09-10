#define _CRT_SECURE_NO_WARNINGS 1
#include<stdio.h>
#include<windows.h>

int main() {
	int a, b, c;
	int tmp;
	scanf("%d%d%d", &a, &b, &c);
	if (a < b) {
		tmp = a;
		a = b;
		b = tmp;
	}
	if (a < c) {
		tmp = a;
		a = c;
		c = tmp;
	}
	if (b < c) {
		tmp = b;
		b = c;
		c = tmp;
	}
	printf("%d,%d,%d",a,b,c);
	system("pause");
	return 0;
}



//int main() {
//	int arr[11] = { 1,4,2,3,6,5,8,9,7,20,10 };
//	int max = arr[0];
//	int i;
//	for (i = 1; i < 11; i++) {
//		if (arr[i] > max) {
//			max = arr[i];
//		}
//	}
//	printf("%d\n", max);
//	system("pause");
//	return 0;
//}


//int main() {
//	int a = 1;
//	int b = 2;
//	a = a + b;
//	b = a - b;
//	a = a - b;
//	printf("a= %d,b= %d\n", a, b);
//	system("pause");
//	return 0;
//}


//int main() {
//	int a = 1;
//	int b = 2;
//	int tmp;
//	tmp = a;
//	a = b;
//	b = tmp;
//	printf("a= %d,b= %d\n", a, b);
//	system("pause");
//	return 0;
//}


//int main() {
//	int year;
//	for (year = 1000; year <= 2000; year++) {
//		if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))) {
//			printf("%d\n", year);
//		}
//	}
//	system("pause");
//	return 0;
//}


//int main() {
//	int i;
//	int j;
//	for (i = 1; i < 10; i++) {
//		for (j = 1; j <= i; j++) {
//			printf("%d * %d ", j, i, j*i);
//			if (i == j) {
//			   printf("\n");
//		    }
//		}
//	}
//	system("pause");
//	return 0;
//}


//int main() {
//	int i;
//	int j;
//	for (i = 100; i <= 200; i++) {
//		for (j = 2; j < i; j++) {
//			if (i % j == 0) {
//				break;
//			}
//		}
//		if (i == j) {
//			printf("%d\n", i);
//		}
//	}
//	system("pause");
//	return 0;
//}



