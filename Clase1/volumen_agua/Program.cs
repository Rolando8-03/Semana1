//Calcular el volumen total de agua (m3)
//Usuario ingresa longitud, ancho y altura del tanque en metros

float longitud, ancho, altura, volumen, volumen2, agua, porcentaje;

Console.WriteLine("Hola mucho gusto, este programa calcula el volumen total de agua recolectada");
Console.Write("\nIngrese la longitud del tanque en metros: ");
longitud = float.Parse(Console.ReadLine()!);
Console.Write("\nIngrese el ancho del tanque en metros: ");
ancho = float.Parse(Console.ReadLine()!);
Console.Write("\nIngrese la altura del tanque en metros: ");
altura = float.Parse(Console.ReadLine()!);
volumen = longitud * ancho * altura;
volumen2 = volumen * 1000;
Console.WriteLine($"\nEl volumen del tanque es de {volumen:F2} m3 o bien, {volumen2:F2} litros");
Console.Write("\nIngrese la cantidad de agua recolectada en litros: ");
agua = float.Parse(Console.ReadLine()!);
porcentaje = agua / volumen2 * 100;
Console.WriteLine($"\nEl agua recolectada ({agua} litros) ocupa un {porcentaje:F2}% de los {volumen2} litros de volumen del tanque");