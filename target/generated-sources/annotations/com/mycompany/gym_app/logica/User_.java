package com.mycompany.gym_app.logica;

import java.util.Date;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2024-07-25T21:12:07", comments="EclipseLink-2.7.12.v20230209-rNA")
@StaticMetamodel(User.class)
public class User_ { 

    public static volatile SingularAttribute<User, Date> fecha_nac;
    public static volatile SingularAttribute<User, String> genero;
    public static volatile SingularAttribute<User, Integer> id;
    public static volatile SingularAttribute<User, String> nombre;
    public static volatile SingularAttribute<User, Integer> edad;
    public static volatile SingularAttribute<User, String> contraseña;

}