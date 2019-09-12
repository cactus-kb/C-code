#define _CRT_SECURE_NO_WARNINGS 1
#include<stdio.h>
#include<windows.h>
#include<math.h>
#include<time.h>
#if 0
int main() {
	int n = 7;
	int i;
	int j;
	int a;
	int b;
	for (i = 0; i <= n; i++) {
		for (j = 0; j < 2 * i - 1; j++) {
			printf("*");
		}
		printf("\n");
	}
	for (a = 0; a <= n; a++) {
		for (b = 0; b < 2 * n -1-(2 * (a - 1)); b++) {
			printf("*");
		}
		printf("\n");
	}
	system("pause");
	return 0;
}


int main() {
	int n = 100000000;
	int i;
	for (i = 0; i <= n; i++) {
		int count = 0;
		int tmp = i;
		double sum = 0;
		while (tmp ) {
			count++;
			tmp = tmp / 10;
		}
		tmp = i;
		while (tmp) {
			sum = sum + pow(tmp % 10, count);
			tmp = tmp / 10;
		}
		if (i == sum) {
			printf("%d ", i);
		}
	}
	system("pause");
	return 0;
}


void Menu() {
	printf("***********MENU**********\n");
	printf("**********1.play*********\n");
	printf("**********0.exit*********\n");
	printf("*************************\n");
}
void Game() {
	int randnum = rand() % 100 + 1;
	printf("游戏开始！\n");
	while (1) {
		int num = 0 ;
		printf("请输入您猜的数字： ");
		scanf("%d", &num);
		if (randnum == num) {
			printf("猜对了！\n");
			break;
		}
		else if (randnum < num) {
			printf("猜大了！\n");
		}
		else if (randnum > num) {
			printf("猜小了！\n");
		}
	}
}
int main() {
	int input = 0;
    srand((unsigned int)time(NULL));
	do {
		Menu();
		printf("请输入您的选择：");
		scanf("%d", &input);
		switch (input) {
		case 1:
			Game();
			break;
		case 0:
			printf("退出游戏！\n");
			break;
		default:
			printf("请输入正确的数字： ");
			break;
		}
	} while (input);
	system("pause");
	return 0;
}


int Func(int arr[],int k,int len) {
	int left = 0;
	int right = len - 1;
	while (left <= right) {
		int mid = (left + right) / 2;
		if (arr[mid] > k) {
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
	int ret = Func(arr, 7,len);
	if (ret == -1) {
		printf("not find!\n");
	}
	else {
		printf("%d\n", ret);
	}
	system("pause");
	return 0;
}
#endif
void Menu() {
	printf("---------  MENU  ---------\n");
	printf("********* 1.PLAY *********\n");
	printf("********* 0.EXIT *********\n");
	printf("--------------------------\n");
}
void Game() {
	int randnum = rand() % 100 + 1;
	int num = 0;
	printf("**游戏开始啦!**\n");
	while (1) {
		printf("请输入您猜的数字：");
		scanf("%d", &num);
		if (randnum == num) {
			printf("恭喜你猜对了！\n");
			break;
		}
		else if (randnum > num) {
			printf("猜小了哦！\n");
		}
		else if(randnum < num) {
			printf("猜大了呢！\n");
		}
	}
}
int main() {
	int input = 0;
	srand((unsigned int) time(NULL));
	do {
		Menu();
		printf("请选择您的操作：");
		scanf("%d", &input);
		switch (input) {
		case 1:
			Game();
			break;
		case 0:
			printf("退出游戏！\n");
			break;
		default:
			printf("请输入正确的数字哦：\n");
			break;
		}
	} while (input);
	system("pause");
	return 0;
}


