import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/*
  Написать простой класс ТелефонныйСправочник,
  который хранит в себе список фамилий и телефонных номеров.
  В этот телефонный справочник с помощью метода add() можно добавлять записи.
  С помощью метода get() искать номер телефона по фамилии.
  Следует учесть, что под одной фамилией может быть несколько телефонов,
  тогда при запросе такой фамилии должны выводиться все телефоны.
*/


public class PhoneBook {
    private HashMap<String , List<String>> pb;

    public PhoneBook() {
        this.pb = new HashMap<>();
    }

    public void add (String name, String phoneNum) {
        if (pb.containsKey(name)) {
            List lList = pb.get(name);
            lList.add(phoneNum);
        }
        else {
            List lList = new ArrayList();
            lList.add(phoneNum);
            pb.put(name, lList);
        }
    }
    public List get(String  name){
        return pb.get(name);
    }
}
