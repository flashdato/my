package ge.itvet.second;

import java.util.Collections;

public class Person {
    private  String name;
    private  String surname;
    private  String city;

    public String getSurname() {
        return surname;
    }
    public String getName() {
        return name;
    }
    public String getCity() {
        return city;
    }
   public Person(String name, String surname, String city)
   {
        this.name= name;
       this.city = city;
       this.surname = surname;
   }
    public Person()
    {
    }
    @Override
    public String toString() {
        return "Person" + " name='" + name +
                ", surname='" + surname  +
                ", city='" + city;
    }
}
