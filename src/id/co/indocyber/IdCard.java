/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.co.indocyber;

import java.util.Date;

/**
 *
 * @author user
 */
public class IdCard {
    
    private String kode;
    private Date expiredDate;
    private Employee employee;
    
    public IdCard() {
    }

    public IdCard(String kode, Date expiredDate) {
        this.kode = kode;
        this.expiredDate = expiredDate;
    }

    
    /**
     * @return the kode
     */
    public String getKode() {
        return kode;
    }

    /**
     * @param kode the kode to set
     */
    public void setKode(String kode) {
        this.kode = kode;
    }

    /**
     * @return the expiredDate
     */
    public Date getExpiredDate() {
        return expiredDate;
    }

    /**
     * @param expiredDate the expiredDate to set
     */
    public void setExpiredDate(Date expiredDate) {
        this.expiredDate = expiredDate;
    }

    /**
     * @return the employee
     */
    public Employee getEmployee() {
        return employee;
    }

    /**
     * @param employee the employee to set
     */
    public void setEmployee(Employee employee) {
        this.employee = employee;
    }
    
}
