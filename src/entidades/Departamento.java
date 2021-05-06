/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

/**
 *
 * @author paulp
 */
public class Departamento {
    private int id;
    private String nombre;
    private int categoria_id;
    private String categoria_nombre;

    public Departamento() {
    }

    public Departamento(int id, String nombre, int categoria_id) {
        this.id = id;
        this.nombre = nombre;
        this.categoria_id = categoria_id;
    }

    public Departamento(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    public Departamento(int id, String nombre, int categoria_id, String categoria_nombre) {
        this.id = id;
        this.nombre = nombre;
        this.categoria_id = categoria_id;
        this.categoria_nombre = categoria_nombre;
    }

    public String getCategoria_nombre() {
        return categoria_nombre;
    }

    public void setCategoria_nombre(String categoria_nombre) {
        this.categoria_nombre = categoria_nombre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCategoria_id() {
        return categoria_id;
    }

    public void setCategoria_id(int categoria_id) {
        this.categoria_id = categoria_id;
    }

    @Override
    public String toString() {
        return "Departamento{" + "id=" + id + ", nombre=" + nombre + ", categoria_id=" + categoria_id + '}';
    }
    
    
}
