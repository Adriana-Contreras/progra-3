package com.example.casos_corona_virus.model;


import javax.persistence.*;

@Entity
@Table(name ="coronaVirus")
public class CoronaVirusModel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idCoronaVirus;
    @Column(name = "nombreDep", length = 50, nullable = false)
    private String nombreDep;
    @Column(name = "casos_contagiados")
    private int casos_contagiados;
    @Column(name = "casos_sospechosos")
    private int casos_sospechosos;
    @Column(name = "casos_recuperados")
    private int casos_recuperados;

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
}


