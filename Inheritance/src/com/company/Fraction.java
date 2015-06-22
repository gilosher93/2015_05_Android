package com.company;

/**
 * Created by eladlavi on 6/22/15.
 */
public class Fraction extends Number {


    private int numerator;
    private int denominator = 1;

    public Fraction(int numerator, int denominator){
        this.denominator = 1;
        setNumerator(numerator);
        setDenominator(denominator);
    }

    public void setNumerator(int numerator){
        this.numerator = numerator;
    }

    public int getNumerator(){
        return numerator;
    }

    public void setDenominator(int denominator){
        if(denominator != 0)
            this.denominator = denominator;
    }

    public int getDenominator(){
        return denominator;
    }

    @Override
    public String toString() {
        return numerator + "/" + denominator;
    }

    @Override
    public int intValue() {
        return numerator / denominator;
    }

    @Override
    public long longValue() {
        return numerator / denominator;
    }

    @Override
    public float floatValue() {
        return numerator / (float)denominator;
    }

    @Override
    public double doubleValue() {
        return numerator / (double)denominator;
    }

    public void print(){
        System.out.println("  " + numerator);
        System.out.println("-----");
        System.out.println("  " + denominator);
    }
}
