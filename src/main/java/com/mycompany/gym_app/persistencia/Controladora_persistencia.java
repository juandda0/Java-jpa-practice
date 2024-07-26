package com.mycompany.gym_app.persistencia;

import com.mycompany.gym_app.logica.Cliente;
import com.mycompany.gym_app.logica.Ejercicio;
import com.mycompany.gym_app.logica.Entrenador;
import com.mycompany.gym_app.logica.Rutina;
import com.mycompany.gym_app.logica.User;
import com.mycompany.gym_app.persistencia.exceptions.NonexistentEntityException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Controladora_persistencia {
    
    ClienteJpaController cliente_jpa = new ClienteJpaController();
    EjercicioJpaController ejercicio_jpa = new EjercicioJpaController();
    EntrenadorJpaController entrenador_jpa = new EntrenadorJpaController();
    RutinaJpaController rutina_jpa = new RutinaJpaController();
    UserJpaController user_jpa = new UserJpaController();

    // CLIENTE
    public void crear_cliente(Cliente cliente) {
        cliente_jpa.create(cliente);
    }

    public void eliminar_cliente(int id) {
        try {
            cliente_jpa.destroy(id);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(Controladora_persistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void editar_cliente(Cliente cliente) {
        try {
            cliente_jpa.edit(cliente);
        } catch (Exception ex) {
            Logger.getLogger(Controladora_persistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Cliente traer_cliente(int id) {
        return cliente_jpa.findCliente(id);
    }

    public ArrayList<Cliente> traer_lista_clientes() {
        List<Cliente> lista = cliente_jpa.findClienteEntities();
        return new ArrayList<>(lista);
    }
    
    // EJERCICIO
    public void crear_ejercicio(Ejercicio ejercicio) {
        ejercicio_jpa.create(ejercicio);
    }

    public void eliminar_ejercicio(int id) {
        try {
            ejercicio_jpa.destroy(id);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(Controladora_persistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void editar_ejercicio(Ejercicio ejercicio) {
        try {
            ejercicio_jpa.edit(ejercicio);
        } catch (Exception ex) {
            Logger.getLogger(Controladora_persistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Ejercicio traer_ejercicio(int id) {
        return ejercicio_jpa.findEjercicio(id);
    }

    public ArrayList<Ejercicio> traer_lista_ejercicios() {
        List<Ejercicio> lista = ejercicio_jpa.findEjercicioEntities();
        return new ArrayList<>(lista);
    }
    
    // ENTRENADOR
    public void crear_entrenador(Entrenador entrenador) {
        entrenador_jpa.create(entrenador);
    }

    public void eliminar_entrenador(int id) {
        try {
            entrenador_jpa.destroy(id);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(Controladora_persistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void editar_entrenador(Entrenador entrenador) {
        try {
            entrenador_jpa.edit(entrenador);
        } catch (Exception ex) {
            Logger.getLogger(Controladora_persistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Entrenador traer_entrenador(int id) {
        return entrenador_jpa.findEntrenador(id);
    }

    public ArrayList<Entrenador> traer_lista_entrenadores() {
        List<Entrenador> lista = entrenador_jpa.findEntrenadorEntities();
        return new ArrayList<>(lista);
    }
    
    // RUTINA
    public void crear_rutina(Rutina rutina) {
        try {
            rutina_jpa.create(rutina);
        } catch (Exception ex) {
            Logger.getLogger(Controladora_persistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void eliminar_rutina(int id) {
        try {
            rutina_jpa.destroy(id);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(Controladora_persistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void editar_rutina(Rutina rutina) {
        try {
            rutina_jpa.edit(rutina);
        } catch (Exception ex) {
            Logger.getLogger(Controladora_persistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Rutina traer_rutina(int id) {
        return rutina_jpa.findRutina(id);
    }

    public ArrayList<Rutina> traer_lista_rutinas() {
        List<Rutina> lista = rutina_jpa.findRutinaEntities();
        return new ArrayList<>(lista);
    }
    
    // USER
    public void crear_user(User user) {
        user_jpa.create(user);
    }

    public void eliminar_user(int id) {
        try {
            user_jpa.destroy(id);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(Controladora_persistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void editar_user(User user) {
        try {
            user_jpa.edit(user);
        } catch (Exception ex) {
            Logger.getLogger(Controladora_persistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public User traer_user(int id) {
        return user_jpa.findUser(id);
    }

    public ArrayList<User> traer_lista_users() {
        List<User> lista = user_jpa.findUserEntities();
        return new ArrayList<>(lista);
    }
}
