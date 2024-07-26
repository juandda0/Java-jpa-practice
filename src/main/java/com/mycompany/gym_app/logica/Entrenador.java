package com.mycompany.gym_app.logica;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.OneToMany;

@Entity
public class Entrenador extends User implements Serializable{
    
    private static final long serialVersionUID = 1L;
    //Atributos
    @Basic
    private String especialidad;
    private int años_experiencia;
    
    @OneToMany(mappedBy = "entrenador")
    private List<Cliente> clientes_asignados = new ArrayList<>();
    
    public Entrenador(){
    }
    
    public Entrenador(String especialidad, int años_experiencia,
                     int id, String nombre, String contraseña, int edad, String genero, Date fecha_nac){
        
        super(id, nombre, contraseña, edad, genero, fecha_nac);
        this.especialidad = especialidad;
        this.años_experiencia = años_experiencia;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public int getAños_experiencia() {
        return años_experiencia;
    }

    public void setAños_experiencia(int años_experiencia) {
        this.años_experiencia = años_experiencia;
    }

    public List<Cliente> getClientes_asignados() {
        return clientes_asignados;
    }

    public void setClientes_asignados(List<Cliente> clientes_asignados) {
        this.clientes_asignados = clientes_asignados;
    }

    
    
}
