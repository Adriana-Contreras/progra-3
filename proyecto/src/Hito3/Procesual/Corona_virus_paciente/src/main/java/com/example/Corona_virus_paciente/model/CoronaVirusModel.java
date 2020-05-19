package com.example.Corona_virus_paciente.model;

import javax.persistence.*;

@Entity
@Table(name ="coronaVirusPaciente")
public class CoronaVirusModel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idCoronaVirus;
    @Column(name = "nombreDep", length = 50, nullable = false)
    private String nombreDep;
    @Column(name = "nombrepaciente", length = 50)
    private String nombrepaciente;
    @Column(name = "apellidos", length = 50)
    private String apellidos;
    @Column(name = "edad")
    private int edad;
    @Column(name = "casos_contagiados")
    private int casos_contagiados;
    @Column(name = "casos_sospechosos")
    private int casos_sospechosos;
    @Column(name = "casos_recuperados")
    private int casos_recuperados;
    @Column(name = "categoria", length = 50)
    private String  categoria;
    @Column(name = "fullname", length = 100)
    private String fullname;



    public int getIdCoronaVirus() {
        return idCoronaVirus;
    }

    public String getNombreDep() {
        return nombreDep;
    }

    public int getCasos_contagiados() {
        return casos_contagiados;
    }

    public int getCasos_sospechosos() {
        return casos_sospechosos;
    }

    public int getCasos_recuperados() {
        return casos_recuperados;
    }

    public void setIdCoronaVirus(int idCoronaVirus) {
        this.idCoronaVirus = idCoronaVirus;
    }

    public void setNombreDep(String nombreDep) {
        this.nombreDep = nombreDep;
    }

    public void setCasos_contagiados(int casos_contagiados) {
        this.casos_contagiados = casos_contagiados;
    }

    public void setCasos_sospechosos(int casos_sospechosos) {
        this.casos_sospechosos = casos_sospechosos;
    }

    public void setCasos_recuperados(int casos_recuperados) {
        this.casos_recuperados = casos_recuperados;
    }

    public String getNombrepaciente() {
        return nombrepaciente;
    }

    public String getApellidos() {
        return apellidos;
    }


    public void setNombrepaciente(String nombrepaciente) {
        this.nombrepaciente = nombrepaciente;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getEdad() {
        return edad;
    }

    public String getCategoria() {
        return categoria;
    }

    public String getFullname() {
        return fullname;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }


}
