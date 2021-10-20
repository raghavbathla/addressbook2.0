package addressBook;

import com.opencsv.CSVReader;
import com.opencsv.CSVReaderBuilder;
import com.opencsv.bean.StatefulBeanToCsv;
import com.opencsv.bean.StatefulBeanToCsvBuilder;
import com.opencsv.exceptions.CsvDataTypeMismatchException;
import com.opencsv.exceptions.CsvRequiredFieldEmptyException;

import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class AddressBook {

 ArrayList<Contacts> arrayList = new ArrayList<>();
    Scanner scanner;

    public AddressBook() {
        this.scanner = new Scanner(System.in);
    }
    public ArrayList<Contacts> addData(){



        System.out.println("Enter all the details");
        System.out.println("First Name");
        String fname = scanner.nextLine();

        System.out.println("Last Name");
        String lname = scanner.nextLine();
        System.out.println("Address");
        String address = scanner.nextLine();
        System.out.println("City");
        String city = scanner.nextLine();
        System.out.println("state");
        String state = scanner.nextLine();
        System.out.println("zip");
        String zip = scanner.nextLine();
        System.out.println("PhoneNumber");
        String phone = scanner.nextLine();
        System.out.println("Email");
        String email = scanner.nextLine();

        arrayList.add(new Contacts(fname,lname,address,city,state,zip,phone,email));
        System.out.println("Data added Successfully");
        return arrayList;

    }
    public void edit(String name){
        for (int i=0;i<arrayList.size();i++){
            if(arrayList.get(i).getFirstName()==name){
                System.out.println("Enter  the new  details");
                System.out.println("First Name");
                String fname = scanner.nextLine();
                System.out.println("Last Name");
                String lname = scanner.nextLine();
                System.out.println("Address");
                String address = scanner.nextLine();
                System.out.println("City");
                String city = scanner.nextLine();
                System.out.println("state");
                String state = scanner.nextLine();
                System.out.println("zip");
                String zip = scanner.nextLine();
                System.out.println("PhoneNumber");
                String phone = scanner.nextLine();
                System.out.println("Email");
                String email = scanner.nextLine();
                arrayList.set(i,new Contacts(fname,lname,address,city,state,zip,phone,email));
                System.out.println("Data updated successfully");
                break;
            }
        }

    }
    public  void delete(String name)
    {
        for (int i =0; i<arrayList.size(); i++){
            if(arrayList.get(i).getFirstName()==name){
                arrayList.remove(i);
                System.out.println("Deleted Successful");
                break;
            }
        }
    }
    public void showData(){
        for(int i =0 ;i<arrayList.size();i++){
            System.out.println(arrayList.get(i).getFirstName());
            System.out.println(arrayList.get(i).getLastName());
            System.out.println(arrayList.get(i).getAddress());
            System.out.println(arrayList.get(i).getCity());
            System.out.println(arrayList.get(i).getZip());
            System.out.println(arrayList.get(i).getState());
            System.out.println(arrayList.get(i).getPhoneNumber());
            System.out.println(arrayList.get(i).getEmail());

        }

    }
    public  void writeDataUsingCSV() throws IOException, CsvDataTypeMismatchException, CsvRequiredFieldEmptyException {
        try (Writer writer = Files.newBufferedWriter(Paths.get("Contacts.csv"));) {
            StatefulBeanToCsvBuilder<Contacts> builder = new StatefulBeanToCsvBuilder<>(writer);
            StatefulBeanToCsv<Contacts> beanWriter = builder.build();
            beanWriter.write(arrayList);
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public  void readDataUsingCSV() throws IOException {
        try (Reader reader = Files.newBufferedReader(Paths.get("Contacts.csv"));
             CSVReader csvReader = new CSVReaderBuilder(reader).withSkipLines(1).build();) {
            String[] nextRecord;
            while ((nextRecord = csvReader.readNext()) != null) {
                System.out.println("First Name  " + nextRecord[3]);
                System.out.println("Last Name  " + nextRecord[4]);
                System.out.println("Address  " + nextRecord[0]);
                System.out.println("City  " + nextRecord[2]);
                System.out.println("State  " + nextRecord[6]);
                System.out.println("Phone  " + nextRecord[5]);
                System.out.println("Zip  " + nextRecord[7]);
            }
        }
    }
}
