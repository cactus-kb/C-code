#define _CRT_SECURE_NO_WARNINGS 1
#include<stdio.h>
#include<windows.h>

//#define PI 3
//int main()
//{
//	int x, y;
//	for (x = 0, y = 0; x < 2 && y < 5; ++x, ++y);
//	{
//		printf("hehe\n");
//	}
//	system("pause");
//	return 0;
//}

	/*int i = 1;
	while (i <= 10)
	{
		i++;
		if (i == 5)
			continue;
			printf("%d ", i);
			
	}*/
	/*int i;
	for (i = 1; i <= 10; i++)
	{
		printf("%d ", i);
	}*/
	//int r = 2,sum;
	//sum = PI * r * r;
	//printf("%d\n", sum);
	//stu3 = {"zhangsan",20,"123456"};
	//int arr[10] = { 1,2,3,4,5 };
	// arr = {9,8,7,6,5,4,3,2}; error
	//struct Student stu1 = {"zhangsan",20,"123456"};
	//struct Student stu2 = {"guanyu",18,"110"};
	//stu2.age = 99;
	////stu2.name = "zhangfei";
	//strcpy(stu2.name,"zhangfei");

	/*printf("%d\n",sizeof(char *));*///4
	//printf("%d\n",sizeof(short *));//4
	//printf("%d\n",sizeof(int *));//4
	//printf("%d\n",sizeof(float *));//4
	//printf("%d\n",sizeof(long *));//4
	//printf("%d\n",sizeof(long long *));//4
	//printf("%d\n",sizeof(double *));//4
	/*int a = 10;
	int *p = &a;
	*p = 99;
	printf("%d\n",*p);*/

	/*char ch = 'g';
	char *pc = &ch;

	short sh = 19;
	short *psh = &sh;*/

	//int *p2 = (int *)&ch;
	
#if(0)
int main()
{
	int i;
	int j;
	for (i = 1; i <= 9; i++)//i控制行数，j控制列数
	{
		for (j = 1; j <= i; j++)
		{
			printf("%d * %d\t ", j, i, j*i);
			if (i == j)
			printf("\n");

		}

	}
	system("pause");
	return 0;
}


int main()
{
		int input = 0;
		scanf("%d", &input);
		//double input = 1.0f;
		switch (input)
		{
		default:
			printf("您的输入有误\n");
			break;
		case 1:
			printf("1\n");
			break;
		case 2:
			printf("2\n");
			break;

		}
	system("pause");
	return 0;
}

//编写程序数一下1到 100 的所有整数中出现多少个数字9。 
int main()
{
	int i;
	int count = 0;
	for (i = 1; i <= 100; i++)
	{
		if (i % 10 == 9)//9,19,29,39,49,59,69,79,89,
		{
			count ++;
		}
		if (i/10 == 9)//90,91,92,93,94,95,96,97,98,99
		{
			count++;
		}
	}
	printf("count=%d\n", count);
	system("pause");
	return 0;
}

//计算1/1-1/2+1/3-1/4+1/5 …… + 1/99 - 1/100 的值。 
int main()
{
	int y = 1;
	float x = 2, sum = 1,t;
	while (x <= 100)
	{
		y = -y;
		t = y / x;
		sum = sum + t;
		x = x + 1;
	}
	printf("sum=%f\n",sum);
	system("pause");
	return 0;
}

//将数组A中的内容和数组B中的内容进行交换。数组一样大）
int main()
{
	int arr1[] = { 1, 5, 8 }, arr2[] = { 2, 9, 6 }, i, t;
	printf("arr1=");
	for (i = 0; i < 3; i++)
	{
		printf("%d ", arr1[i]);
	}
	printf("\n");
	printf("arr2=");
	for (i = 0; i < 3; i++)
	{
		printf("%d ", arr2[i]);
	}
	printf("\n");
	for (i = 0; i < 3; i++)
	{
		t = arr1[i];
		arr1[i] = arr2[i];
		arr2[i] = t;
	}
	printf("new arr1=");
	for (i = 0; i < 3; i++)
	{
		printf("%d ", arr1[i]);
	}
	printf("\n");
	printf("new arr2=");
	for (i = 0; i < 3; i++)
	{
		printf("%d ", arr2[i]);
	}
	printf("\n");
	system("pause");
	return 0;
}
#endif