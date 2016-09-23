/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author laurent
 */
public abstract class Forme {
    
    private int aire;
    
    public int getAire(){
        return aire;
    }
    
    public void setAire(){
        this.aire = aire;
    }
    
    public abstract void dessiner();
    
}
