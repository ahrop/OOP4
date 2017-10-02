/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.co.indocyber;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author user
 */
public class EmployeeMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, IOException, ParseException {
        File file = new File("D:\\DataBase.txt");
        FileReader fileReader = new FileReader(file);
        BufferedReader reader = new BufferedReader(fileReader);
        List <Employee> employeeList = new ArrayList<>();
        SimpleDateFormat df = new SimpleDateFormat("dd-MM-yyyy");
        String line = null;
        while ((line = reader.readLine()) != null) {
//            System.out.println(line);
            String []split = line.split(",");
//            System.out.println(split);
            Employee emp = new Employee(split[0],new Department(split[1].trim()), new IdCard(split[2].trim(),df.parse(split[3].trim())), Double.parseDouble(split[4].trim()));
            employeeList.add(emp);
//            System.out.println((new Department(split[1].trim())).getDeptName());
        }
        System.out.println(employeeList.size());
//        System.out.println(employeeList.lastIndexOf());
    }
    
}
 