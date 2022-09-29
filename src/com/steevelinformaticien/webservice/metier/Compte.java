/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.steevelinformaticien.webservice.metier;

import java.io.Serializable;
import java.util.Date;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author PEPECELL
 */
@XmlRootElement(name="cp")
public class Compte implements Serializable {
    private Long code;
    private double solde;
    private Date datecreation;

    public Compte() {
    }

    public Compte(Long code, double solde, Date datecreation) {
        this.code = code;
        this.solde = solde;
        this.datecreation = datecreation;
    }

    public Long getCode() {
        return code;
    }

    public void setCode(Long code) {
        this.code = code;
    }

    public double getSolde() {
        return solde;
    }

    public void setSolde(double solde) {
        this.solde = solde;
    }

    public Date getDatecreation() {
        return datecreation;
    }

    public void setDatecreation(Date datecreation) {
        this.datecreation = datecreation;
    }
    
    
}
