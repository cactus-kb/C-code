#define _CRT_SECURE_NO_WARNINGS 1
#include<stdio.h>
#include<windows.h>
#include<assert.h>
#if 0
 int my_strlen(const char *str) {
	int count = 0;
	while (*str) {
		count++;
		str++;
	}
	return count;
}
int my_strlen1(const char *str) {
	if (*str == '\0') {
		return 0;
	}
	else {
		return 1 + my_strlen1(str + 1);
	}
}
int my_strlen3(char *s) {
	char *p = s;
	while (*p != '\0') {
		p++;
	}
	return p - s;
}
int main() {
	char *arr="abcd";
	int ret = my_strlen3(arr);
	printf("%d\n", ret);
	system("pause");
	return 0;
}

char *my_strcpy(char *dest, const char *src) {
	char *ret = dest;
	assert(dest != NULL);
	assert(src != NULL);
	while (*dest++ = *src++) {
		;
	}
	return ret;
}

int main() {
	char arr[] = "abcd";
	char arr1[] = "hed";
	printf("%s\n",my_strcpy(arr, arr1));
	system("pause");
	return 0;
}


char *my_strcat(char *dest, const char *src) {
	char *ret = dest;
	assert(dest != NULL);
	assert(src != NULL);
	while (*dest) {
		dest++;
	}
	while (*dest++ = *src++) {
		;
	}
	return ret;
}
int main() {
	char arr[] = "abc";
	char arr1[] = "def";
	printf("%s\n", my_strcat(arr, arr1));
	system("pause");
	return 0;
}

//char *my_strstr(const char *str1, const char *str2) {
//	assert(str1);
//	assert(str2);
//	char *cp = (char*)str1;
//	char *substr = (char*)str2;
//	char *s1 = NULL;
//	if (*str2 == '\0') {
//		return NULL;
//	}
//	while (*cp) {
//		s1 = cp;
//		substr = str2;
//		while (*s1 && *substr && (*s1 == *substr)) {
//			s1++;
//			substr++;
//		}
//		if (*substr == '\0') {
//			return cp;
//			cp++;
//		}
//	}
//}
//
//int main() {
//	char arr[] = "hello world";
//	char arr1[] = "world";
//	printf("%d\n", my_strstr);
//	system("pause");
//	return 0;
//}

int my_strcmp(const char *src, const char * dest) {
	int ret = 0;
	assert(src != NULL);
	assert(dest != NULL);
	while (!(ret = *(unsigned char *)src - *(unsigned char *)dest) && *dest) {
		++src;
		++dest;
	}
	if (ret < 0) {
		ret = -1;
	}
	else if (ret > 0) {
		ret = 1;
	}
	return ret;
}
int main() {
	char arr[] = "abcs";
	char arr1[] = "abc";
	printf("%d\n",my_strcmp(arr, arr1));
	system("pause");
	return 0;
}


void *memcpy(void *dest, const void *src, size_t count) {
	void *ret = dest;
	assert(src != NULL);
	while (count--) {
		*(char*)dest = *(char*)src;
		dest = (char *)dest + 1;
		src = (char *)src + 1;
	}
	return ret;
}
int main() {
	char arr[] = "abc";
	char arr1[] = "cde";
	printf("%s\n",(char*)memcpy(arr, arr1, strlen(arr)));
	system("pause");
	return 0;
}

void *memmove(void *dest, const void *src, size_t count) {
	void *ret = dest;
	if (dest <= src || (char *)dest >= ((char*)src + count)) {
		while (count--) {
			*(char*)dest = *(char*)src;
			dest = (char*)dest + 1;
			src = (char*)src + 1;
		}
	}
	else {
		dest = (char*)dest + count - 1;
		src = (char *)src + count - 1;
		while (count--) {
			*(char*)dest = *(char*)src;
			dest = (char*)dest - 1;
			src = (char*)src - 1;
		}
	}
	return ret;
}
int main() {
	char arr[] = "abc";
	char arr1[] = "def";
	printf("%s\n", (char*)memmove(arr, arr1, strlen(arr)));
	system("pause");
	return 0;
}


int main() {
	char arr[] = { 1,2,3,4,5,6,7,8,9,10 };
	char arr1[] = "abcde";
	char arr3[] = { 'a','b','c' };
	printf("%d\n", strlen(arr));//未定义行为
	printf("%d\n", strlen(arr1));//strlen求的是**字符串**的长度，且需要字符指针
	printf("%d\n", strlen(arr3));//未定义行为
	system("pause");
	return 0;
}

int main() {
	char arr[] = { 1,2,3,4,5,6,7,8,9,10 };
	char arr1[] = "abcde";
	char arr2 = 2;
	char arr3[] = { 'a','b','c' };
	printf("%d\n", sizeof(arr));
	printf("%d\n", sizeof(arr1));
	printf("%d\n", sizeof(arr2));
	printf("%d\n", sizeof(arr3));
	system("pause");
	return 0;
}

typedef struct st_type {
	int i;
	int a[0];
}type_a;
int main() {
	printf("%d\n", sizeof(type_a));
	system("pause");
	return 0;
}


typedef struct st_type {
	int i;
	int a[0];
}type_a;
int main() {
	int i = 0;
	type_a *p = (type_a*)malloc(sizeof(type_a) + 100 * sizeof(int));
	p->i = 100;
	for (i = 0; i < 100; i++) {
		p->a[i] = i;
	}
	free(p);
	//printf("%d\n", sizeof(type_a));
	system("pause");
	return 0;
}



