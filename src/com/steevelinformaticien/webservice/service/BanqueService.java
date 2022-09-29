/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.steevelinformaticien.webservice.service;

import com.steevelinformaticien.webservice.metier.Compte;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

/**
 *
 * @author PEPECELL
 */
@WebService(name="BanqueWS")
public class BanqueService {
    @WebMethod(operationName="conversionGdsToDollar")
    public double convertion(@WebParam(name="montant")double montant){
        return montant*11.3;
    }
    @WebMethod
    public Compte getCompte(@WebParam(name="code")Long code){
        return new Compte(code,Math.random()*80000,new Date());
    }
    @WebMethod
    public List<Compte> getComptes(){
        List<Compte> comptes=new ArrayList();
        comptes.add(new Compte(1L,Math.random()*80000,new Date()));
        comptes.add(new Compte(2L,Math.random()*80000,new Date()));
        comptes.add(new Compte(3L,Math.random()*80000,new Date()));
        comptes.add(new Compte(4L,Math.random()*80000,new Date()));
        comptes.add(new Compte(5L,Math.random()*80000,new Date()));
        
        return comptes;
    }
}
