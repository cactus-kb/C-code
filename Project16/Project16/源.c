#define _CRT_SECURE_NO_WARNINGS 1
#include<stdio.h>
#include<windows.h>
#include<string.h>
#include<time.h>
#include<math.h>
#if 0
int main() {
	char psw[] = "123456";
	int i;
	for (i = 0; i < 3; i++) {
		printf("please input:");
		scanf("%s", psw);
		if (strcmp(psw, "123456") == 0) {
			printf("password is right!\n");
			break;
		}
		else if (i == 3) {
			printf("exit\n");
		}
		else {
			printf("log in\n");
		}
	}
	system("pause");
	return 0;
}


int main() {
	int ch = 0;
	while ((ch = getchar()) != 0) {
		if (ch >= 'a' && ch <= 'z') {
			putchar(ch - 32);
		}
		else if (ch >= 'A' && ch <= 'Z') {
			putchar(ch + 32);
		}
		else if (ch >= '0' && ch <= '9') {
			;
		}
		else {
			putchar(ch);
		}
	}
	system("pause");
	return 0;
}


void Menu() {
	printf("----------MENU--------\n");
	printf("*********1.play*******\n");
	printf("*********0.exit*******\n");
	printf("----------------------\n");
}
void Game() {
	int randnum = rand() % 100 + 1;
	int input = 0;
	while (1) {
		printf("请输入您猜的数字：");
		scanf("%d", &input);
		if (randnum == input) {
			printf("猜对了！\n");
				break;
		}
		else if (randnum > input) {
			printf("猜小了！\n");
		}
		else if (randnum < input) {
			printf("猜大了！\n");
		}
	}
}
int main() {
	int num;
	srand((unsigned int)time(NULL));
	do {
		Menu();
		printf("游戏开始！\n");
		printf("请选择你的操作：");
		scanf("%d", &num);
		switch (num) {
		case 1:
			Game();
			break;
		case 0:
			printf("退出游戏！\n");
			break;
		default:
			printf("请输入正确数字：");
			break;
		}
	} while(num);
	system("pause");
	return 0;
}


int Fun(int arr[], int len, int k) {
	int left = 0;
	int right = len - 1;
	while (left < right) {
		int mid = (left + right) / 2;
		if(arr[mid] > k) {
			right = mid - 1;
		}
		else if (arr[mid] < k) {
			left = mid + 1;
		}
		else {
			return mid;
		}
	}
	return -1;
}
int main() {
	int arr[] = { 1,2,3,4,5,6,7,8,9 };
	int len = sizeof(arr) / sizeof(arr[0]);
	int ret = Fun(arr, len, 3);
	if (ret == -1) {
		printf("not found\n");
	}
	else {
		printf("%d\n",ret);
	}
	system("pause");
	return 0;
}

void Mul(int n) {
	int i;
	int j;
	for (i = 1; i <= n; i++) {
		for (j = 1; j <= i; j++) {
			printf(" %2d * %2d ",j,i,j * i);
			if (i == j) {
				printf("\n");
			}
		}
	}
}
int main() {
	int n = 12;
	Mul(n);
	system("pause");
	return 0;
}

void Change(int *a,int *b) {
	int c = 0;
	c = *a;
	*a = *b;
	*b = c;
}
int main() {
	int a = 1;
	int b = 2;
	printf("a= %d,b=%d\n", a, b);
	Change(&a,&b);
	printf("a= %d,b=%d\n", a, b);
	system("pause");
	return 0;
}


int Fun(int year) {
	if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))) {
		return 0;
		}
	return 1;
}
int main() {
	int year = 2000;
	int ret = Fun(year);
	if (ret == 0) {
		printf("是闰年！\n");
	}
	else{
		printf("不是闰年！\n");
	}
	system("pause");
	return 0;
}

int Prime(int n) {
	int i;
	int j = (int)sqrt(n);
	for (i = 2; i < j; i++) {
		if (n % i == 0) {
			return 0;
		}
	}
    return -1;
}
int main() {
	int n = 23;
	if (Prime(n) == 0) {
		printf("is not prime\n");
	}
	else {
		printf("is prime\n");
	}
	system("pause");
	return 0;
}
#endif

//void Init(int arr[],int len) {
//	int i;
//	for (i = 0; i < len; i++) {
//		arr[i] = i;
//		printf("%d", arr[i]);
//	}
//}
//void Empty(int arr[]) {
//	memset(arr, 0, 50);
//}
//void Reverse(int arr[],int len) {
//	int i;
//	for (i = 0; i < len; i++) {
//		int tmp;
//		tmp = arr[i];
//		arr[i] = arr[len - 1];
//		arr[len - 1] = tmp;
//	}
//}
//int main() {
//	int arr[] = { 6,7,8,9 };
//	int len = sizeof(arr) / sizeof(arr[0]);
//	Init(arr, len);
//	system("pause");
//	return 0;
//}
