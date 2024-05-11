package com.mycompany.ud4_te1;

/**
 * La clase CCuenta representa una cuenta bancaria con funciones 
 * como ingresar, retirar y consultar saldo. 
 *
 * @version 6.0
 * @author Haizea
 */

public class CCuenta {

    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInteres;
    public static final double COMISION=2;

    /**
     * Constructor de la clase CCuenta.
     */
    public CCuenta() {
    }
    /**
     * Constructor parametrizado de la clase CCuenta.
     *
     * @param nom   nombre del titular
     * @param cue   numero de cuenta
     * @param sal   saldo 
     * @param tipo  interes
     */
    public CCuenta(String nom, String cue, double sal, double tipo) {
        nombre = nom;
        cuenta = cue;
        saldo = sal;
    }
    /**
     * Obtiene el nombre del titular
     * @return Nombre del titular
     */
    public String getNombre() {
        return nombre;
    }
    /**
     * Establece el nombre del titular
     * @param nombre nombre del titular
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    /**
     * Obtiene el nuero de cuenta
     * @return Numero de cuenta
     */
    public String getCuenta() {
        return cuenta;
    }
    /**
     * Establece el numero de cuenta
     * @param cuenta numero de cuenta
     */
    public void setCuenta(String cuenta) {
        this.cuenta=cuenta;
    }
    /**
     * Obtiene el saldo
     * @return Saldo
     */
    public double getSaldo() {
        return saldo;
    }
    /**
     * Establece el saldo
     * @param saldo nuevo saldo
     */
    public void setSaldo(double saldo) {
        this.saldo=saldo;
    }
    /**
     * Obtiene la tasa de interes
     * @return tasa de interes
     */
    public double gettipoInteres() {
        return tipoInteres;
    }
    /**
     * Establece la tasa de interes
     * @param tipoInteres  tasa de interes
     */
    public void settipoInteres(double tipoInteres) {
        this.tipoInteres = tipoInteres;
    }
    /**
     * Metodo para ingresar una cantidad en la cuenta
     * @param cantidad la cantidad a ingresar
     * @throws Exception si la cantidad es negativa
     */
    public void ingresar(double cantidad) throws Exception {
        if (cantidad < 0) {
            throw new Exception("No se puede ingresar una cantidad negativa");   
        }
        saldo = saldo + cantidad;
    }
    /**
     * Realiza un retiro de la cuenta
     * @param cantidad cantidad a retirar
     * @throws Exception si la cantidad es negativa o no hay suficiente saldo
     */
    public void retirar(double cantidad) throws Exception {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (getSaldo() < cantidad + COMISION)
            throw new Exception ("No se hay suficiente saldo");
        saldo = saldo - (cantidad + COMISION);
    }

    
}
