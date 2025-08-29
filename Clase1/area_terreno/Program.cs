//Área total en manzanas de un terreno en manzanas
//Usuario ingresa la longitud y el ancho en varas

float longitud, ancho;

Console.WriteLine("Hola mucho gusto, este programa calcula el área total de su terreno");
Console.Write("\nIngrese la longitud de su terreno en varas: ");
longitud = float.Parse(Console.ReadLine()!);
Console.Write("\nIngrese el ancho de su terreno en varas: ");
ancho = float.Parse(Console.ReadLine()!);
Console.WriteLine($"\nEl área total de su terreno es de {(longitud * ancho / 1428.8):F2} manzanas");