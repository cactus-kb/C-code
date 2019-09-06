#define _CRT_SECURE_NO_WARNINGS 1
#include"game.h"
#if 0
void menu()
{
	printf("*******Menu********\n");
	printf("******1.play*******\n");
	printf("******0.exit*******\n");
	printf("*******************\n");
}
void game()
{
	//存放雷 1代表雷
	char mine[ROWS][COLS] = { 0 };
	//排查雷 *
	char mineInfo[ROWS][COLS] = { 0 };

	InitBoard(mine, ROWS, COLS, '0');
	InitBoard(mineInfo, ROWS, COLS, '*');
	ShowBoard(mineInfo, ROW, COL);
	SetMine(mine, ROW, COL);
	FindMine(mine, mineInfo, ROW, COL);
}
int main()
{
	int input = 0;
	srand((unsigned int)time(NULL));
	do
	{
		menu();
		printf("请输入你的选择->");
		scanf("%d", &input);
		switch (input)
		{
		case 1:
			game();
				break;
		case 0:
			printf("退出游戏\n");
			break;
		default:
			printf("请输入正确的数字\n");
			break;
		}
	} while (input);
	system("pause");
	return 0;
}
#endif

#if 0
int check()
{
	int i = 1;
	return (*(char *)&i);
}
int main()
{
	int ret = check();
	if (ret == 1)
	{
		printf("小端\n");
	}
	else
	{
		printf("大端\n");
	}
	system("pause");
	return 0;
}

int check()
{
	union
	{
		int i;
		char c;
	}un;
	un.i = 1;
	return un.c;
}
int main()
{
	int ret = check();
	if (ret == 1)
	{
		printf("xiaoduan\n");
	}
	else
	{
		printf("dadaun\n");
	}
	system("pause");
	return 0;
}


int main()
{
	char a = -1;
	signed char b = -1;
	unsigned char c = -1;
	printf("%d\n%d\n%d\n", a, b, c);
	system("pause");
	return 0;
}


int main()
{
	int a = 5;
	int b = 4;
	double c = a * b;
	printf("%d\n", a);
	system("pause");
	return 0;
}
#endif
int main()
{
	char a[1000];
	int i;
	for (i = 0; i < 1000; i++)
	{
		a[i] = -1 - i;//-1....-127,0....128
	}
	printf("%d", strlen(a));
	system("pause");
	return 0;
}
switch ()
{
case 1:
	break;
case 2:
	break;
default:
	braek;

}
