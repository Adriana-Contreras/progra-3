package com.example.swing.Model;


import javax.persistence.*;

@Entity
@Table(name = "dias")
public class DiccionaryModel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    @Column(name= "ingles", length =200, nullable = false)
    private String ingles;

    @Column(name= "portugues", length =200, nullable = false)
    private String portugues;

    @Column(name= "español", length =200, nullable = false)
    private String español;


    public DiccionaryModel(){

    }

    public DiccionaryModel(String ingles, String portugues, String español){
        this.ingles= ingles;
        this.portugues= portugues;
        this.español= español;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setIngles(String ingles) {
        this.ingles = ingles;
    }

    public void setPortugues(String portugues) {
        this.portugues = portugues;
    }

    public void setEspañol(String español) {
        this.español = español;
    }

    public Integer getId() {
        return id;
    }

    public String getIngles() {
        return ingles;
    }

    public String getPortugues() {
        return portugues;
    }

    public String getEspañol() {
        return español;
    }
}
