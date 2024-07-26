
package com.mycompany.gym_app.logica;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity
public class Rutina implements Serializable {
   //Atributos
   @Id
   private int id;
   
   @Basic
   private String nombre;
   private int duracion;
   private String objetivo;

   @ManyToMany
   @JoinTable(
       name = "rutina_ejercicio",
       joinColumns = @JoinColumn(name = "rutina_id"),
       inverseJoinColumns = @JoinColumn(name = "ejercicio_id")
   )    
   private List<Ejercicio> ejercicios = new ArrayList<>();
   
   //Constructores
    public Rutina() {
    }

    public Rutina(int id, String nombre, int duracion, String objetivo, List<Ejercicio> ejercicios) {
        this.id = id;
        this.nombre = nombre;
        this.duracion = duracion;
        this.objetivo = objetivo;
        this.ejercicios = ejercicios;
    }

    
    //Getters y setters
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

    public List<Ejercicio> getEjercicios() {
        return ejercicios;
    }

    public void setEjercicios(List<Ejercicio> ejercicios) {
        this.ejercicios = ejercicios;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public String getObjetivo() {
        return objetivo;
    }

    public void setObjetivo(String objetivo) {
        this.objetivo = objetivo;
    }

}
