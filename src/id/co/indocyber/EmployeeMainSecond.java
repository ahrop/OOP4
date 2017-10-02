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
public class EmployeeMainSecond {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, IOException, ParseException {
        File file = new File("D:\\DataBase.txt");
        FileReader fileReader = new FileReader(file);
        BufferedReader reader = new BufferedReader(fileReader);
        List<Employee> employeeList = new ArrayList<>();
        String line = null;
        Department dept;
        IdCard kartu;
        SimpleDateFormat df = new SimpleDateFormat("dd-MM-yyyy");
        double gaji;
        while ((line = reader.readLine()) != null) {
            String[] split = line.split(",");
            dept = new Department(split[1].trim());
            kartu = new IdCard(split[2].trim(), df.parse(split[3].trim()));
            gaji = Double.parseDouble(split[4]);
            Employee emp = new Employee(split[0], dept, kartu, gaji);
            employeeList.add(emp);
            emp.getDept().getDeptName();
        }
        System.out.println(employeeList.size());
    }

}
