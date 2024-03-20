/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.calculator;

import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

/**
 *
 * @author HP
 */
public class server {
    public static void main(String[] args){
        try{
            LocateRegistry.createRegistry(1098);
            Cal_Implt implt = new Cal_Implt();
            Naming.rebind("rmi://localhost:1098/calculator", implt);
            System.out.println("Serveur prêt");
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
