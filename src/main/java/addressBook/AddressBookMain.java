package addressBook;


import java.util.*;


public class AddressBookMain {
    public static void main(String[] args) {

        System.out.println("Welcome to address Book");
        System.out.println("Enter the number of address Book");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
AdressBooKAdd adressBooKAdd = new AdressBooKAdd();
        Dictionary<String , ArrayList<Contacts>> dictionary = new Hashtable<String , ArrayList<Contacts>>();
        for (int i = 1; i <= num; i++) {
            System.out.println("Enter the name of address book");
sc.nextLine();
            String name = sc.nextLine();
            System.out.println("Enter the data of  " +i+ " book");
            dictionary.put(name, adressBooKAdd.addressBook());
            sc.nextLine();
        }
        System.out.println("The Dictionary is: " + dictionary);


    }
}
