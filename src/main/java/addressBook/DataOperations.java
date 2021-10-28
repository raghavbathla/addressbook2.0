package addressBook;

import java.util.*;
import java.util.stream.Collectors;

public class DataOperations {
    Scanner scanner = new Scanner(System.in);
    ArrayList <Contacts> contacts = new  ArrayList<>();
    private Dictionary<String, ArrayList<Contacts>> dictionary = new Hashtable<>();
private  Dictionary<Object,Object> details = new Hashtable<>();
    public DataOperations(Dictionary<String, ArrayList<Contacts>> dictionary) {
        this.dictionary = dictionary;
    }
    public void viewPersonByCity(String addressBookName, String cityName){
List<Contacts> contacts = dictionary.get(addressBookName);
List<Contacts> resultList =contacts.stream().filter(i->i.getCity().equals(cityName)).collect(Collectors.toList());
resultList.stream().forEach(i->System.out.println(i.getFirstName()+i.getLastName()));

        }
    public void viewPersonByState(String addressBookName, String stateName){
        List<Contacts> contacts = dictionary.get(addressBookName);
        List<Contacts> resultList =contacts.stream().filter(i->i.getState().equals(stateName)).collect(Collectors.toList());
        resultList.stream().forEach(i->System.out.println(i.getFirstName()+i.getLastName()));

    }
    public Long countPersonByCity(String addressBookName, String cityName){
        List<Contacts> contacts = dictionary.get(addressBookName);
        Long resultList =contacts.stream().filter(i->i.getCity().equals(cityName)).count();
      return   resultList;

    }
    public Long countPersonByState(String addressBookName, String stateName){
        List<Contacts> contacts = dictionary.get(addressBookName);
       Long resultList =contacts.stream().filter(i->i.getState().equals(stateName)).count();
      return resultList;

    }
public void sortList(String addressBookName,String name){
    List<Contacts> contacts = dictionary.get(addressBookName);
 contacts.stream().sorted().forEach(Collections.sort(Contacts, new Comparator<Contacts>() {
     public int compare(Student s1, Student s2) {
         // notice the cast to (Integer) to invoke compareTo
         return ((Integer)s1.getScore()).compareTo(s2.getScore());
     }
 });
}
}
