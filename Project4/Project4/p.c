#define _CRT_SECURE_NO_WARNINGS 1
#include<stdio.h>
#include<windows.h>
#include <stdlib.h>
#include<time.h>
#include<math.h>
//求Sn = a + aa + aaa + aaaa + aaaaa的前n项之和，其中a是一个数字，
//例如：2 + 22 + 222 + 2222 + 22222
int main()
{
	int i ;
	int a; 
	int Sn = 0;
    int sum = 0;
	scanf("%d", &a);
	for (i = 0; i < 5; i++)
	{
		sum = sum * 10 + a;
		Sn = Sn + sum;
	}
	printf("%d\n", Sn);
	system("pause");
	return 0;
}

#if 0
//2.求出0～999999之间的所有“水仙花数”并输出。 
//“水仙花数”是指一个三位数，其各位数字的立方和确好等于该数本身，
//如；153＝1 ^ 3＋5 ^ 3＋3 ^ 3 ? ，则153是一个“水仙花数”。
//1234 = 1 ^ 4 + 2 ^ 4 + 3 ^ 4 + 4 ^ 4

int main()
{
	int i = 0;
	for (i = 0; i < 1000000; i++)
	{
		int count = 0;
		int tmp = i;
		int sum = 0;
		//计算几位数
		while (tmp)
		{
			count++;
			tmp = tmp / 10;
		}
		//计算每位数的次方和
		tmp = i;
		while (tmp)
		{
			sum += (int)pow(tmp % 10, count);
			tmp = tmp / 10;
		}
		//比较
		if (i == sum)
		{
			printf("%d ", i);
		}
	}
		system("pause");
		return 0;
	
}


int main()
{
	int i = 0, j = 0, k = 0;
	for (i = 0; i <= 7; i++)
	{
		for (j = 0; j <= 7 - i ; j++)
			printf(" ");
		for (k = 0; k < 2 * i - 1; k++)
			printf("*");
		printf("\n");
	}
	int a = 0, b = 0, c = 0;
	for (a = 1; a <= 7; a++)
	{
		for (b = 0; b <= a ; b++)
			printf(" ");
		for (c = 0; c < 13 - 2 * a; c++)
			printf("*");
		printf("\n");
	}
	system("pause");
	return 0;
}

//编写一个程序，可以一直接收键盘字符， 
//如果是小写字符就输出对应的大写字符，
//如果接收的是大写字符，就输出对应的小写字符，
//如果是数字不输出。
//123ABCD45efG == > abcdEFg
int main()
{
	int ch = 0;
	while ((ch = getchar()) != EOF)
	{
		if (ch >= 'a' && ch <= 'z')
		{
			putchar(ch - 32);
		}
		else if (ch >= 'A' && ch <= 'Z')
		{
			putchar(ch + 32);
		}
		else if (ch >= '0' && ch <= '9')
		{
			;
		}
		else
		{
			putchar(ch);
		}
	}
	system("pause");
	return 0;
}

//1.完成猜数字游戏
void Menu()
{
	printf("******Menu******\n");
	printf("*****1.play*****\n");
	printf("*****0.exit*****\n");
	printf("****************\n");
}
void game()
{
	int randnum = rand() % 100 + 1;
	printf("开始游戏\n");
	while (1)
	{
		int num = 0;
		printf("请输入您猜的数字:->");
		scanf("%d", &num);
		if(num == randnum)
		{
			printf("猜对了！\n");
			break;
		}
		else if(num > randnum)
		{
			printf("猜大了！\n");
		}
		else if(num < randnum)
		{
			printf("猜小了！\n");
		}
	}
}
int main()
{
	int input = 0;
	srand((unsigned int)time(NULL));
	do 
	{
		Menu();
		printf("请输入操作序号:");
		scanf("%d",&input);
		switch (input)
		{
		case 1:
			game();
			break;
		case 0:
		    printf("退出游戏\n");
			break;
		default:
			printf("请输入正确数字：");
			break;
		}
	} while (input);
	system("pause");
	return 0;
}

//3.编写代码模拟三次密码输入的场景
int main()
{
	char psw[10] = "123456";
	int i = 0;
	int j = 0;
	for (i = 0; i < 3; ++i)
	{
		printf("please input:");
		scanf("%s", psw);
		if (strcmp(psw, "password") == 0)
		{
			break;
		}
		if (i == 3)
		{
			printf("exit\n");
		}
		else
		{
			printf("log in\n");
		}
	}
	system("pause");
	return 0;
}

int main()
{
	char str1[] = "welcome to china";
	char str2[] = "****************";
	int left = 0;
	int right = strlen(str1) - 1;
	printf("%s\n", str2);
	while (left <= right)
	{
		str2[left] = str1[left];
		str2[right] = str1[right];
		left++;
		right--;
		printf("%s\n", str2);
	}
	system("pause");
	return 0;
}

//.写代码可以在整型有序数组中查找想要的数字,找到了返回下标，找不到返回 - 1.（折半查找）
int binarySearch(int arr[], int len, int key)
{
	int left = 0;
	int right = len - 1;
	while (left <= right)
	{
		int mid = (left + right) / 2;
		if (arr[mid] > key)
		{
			right = mid - 1;
		}
		else if (arr[mid] < key)
		{
			left = mid + 1;
		}
		else
		{
			return mid;
		}
	}
	return -1;
}
	int main()
	{
		int arr[10] = { 1,2,3,4,5,6,7,8,9,10 };
		int len = sizeof(arr) / sizeof(arr[0]);
		int ret = binarySearch(arr,len,5);
		if (ret == -1)
		{
			printf("not found\n");
		}
		else
		{
			printf("%d\n",ret);
		}
		system("pause");
		return 0;
	}


int main()
{
	int n = 4;
	int i = 0;
	int ret = 1;
	int sum = 0;
	for (i = 1; i <= n; i++)
	{
		ret = ret * i;
		sum = sum + ret;
	}
	printf("%d\n", sum);
	system("pause");
	return 0;
}
#endif