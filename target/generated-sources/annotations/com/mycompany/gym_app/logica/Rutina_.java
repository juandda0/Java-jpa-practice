package com.mycompany.gym_app.logica;

import com.mycompany.gym_app.logica.Ejercicio;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2024-07-25T21:12:07", comments="EclipseLink-2.7.12.v20230209-rNA")
@StaticMetamodel(Rutina.class)
public class Rutina_ { 

    public static volatile SingularAttribute<Rutina, String> objetivo;
    public static volatile ListAttribute<Rutina, Ejercicio> ejercicios;
    public static volatile SingularAttribute<Rutina, Integer> duracion;
    public static volatile SingularAttribute<Rutina, Integer> id;
    public static volatile SingularAttribute<Rutina, String> nombre;

}