#define _CRT_SECURE_NO_WARNINGS 1
#include<stdio.h>
#include<windows.h>
//int main() {
//	int n = 2;
//	int m = 1;
//	int i;
//	int ret = 0;
//	int sum = 0;
//	for (i = 0; i <= m; i++) {
//		ret = 10 * ret + n;
//		sum = sum + ret;
//	}
//	printf("%d\n", sum);
//	system("pause");
//	return 0;
//}

//int main() {
//	int n = 20;
//	int i = 0;
//	int j = 0;
//	int k = 0;
//	for (i = 0; i <= n; i++) {
//		for (j = 0; j <= n - i; j++) {
//			printf(" ");
//		}
//		for (k = 0; k < 2 * i - 1; k++) {
//			printf("*");
//		}
//		printf("\n");
//	}
//	int a = 0;
//	int b;
//	int c;
//	for (a = 0; a <= n - 1; a++) {
//		for (b = 0; b <= a+1; b++) {
//			printf(" ");
//		}
//		for (c = 0; c < (2 * n) - 3 - (2 * a); c++) {
//			printf("*");
//		}
//		printf("\n");
//	}
//	system("pause");
//	return 0;
//}

//int main() {
//	int n;
//	int count = 0;
//	for (n = 1; n <= 100; n++) {
//		if (n % 10 == 9) {
//			count++;
//		}
//		if (n / 10 == 9) {
//			count++;
//		}
//	}
//	printf("%d\n", count);
//	system("pause");
//	return 0;
//}

//int main() {
//	int y = -1;
//	float x;
//	float ret;
//	float sum = 0;
//	for (x = 1; x <= 100; x++) {
//		y = -y;
//		ret = y / x;
//		sum = sum + ret;
//	}
//	printf("%f\n", sum);
//	system("pause");
//	return 0;
//}


//int main() {
//	int arr[3] = { 1,2,3 };
//	int arr1[3] = { 4,5,6 };
//	int i;
//	int t;
//	printf("arr= ");
//	for (i = 0; i < 3; i++) {
//		printf("%d ", arr[i]);
//	}
//	printf("\n");
//	printf("arr1= ");
//	for (i = 0; i < 3; i++) {
//		printf("%d ", arr1[i]);
//	}
//	printf("\n");
//	for (i = 0; i < 3; i++) {
//		t = arr[i];
//		arr[i] = arr1[i];
//		arr1[i] = t;
//	}
//	printf("new arr= ");
//	for (i = 0; i < 3; i++) {
//		printf("%d ", arr[i]);
//	}
//	printf("\n");
//	printf("new arr1= ");
//	for (i = 0; i < 3; i++) {
//		printf("%d ", arr1[i]);
//	}
//	printf("\n");
//	system("pause");
//	return 0;
//}
//


//int main() {
//	int a = 63;
//	int b = 54;
//	int c = 0;
//	while (a % b != 0) {
//		c = a % b;
//		a = b;
//		b = c;
//	}
//	printf("%d\n", b);
//	system("pause");
//	return 0;
//}