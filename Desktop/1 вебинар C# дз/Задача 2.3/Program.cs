// Напишите программу, которая на вход принимает два числа и выдаёт, какое число большее, а какое меньшее.
// a = -9 b = -3 -> max = -3

int a = -9;
int b = -3;

int max = a;

if (a > max) max = a;
if (b > max) max = b; 

Console.Write("max = ");
Console.WriteLine(max);
