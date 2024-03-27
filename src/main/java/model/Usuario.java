package model;

public class Usuario {

    private Integer id_usuario;
    private String nombre_usuario;
    private String nick_usuario;
    private String email_usuario;
    private String direccion_usuario;
    private String telefono_usuario;
    private Integer edad_usuario;
    private String tipo_usuario;
    private String password;

    
    //Constructor vacio
    public Usuario() {

    }

    
    //Constructor
    public Usuario(Integer id_usuario, String nombre_usuario, String nick_usuario, String email_usuario,
            String direccion_usuario, String telefono_usuario, Integer edad_usuario, String tipo_usuario,
            String password) {
        this.id_usuario = id_usuario;
        this.nombre_usuario = nombre_usuario;
        this.nick_usuario = nick_usuario;
        this.email_usuario = email_usuario;
        this.direccion_usuario = direccion_usuario;
        this.telefono_usuario = telefono_usuario;
        this.edad_usuario = edad_usuario;
        this.tipo_usuario = tipo_usuario;
        this.password = password;
    }


    //Getters y Setters
    public Integer getId_usuario() {
        return id_usuario;
    }
    public void setId_usuario(Integer id_usuario) {
        this.id_usuario = id_usuario;
    }
    public String getNombre_usuario() {
        return nombre_usuario;
    }
    public void setNombre_usuario(String nombre_usuario) {
        this.nombre_usuario = nombre_usuario;
    }
    public String getNick_usuario() {
        return nick_usuario;
    }
    public void setNick_usuario(String nick_usuario) {
        this.nick_usuario = nick_usuario;
    }
    public String getEmail_usuario() {
        return email_usuario;
    }
    public void setEmail_usuario(String email_usuario) {
        this.email_usuario = email_usuario;
    }
    public String getDireccion_usuario() {
        return direccion_usuario;
    }
    public void setDireccion_usuario(String direccion_usuario) {
        this.direccion_usuario = direccion_usuario;
    }
    public String getTelefono_usuario() {
        return telefono_usuario;
    }
    public void setTelefono_usuario(String telefono_usuario) {
        this.telefono_usuario = telefono_usuario;
    }
    public Integer getEdad_usuario() {
        return edad_usuario;
    }
    public void setEdad_usuario(Integer edad_usuario) {
        this.edad_usuario = edad_usuario;
    }
    public String getTipo_usuario() {
        return tipo_usuario;
    }
    public void setTipo_usuario(String tipo_usuario) {
        this.tipo_usuario = tipo_usuario;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }


    @Override
    public String toString() {
        return "Usuario [id_usuario=" + id_usuario + ", nombre_usuario=" + nombre_usuario + ", nick_usuario="
                + nick_usuario + ", email_usuario=" + email_usuario + ", direccion_usuario=" + direccion_usuario
                + ", telefono_usuario=" + telefono_usuario + ", edad_usuario=" + edad_usuario + ", tipo_usuario="
                + tipo_usuario + ", password=" + password + "]";
    }


    
}
