package Domain;
// Generated 17/03/2019 08:51:12 PM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Bien generated by hbm2java
 */
public class Bien  implements java.io.Serializable {


     private Integer idBien;
     private Funcionario funcionario;
     private String descripcion;
     private String cantidad;
     private String marca;
     private String biencol;
     private int precio;
     private String funcionario_1;
     private Set categorias = new HashSet(0);
     private Set solicituds = new HashSet(0);

    public Bien() {
    }

	
    public Bien(Funcionario funcionario, String descripcion, String cantidad, String marca, String biencol, int precio, String funcionario_1) {
        this.funcionario = funcionario;
        this.descripcion = descripcion;
        this.cantidad = cantidad;
        this.marca = marca;
        this.biencol = biencol;
        this.precio = precio;
        this.funcionario_1 = funcionario_1;
    }
    public Bien(Funcionario funcionario, String descripcion, String cantidad, String marca, String biencol, int precio, String funcionario_1, Set categorias, Set solicituds) {
       this.funcionario = funcionario;
       this.descripcion = descripcion;
       this.cantidad = cantidad;
       this.marca = marca;
       this.biencol = biencol;
       this.precio = precio;
       this.funcionario_1 = funcionario_1;
       this.categorias = categorias;
       this.solicituds = solicituds;
    }
   
    public Integer getIdBien() {
        return this.idBien;
    }
    
    public void setIdBien(Integer idBien) {
        this.idBien = idBien;
    }
    public Funcionario getFuncionario() {
        return this.funcionario;
    }
    
    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }
    public String getDescripcion() {
        return this.descripcion;
    }
    
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public String getCantidad() {
        return this.cantidad;
    }
    
    public void setCantidad(String cantidad) {
        this.cantidad = cantidad;
    }
    public String getMarca() {
        return this.marca;
    }
    
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public String getBiencol() {
        return this.biencol;
    }
    
    public void setBiencol(String biencol) {
        this.biencol = biencol;
    }
    public int getPrecio() {
        return this.precio;
    }
    
    public void setPrecio(int precio) {
        this.precio = precio;
    }
    public String getFuncionario_1() {
        return this.funcionario_1;
    }
    
    public void setFuncionario_1(String funcionario_1) {
        this.funcionario_1 = funcionario_1;
    }
    public Set getCategorias() {
        return this.categorias;
    }
    
    public void setCategorias(Set categorias) {
        this.categorias = categorias;
    }
    public Set getSolicituds() {
        return this.solicituds;
    }
    
    public void setSolicituds(Set solicituds) {
        this.solicituds = solicituds;
    }




}

