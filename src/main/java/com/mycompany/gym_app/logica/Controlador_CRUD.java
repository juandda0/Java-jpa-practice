package com.mycompany.gym_app.logica;

import com.mycompany.gym_app.persistencia.Controladora_persistencia;
import java.util.ArrayList;

public class Controlador {
    
    Controladora_persistencia control_persi = new Controladora_persistencia();
    
    // CRUD CLIENTE
    public void registrar_cliente(Cliente cliente){
        control_persi.crear_cliente(cliente);
    }
    
    public void eliminar_cliente(int id){
        control_persi.eliminar_cliente(id);
    }
    
    public void editar_cliente(Cliente cliente){
        control_persi.editar_cliente(cliente);
    }
    
    public Cliente traer_cliente(int id){
        return control_persi.traer_cliente(id);
    }
    
    public ArrayList<Cliente> traer_lista_cliente(){
        return control_persi.traer_lista_clientes();
    }
    
    // CRUD EJERCICIO
    public void registrar_ejercicio(Ejercicio ejercicio){
        control_persi.crear_ejercicio(ejercicio);
    }
    
    public void eliminar_ejercicio(int id){
        control_persi.eliminar_ejercicio(id);
    }
    
    public void editar_ejercicio(Ejercicio ejercicio){
        control_persi.editar_ejercicio(ejercicio);
    }
    
    public Ejercicio traer_ejercicio(int id){
        return control_persi.traer_ejercicio(id);
    }
    
    public ArrayList<Ejercicio> traer_lista_ejercicio(){
        return control_persi.traer_lista_ejercicios();
    }
    
    // CRUD ENTRENADOR
    public void registrar_entrenador(Entrenador entrenador){
        control_persi.crear_entrenador(entrenador);
    }
    
    public void eliminar_entrenador(int id){
        control_persi.eliminar_entrenador(id);
    }
    
    public void editar_entrenador(Entrenador entrenador){
        control_persi.editar_entrenador(entrenador);
    }
    
    public Entrenador traer_entrenador(int id){
        return control_persi.traer_entrenador(id);
    }
    
    public ArrayList<Entrenador> traer_lista_entrenador(){
        return control_persi.traer_lista_entrenadores();
    }
    
    // CRUD RUTINA
    public void registrar_rutina(Rutina rutina){
        control_persi.crear_rutina(rutina);
    }
    
    public void eliminar_rutina(int id){
        control_persi.eliminar_rutina(id);
    }
    
    public void editar_rutina(Rutina rutina){
        control_persi.editar_rutina(rutina);
    }
    
    public Rutina traer_rutina(int id){
        return control_persi.traer_rutina(id);
    }
    
    public ArrayList<Rutina> traer_lista_rutina(){
        return control_persi.traer_lista_rutinas();
    }
    
    // CRUD USER
    public void registrar_user(User user){
        control_persi.crear_user(user);
    }
    
    public void eliminar_user(int id){
        control_persi.eliminar_user(id);
    }
    
    public void editar_user(User user){
        control_persi.editar_user(user);
    }
    
    public User traer_user(int id){
        return control_persi.traer_user(id);
    }
    
    public ArrayList<User> traer_lista_user(){
        return control_persi.traer_lista_users();
    }
}
