package model;

import java.util.Date;

public class Pedido {


    private Integer id_pedido;
    private String numero_pedido;
    private Date fechaCreacion;
    private Date fechaRecibida;
    private double total_pedido;

    
    public Pedido() {
    }


    public Pedido(Integer id_pedido, String numero_pedido, Date fechaCreacion, Date fechaRecibida,
            double total_pedido) {
        this.id_pedido = id_pedido;
        this.numero_pedido = numero_pedido;
        this.fechaCreacion = fechaCreacion;
        this.fechaRecibida = fechaRecibida;
        this.total_pedido = total_pedido;
    }


    public Integer getId_pedido() {
        return id_pedido;
    }


    public void setId_pedido(Integer id_pedido) {
        this.id_pedido = id_pedido;
    }


    public String getNumero_pedido() {
        return numero_pedido;
    }


    public void setNumero_pedido(String numero_pedido) {
        this.numero_pedido = numero_pedido;
    }


    public Date getFechaCreacion() {
        return fechaCreacion;
    }


    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }


    public Date getFechaRecibida() {
        return fechaRecibida;
    }


    public void setFechaRecibida(Date fechaRecibida) {
        this.fechaRecibida = fechaRecibida;
    }


    public double getTotal_pedido() {
        return total_pedido;
    }


    public void setTotal_pedido(double total_pedido) {
        this.total_pedido = total_pedido;
    }


    @Override
    public String toString() {
        return "Pedido [id_pedido=" + id_pedido + ", numero_pedido=" + numero_pedido + ", fechaCreacion="
                + fechaCreacion + ", fechaRecibida=" + fechaRecibida + ", total_pedido=" + total_pedido + "]";
    }

    
}
