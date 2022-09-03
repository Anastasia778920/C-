// Напишите программу, которая принимает на вход три числа и выдаёт максимальное из этих чисел.
// 22 3 9 -> 22

int a = 22;
int b = 3;
int c = 9;

int max = a;

if (a > max) max = a;
if (b > max) max = b; 
if (c > max) max = c; 

Console.Write("max = ");
Console.WriteLine(max);
