package com.company;

public class Main {

    public static void main(String[] args) {

        String internetSubeButonu = "İnternet subeye gir";
        double dolarDun = 8.15;
        double dolarBugün = 8.18;
        int Vade = 36;
        boolean DustuMu = false;

        System.out.println(internetSubeButonu);

        if (dolarBugün<dolarDun)
        {
            System.out.println("Dolar düştü resmi ");
        }
        else if (dolarBugün>dolarDun)
        {
            System.out.println("Dolar yükseldi resmi ");
        }
        else
        {
            System.out.println("Dolar eşittir resmi");
        }

        String kredi1 = "Hızlı kredi1";
        String kredi2 = "Mutlu emekli kredisi";
        String kredi3 = "Konut kredisi";
        String kredi4 = "Çiftçi kredisi";
        String kredi5 = "Msb kredisi";
        String kredi6 = "Meb kredisi";

        System.out.println(kredi1);
        System.out.println(kredi2);
        System.out.println(kredi3);
        System.out.println(kredi4);
        System.out.println(kredi5);
        System.out.println(kredi6);

        String [] Krediler =
          {
            "Hızlı kredi",
            "Mutlu emekli kredisi",
            "Konut Kredisi",
            "Çiftçi kredisi",
            "Msb kredisi",
            "Meb kredisi"
          }

          for (string kredi : krediler)
          {
              system.out.println(kredi);
          }

          for (int i = 0; i<krediler.length; i++)

        };


}
