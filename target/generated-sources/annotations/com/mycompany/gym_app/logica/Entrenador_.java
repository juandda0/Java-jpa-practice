package com.mycompany.gym_app.logica;

import com.mycompany.gym_app.logica.Cliente;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2024-07-25T21:12:07", comments="EclipseLink-2.7.12.v20230209-rNA")
@StaticMetamodel(Entrenador.class)
public class Entrenador_ extends User_ {

    public static volatile SingularAttribute<Entrenador, Integer> años_experiencia;
    public static volatile ListAttribute<Entrenador, Cliente> clientes_asignados;
    public static volatile SingularAttribute<Entrenador, String> especialidad;

}