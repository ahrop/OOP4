/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.co.indocyber;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author user
 */
public class Company {
    private List<Department> departments; // ini boleh : private List<Department> departments = new ArrayList<>(); ;
    
    private String companyName;

    public Company() {
        departments = new ArrayList<>();
    }

    public Company(List<Department> departments, String companyName) {
        this.departments = departments;
        this.companyName = companyName;
    }
    

    /**
     * @return the departments
     */
    public List<Department> getDepartments() {
        return departments;
    }

    /**
     * @param departments the departments to set
     */
    public void setDepartments(List<Department> departments) {
        this.departments = departments;
    }

    /**
     * @return the companyName
     */
    public String getCompanyName() {
        return companyName;
    }

    /**
     * @param companyName the companyName to set
     */
    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }
    
    public double calculateTotalCompanySalary(){
        double total = 0.0;
        for (Department d : departments){
            total += d.calculateTotalSalary();
        }
        return total;
    }
    
    public int jumlahKartuExpired(){
        int jumlah = 0;
        
        for (Department d : departments){
            jumlah += d.cariKartuExpired();
        }
        
        return jumlah;
    }
    
    
}
