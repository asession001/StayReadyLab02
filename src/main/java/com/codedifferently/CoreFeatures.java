package com.codedifferently;

public class CoreFeatures {
    
    public double add (double num){
        return SciCalculator.currentValue + num;
    }

    public double subtract (double num){
        return SciCalculator.currentValue - num;
    }

    public double divide (double num){
        return SciCalculator.currentValue / num;
    }

    public double multiply (double num){
        return SciCalculator.currentValue * num;
    }

    public double square (double num){
        return SciCalculator.currentValue * SciCalculator.currentValue;
    }

    public double squareRoot (double num){
        return Math.sqrt(SciCalculator.currentValue);
    }

    public double inverse (double num){
        return SciCalculator.currentValue * -1;
    }
    
    public double factorial (double num){
        return SciCalculator.currentValue + num;
    }

    public double switchSign (double num){
        return SciCalculator.currentValue + num;
    }
    
}