package com.howtodoinjava.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="ABBONAMENTI")
public class Abbonamenti {
     
    @Id
    @Column(name="IDABBONAMENTI")
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="EMPLOYEE_SEQ")
    @SequenceGenerator(name="EMPLOYEE_SEQ",sequenceName="EMPLOYEE_SEQ", allocationSize=1)
    private Integer idabbonamenti;
     
    @Column(name="IDUTENTE")
    private String idutente;
 
    @Column(name="DATAINIZIO")
    private String datainizio;
 
    @Column(name="IDDURATA")
    private String iddurata;
     
    @Column(name="COSTO")
    private String costo;
     
     
    public String getIdUtente() {
        return idutente;
    }
    public void setIdUtente(String idutente) {
        this.idutente = idutente;
    }
    public Integer getId() {
        return idabbonamenti;
    }
    public void setId(String id) {
        this.idabbonamenti = idabbonamenti;
    }
    public String getDatainizio() {
        return datainizio;
    }
   
    public void setDatainizio(String datainizio) {
        this.datainizio = datainizio;
    }
    public String getIddurata() {
        return iddurata;
    }
    public void setIddurata(String iddurata) {
        this.iddurata = iddurata;
    }
    public String getCosto() {
        return costo;
    }
    public void setCosto(String costo) {
        this.costo = costo;
    }
    
    
}