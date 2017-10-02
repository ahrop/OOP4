/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.co.indocyber;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author user
 */
public class Stringdate {

    public static void main(String[] args) throws ParseException {
        SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy"); //memformat tanggal ke format tertentu
        Date d = df.parse("25/8/2017"); //memparsing tanggal
        System.out.println(d);

        Date s = df.parse("1/1/2018");
        System.out.println(s);

        Date now = new Date();
        String skrg = df.format(now);
        System.out.println(skrg);
        
        SimpleDateFormat dff = new SimpleDateFormat("dd-MM-yyyy");
        Date dd = dff.parse("25-12-2017");
        System.out.println(dd);
        
        boolean exp1 =  d.before(now);
        boolean exp2 =  s.before(now);
        
        System.out.println("Kartu satu expired: " + exp1);
        System.out.println("Kartu dua expired: " + exp2);
    }

}
