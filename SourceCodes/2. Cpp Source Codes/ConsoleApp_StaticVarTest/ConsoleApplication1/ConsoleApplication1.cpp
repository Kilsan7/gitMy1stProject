// ConsoleApplication1.cpp : 콘솔 응용 프로그램에 대한 진입점을 정의합니다.
// Static variable에 값을 Class 바깥에서 직접 Setting하면 어떻게 되는지 Test

#include "stdafx.h"
#include <iostream>
using namespace std;
template <class T>
void f(T) {
	static int i = 1;
	cout << "Static variable i 값 = " << ++i << endl;
}
int main()
{
	f(1);
	f(1.0);  // (1) float형 class 변수
	f(1);
	f(9);    // static (class 변수)이라서 값 변경 안 된다. class 호출에 따른 값 증가(값 변경은 class 내부에서 해야 함)
	f(0);
	f(100);
	f(110);
	f(5.24); // class 호출에 따라 (1) 증가 ++i
	cout << "Class에서 선언된 Static variable은 인위적으로 외부에서 값을 변경할 수 없다." << endl << endl;

	// 아래 세 개는 모두 array의 두 번째 element 값을 출력한다.
	int arr[] = { 5, 6, 7, 8 };
	int *ptr = arr;
	//cout << arr (1);
	cout << "    prt[1] : " << ptr[1] << endl;
	cout << "*(ptr + 1) : " << *(ptr + 1) << endl;
	cout << "    arr[1] : " << arr[1] << endl;
	cout << "Array element에 access 하는 방법 array[index], pointer[index], *(pointer + index)" << endl;
}