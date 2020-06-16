package ge.itvet;

import java.util.List;

public class Country  {
    public final int population;
    public final int area;
    public final String name;

    public Country(String name,int population, int area) {
        this.name = name;
        this.population = population;
         this.area = area;

    }
    @Override
    public String toString() {
        return "Country{" +
                "population=" + population +
                ", area=" + area +
                ", name: " + name +
                '}'+"\n";
    }
    public static int strToInt( String str ) {
        int i = 1;
        int num = 0;
        while (i < str.length()) {
            num *= 10;
            num += str.charAt(i++) - '0';
        }
        return num;
    }


}

