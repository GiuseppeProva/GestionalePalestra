package com.howtodoinjava.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="UTENTI")
public class UtentiEntity {
     
    @Id
    @Column(name="IDUTENTE")
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="EMPLOYEE_SEQ")
    @SequenceGenerator(name="EMPLOYEE_SEQ",sequenceName="EMPLOYEE_SEQ", allocationSize=1)
    private Integer idutente;
     
    @Column(name="NOME")
    private String nome;
 
    @Column(name="DATANASCITA")
    private String datanascita;
 
    @Column(name="PASSWORD")
    private String password;
     
    @Column(name="TELEFONO")
    private String telefono;
     
     
    public String getNome() {
        return nome;
    }
    public String getTelefono() {
        return telefono;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    public String getPassword() {
        return password;
    }
    public String getDatanascita() {
        return datanascita;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public void setDatanascita(String datanascita) {
        this.datanascita = datanascita;
    }
    public Integer getId() {
        return idutente;
    }
    public void setId(Integer id) {
        this.idutente = idutente;
    }
}