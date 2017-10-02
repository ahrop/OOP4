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
public class Winner {

    private String WinnerName;
    private String gender;
    private Prize winnerPrize;

    /**
     * @return the WinnerName
     */
    public String getWinnerName() {
        return WinnerName;
    }

    /**
     * @param WinnerName the WinnerName to set
     */
    public void setWinnerName(String WinnerName) {
        this.WinnerName = WinnerName;
    }

    /**
     * @return the winnerPrize
     */
    public Prize getWinnerPrize() {
        return winnerPrize;
    }

    /**
     * @param winnerPrize the winnerPrize to set
     */
    public void setWinnerPrize(Prize winnerPrize) {
        this.winnerPrize = winnerPrize;
    }

    /**
     * @return the gender
     */
    public String getGender() {
        return gender;
    }

    /**
     * @param gender the gender to set
     */
    public void setGender(String gender) {
        this.gender = gender;
    }

}
