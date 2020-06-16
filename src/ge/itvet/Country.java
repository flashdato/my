package ge.itvet;

import java.util.List;

public class Country  {
    public final String population;
    public final String area;
    public final String name;

    public Country(String name,String population, String area) {
        this.name = name;
        this.population = population;
         this.area = area;

    }
    @Override
    public String toString() {
        return "Country{" +
                "population=" + population +
                ", area=" + area +
                ", name: '" + name +
                '}';
    }



}

