// Реализуйте структуру телефонной книги с помощью HashMap, учитывая, что 1 человек может иметь несколько телефонов.

import java.util.HashMap;

public class Phonebook {
    private HashMap<String, String[]> phonebook;

    public Phonebook(){
        phonebook = new HashMap<>();
    }

        public void addPerson(String name, String[] phones){
            phonebook.put(name, phones); 
        }

        public String[] getPhones(String name){
            return phonebook.get(name);
        }

        public static void main(String[] args) {
            Phonebook book = new Phonebook(); 
            book.addPerson("Alex", new String[]{"123456789", "124356789"}); 
            book.addPerson("Masha", new String[]{"123498765"});

            String[] phones = book.getPhones("Alex");
            for(String phone : phones){
                System.out.println(phone);
            }
        }
    }
