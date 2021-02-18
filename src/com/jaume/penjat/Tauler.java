package com.jaume.penjat;

public class Tauler {
    private char[] paraulaSecreta;
    private String[] palabraEndevinada;
    private int intents;
    private int totalIntents;
    
    public Tauler(){
        paraulaSecreta = new char[0];
        palabraEndevinada = new String[0];
        intents = 0;
        totalIntents = 0;
    }
    
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

    public void inicialitzarPartida(String palabra, int intentos){
        this.paraulaSecreta = new char[palabra.length()];
        for(int i =0; i <palabra.length(); i++){
            this.paraulaSecreta[i] = palabra.charAt(i);
        }
        this.palabraEndevinada = new String[palabra.length()];
        for(int i = 0 ; i < palabra.length(); i++){
            if(palabra.charAt(i) == new Character(' ')){
                this.palabraEndevinada[i] = " ";
            } 
        }
        
        this.setIntents(intentos);
        this.setTotalIntents(intentos);
    }





    public String imprimir(){
        String resultat = "";
        for(int i = 0; i < palabraEndevinada.length; i++){
            if(palabraEndevinada[i] == null){
                resultat = resultat+"_";

            }else if(palabraEndevinada[i] == " "){
                    resultat = resultat+" ";
            }else{
                resultat = resultat+palabraEndevinada[i];
            }
        }
        return resultat;
    }


}
