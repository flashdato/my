package ge.itvet;

import java.util.Comparator;

interface CountryComparator {

    class Byname implements Comparator<Country> {
        @Override
        public int compare(Country c, Country c1) {
            return c.name.compareTo(c1.name);
        }
    }

    class Byarea implements Comparator<Country> {
        @Override
        public int compare(Country c, Country c1) {
            {
                return c.area.compareTo(c1.area);
        }
    }

    class Bypopulation implements Comparator<Country> {
        @Override
        public int compare(Country c, Country c1) {
            {
                return c.population.compareTo(c1.population);
        }
    }
}}}
