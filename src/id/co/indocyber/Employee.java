/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.co.indocyber;

/**
 *
 * @author user
 */
public class Employee {
    private String name;
    private Department dept;
    private IdCard empCard;
    private double salary;

    public Employee() {
    }

    public Employee(String name, Department dept, IdCard emCard, double salary) {
        this.name = name;
        this.dept = dept;
        this.empCard= emCard;
        this.salary = salary;
        
    }
    

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the dept
     */
    public Department getDept() {
        return dept;
    }

    /**
     * @param dept the dept to set
     */
    public void setDept(Department dept) {
        this.dept = dept;
    }

    /**
     * @return the empCard
     */
    public IdCard getEmpCard() {
        return empCard;
    }

    /**
     * @param empCard the empCard to set
     */
    public void setEmpCard(IdCard empCard) {
        this.empCard = empCard;
    }

    /**
     * @return the salary
     */
    public double getSalary() {
        return salary;
    }

    /**
     * @param salary the salary to set
     */
    public void setSalary(double salary) {
        this.salary = salary;
    }
    
    
}
