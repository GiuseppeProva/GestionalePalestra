package com.howtodoinjava.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="ALLENAMENTI")
public class Allenamenti {
     
    @Id
    @Column(name="IDALLENAMENTO")
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="EMPLOYEE_SEQ")
    @SequenceGenerator(name="EMPLOYEE_SEQ",sequenceName="EMPLOYEE_SEQ", allocationSize=1)
    private Integer idallenamento;
     
    @Column(name="DESCRIZIONE")
    private String descrizione;
 
    
     
    public String getDescrizione() {
        return descrizione;
    }
    public Integer getId() {
        return idallenamento;
    }
    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
    }
    public void setId(Integer id) {
        this.idallenamento = idallenamento;
    }
    
}