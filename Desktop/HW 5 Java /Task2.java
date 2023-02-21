import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

// Пусть дан список сотрудников:Иван Иванов и т.д.
// Написать программу, которая найдет и выведет повторяющиеся имена с количеством повторений. Отсортировать по убыванию популярности.

public class Task2 {
    public static void main(String[] args) {
        String[] name = {"Ivan Ivanov", "Vasya Petrov", "Ivan Ivanov"}; 
        Map<String, Integer> nameAndCount = new HashMap<>();
        String[] names;
        for(String name : names) {
            if (nameAndCount.containsKey(name)) {
                int count = nameAndCount.get(name); 
                nameAndCount.put(name, count + 1);
            }
            else{
                nameAndCount.put(name, 1);
            }
        }
        printDubs(nameAndCount);
    }
    public static void printDubs(Map<String,Integer> m){
        for(Entry<String, Integer> entry : m.entrySet()) {
            if (entry.getValue() > 1)
            System.out.println("Name: " + entry.getKey() + ", Count: " + entry.getValue());
        }
    }

}
