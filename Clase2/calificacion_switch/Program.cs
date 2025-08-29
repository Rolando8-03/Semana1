//Evaluar la calificación de un estudiante y mostrar si aprobó, recuperación o reprobó

int num;

Console.WriteLine("Hola mucho gusto, este programa evalúa tu calificación");
Console.Write("\nIngresa tu calificación: ");
num = int.Parse(Console.ReadLine()!);
switch (num)
{
    case >=70 and <=100:
        Console.WriteLine("Has aprobado la asignatura");
        break;
    case >=50 and <70:
        Console.WriteLine("Estás en recuperación");
        break;
    case >=0 and <50:
        Console.WriteLine("Has reprobado la asignatura");
        break;
    default:
        Console.WriteLine("La calificación ingresada no es válida");
        break;
}
