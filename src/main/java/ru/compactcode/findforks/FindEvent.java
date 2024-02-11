/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ru.compactcode.findforks;

/**
 *
 * @author dim
 */
public class FindEvent {

 
    float proffit = 0;

    public FindEvent(float[][] koeff) {
        int razmI = koeff.
    }

    public FindEvent(float k11, float k11xk12, float k12, float k21, float k21xk22, float k22) {

        koeff[0][0] = k11;
        koeff[0][1] = k11xk12;
        koeff[0][2] = k12;

        koeff[1][0] = k21;
        koeff[1][1] = k21xk22;
        koeff[1][2] = k22;
    }

    private String bookm1stName;
    private String bookm2stName;

    private float k11;
    private float k12;
    private float k11xk12;

    private float k21;
    private float k22;
    private float k21xk22;

    //P = 1 / K1 + 1 / K2 + … + 1 / Kn, 
    //где Sp — вероятность в десятичной дроби, 
    //K1, K2, Kn — коэффициенты на выборы одного рынка, 
    //n – количество выборов на этом рынке.
    public float getProfit2x(int x1, int x2, int y1, int y2) {
        int bookm1;
        int bookm2;
        float win1k1b1 = 1 / koeff[0][0];
        float win1k2b2 = 1 / koeff[2][1];

        float win2k2b1 = 1 / koeff[0][1];
        float win2k1b2 = 1 / koeff[2][0];

        float proffit = (1 / win1k1b1) + (1 / win1k2b2);
        return 1 - proffit;

    }

    public float getProfitBookm() {
        return 0;
    }

}
