package ge.itvet;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import static ge.itvet.Country.strToInt;

public class Main{


    public static void main(String[] args) throws Exception {
        int i=0;
        Scanner scanner = new Scanner(System.in);
        String file = "D:\\Games\\country.csv";
        String delimiter = ",";
        String line;
        List<Country> countries = new ArrayList<>();
        List Test = new ArrayList();
        BufferedReader br = new BufferedReader(new FileReader(file));
            while((line = br.readLine()) != null){
                List values = Arrays.asList(line.split(delimiter));
                Test.add(values);
            }
        Scanner sc = new Scanner(String.valueOf(Test.get(0)));
        sc.useDelimiter("[,\\]\\[\n]\\[]");
          while (i<11) {
              sc = new Scanner(String.valueOf(Test.get(i++)));
              sc.useDelimiter("[,\\]\\[]");
              countries.add(new Country(sc.next(),strToInt(sc.next()),strToInt(sc.next())));
          }

        System.out.println("რომელი ველის მიხედვით გსურს რომ დავალაგო ქვეყნები?  (შემოიტანეთ რიცხვი)\"\n" +
                "1. სახელის მიხედვით\n" +
                "2. ფართობის მიხედვით\n" +
                "3. მოსახლეობის მიხედვით");
        Integer a = scanner.nextInt();
        if(a==1)
        {
        CountryComparator.Byname byname = new CountryComparator.Byname();
        countries.sort(byname);
        System.out.print(countries.toString());
        }
        if (a == 2)
        {
        CountryComparator.Byarea byarea = new CountryComparator.Byarea();
        countries.sort(byarea);
        System.out.print(countries.toString());
        }
        if (a==3)
        {
        CountryComparator.Bypopulation bypopulation = new CountryComparator.Bypopulation();
        countries.sort(bypopulation);
        System.out.print(countries.toString());
        }
        if(a!= 1 && a !=2 && a !=3 )
            System.out.println("try again !!!");

    }}


