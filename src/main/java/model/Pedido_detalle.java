package model;

public class Pedido_detalle {

    private Integer id_detalle;
    private String nombre_detalle_pedido;
    private double cantidad_detalle_pedido;
    private double precio_detalle_pedido;
    private double total_detalle_pedido;


    
    public Pedido_detalle() {
    }



    public Pedido_detalle(Integer id_detalle, String nombre_detalle_pedido, double cantidad_detalle_pedido,
            double precio_detalle_pedido, double total_detalle_pedido) {
        this.id_detalle = id_detalle;
        this.nombre_detalle_pedido = nombre_detalle_pedido;
        this.cantidad_detalle_pedido = cantidad_detalle_pedido;
        this.precio_detalle_pedido = precio_detalle_pedido;
        this.total_detalle_pedido = total_detalle_pedido;
    }



    public Integer getId_detalle() {
        return id_detalle;
    }



    public void setId_detalle(Integer id_detalle) {
        this.id_detalle = id_detalle;
    }



    public String getNombre_detalle_pedido() {
        return nombre_detalle_pedido;
    }



    public void setNombre_detalle_pedido(String nombre_detalle_pedido) {
        this.nombre_detalle_pedido = nombre_detalle_pedido;
    }



    public double getCantidad_detalle_pedido() {
        return cantidad_detalle_pedido;
    }



    public void setCantidad_detalle_pedido(double cantidad_detalle_pedido) {
        this.cantidad_detalle_pedido = cantidad_detalle_pedido;
    }



    public double getPrecio_detalle_pedido() {
        return precio_detalle_pedido;
    }



    public void setPrecio_detalle_pedido(double precio_detalle_pedido) {
        this.precio_detalle_pedido = precio_detalle_pedido;
    }



    public double getTotal_detalle_pedido() {
        return total_detalle_pedido;
    }



    public void setTotal_detalle_pedido(double total_detalle_pedido) {
        this.total_detalle_pedido = total_detalle_pedido;
    }



    @Override
    public String toString() {
        return "Pedido_detalle [id_detalle=" + id_detalle + ", nombre_detalle_pedido=" + nombre_detalle_pedido
                + ", cantidad_detalle_pedido=" + cantidad_detalle_pedido + ", precio_detalle_pedido="
                + precio_detalle_pedido + ", total_detalle_pedido=" + total_detalle_pedido + "]";
    }


    

}
