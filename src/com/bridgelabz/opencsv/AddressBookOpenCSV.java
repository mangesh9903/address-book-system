package com.bridgelabz.opencsv;

import com.bridgelabz.model.Contact;
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
import java.util.List;

/*********************************************************************
 * Purpose: Class for Write And Read Data From CSV File Using OpenCSV Library. .
 *
 * @author Mangesh Bhujang
 * @version 1.0
 * @since 07-03-2022
 *
 **********************************************************************/
public class AddressBookOpenCSV {

    /**
     * Method :- Method For Write data In the CSV File.
     *
     * @param contactList passing ContactList as a Input
     * @throws IOException
     */
    public void writeDataToCSV(List<Contact> contactList) throws IOException {
        Writer writer = Files.newBufferedWriter(Paths.get("Contacts.csv"));
        try {
            StatefulBeanToCsvBuilder builder = new StatefulBeanToCsvBuilder(writer);
            StatefulBeanToCsv beanWriter = builder.build();
            beanWriter.write(contactList);
        } catch (CsvRequiredFieldEmptyException e) {
            e.printStackTrace();
        } catch (CsvDataTypeMismatchException e) {
            e.printStackTrace();
        } finally {
            writer.close();
        }
    }

    /**
     * Method :- Method for read Data From CSV File Using OpenCSV Libraray.
     *
     * @throws IOException
     */
    public void readDataFromCSV() {
        Reader reader = null;
        try {
            reader = Files.newBufferedReader(Paths.get("Contacts.csv"));
            CSVReader csvReader = new CSVReaderBuilder(reader).withSkipLines(1).build();
            String[] nextRecord;
            while ((nextRecord = csvReader.readNext()) != null) {
                System.out.println("First Name = " + nextRecord[3]);
                System.out.println("Last Name = " + nextRecord[4]);
                System.out.println("Address = " + nextRecord[0]);
                System.out.println("City = " + nextRecord[1]);
                System.out.println("State = " + nextRecord[2]);
                System.out.println("Email = " + nextRecord[6]);
                System.out.println("Phone Number = " + nextRecord[5]);
                System.out.println("Zip Code = " + nextRecord[7]);
                System.out.println("----------------------------------");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
