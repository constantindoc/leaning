/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.home.mavenspringstudy.performer;

/**
 *
 * @author Константин
 */
public class Juggler implements Performer {
    
    private int beanBags = 3;
    
    public Juggler() {}
    
    public Juggler(int beanBags) {
        this.beanBags = beanBags;
    }

    public void performer() {
        System.out.println("Жонглер с " + beanBags + " шарами...");
    }
    
}
