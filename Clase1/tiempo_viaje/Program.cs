//Calcular el tiempo total de horas de viaje 
//Usuario ingresa la velocidad promedio en km/h
//Se asume una distancia fija de 40 km (Managua a Granada)

float velocidad;

Console.WriteLine("Hola mucho gusto, este programa calcula el tiempo total de viaje");
Console.Write("\nIngrese la velocidad promedio en km/h: ");
velocidad = float.Parse(Console.ReadLine()!);
Console.WriteLine($"\nEl tiempo total de horas de viaje desde Managua a Granada a una velocidad promedio de {velocidad} km/h es de {(40.0 / velocidad):F2} horas");