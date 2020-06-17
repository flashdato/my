package ge.itvet;

import ge.itvet.data.model.Country;
import ge.itvet.data.reader.CommaSeparatedStringToCountryConverter;
import ge.itvet.data.reader.DataReader;

import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static final String filePath = "/home/mikheil/Downloads/itvet/country.csv";


    public static void main(String[] args) throws Exception {
        method1();
    }

    private static void method2() throws Exception {
        Scanner scanner = new Scanner(new File(filePath));
        scanner.useDelimiter("((,)|(\n))");
        if (scanner.hasNext()) scanner.nextLine();
        Collection<Country> countries = new ArrayList<>();
        while (scanner.hasNext()) {
            String name = scanner.next().trim();
            String population = scanner.next().trim();
            String area = scanner.next().trim();
            if (name.length() + population.length() + area.length() == 0) break;
            if (population.length() == 0) population = "0";
            if (area.length() == 0) area = "0";
            countries.add(new Country(name, Integer.parseInt(population), Integer.parseInt(area)));
        }
        System.out.println(countries);

    }

    private static void method1() throws Exception {
        List<Country> countries = DataReader.readSCVData(filePath, new CommaSeparatedStringToCountryConverter());

        Scanner scanner = new Scanner(System.in);
        System.out.println("რომელი ველის მიხედვით გსურს რომ დავალაგო ქვეყნები?  (შემოიტანეთ რიცხვი)");
        System.out.println("1. სახელის მიხედვით");
        System.out.println("2. ფართობის მიხედვით");
        System.out.println("3. მოსახლეობის მიხედვით");

        // თუმცა აქ შეიძლებოდა შენი უ-else-ო if-ები დაგვეტოვა.
        Integer a = scanner.nextInt();
        switch (scanner.nextInt()) {
            case 1:
                countries.sort((c1, c2) -> c2.name.compareTo(c1.name));
                break;
            case 2:
                countries.sort((c1, c2) -> c2.area - c1.area);
                break;
            case 3:
                countries.sort((c1, c2) -> c2.population - c1.population);
                break;
            default:
                System.out.println("try again !!!");
        }
    }
}

