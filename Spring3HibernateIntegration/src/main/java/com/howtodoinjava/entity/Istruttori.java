package com.howtodoinjava.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="ISTRUTTORI")
public class Istruttori {
     
    @Id
    @Column(name="IDISTRUTTORE")
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="EMPLOYEE_SEQ")
    @SequenceGenerator(name="EMPLOYEE_SEQ",sequenceName="EMPLOYEE_SEQ", allocationSize=1)
    private Integer idistruttore;
     
    @Column(name="NOME")
    private String nome;
 
    @Column(name="DATANASCITA")
    private String datanascita;
 
     
    @Column(name="TELEFONO")
    private String telefono;
    
    @Column(name="CODICEFISCALE")
    private String codicefiscale;
     
     
    public String getNome() {
        return nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public String getDatanascita() {
        return datanascita;
    }
    
    public void setDatanascita(String datanascita) {
        this.datanascita = datanascita;
    }
    
    public String getTelefono() {
        return telefono;
    }
   
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    
    public String getCodicefiscale() {
        return codicefiscale;
    }
    
    public void setCodicefiscale(String Codicefiscale) {
        this.codicefiscale = codicefiscale;
    }
   
    
    public Integer getId() {
        return idistruttore;
    }
    
    public void setId(Integer id) {
        this.idistruttore = idistruttore;
    }
}