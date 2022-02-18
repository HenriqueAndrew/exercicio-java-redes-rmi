package com.henriqueandrew.prova;

// @author Henrique Andrew da Silva

import java.rmi.Naming;


public class CalculadoraCliente {
    
    public static void main (String[] args){
        try{
            Calculadora c = (Calculadora) Naming.lookup("//127.0.0.1:1020/Calculadora");
            System.out.println("Adição: " + c.add(10, 10));
            System.out.println("Subtração: " + c.sub(10, 10));
            System.out.println("Multiplicação: " + c.mul(10, 10));
            System.out.println("Divisão: " + c.div(10, 10));           
        }
        catch(Exception e){
            System.out.println("e");
        }
    }

}
