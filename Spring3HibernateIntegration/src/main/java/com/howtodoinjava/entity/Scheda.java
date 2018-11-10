package com.howtodoinjava.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="SCHEDA")
public class Scheda {
     
    @Id
    @Column(name="IDSCHEDA")
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="EMPLOYEE_SEQ")
    @SequenceGenerator(name="EMPLOYEE_SEQ",sequenceName="EMPLOYEE_SEQ", allocationSize=1)
    private Integer idscheda;
     
    @Column(name="IDALLENAMENTI")
    private String idallenamenti;
 
    @Column(name="NUMERO")
    private String numero;
 
    @Column(name="DATAEMISSIONE")
    private String dataemissione;
     
    @Column(name="IDISTRUTTORI")
    private String idistruttori;
     
    @Column(name="IDALLENAMENTO")
    private String idallenamento;
     
    public String getidallenamenti() {
        return idallenamenti;
    }
    public void setidallenamenti(String idallenamenti) {
        this.idallenamenti = idallenamenti;
    }
    public String getnumero() {
        return numero;
    }
    public void setnumero(String numero) {
        this.numero = numero;
    }
   
    public String getdataemissione() {
        return  dataemissione;
    }
    public void setdataemissione(String dataemissione) {
        this.dataemissione = dataemissione;
    }
    public String getidallenamento() {
        return idallenamento;
    }
   
    public void setidallenamento(String idallenamento) {
        this.idallenamento = idallenamento;
    }
    
   
    public Integer getId() {
        return idscheda;
    }
    public void setId(Integer id) {
        this.idscheda = idscheda;
    }
}