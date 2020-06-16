package ge.itvet;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;



public class Main{
    public static void main(String[] args) throws Exception {
        int i=0;
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
        sc.useDelimiter("[,\\]\\[]\\[\n]");
          while (i<11) {
              sc = new Scanner(String.valueOf(Test.get(i++)));
              sc.useDelimiter("[,\\]\\[]");
              countries.add(new Country(sc.next(),sc.next(),sc.next()));
          }
        System.out.println(countries.toString());
        CountryComparator.Byarea byarea = new CountryComparator.Byarea();
        countries.sort(byarea);
        System.out.print(countries.toString());
    }}


