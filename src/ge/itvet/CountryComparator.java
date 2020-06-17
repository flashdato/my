package ge.itvet;

import ge.itvet.data.model.Country;

import java.util.Comparator;

public interface CountryComparator {

    class ByName implements Comparator<Country> {
        @Override
        public int compare(Country c, Country c1) {
            return c.name.compareTo(c1.name);
        }
    }

    class ByArea implements Comparator<Country> {
        @Override
        public int compare(Country c, Country c1) {
            return Integer.compare(c1.area, c.area);
        }
    }


    class ByPopulation implements Comparator<Country> {
        @Override
        public int compare(Country c, Country c1) {
            return Double.compare(c.population, c1.population);
        }
    }
}
