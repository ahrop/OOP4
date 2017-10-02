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
public class MainWinner {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ExtraPrize payung = new ExtraPrize();
        payung.setExtraPrizeName("Payung");
        payung.setExtraPrizeAmount(35000.0);
        
        ExtraPrize piring = new ExtraPrize();
        piring.setExtraPrizeName("Piring cantik");
        piring.setExtraPrizeAmount(10000);
        
        ExtraPrize panci = new ExtraPrize();
        panci.setExtraPrizeName("Panci");
        panci.setExtraPrizeAmount(35000.0);
        
        ExtraPrize baju = new ExtraPrize();
        baju.setExtraPrizeName("Baju Baru");
        baju.setExtraPrizeAmount(10000);
        
        List<ExtraPrize> ep = new ArrayList<>();
        ep.add(payung);
        ep.add(piring);
        ep.add(panci);
        ep.add(baju);
        
        Prize prize = new Prize();
        prize.setPrizeCategory("Pertama");
        prize.setExtraPrize(ep);
        
        Winner aku = new Winner();
        aku.setWinnerName("Ropandi");
        aku.setWinnerPrize(prize);
        aku.getWinnerPrize().calcultateAmountTotalPrize();
        String fmx = String.format("%,.2f",aku.getWinnerPrize().calcultateAmountTotalPrize());
        System.out.println("Pemenang bernama " +aku.getWinnerName()+", memenangkan hadiah kategory "
                +aku.getWinnerPrize().getPrizeCategory()+" dengan hadiah total sebesar Rp. "
                + fmx + " dengan extra hadiah berupa : " + aku.getWinnerPrize().listExtraPrize());
        // TODO code application logic here
    }
    
}
