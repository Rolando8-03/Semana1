//Verificar si un número es positivo, negativo o neutro

int num;

Console.WriteLine("Hola mucho gusto, este programa valida los tipos de números enteros");
Console.Write("\nIngrese un número: ");
num = int.Parse(Console.ReadLine()!);
if (num > 0)
{
    Console.WriteLine("\nEl número es positivo");
}
else if (num < 0)
{
    Console.WriteLine("\nEl número es negativo");
}
else
{
    Console.WriteLine("\nEl número es neutro");
}   