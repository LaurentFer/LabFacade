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
public class FacadeForme {
    
    private Forme monCercle;
    private Forme monCarre;
    
    public FacadeForme(){
        monCercle   =   new Cercle();
        monCarre    =   new Carre();
    }
    
    public void dessineLeCercle(){
        monCercle.dessiner();
    }
    
    public void dessineLeCarre(){
        monCarre.dessiner();
    }
    
}
