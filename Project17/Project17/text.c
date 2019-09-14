#define _CRT_SECURE_NO_WARNINGS 1
#include<stdio.h>
#include<windows.h>
#if 0
int main() {
	char str1[] = "hello world";
	char str2[] = "hello world";
	char *str3 = "hello world";
	char *str4 = "hello world";
	if (str1 == str2) {
		printf("str1 and str2 are same\n");
	}
	else {
		printf("str1 and str2 are not same\n");
	}
	if (str3 == str4) {
		printf("str3 and str4 are same\n");
	}
	else {
		printf("str3 and str4 are not same\n");
	}
	system("pause");
	return 0;
}

int main() {
	int arr[10] = {1};
	printf("%p\n", arr);
	printf("%p\n", &arr);
	printf("%p\n", arr + 1);
	printf("%p\n", &arr + 1);
	system("pause");
	return 0;
}

void print_arr1(int arr[3][5], int row, int col) {
	int i = 0;
	int j = 0;
	for (i = 0; i < row; i++) {
		for (j = 0; j < col; j++) {
			printf("%d ", arr[i][j]);
		}
		printf("\n");
	}
}
void print_arr2(int(*arr)[5], int row, int col) {
	int i = 0;
	int j = 0;
	for (i = 0; i < row; i++) {
		for (j = 0; j < col; j++) {
			printf("%d ",arr[i][j]);
		}
		printf("\n");
	}
}
int main() {
	int arr[3][5] = { 1,2,3,4,5,6,7,8,9,10 };
	print_arr1(arr, 3, 5);
	print_arr2(arr, 3, 5);
	system("pause");
	return 0;
}


void print(int *p, int len) {
	int i = 0;
	for (i = 0; i < len; i++) {
		printf("%d\n", *(p + i));
	}
}
int main() {
	int arr[10] = { 1,2,3,4,5,6,7,8,9,10 };
	int  *p = arr;
	int len = sizeof(arr) / sizeof(arr[0]);
	print(p, len);
	system("pause");
	return 0;
}


void test(int **ptr) {
	printf("num = %d\n", **ptr);
}
int main() {
	int n = 10;
	int *p = &n;
	int **pp = &p;
	test(pp);
	test(&p);
	system("pause");
	return 0;
}


void test() {
	printf("heheh\n");
}
int main() {
	printf("%p\n", test);
	printf("%p\n", &test);
	system("pause");
	return 0;
}

/*
int add(int a, int b) {
	return a + b;
}
int sub(int a, int b) {
	return a - b;
}
int mul(int a, int b) {
	return a * b;
}
int dvi(int a, int b) {
	return a / b;
}
int main() {
	int x;
	int y;
	int input = 0;
	int ret = 0;
	int(*p[5])(int x, int y) = { 0,add,sub,mul,dvi };
	while (input) {
		printf("*****************************\n");
		printf("1:add               2:sub    \n");
		printf("3:mul               4:div    \n");
		printf("*****************************\n");
		printf("请选择：");
		scanf("%d", &input);
		if (input <= 4 && input >= 1) {
			printf("输入操作数：");
			scanf("%d %d", &x, &y);
			ret = (*p[input])(x, y);
		}
		else {
			printf("输入有误\n");
			printf("ret = %d\n", ret);
		}
	}
	system("pause");
	return 0;
}*/


int int_cmp(const void *p1, const void *p2) {
	return(*(int *)p1 > *(int *)p2);
}
int main() {
	int arr[] = { 0,1,2,3,4,5,6,7,8,9 };
	int i = 0;
	qsort(arr, sizeof(arr) / sizeof(arr[0]), sizeof(int), int_cmp);
	for (i = 0; i < sizeof(arr) / sizeof(arr[0]); i++) {
		printf("%d", arr[i]);
	}
	printf("\n");
	system("pause");
	return 0;
}
#endif

int int_cmp(const void *p1, const void *p2) {
	return (*(int *)p1 > *(int *)p2);
}
void _swap(void *p1, void *p2, int size) {
	int i = 0;
	for (i = 0; i < size; i++) {
		char tmp = *((char *)p1 + i);
		*((char *)p1 + i) = *((char *)p2 + i);
		*((char *)p2 + i) = tmp;
	}
}
void bubble(void *base, int count, int size, int(*cmp)(void *, void *)) {
	int i = 0;
	int j = 0;
	for (i = 0; i < count - 1; i++) {
		for (j = 0; j < count - i - 1; j++) {
			if (cmp((char*)base + j * size, (char*)base + (j + 1)*size) > 0) {
				_swap((char*)base + j * size, (char*)base + (j + 1)*size, size);
			}
		}
	}

}
int main() {
	int arr[] = { 1,3,5,7,9,2,4,6,8,0 };
	int i = 0;
	bubble(arr, sizeof(arr) / sizeof(arr[0]), sizeof(int), int_cmp);
	for (i = 0; i < sizeof(arr) / sizeof(arr[0]); i++) {
		printf("%d", arr[i]);
	}
	system("pause");
	return 0;
}