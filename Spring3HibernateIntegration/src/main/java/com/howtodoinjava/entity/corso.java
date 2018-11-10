package com.howtodoinjava.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="ADMIN")
public class corso {
     
    @Id
    @Column(name="IDCORSO")
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="EMPLOYEE_SEQ")
    @SequenceGenerator(name="EMPLOYEE_SEQ",sequenceName="EMPLOYEE_SEQ", allocationSize=1)
    private Integer idcorso;
     
    @Column(name="DESCRIZIONE")
    private String descrizione;
 
    @Column(name="IDISTRUTTORE")
    private String idistruttore;
    
     
    public String getdescrizione() {
        return descrizione;
    }
    public void setdescrizione(String descrizione) {
        this.descrizione = descrizione;
    }
    
    public String getidistruttore() {
        return idistruttore;
    }
    public void setidistruttore(String idistruttore) {
        this.idistruttore= idistruttore;
    }
    public Integer getId() {
        return idcorso;
    }
    
    public void setId(Integer id) {
        this.idcorso = idcorso;
    }
    
}