#define _CRT_SECURE_NO_WARNINGS 1
#include<stdio.h>
#include<windows.h>
#include<string.h>
#include<assert.h>
#include<stdlib.h>
#if 0
/*һ��������ֻ�����������ǳ���һ�Σ� 
�����������ֶ����������Ρ�
�ҳ����������֣����ʵ�֡�
*/
void find(int arr[], int len) {
	int i = 0;
	int j = 0;
	int flag = 0;
	for (i = 0; i < len; i++) {
		flag = 0;
		for (j = 0; j < len; j++) {
			if (arr[i] == arr[j] && i != j) {
				flag = 1;
			}
		}
		if (0 == flag) {
			printf("%d ", arr[i]);
		}
	}
}
int main() {
	int arr[] = { 1,3,6,1,5,3,6,7 };
	int len = sizeof(arr) / sizeof(arr[0]);
	find(arr, len);
	system("pause");
	return 0;
}
/*����ˮ��1ƿ��ˮ1Ԫ��2����ƿ���Ի�һƿ��ˮ��
��20Ԫ�����Զ�����ˮ��
���ʵ��*/
void fun(int x, int y) {
	x = y;
	x = x / 2 + x;
	printf("%d\n", x);
}
int main() {
	int m = 20;
	int n = 0;
	fun(n, m);
	system("pause");
	return 0;
}


//ģ��ʵ��strcpy 
char* strcpy(char* dest, const char* src) {
	char* ret = dest;
	assert((dest != NULL) && (src != NULL));
	while (*dest++ = *src++) {
		;
	}
	return ret;
}
int main() {
	char src[] = "hello";
	char dest[15];
	printf("%s\n", strcpy(dest, src));
	system("pause");
	return 0;
}
#endif
//ģ��ʵ��strcat
char* strcat(char* dest,  const char* src) {
	char* ret = dest;
	assert((dest != NULL) && (src != NULL));
	while (*dest) {
		dest++;
	}
	while (*dest++ = *src++) {
		;
	}
	return ret;
}
int main() {
	char dest[20] = "hello ";
	char* src = "world!";
	printf("%s\n", strcat(dest, src));
	system("pause");
	return 0;
}

