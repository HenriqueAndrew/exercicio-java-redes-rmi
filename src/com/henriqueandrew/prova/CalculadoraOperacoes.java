package com.henriqueandrew.prova;

// @author Henrique Andrew da Silva

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class CalculadoraOperacoes extends UnicastRemoteObject implements Calculadora{
    
    protected CalculadoraOperacoes() throws RemoteException{
        super();
    }

    @Override
    public long add(long a, long b) throws RemoteException {
        return a + b;
    }

    @Override
    public long sub(long a, long b) throws RemoteException {
        return a - b;
    }

    @Override
    public long mul(long a, long b) throws RemoteException {
        return a * b;
    }

    @Override
    public long div(long a, long b) throws RemoteException {
        return a / b;
    }
       

}
