#define _CRT_SECURE_NO_WARNINGS 1
#include<stdio.h>
#include<windows.h>
#include <stdlib.h>
#include<time.h>
#include<math.h>
//��Sn = a + aa + aaa + aaaa + aaaaa��ǰn��֮�ͣ�����a��һ�����֣�
//���磺2 + 22 + 222 + 2222 + 22222
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
//2.���0��999999֮������С�ˮ�ɻ������������ 
//��ˮ�ɻ�������ָһ����λ�������λ���ֵ�������ȷ�õ��ڸ�������
//�磻153��1 ^ 3��5 ^ 3��3 ^ 3 ? ����153��һ����ˮ�ɻ�������
//1234 = 1 ^ 4 + 2 ^ 4 + 3 ^ 4 + 4 ^ 4

int main()
{
	int i = 0;
	for (i = 0; i < 1000000; i++)
	{
		int count = 0;
		int tmp = i;
		int sum = 0;
		//���㼸λ��
		while (tmp)
		{
			count++;
			tmp = tmp / 10;
		}
		//����ÿλ���Ĵη���
		tmp = i;
		while (tmp)
		{
			sum += (int)pow(tmp % 10, count);
			tmp = tmp / 10;
		}
		//�Ƚ�
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

//��дһ�����򣬿���һֱ���ռ����ַ��� 
//�����Сд�ַ��������Ӧ�Ĵ�д�ַ���
//������յ��Ǵ�д�ַ����������Ӧ��Сд�ַ���
//��������ֲ������
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

//1.��ɲ�������Ϸ
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
	printf("��ʼ��Ϸ\n");
	while (1)
	{
		int num = 0;
		printf("���������µ�����:->");
		scanf("%d", &num);
		if(num == randnum)
		{
			printf("�¶��ˣ�\n");
			break;
		}
		else if(num > randnum)
		{
			printf("�´��ˣ�\n");
		}
		else if(num < randnum)
		{
			printf("��С�ˣ�\n");
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
		printf("������������:");
		scanf("%d",&input);
		switch (input)
		{
		case 1:
			game();
			break;
		case 0:
		    printf("�˳���Ϸ\n");
			break;
		default:
			printf("��������ȷ���֣�");
			break;
		}
	} while (input);
	system("pause");
	return 0;
}

//3.��д����ģ��������������ĳ���
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

//.д����������������������в�����Ҫ������,�ҵ��˷����±꣬�Ҳ������� - 1.���۰���ң�
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