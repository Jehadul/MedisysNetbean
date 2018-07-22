/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logictest;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
import javax.sound.midi.SysexMessage;

/**
 *
 * @author HP
 */
public class LogicTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int x = 10;
        int y = 20;
        System.out.println("Before swap:");
        System.out.println("x value: "+x+" and y value: "+y);
        x = x+y;
        y=x-y;
        x=x-y;
        System.out.println("After swap:");
        System.out.println("x value: "+x+" and y value: "+y);
    }
}
