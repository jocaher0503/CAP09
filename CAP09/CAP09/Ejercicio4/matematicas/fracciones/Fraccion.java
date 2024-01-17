package Ejercicio4.matematicas.fracciones;

import Ejercicio4.matematicas.operaciones.Operacion;

public class Fraccion {
    private int numerador;
    private int denominador;

    public Fraccion(int num, int den){
        this.numerador = num;
        this.denominador = den;
    }

    public int getDenominador() {
        return denominador;
    }

    public int getNumerador() {
        return numerador;
    }

    public void setDenominador(int denominador) {
        this.denominador = denominador;
    }

    public void setNumerador(int numerador) {
        this.numerador = numerador;
    }

    @Override
    public String toString() {
        return numerador+"/"+denominador;
    }
    

    public Fraccion invierte(){
        int aux = this.numerador;
        this.numerador = this.denominador;
        this.denominador = aux;
        return this;
    }

    public Fraccion simplifica(){
        int mcd =Operacion.mcd(numerador, denominador);
        this.numerador /= mcd;
        this.denominador /= mcd;
        return this;
    }

    public Fraccion multiplica(Fraccion f){
        this.numerador*=f.numerador;
        this.denominador*=f.denominador;
        return this;
    }

    public Fraccion multiplica(int num){
       return this.multiplica(new Fraccion(num , 1));
    }

    public Fraccion divide(Fraccion f){
        f.invierte();
        this.multiplica(f);
        f.invierte();
        return this;
    }

    public Fraccion potencia(int exponente){
        this.numerador = (int)Math.pow(this.numerador, exponente);
        this.denominador = (int)Math.pow(this.denominador, exponente);
        return this;
    }

    
}
