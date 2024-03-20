/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.calculator;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 *
 * @author HP
 */
public class Cal_Implt extends UnicastRemoteObject implements calinterface{
    public Cal_Implt() throws RemoteException{
        super();
    }
    @Override
    public double calculOperation(String operation) throws Exception{
        double resultat = 0.0;
        String[] elements = operation.split(" "); // Divise la chaîne en fonction de l'espace

        if (elements.length != 3) {
            System.err.println("Format d'opération invalide. Utilisez : <nombre1> <opérateur> <nombre2>");
            return resultat;
        }

        double nombre1 = Double.parseDouble(elements[0]);
        double nombre2 = Double.parseDouble(elements[2]);
        char operateur = elements[1].charAt(0);

        switch (operateur) {
            case '+':
                resultat = nombre1 + nombre2;
                break;
            case '-':
                resultat = nombre1 - nombre2;
                break;
            case '*':
                resultat = nombre1 * nombre2;
                break;
            case '/':
                if (nombre2 != 0) {
                    resultat = nombre1 / nombre2;
                } else {
                    System.err.println("Division par zéro impossible.");
                }
                break;
            case '%':
                resultat = nombre1 % nombre2;
            default:
                System.err.println("Opérateur invalide. Utilisez +, -, *, ou /.");
                break;
        }

        return resultat;
    }
}
