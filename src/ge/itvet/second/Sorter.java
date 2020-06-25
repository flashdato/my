package ge.itvet.second;

import javax.swing.*;
import java.lang.reflect.Array;
import java.util.*;

public class Sorter{
    protected List<Person> personList;
    public Sorter(List<Person> personList1)
    {
        this.personList= personList1;
    }
    Map<String,Integer> names = new HashMap();
   public int namecounter()
   {

       for (int i = 0; i < personList.size(); i++) {
          names.put( personList.get(i).getName(),i);
       }
       return names.size();
   }


    List<Map<String,Person>> list = new ArrayList<>();
      Map<String,Person> map = new HashMap<>();

    public List sort(EnomPerson anEnum)
    {
        for (int j = 0; j < namecounter(); j++) {


        for (int i=0;i<personList.size();i++) {

            if (anEnum.getMyOrdinal() == 1) {

            }
//            else if (anEnum.getMyOrdinal() == 2){
//                map.put(person.getSurname(), person);
//                list.add(map);}
//            else if (anEnum.getMyOrdinal() == 3) {
//                map.put(person.getCity(), person);
//                list.add(map);
//            }

        }}
       return list;
    }
}
