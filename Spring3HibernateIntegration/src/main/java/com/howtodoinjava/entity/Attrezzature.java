package com.howtodoinjava.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="ATTREZZATURE")
public class Attrezzature {
     
    @Id
    @Column(name="IDATTREZZATURE")
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="EMPLOYEE_SEQ")
    @SequenceGenerator(name="EMPLOYEE_SEQ",sequenceName="EMPLOYEE_SEQ", allocationSize=1)
    private Integer idattrezzature;
     
    @Column(name="TIPOLOGIA")
    private String tipologia;
 
    
     
    public String gettipologia() {
        return tipologia;
    }
    public void settipologia(String tipologia) {
        this.tipologia = tipologia;
    }
    public Integer getId() {
        return idattrezzature;
    }
   
    public void setId(Integer id) {
        this.idattrezzature = idattrezzature;
    }
    
}