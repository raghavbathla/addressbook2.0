package addressBook;

import java.util.*;

public class DataOperations {
    Scanner scanner = new Scanner(System.in);
    ArrayList <Contacts> contacts = new  ArrayList<>();
    private Dictionary<String, ArrayList<Contacts>> dictionary = new Hashtable<>();
private  Dictionary<Object,Object> details = new Hashtable<>();
    public DataOperations(Dictionary<String, ArrayList<Contacts>> dictionary) {
        this.dictionary = dictionary;
    }
public void duplicateName(String addressbookName,String name){
        List<Contacts> contacts = dictionary.get(addressbookName);
        Optional<Contacts> result = contacts.stream().filter(i->i.getFirstName().equals(name)).findFirst();

}

//    public void viewPersonByCity(){
//System.out.println("Enter the name of Address book");
//        String name = scanner.nextLine();
//        scanner.nextLine();
//        contacts =  dictionary.get(name);
//        System.out.println("Enter the City or State");
//        String cityOrState = scanner.nextLine();
//    ArrayList<Contacts> data = contacts.stream()
//            .filter(findState -> findState.getKey().equals(stateName)).map(Map.Entry::getValue).findFirst()
//            .orElse(null);
//        }

//
//  for (data contact : contacts) {
//        System.out.println("First Name: " + contact.getFirstName() + " Last Name: " + contact.getLastName());
//    }
//
//    }
//    public void viewPersonByState(){
//        System.out.println("Enter the name of Address book");
//        String name = scanner.nextLine();
//        scanner.nextLine();
//        contacts =  dictionary.get(name);
//        System.out.println("Enter the City or State");
//        String cityOrState = scanner.nextLine();
//
//
//
//
//        ArrayList<Contacts> data = contacts.stream()
//                .filter(findState -> findState.getKey().equals(stateName)).map(Map.Entry::getValue).findFirst()
//                .orElse(null);
//    }
//
//
//  for (data contact : contacts) {
//          System.out.println("First Name: " + contact.getFirstName() + " Last Name: " + contact.getLastName());
//          }
//
//
//
//
//    }
}
