/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package casa;

/**
 *
 * @author Pedro
 */
public class Porta {
    private boolean aberta = true;
    private String cor;
    private double dimensaoX;
    private double dimensaoY;
    private double dimensaoZ;

    public boolean isAberta() {
        return aberta;
    }

    public void setAberta(boolean aberta) {
        this.aberta = aberta;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public double getDimensaoX() {
        return dimensaoX;
    }

    public void setDimensaoX(double dimensaoX) {
        this.dimensaoX = dimensaoX;
    }

    public double getDimensaoY() {
        return dimensaoY;
    }

    public void setDimensaoY(double dimensaoY) {
        this.dimensaoY = dimensaoY;
    }

    public double getDimensaoZ() {
        return dimensaoZ;
    }

    public void setDimensaoZ(double dimensaoZ) {
        this.dimensaoZ = dimensaoZ;
    }
    
    public void abre(){
        isAberta();
    }
    
    public void fecha(){
        setAberta(false);
    }
    
    public void mudaCor(String nova){
        this.setCor(nova);
    }
    
    public void mostra(){
        System.out.println("\nCor: "+getCor());
        System.out.println("Dimensão X: "+getDimensaoX());
        System.out.println("Dimensão Y: "+getDimensaoY());
        System.out.println("Dimensão Z: "+getDimensaoZ());
        System.out.println("Está aberta? "+isAberta());
    }
}
