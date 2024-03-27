package model;

public class Producto {


    private Integer id_producto;
    private String nombre_producto;
    private String descripcion_producto;
    private String imagen_producto;
    private double precio_producto;
    private int cantidad_producto;


    
    public Producto() {
    }



    public Producto(Integer id_producto, String nombre_producto, String descripcion_producto, String imagen_producto,
            double precio_producto, int cantidad_producto) {
        this.id_producto = id_producto;
        this.nombre_producto = nombre_producto;
        this.descripcion_producto = descripcion_producto;
        this.imagen_producto = imagen_producto;
        this.precio_producto = precio_producto;
        this.cantidad_producto = cantidad_producto;
    }



    public Integer getId_producto() {
        return id_producto;
    }



    public void setId_producto(Integer id_producto) {
        this.id_producto = id_producto;
    }



    public String getNombre_producto() {
        return nombre_producto;
    }



    public void setNombre_producto(String nombre_producto) {
        this.nombre_producto = nombre_producto;
    }



    public String getDescripcion_producto() {
        return descripcion_producto;
    }



    public void setDescripcion_producto(String descripcion_producto) {
        this.descripcion_producto = descripcion_producto;
    }



    public String getImagen_producto() {
        return imagen_producto;
    }



    public void setImagen_producto(String imagen_producto) {
        this.imagen_producto = imagen_producto;
    }



    public double getPrecio_producto() {
        return precio_producto;
    }



    public void setPrecio_producto(double precio_producto) {
        this.precio_producto = precio_producto;
    }



    public int getCantidad_producto() {
        return cantidad_producto;
    }



    public void setCantidad_producto(int cantidad_producto) {
        this.cantidad_producto = cantidad_producto;
    }



    @Override
    public String toString() {
        return "Producto [id_producto=" + id_producto + ", nombre_producto=" + nombre_producto
                + ", descripcion_producto=" + descripcion_producto + ", imagen_producto=" + imagen_producto
                + ", precio_producto=" + precio_producto + ", cantidad_producto=" + cantidad_producto + "]";
    }


    

}
