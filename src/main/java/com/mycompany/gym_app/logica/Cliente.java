package com.mycompany.gym_app.logica;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Cliente extends User implements Serializable{
    
    private static final long serialVersionUID = 1L;
    
    @Basic
    private String objetivos;
    private int peso;
    private int altura;
    private double imc;
    
    @ManyToOne
    @JoinColumn(name = "entrenador_id")
    private Entrenador entrenador;

    public Cliente(){
    }
    
    public Cliente(String objetivos, int peso, int altura, double imc,
                    int id, String nombre, String contraseña, int edad, String genero, Date fecha_nac) {
        
        super(id, nombre, contraseña, edad, genero, fecha_nac);
        this.objetivos = objetivos;
        this.peso = peso;
        this.altura = altura;
        this.imc = imc;
}
    
    //Getters y setters
    public String getObjetivos() {
        return objetivos;
    }

    public void setObjetivos(String objetivos) {
        this.objetivos = objetivos;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public double getImc() {
        return imc;
    }

    public void setImc(double imc) {
        this.imc = imc;
    }

    public Entrenador getEntrenador() {
        return entrenador;
    }

    public void setEntrenador(Entrenador entrenador) {
        this.entrenador = entrenador;
    }

    
}
