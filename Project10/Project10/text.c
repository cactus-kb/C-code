#define _CRT_SECURE_NO_WARNINGS 1
#include<stdio.h>
#include<windows.h>
#include<string.h>
#if 0
//调整数组使奇数全部都位于偶数前面。 
void Fun(int arr[], int len) {
	int left = 0;
	int right = len - 1;
	while (left < right) {
		while ((left < right) && (arr[left] % 2) != 0) {
			left++;
		}
		while ((left < right) && (arr[right] % 2) == 0) {
			right--;
		}
		if (left < right) {
			int tmp = arr[left];
			arr[left] = arr[right];
			arr[right] = tmp;
		}
	}
}
	
int main() {
	int i = 0;
	int arr[] = {5,4,3,2,6,7,3,8};
	int len = sizeof(arr) / sizeof(arr[0]);
	Fun(arr,len);
	for (i = 0; i < len; i++) {
		printf("%d ", arr[i]);
	}
	system("pause");
	return 0;
   
}


//杨氏矩阵
void Fun1(int arr[3][3], int row, int col, int k) {
	int x = 0;
	int y = col - 1;
	while ((x <= 2) && (y >= 0)) {

	    if (arr[x][y] == k) {
		printf("find!:%d %d \n", x, y);
		break;
		}
		else if (arr[x][y] < k) {
			y++;
		}
		else {
			x--;
		}
		if ((x > 2) || (y < 0)) {
			printf("not find!\n");
		}
	}
}
int main() {
	int arr[3][3] = { 1,2,3,2,3,4,3,4,5 };
	int i = 0;
int k = 16;
Fun1(arr, 3, 3, 16);
system("pause");
return 0;
}


//1.实现一个函数，可以左旋字符串中的k个字符。
//ABCD左旋一个字符得到BCDA
//ABCD左旋两个字符得到CDAB
void reverse(char* left, char* right) {
	while (left < right) {
		char tmp = *left;
		*left = *right;
		*right = tmp;
		left++;
		right--;
	}
}
void move(char* p, int k) {
	int len = strlen(p);
	reverse(p, p + k - 1);
	reverse(p + k, p + len - 1);
	reverse(p, p + len - 1);
}
int main() {
	char arr[] = "ABCDE";
	move(arr, 2);
	printf("%s ", arr);
	system("pause");
	return 0;
}


////判断一个字符串是否为另外一个字符串旋转之后的字符串。 
//例如：给定s1 = AABCD和s2 = BCDAA，返回1，给定s1 = abcd和s2 = ACBD，返回0.
//AABCD左旋一个字符得到ABCDA
//AABCD左旋两个字符得到BCDAA
//AABCD右旋一个字符得到DAABC
void reverse(char* left, char* right) {
	char tmp = *left;
	*left = *right;
	*right = tmp;
	left++;
	right--;
}
void move(char* p, int k) {
	int len = strlen(p);
	reverse(p, p + k - 1);//旋转想要旋转的字符
	reverse(p + k, p + len - 1);//旋转剩余的字符
	reverse(p, p + len - 1);//将所有的字符全部旋转
}
int fun(char* s1, char* s2) {
	if (strlen(s1) != strlen(s2)) {
		return 0;
	}
	if (!(strcmp(s1, s2))) {
		return 1;
	}
	int k = strlen(s1);
	k--;
	while (k--) {
		move(s2, 1);
		if (!(strcmp(s1, s2))) {
			return 1;
		}
	}
	return 0;
}


int main() {
	char arr[] = "abc";
	char arr1[] = "abcd";
	printf("%d\n", fun(arr, arr1));
	system("pause");
	return 0;
}
#endif




