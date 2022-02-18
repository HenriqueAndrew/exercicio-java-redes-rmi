package com.henriqueandrew.prova;

// @author Henrique Andrew da Silva

import java.rmi.Naming;


public class CalculadoraServidor {
    
    CalculadoraServidor(){
        try{
            Calculadora c = new CalculadoraOperacoes();
            Naming.rebind("RMI://127.0.0.1:1020/Calculadora", c);
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
    
    public static void main(String[] args){
        new CalculadoraServidor();
    }
            
}
