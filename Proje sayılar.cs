using System;

class Program
{
    static void Main()
    {
        // Kullanıcıdan bir sayı al
        Console.Write("Bir sayı girin: ");
        int sayi = int.Parse(Console.ReadLine());

        // Sayının pozitif, negatif veya sıfır olduğunu kontrol et
        if (sayi > 0)  //Pozitif ise
        {
            Console.WriteLine("Pozitif sayı");
        }
        else if (sayi < 0)   // Sayı negtifse
        {
            Console.WriteLine("Negatif sayı");
        }
        else
      {
            Console.WriteLine("Sayı sıfırdır");
        }
    }
}