package curd_tarea;

import java.io.Serializable;

public class Persona implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;
    private String name;
    private int edad;
    private double altura;
    
public Persona(){
    this.name=null;
    this.edad=0;
    this.altura=0.0;
}
public Persona(String name, int edad, double altura){
    this.name=name;
    this.edad=edad;
    this.altura=altura;
}

public String getName() {
    return name;
}
public void setName(String name) {
    this.name = name;
}
public int getEdad() {
    return edad;
}
public void setEdad(int edad) {
    this.edad = edad;
}
public double getAltura() {
    return altura;
}
public void setAltura(double altura) {
    this.altura = altura;
}
}