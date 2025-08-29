//Evaluar la calificación de un estudiante y mostrar si aprobó, recuperación o reprobó

int num;

Console.WriteLine("Hola mucho gusto, este programa evalúa tu calificación");
Console.Write("\nIngresa tu calificación: ");
num = int.Parse(Console.ReadLine()!);
if (num >= 70 && num <= 100)
{
    Console.WriteLine("\nHas aprobado la clase");
}
else if (num < 70 && num >= 50)
{
    Console.WriteLine("\nEstás en recuperación");
}
else if (num < 50 && num >= 0)
{
    Console.WriteLine("\nHas reprobado la clase");
}
else
{
    Console.WriteLine("\nLa calificación ingresada no es válida");
}