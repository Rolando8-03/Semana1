//Pedir un número entre 1 y 7 y mostrar el día de la semana

int num;

Console.WriteLine("Bienvenido!");
Console.Write("\nIngrese un número entre 1-7: ");
num = int.Parse(Console.ReadLine()!);
switch (num)
{
    case 1:
        Console.WriteLine("\nEl día es Lunes!");
        break;
    case 2:
        Console.WriteLine("\nEl día es Martes!");
        break;
    case 3:
        Console.WriteLine("\nEl día es Miércoles!");
        break;
    case 4:
        Console.WriteLine("\nEl día es Jueves!");
        break;
    case 5:
        Console.WriteLine("\nEl día es Viernes!");
        break;
    case 6:
        Console.WriteLine("\nEl día es Sábado!");
        break;
    case 7:
        Console.WriteLine("\nEl día es Domingo!");
        break;
    default:
        Console.WriteLine("\nEl número ingresado no es válido");
        break;
}