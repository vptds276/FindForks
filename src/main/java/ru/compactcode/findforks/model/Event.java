/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ru.compactcode.findforks.model;

import java.awt.List;
import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author compactcode.ru
 * @Version 1.0
 *
 */
public class Event implements Serializable {

    private String command_1;
    private String command_2;
    private float koeff_1;
    private float koeff_1x2;
    private float koeff_2;

    public Event() {
    }

    public Event(String command_1, String command_2, float koeff_1, float koeff_1x2, float koeff_2) {
        this.command_1 = command_1;
        this.command_2 = command_2;
        this.koeff_1 = koeff_1;
        this.koeff_1x2 = koeff_1x2;
        this.koeff_2 = koeff_2;
    }

//    public Event getEvent(){
//        Event event = new Event(this.command_1, this.command_2, this.koeff_1, this.koeff_1x2, this.koeff_2);
//        return event;
//    }
    /**
     *
     * @return
     */
    public ArrayList<Float> getKoeefs() {
        ArrayList<Float> numbers = new ArrayList<Float>();
        numbers.add(koeff_1);
        numbers.add(koeff_1x2);
        numbers.add(koeff_2);
        return numbers;
    }

    public float getKoeff_1() {
        return koeff_1;
    }

    public void setKoeff_1(float koeff_1) {
        this.koeff_1 = koeff_1;
    }

    public float getKoeff_x() {
        return koeff_1x2;
    }

    public void setKoeff_x(float koeff_1x2) {
        this.koeff_1x2 = koeff_1x2;
    }

    public float getKoeff_2() {
        return koeff_2;
    }

    public void setKoeff_2(float koeff_2) {
        this.koeff_2 = koeff_2;
    }

    @Override
    public String toString() {
        return "Event{" + "command_1=" + command_1
                + ", command_2=" + command_2
                + ", koeff_1=" + koeff_1
                + ", koeff_x=" + koeff_1x2
                + ", koeff_2=" + koeff_2 + '}';
    }

}
