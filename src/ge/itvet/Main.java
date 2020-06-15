package ge.itvet;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main{
    public static void main(String[] args) throws Exception {
        List<Country> countries = new ArrayList<>();
       countries.add(new Country(140, 1500, "TVT"));
        countries.add(new Country(109, 2000, "Samsung"));
        countries.add(new Country(109, 2000, "Sharp"));
        countries.add(new Country(109, 2000, "Sony"));
        countries.add(new Country(109, 2000, "Lg"));
        System.out.println(countries.toString());

}}
