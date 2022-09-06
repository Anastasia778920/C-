// Напишите программу, которая принимает на вход цифру, обозначающую день недели, и проверяет, является ли этот день выходным.
// 6 -> да
// 7 -> да
// 1 -> нет

Console.WriteLine("Введите цифру, обозначающую день недели: ");
int numberDay = Convert.ToInt32(Console.ReadLine());

void CheckingTheDayOfTheWeek (int numberDay)
{
    if (numberDay == 6 || numberDay == 7)
    {
        Console.WriteLine("Этот день является выходным");
    }
    else if (numberDay < 1 || numberDay > 7)
    Console.WriteLine("Этот день не является днем недели");
    
    else Console.WriteLine("Этот день недели не выходной");
}

CheckingTheDayOfTheWeek(numberDay);
