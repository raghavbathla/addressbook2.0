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

}
