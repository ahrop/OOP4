/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.co.indocyber;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author user
 */
public class Department {

    private List<Employee> employees; // menunjukkan 1 department memiliki banyak karyawan
    private String deptName;
    private Company comp;

    public Department(String depatmentName) {
        this.deptName = depatmentName; 
        employees = new ArrayList<>();
    }

    /**
     * @return the employees
     */
    public List<Employee> getEmployees() {
        return employees;
    }

    /**
     * @param employees the employees to set
     */
    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }

    /**
     * @return the deptName
     */
    public String getDeptName() {
        return deptName;
    }

    /**
     * @param deptName the deptName to set
     */
    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public double calculateTotalSalary() {
        double total = 0.0;
        for (Employee e : employees) {
            total += e.getSalary();
        }
        return total;
    }

    public int cariKartuExpired() {
        Date now = new Date();
        int jumlah = 0;
        for (Employee e : employees) {
            if (e.getEmpCard().getExpiredDate().before(now)) {
                jumlah++;
            }
        }

        return jumlah;
    }

    /**
     * @return the comp
     */
    public Company getComp() {
        return comp;
    }

    /**
     * @param comp the comp to set
     */
    public void setComp(Company comp) {
        this.comp = comp;
    }

}
