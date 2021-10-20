package addressBook;

import com.opencsv.exceptions.CsvDataTypeMismatchException;
import com.opencsv.exceptions.CsvRequiredFieldEmptyException;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class AdressBooKAdd {


    public ArrayList<Contacts> addressBook() throws CsvRequiredFieldEmptyException, CsvDataTypeMismatchException, IOException {

ArrayList<Contacts> arrayList = new ArrayList<>();
        boolean flag = true;
        Scanner sc = new Scanner(System.in);
        AddressBook addressBook = new AddressBook();
        while (flag) {
            System.out.println("Enter 1 for add, 2 for edit, 3 for delete,4 for print, 5 for write with csv, 6 read with csv 0 for exit ,");
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
                    addressBook.writeDataUsingCSV();
                    break;
                case 6:
                    addressBook.readDataUsingCSV();
                    break;
                case 0:
                    flag = false;
                    break;
            }
        }
        return arrayList;
    }

}