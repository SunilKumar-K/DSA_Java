package phonebook;

import java.util.*;


public class phoneBook {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        HashMap<String,Integer> phonebook = new HashMap<>();
        while(n != 0)
        {
            String name = sc.next();
            int number = sc.nextInt();
            phone phone = new phone();
            phone.setName(name);
            phone.setNumber(number);
            phonebook.put(phone.getName(), phone.getNumber());
            n--;
        }
    }
}
