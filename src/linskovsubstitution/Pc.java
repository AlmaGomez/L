/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linskovsubstitution;

/**
 *
 * @author almaangelica
 */
public class Pc implements Plataforma {
    //sobreescribe el metodo de la interfaz
    @Override
    public void Jugar(){
        System.out.println("Bienvenido a la MasterRace <3");
    }
}
