//Calcular la cantidad total de baldes de leche producidos
//Usuario ingresa el volumen promedio por vaca en litros y el número total de vacas ordeñadas

float volumen, total;
int vacas;

Console.WriteLine("Hola mucho gusto, este programa calcula la cantidad de baldes de leche producidos en un día");
Console.Write("\nIngrese el volumen promedio de leche por vaca en litros: ");
volumen = float.Parse(Console.ReadLine()!);
Console.Write("\nIngrese el número total de vacas ordeñadas: ");
vacas = int.Parse(Console.ReadLine()!);
DateTime fecha = DateTime.Today;
total = vacas * volumen / 20;
Console.WriteLine($"\nEl número total de baldes de leche producidos hoy ({fecha.ToShortDateString()}) es {total:F2}");