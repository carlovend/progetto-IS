package org.example;

public class Calcolatrice {

    public float sum(float a, float b){
        return a+b;
    }

    public float sub(float a, float b){
        return a-b;
    }

    public float mol(float a, float b){
        return a*b;
    }

    public float div(float a, float b) throws Exception {
        if(b!=0){
            return a/b;
        }
        throw new Exception("Impossibile");
    }
}
