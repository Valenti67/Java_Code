#include <stdio.h>
#include <math.h>
#include <assert.h>
#include <windows.h>

void Print(int *arr, int num)
{
	assert(arr);
	for (int i = 0; i < num; i++){
		printf("%d ", *(arr + i));
	}
	printf("\n");
	//int *end = arr + num;
	//for (; arr < end; arr++){
	//	printf("%d ", *arr);
	//}
}
void ReverseString(char *str)
{
	assert(str);

	char *start = str;
	char *end = str + strlen(str) - 1;

	while (start < end){
		char temp = *start;
		*start = *end;
		*end = temp;
		start++, end--;
	}
}

int SnTotal(int base, int num)
{
	int total = 0;
	for (int i = 0; i < num; i++){
		int sum = base;
		for (int j = 0; j < i; j++){
			sum = sum * 10 + base;
		}
		printf("----- %d\n", sum);
		total += sum;
	}

	return total;
}
//0, 1
int IsNarcissus(int x)
{
	//1. 求位数
	int num = 0;
	int temp = x;
	while (temp){
		temp /= 10;
		num++;
	}

	//2. 拆分
	//3. 求num次方
	//4. 并累加
	int result = 0;
	temp = x;
	while (temp){
		int data = temp % 10;
		result += (int)pow(data, num);
		temp /= 10;
	}

	return result == x;
}

int DrinkSoda(int money)
{
	int total = money;
	int empty = money;

	while (empty > 1){
		total += empty / 2;
		empty = empty / 2 + empty % 2;
	}

	return total;
}

int Strlen(const char *str)
{
	//int count = 0;
	//while (*str){
	//	str++;
	//	count++;
	//}

	//return count;

	//if (*str == '\0'){
	//	return 0;
	//}

	//return 1 + Strlen(str + 1);
	//"abc"
	//assert(str);

	//const char *end = str; //"abc\0"
	//while (*end){
	//	end++;
	//}
	//return end - str;
}

char *MyStrcpy(char *dst, const char *src)
{
	assert(dst);
	assert(src);
	char *ret = dst; //?????

	while (*dst = *src){
		dst++, src++;
	}

	return ret;
}

//10-> 1010 -> 2*(1*2^1..1*2^0)+0*2^0

void SwitchOdd2Even(int arr[], int num)
{
	int left = 0;
	int right = num - 1;
	while (left < right){
		while (left < right && (arr[left] & 1)){
			left++;
		}
		while (left < right && !(arr[right] & 1)){
			right--;
		}

		if (left < right){
			arr[left] ^= arr[right];
			arr[right] ^= arr[left];
			arr[left] ^= arr[right];
		}
	}
}
int main()
{
	char diamond[10][10] = {
		"    *",
		"   ***",
		"  *****",
		" *******",
		"*********",
		" *******",
		"  *****",
		"   ***",
		"    *"
	};
	int num = sizeof(diamond) / sizeof(diamond[0]);
	for (int i = 0; i < num; i++){
		printf("%s\n", diamond[i]);
	}

	//调整数组使奇数全部都位于偶数前面(如何保证奇数偶数原始顺序不变)
	//int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
	//int num = sizeof(arr) / sizeof(arr[0]);
	//SwitchOdd2Even(arr, num);
	//strcpy(dst, src)实现
	//const char *src = "hello world";
	//char dst[16] = { '\0' };
	//MyStrcpy(dst, src);
	//printf("%s\n", dst);

	//模拟实现库函数strlen
	//const char *str = "aaaaaa";
	//int len = Strlen(str);
	//printf("%d\n", len);
	//喝汽水，1瓶汽水1元，2个空瓶可以换一瓶汽水，
	//给20元，可以多少汽水（编程实现）。
	//int money = 20;
	//int total = DrinkSoda(money);
	//printf("total = %d\n", total);
	//打印水仙花数
	//题目内容 :
	//求出0～100000之间的所有“水仙花数”并输出。
	//“水仙花数”是指一个n位数，其各位数字的n次方之
    //和确好等于该数本身，如 : 153＝1 ^ 3＋5 ^ 3＋3 ^ 3，
	//则153是一个“水仙花数”。

	//for (int i = 0; i < 100000; i++){
	//	if (IsNarcissus(i)){
	//		printf("%d ", i);
	//	}
	//}
	//printf("\n");
	//求Sn = a + aa + aaa + aaaa + aaaaa的前5项之和，其中a是一个数字，
	//例如：2 + 22 + 222 + 2222 + 22222
	//int sn = SnTotal(2, 5);
	//printf("total:%d\n", sn);
	//unsigned long pulArray[] = { 6, 7, 8, 9, 10 };
	//unsigned long *pulPtr;
	//pulPtr = pulArray;
	//*(pulPtr + 3) += 3;
	//printf("%d, %d\n", *pulPtr, *(pulPtr + 3));

	//字符串逆序
	//char str[] = "abcd1234";
	//printf("Before: %s\n", str);
	//ReverseString(str);
	//printf("After : %s\n", str);
	//int arr[] = { 1, 2, 3, 4, 5, 6, 7 };
	//int num = sizeof(arr) / sizeof(arr[0]);

	//Print(arr, num);
	system("pause");
	return 0;
}