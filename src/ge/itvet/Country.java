package ge.itvet;

public class Country  {
    public final int population;
    public final double area;
    public final String name;

    public Country(int population, double area, String name) {
    this.population = population;
    this.area = area;
    this.name = name;
    }

    @Override
    public String toString() {
        return "Country{" +
                "population=" + population +
                ", area=" + area +
                ", name: '" + name   + '\'' +
                '}';
    }



}

