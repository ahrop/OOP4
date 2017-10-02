/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.co.indocyber;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;

/**
 *
 * @author user
 */
public class Oop4 {
    
    public static void main(String[] args) throws ParseException {
        
//        SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
//        
//        Employee staff = new Employee();
//        staff.setName("Mr. Andrea");
//        staff.setSalary(4000000.0);
//        IdCard andreaCard = new IdCard("ID0001", df.parse("23/09/2017"));
//        staff.setEmpCard(andreaCard);
//        System.out.println(staff.getName() + " kartu expired " + staff.getEmpCard().getExpiredDate());
//        
//        Employee oldStaff = new Employee();
//        oldStaff.setName("Widodo");
//        oldStaff.setSalary(15000000.0);
//        oldStaff.setEmpCard(new IdCard("ID0002", df.parse("31/12/2040")));
//        System.out.println(oldStaff.getName() + " kartu expired " + oldStaff.getEmpCard().getExpiredDate());
//        
////        Department deptFinance = new Department();
////        deptFinance.setDeptName("Bagian Keuangan");
//
//        //sebenernya bisa koding seperti di bawah ini, tapi usahakan jangan
//        //BISA, TAPI TIDAK EFISIEN
//        //bagian kiri selalu referensi (merujuk)
//        List employeesOfFinance = deptFinance.getEmployees();
//        Employee financeSecretary = new Employee();
//        financeSecretary.setName("Santi");
//        financeSecretary.setSalary(9000000.0);
//        employeesOfFinance.add(financeSecretary);
//        financeSecretary.setEmpCard(new IdCard("ID0003", df.parse("21/12/2020")));
//        System.out.println(financeSecretary.getName() + " kartu expired " + financeSecretary.getEmpCard().getExpiredDate());
//
//        // REKOMENDASI GUNAKAN PEMANGGILAN SEPERTI DI BAWAH INI
//        deptFinance.getEmployees().add(staff);
//        deptFinance.getEmployees().add(oldStaff);
//        
//        Company ptSusuGelas = new Company();
//        ptSusuGelas.setCompanyName("PT. Susu Gelas Segar Sejahtera");
//        
//        Department deptHrd = new Department();
//        deptHrd.setDeptName("Bagian HRD");
//        Department deptProduksi = new Department();
//        deptProduksi.setDeptName("Bagian Produksi");
//        
//        Employee bossHrd = new Employee();
//        bossHrd.setName("Agus");
//        bossHrd.setSalary(8000000);
//        bossHrd.setEmpCard(new IdCard("ID0004", df.parse("31/12/2005")));
//        System.out.println(bossHrd.getName() + " kartu expired " + bossHrd.getEmpCard().getExpiredDate());
//        
//        Employee wakilBosHrd = new Employee();
//        wakilBosHrd.setName("Malih");
//        wakilBosHrd.setSalary(6000000);
//        wakilBosHrd.setEmpCard(new IdCard("ID0005", df.parse("31/12/2016")));
//        System.out.println(wakilBosHrd.getName() + " kartu expired " + wakilBosHrd.getEmpCard().getExpiredDate());
//        
//        Employee staffHrd = new Employee();
//        staffHrd.setName("Sandi");
//        staffHrd.setSalary(40000000);
//        staffHrd.setEmpCard(new IdCard("ID0006", df.parse("31/10/2014")));
//        System.out.println(staffHrd.getName() + " kartu expired " + staffHrd.getEmpCard().getExpiredDate());
//        
//        Employee bossProduksi = new Employee();
//        bossProduksi.setName("Budi");
//        bossProduksi.setSalary(9000000);
//        bossProduksi.setEmpCard(new IdCard("ID0007", df.parse("31/10/2018")));
//        System.out.println(bossProduksi.getName() + " kartu expired " + bossProduksi.getEmpCard().getExpiredDate());
//        
//        Employee wakilBossProduksi = new Employee();
//        wakilBossProduksi.setName("Yanto");
//        wakilBossProduksi.setSalary(7000000);
//        wakilBossProduksi.setEmpCard(new IdCard("ID0008", df.parse("31/12/2015")));
//        System.out.println(wakilBossProduksi.getName() + " kartu expired " + wakilBossProduksi.getEmpCard().getExpiredDate());
//        
//        Employee staffProduksi = new Employee();
//        staffProduksi.setName("Ujang");
//        staffProduksi.setSalary(4500000);
//        staffProduksi.setEmpCard(new IdCard("ID0009", df.parse("31/12/2010")));
//        System.out.println(staffProduksi.getName() + " kartu expired " + staffProduksi.getEmpCard().getExpiredDate());
//
//        // karyawan baru
//        System.out.println("Jumlah Karyawan " + deptFinance.getDeptName() + " ada " + deptFinance.getEmployees().size());
//        System.out.println("Jumlah Karyawan " + deptHrd.getDeptName() + " ada " + deptHrd.getEmployees().size());
//        System.out.println("Jumlah Karyawan " + deptProduksi.getDeptName() + " ada " + deptProduksi.getEmployees().size());
//
////        //hitung jumlah gaji yang dikeluarkan untuk dept finance
////        double total = 0.0;
////        for (Employee e : deptFinance.getEmployees()){
////            total += e.getSalary();
////        }
////        
////        System.out.printf("Total gaji yang dikeluarkan dept finance : %,.2f", total);
////        System.out.println("");
//        //memasukkan objek employee ke departement
//        deptHrd.getEmployees().add(bossHrd);
//        deptHrd.getEmployees().add(wakilBosHrd);
//        deptHrd.getEmployees().add(staffHrd);
//        deptProduksi.getEmployees().add(bossProduksi);
//        deptProduksi.getEmployees().add(wakilBossProduksi);
//        deptProduksi.getEmployees().add(staffProduksi);
//
//        //memasukkan objek department ke perusahaan;
//        ptSusuGelas.getDepartments().add(deptFinance);
//        ptSusuGelas.getDepartments().add(deptHrd);
//        ptSusuGelas.getDepartments().add(deptProduksi);
//        
//        System.out.printf("Total gaji yang dikeluarkan dept finance : %,.2f", deptFinance.calculateTotalSalary());
//        System.out.println("");
//        System.out.printf("Total gaji yang dikeluarkan dept hdd : %,.2f", deptHrd.calculateTotalSalary());
//        System.out.println("");
//        System.out.printf("Total gaji yang dikeluarkan dept produksi : %,.2f", deptProduksi.calculateTotalSalary());
//        System.out.println("");
//        System.out.printf("Total gaji yang dikeluarkan perusahaan : %,.2f", ptSusuGelas.calculateTotalCompanySalary());
//        System.out.println("");
//        System.out.println("");
//        System.out.println("Total kartu yang expired di dept finance sebanyak : " + deptFinance.cariKartuExpired());
//        System.out.println("Total kartu yang expired di dept hrd sebanyak : " + deptHrd.cariKartuExpired());
//        System.out.println("Total kartu yang expired di dept produksi sebanyak : " + deptProduksi.cariKartuExpired());
//        System.out.println("Total kartu yang expired di perusahaan sebanyak : " + ptSusuGelas.jumlahKartuExpired());
//        System.out.println("");

//        double total = 450000000000000.0;
//        System.out.println("Weird: " + total);
//        System.out.printf("Total %,f", total);
//        System.out.println("");
    }
    
}
