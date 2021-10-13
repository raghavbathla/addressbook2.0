package addressBook;

import java.util.ArrayList;
import java.util.Scanner;

public class AdressBooKAdd {


    public ArrayList<Contacts> addressBook() {

ArrayList<Contacts> arrayList = new ArrayList<>();
        boolean flag = true;
        Scanner sc = new Scanner(System.in);
        AddressBook addressBook = new AddressBook();
        while (flag) {
            System.out.println("Enter 1 for add, 2 for edit, 3 for delete,4 for print, 5 for exit");
            switch (sc.nextInt()) {
                case 1:
                arrayList =   addressBook.addData();
                    break;
                case 2:
                    System.out.println("Enter first name to edit");
                    String nameToEdit = sc.nextLine();
                    addressBook.edit(nameToEdit);
                    break;
                case 3:
                    System.out.println("Enter first name to delete");
                    String name = sc.nextLine();
                    addressBook.delete(name);
                    break;
                case 4:
                    addressBook.showData();
                    break;
                case 5:
                    flag = false;
                    break;
            }
        }
        return arrayList;
    }

}