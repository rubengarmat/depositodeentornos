package cuentas;

/**
 * Esta clase es la del ejemplo de la tarea 4 y sera llamada por Main para generar objetos CCuenta
 * @author marti
 * @version 2.0
 * @since 1.0
 *  
 */

public class CCuenta {


    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInteres;

    /**
	 * Constructor
	 */
    public CCuenta()
    {
    }

    /**
	 * segundo constructor
	 * @param nom nombre de la cuenta
	 * @param cue cuenta
	 * @param sal saldo de la cuenta
	 * @param tipo tipo de Interes
	 */
    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        nombre =nom;
        cuenta=cue;
        saldo=sal;
    }

    /**
	 * Devuelve el saldo de la cuenta
	 * @return saldo de la cuenta
	 */
    public double estado()
    {
        return saldo;
    }

	/**
	 * metodo que sirve para ingresar dinero en cuenta
	 * @param cantidad la cantidad que se ingresa en cuenta
	 * @throws Exception cantidad no puede ser negativa
	 */
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        saldo = saldo + cantidad;
    }

	/**
	 * metodo que sirve para retirar dinero en cuenta
	 * @param cantidad la cantidad que se retira en cuenta
	 * @throws Exception cantidad no puede ser negativa
	 */
    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        saldo = saldo - cantidad;
    }

    /**
	 * Devuelve el nombre de la cuenta
	 * @return nombre de la cuenta
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * establece el nombre
	 * @param nombre de la cuenta
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

    /**
	 * Devuelve la cuenta
	 * @return cuenta
	 */
	public String getCuenta() {
		return cuenta;
	}

	/**
	 * establece la cuenta
	 * @param cuenta que se indica
	 */
	public void setCuenta(String cuenta) {
		this.cuenta = cuenta;
	}

    /**
	 * Devuelve el saldo de la cuenta
	 * @return saldo de la cuenta
	 */
	public double getSaldo() {
		return saldo;
	}

	/**
	 * establece el saldo
	 * @param saldo de la cuenta
	 */
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

    /**
	 * Devuelve el tipoInteres de la cuenta
	 * @return tipoInteres de la cuenta
	 */
	public double getTipoInteres() {
		return tipoInteres;
	}

	/**
	 * establece el tipo de interes
	 * @param tipoInteres de la cuenta
	 */
	public void setTipoInteres(double tipoInteres) {
		this.tipoInteres = tipoInteres;
	}
    
     
}
