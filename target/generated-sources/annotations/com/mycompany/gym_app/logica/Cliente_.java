package com.mycompany.gym_app.logica;

import com.mycompany.gym_app.logica.Entrenador;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2024-07-25T21:12:07", comments="EclipseLink-2.7.12.v20230209-rNA")
@StaticMetamodel(Cliente.class)
public class Cliente_ extends User_ {

    public static volatile SingularAttribute<Cliente, Entrenador> entrenador;
    public static volatile SingularAttribute<Cliente, Integer> peso;
    public static volatile SingularAttribute<Cliente, Integer> altura;
    public static volatile SingularAttribute<Cliente, String> objetivos;
    public static volatile SingularAttribute<Cliente, Double> imc;

}