/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import handReader.HandReader;

/**
 *
 * @author Juuso
 */
public class HeadsupHUD {
    public static void main(String[] args) {

        HandReader handreader = new HandReader();
        handreader.lataaTiedostonSisalto();
        handreader.tulosta();
             
    }
}
