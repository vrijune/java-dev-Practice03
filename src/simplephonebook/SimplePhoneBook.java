package simplephonebook;

import java.util.*;

/**
 * Complete this class for adding names and phone numbers to a collection.
 *
 * @author wyu861.
 */
public class SimplePhoneBook {
    public SimplePhoneBook() {
        String name;
        Integer age;
        HashMap<String, Integer> map = new HashMap<>();

    }

    // 2a. Adds multiple contacts to the phone book collection
    public List addMultipleContacts(Map<String, Integer> multipleContacts) {
        Map<String, Integer> map = new HashMap<>();
        map.put("test", (Integer) new Object());
        map.put("test1", (Integer) new Object());

        Set<Map.Entry<String, Integer>> set = map.entrySet();
        Iterator<Map.Entry<String, Integer>> it = set.iterator();
        while (it.hasNext()) {
            Map.Entry<String, Integer> entry = it.next();
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println(key + "=" + value);

        }
        return (List) multipleContacts;
    }


     2b. Adds a single contact to the phone book collection
    public void addNewContact(String name, int number) {
        String newName = null;
        Integer newNumber = 0;

        map.put(newName, newNumber);
        Set<String> set = map.keySet();
        for (String key : set) {
            if (map.containsKey(name)) {
                System.out.println("Current number for\n" + name + "is" + number);
            } else System.out.println("Number for" + newName + "is" + newNumber);
        }


        Integer num = phoneBook.get(name);
        if (num != null){
            System.out.printf(" Current number for %s is %d.%n", name , number);
        }
        phoneBook.put(name, number);
        System.out.printf("");

    }


    // 2c. Prints the number for a given name
    public void printNumberFor(String name) {
//        Map<String, Integer> map = new HashMap<>();
//        for (String key : map.keySet()) {
//            if (map.containsKey(name)) {
//                Integer value = map.get(key);
//                System.out.println("Current number for" + name + "is" + value);
//            } else {
//                System.out.println("The person" + name + " does not exist in the phone book");
//            }
//
//        }
//
//    }

    Integer num = phoneBook.get(name);
    if









    // 2d. Prints the total number of entries of the phone book collection
    public void printTotalNumberOfEntries() {
        Scanner sc = new Scanner(System.in);
        int totalNumber = 0;
        for (int i = 0; i < 10; i++) {
            totalNumber += sc.nextInt();
        }
        System.out.println("There are" + totalNumber + "entries in the phone book");
        sc.close();
    }





    // 2e. Prints the name for a given phone number
    public String printNameByPhoneNumber(int phoneNumber) {

        String key = "";
        TreeMap<String, Integer> map = new TreeMap<>();
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (phoneNumber==(entry.getValue())) {
                key = entry.getKey();
            }

        }

        return key;
    }
}
