/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labfacade;

import model.*;
/**
 *
 * @author laurent
 */
public class LabFacade {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        FacadeForme maMaisonDesObjets   =   new FacadeForme();
        
        maMaisonDesObjets.dessineLeCercle();
        maMaisonDesObjets.dessineLeCarre();
    }
    
}
