//Determinar si un año es bisiesto

int num;

Console.WriteLine("Hola mucho gusto, este programa determina si un año es bisiesto");
Console.Write("\nIngrese un año: ");
num = int.Parse(Console.ReadLine()!);
if (num % 4 == 0 && num % 100 != 0 || num % 400 == 0)
{
    Console.WriteLine("\nEl año es bisiesto");
} 
else
{
    Console.WriteLine("\nEl año no es bisiesto");
}