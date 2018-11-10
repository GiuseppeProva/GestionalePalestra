package com.howtodoinjava.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="ISCRIZIONI")
public class Iscrizioni {
     
    @Id
    @Column(name="IDISCRIZIONI")
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="EMPLOYEE_SEQ")
    @SequenceGenerator(name="EMPLOYEE_SEQ",sequenceName="EMPLOYEE_SEQ", allocationSize=1)
    private Integer idiscrizioni;
     
    @Column(name="IDUTENTE")
    private String idutente;
 
    @Column(name="DATAISCRIZIONE")
    private String dataiscrizione;
 
    @Column(name="PAGATO")
    private String pagato;
     
    @Column(name="IDCORSO")
    private String idcorso;
     
     
    public String getidutente() {
        return idutente;
    }
    
    public void setidutente(String idutente) {
        this.idutente = idutente;
    }
    
    public String getdataiscrizione() {
        return dataiscrizione;
    }
   
    public void setdataiscrizione(String dataiscrizione) {
        this.dataiscrizione = dataiscrizione;
    }
    public String getpagato() {
        return pagato;
    }
   
    public void setpagato(String pagato) {
        this.pagato = pagato;
    }
    
    public String getidcorso() {
        return idcorso;
    }
    
    public void setidcorso(String idcorso) {
        this.idcorso = idcorso;
    }
    public Integer getId() {
        return idiscrizioni;
    }
    public void setId(Integer id) {
        this.idiscrizioni = idiscrizioni;
    }
}