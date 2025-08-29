//Calcular la distancia recorrida en km por un ciclista
//Usuario ingresa la velocidad promedio en km/h y el tiempo

float velocidad, tiempo;

Console.WriteLine("Hola mucho gusto, este programa calcula su distancia recorrida basada en su velocidad y su tiempo");
Console.Write("\nIngrese la velocidad promedio en km/h: ");
velocidad = float.Parse(Console.ReadLine()!);
Console.Write("\nIngrese su tiempo en horas: ");
tiempo = float.Parse(Console.ReadLine()!);
Console.WriteLine($"\nLa distancia recorrida a una velocidad promedio de {velocidad} km/h y en {tiempo} horas es de {(velocidad*tiempo):F2} km");