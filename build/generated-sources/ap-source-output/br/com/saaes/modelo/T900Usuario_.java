package br.com.saaes.modelo;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(T900Usuario.class)
public abstract class T900Usuario_ {

	public static volatile SingularAttribute<T900Usuario, String> senha;
	public static volatile SingularAttribute<T900Usuario, Boolean> ativo;
	public static volatile SingularAttribute<T900Usuario, String> cdUsuReg;
	public static volatile SingularAttribute<T900Usuario, Date> dtInc;
	public static volatile SingularAttribute<T900Usuario, String> nome;
	public static volatile SingularAttribute<T900Usuario, Long> id;
	public static volatile SingularAttribute<T900Usuario, String> cpfCnpj;
	public static volatile SingularAttribute<T900Usuario, Date> dtFim;

}

