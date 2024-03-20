/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.calculator;

import java.rmi.Remote;

/**
 *
 * @author HP
 */
public interface calinterface extends Remote{
    public double calculOperation(String operation) throws Exception;
}
