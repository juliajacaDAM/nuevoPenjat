package com.jaume.penjat;

public class Tauler {
    private char[] paraulaSecreta;
    private String[] palabraEndevinada;
    private int intents;
    private int totalIntents;

    public char[] getParaulaSecreta() {
        return paraulaSecreta;


    }

    public void setParaulaSecreta(char[] paraulaSecreta) {
        this.paraulaSecreta = paraulaSecreta;
    }





    public String[] getPalabraEndevinada() {
        return palabraEndevinada;
    }

    public void setPalabraEndevinada(String[] palabraEndevinada) {
        this.palabraEndevinada = palabraEndevinada;
    }

    public int getIntents() {
        return intents;
    }

    public void setIntents(int intents) {
        this.intents = intents;
    }

    public int getTotalIntents() {
        return totalIntents;
    }

    public void setTotalIntents(int totalIntents) {
        this.totalIntents = totalIntents;
    }
}
