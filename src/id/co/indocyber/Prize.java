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
public class Prize {
    private String prizeCategory;
    private double amountPrize;
    private List <ExtraPrize> extraPrize;

    public Prize() {
    }

    public Prize(String prizeCategory, double totalPrize, List<ExtraPrize> extraPrize) {
        this.prizeCategory = prizeCategory;
        this.amountPrize = totalPrize;
        this.extraPrize = new ArrayList<>();
    }
   private double calculateAmountExtraPrize() {
       double total = 0.0;
       for (ExtraPrize extra: getExtraPrize()) {
           total += extra.getExtraPrizeAmount();
           
       }
       return total;
   }
  public double calcultateAmountTotalPrize() {
      double total = 0.0;
             total = getAmountPrize() + calculateAmountExtraPrize();
      return total;
  }
  public String listExtraPrize() {
      int count = 0;
      StringBuilder sb = new StringBuilder();
      for (ExtraPrize extraPrize1 : extraPrize) {
          count ++;
          sb.append(extraPrize1.getExtraPrizeName());
          if(count != extraPrize.size() && count != (extraPrize.size()-1)) {
          sb.append(", ");
          } else if ( count == (extraPrize.size() - 1) && count != extraPrize.size()) {
          sb.append(" dan ");
          }else {
          sb.append(".");
          }
          
          
  }
      return sb.toString();
  
  }
    /**
     * @return the prizeCategory
     */
    public String getPrizeCategory() {
        return prizeCategory;
    }

    /**
     * @param prizeCategory the prizeCategory to set
     */
    public void setPrizeCategory(String prizeCategory) {
        this.prizeCategory = prizeCategory;
    }

    /**
     * @return the amountPrize
     */
    public double getAmountPrize() {
        return 1000000.0;
    }

    /**
     * @param amountPrize the amountPrize to set
     */

    /**
     * @return the extraPrize
     */
    public List <ExtraPrize> getExtraPrize() {
        return extraPrize;
    }

    /**
     * @param extraPrize the extraPrize to set
     */
    public void setExtraPrize(List <ExtraPrize> extraPrize) {
        this.extraPrize = extraPrize;
    }
}
