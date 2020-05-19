package com.example.apprest.model;


import javax.persistence.*;
import java.util.Date;

@Entity
@Table (name ="persona")   //@Table(name = "persona")
public class personaModel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idPer;
    @Column(name = "nombres", length = 50, nullable = false)
    private String nombres;
    @Column(name = "apellidos", length = 50)
    private String apellidos;
    @Column(name = "email", length = 100)
    private String email;
    @Column(name = "fechaNac")
    private Date fechaNac;



    public int getIdPer() {
        return idPer;
    }
    public void setIdPer(int idPer) {
        this.idPer = idPer;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getFechaNac() {
        return fechaNac;
    }

    public void setFechaNac(Date fechaNac) {
        this.fechaNac = fechaNac;
    }

}
