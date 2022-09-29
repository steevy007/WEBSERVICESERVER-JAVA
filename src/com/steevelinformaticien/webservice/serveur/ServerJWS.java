/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.steevelinformaticien.webservice.serveur;

import com.steevelinformaticien.webservice.service.BanqueService;
import javax.xml.ws.Endpoint;

/**
 *
 * @author PEPECELL
 */
public class ServerJWS {
   
    public static void main(String[] args) {
        String URL="http://localhost:8085/";
        Endpoint.publish(URL,new BanqueService());
        System.out.println("application deploy : "+URL);
    }
}
