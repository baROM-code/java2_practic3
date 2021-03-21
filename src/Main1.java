import java.util.*;

public class Main1 {
    public static void main(String[] args) {

        List<String> itComp = new ArrayList<>();
        itComp.add("AMD");
        itComp.add("Apple");
        itComp.add("Cisco");
        itComp.add("IBM");
        itComp.add("AMD");
        itComp.add("Zuxel");
        itComp.add("IBM");
        itComp.add("AMD");
        itComp.add("Micron");
        itComp.add("Nvidia");
        itComp.add("Apple");
        itComp.add("Hunyx");
        itComp.add("Seagate");
        System.out.println("Исходный список слов: " + itComp);

        // Сделаем список уникальных слов из itComp
        Set<String> uniqueName = new HashSet();
        uniqueName.addAll(itComp);
        System.out.println("Cписок уникальных слов: " + uniqueName);

        Collections.sort(itComp); // Сортируем список
        // Cчитаем сколько раз встречается каждое слово
        Iterator<String> iter = uniqueName.iterator();
        while (iter.hasNext()) {
            String str = iter.next();
            int firsIndex = itComp.indexOf(str);
            int lastIndex = itComp.lastIndexOf(str);
            if (firsIndex != lastIndex) {
                System.out.println(str + " встречается " + (1 + lastIndex - firsIndex) + " раз(а)");
            }
        }
    }
}
