package com.mycompany.gym_app.logica;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Ejercicio implements Serializable {
    
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id;
    
    @Basic
    private String nombre;
    
    @ManyToMany(mappedBy = "ejercicios")
    private List<Rutina> rutinas = new ArrayList<>();
    
    public Ejercicio() {
    }

    public Ejercicio(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }


    //Guetters y setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
}