//#define PERSONS_MAX_SIZE 200
#define NAME_MAX_SIZE 1024
#define PHONE_MAX_SIZE 1024
typedef struct PersonInfo {
	char name[NAME_MAX_SIZE];
	char phone[PHONE_MAX_SIZE];
}PersonInfo;
typedef struct AddrBook {
	PersonInfo* persons;
	int size;
	int capacity;
}AddrBook;
void Init(AddrBook* addr_book) {
	assert(addr_book != NULL);
	addr_book->capacity = 10;
	addr_book->persons = (PersonInfo*)malloc(sizeof(PersonInfo)*addr_book->capacity);
	addr_book->size = 0;
	for (int i = 0; i < addr_book->capacity; ++i) {
		memset(addr_book->persons[i].name, 0, NAME_MAX_SIZE);
		memset(addr_book->persons[i].phone, 0, PHONE_MAX_SIZE);
	}
}
void Add(AddrBook* addr_book) {
	assert(addr_book != NULL);
	printf("新增联系人！\n");
	if (addr_book->size >= addr_book->capacity) {
		addr_book->capacity += 10;
		addr_book->persons = (PersonInfo*)realloc(addr_book->persons, addr_book->capacity);
		//printf("当前通讯录已满，需删除一个再新增！\n");
		//return;
	}
	PersonInfo* p = &addr_book->persons[addr_book->size];
	printf("请输入新联系人的姓名：");
	//char name[NAME_MAX_SIZE] = { 0 };
	scanf("%s", p->name);
	printf("请输入新联系人的电话：");
	scanf("%s", p->phone);
	++addr_book->size;
	printf("新增联系人成功！\n");
}
void Remove(AddrBook* addr_book) {
	assert(addr_book != NULL);
	printf("删除通讯录中的元素\n");
	if (addr_book->size == 0) {
		printf("通讯录为空\n");
		return;
	}
	printf("请输入要删除元素的序号：");
	int index = 0;
	scanf("%d", &index);
	if (index < 0 || index >= addr_book->size) {
		printf("输入序号有误！应输入[0--%d]\n", addr_book->size - 1);
		return;
	}
	if (index = addr_book->size - 1) {
		--addr_book->size;
	}
	else {
		PersonInfo* mid = &addr_book->persons[index];
		PersonInfo* last = &addr_book->persons[addr_book->size - 1];
		strcpy(mid->name, last->name);
		strcpy(mid->phone, last->phone);
		--addr_book->size;
	}
	printf("删除成功！当前还剩 %d 条记录\n", addr_book->size);
}
void PrintAll(AddrBook* addr_book) {
	assert(addr_book != NULL);
	printf("=========================\n");
	for (int i = 0; i < addr_book->size; ++i) {
		PersonInfo* p = &addr_book->persons[i];
		printf("[%d] %s: %s\n", i, p->name, p->phone);
	}
	printf("当前共有 %d 条记录\n", addr_book->size);
	printf("=========================\n");
}
void Update(AddrBook* addr_book) {
	assert(addr_book != NULL);
	printf("更新联系人记录\n");
	if (addr_book->size == 0) {
		printf("当前通讯录为空,不能修改！\n");
		return;
	}
	printf("请输入需修改联系人的序号：");
	int index = 0;
	scanf("%d", &index);
	if (index < 0 || index >= addr_book->size) {
		printf("输入序号有误！应输入[0--%d]", addr_book->size - 1);
		return;
	}
	PersonInfo* p = &addr_book->persons[index];
	printf("当前姓名为：%s\n请输入修改之后的姓名(*表示不修改)：", p->name);
	char name[NAME_MAX_SIZE] = { 0 };
	scanf("%s", name);
	if (strcmp(name, "*") != 0) {
		strcpy(p->name, name);
	}
	printf("当前电话为：%s\n请输入修改之后的电话(*表示不修改)：", p->phone);
	char phone[PHONE_MAX_SIZE] = { 0 };
	scanf("%s", phone);
	if (strcmp(phone, "*") != 0) {
		strcpy(p->phone, phone);
	}
	printf("修改完成！\n");
}
int Menu() {
	printf("=========================\n");
	printf("欢迎使用通讯录！\n");
	printf("1.显示所有联系人信息\n");
	printf("2.新增联系人信息\n");
	printf("3.修改联系人信息\n");
	printf("4.删除联系人信息\n");
	printf("0.退出通讯录！\n");
	printf("=========================\n");
	printf("请输入您的选择：");
	int choice;
	scanf("%d", &choice);
	return choice;
}
AddrBook addr_book;
typedef void(*Func)(AddrBook*);
int main() {
	Init(&addr_book);
	Func func_table[] = {
		NULL,
		PrintAll,
		Add,
		Update,
		Remove,
	};
	while (1) {
		int choice = Menu();
		if (choice < 0 || choice > 4) {
			printf("您的输入有误，请重新输入！\n");
			continue;
		}
		if (choice == 0) {
			printf("goodbye!\n");
			break;
		}
		system("cls");
		func_table[choice](&addr_book);
	}
	system("pause");
	return 0;
}
#endif
int main() {
	system("pause");
	return 0;
}