// Напишите программу, которая на вход принимает два числа и выдаёт, какое число большее, а какое меньшее.
// a = 2 b = 10 -> max = 10

int a = 2;
int b = 10;

int max = a;

if (a > max) max = a;
if (b > max) max = b; 

Console.Write("max = ");
Console.WriteLine(max);
