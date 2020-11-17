package modelo;


public class Producto {
    private int idproducto;
    private String nombre;
    private String codigo;
    private String fecha_produccion;
    private int stock;
    private double precio_compra;
    private double precio_venta;
    private String estado;

    public Producto() {
    }

    public Producto(int idproducto, String nombre, String codigo, String fecha_produccion, int stock, double precio_compra, double precio_venta, String estado) {
        this.idproducto = idproducto;
        this.nombre = nombre;
        this.codigo = codigo;
        this.fecha_produccion = fecha_produccion;
        this.stock = stock;
        this.precio_compra = precio_compra;
        this.precio_venta = precio_venta;
        this.estado = estado;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public int getIdproducto() {
        return idproducto;
    }

    public void setIdproducto(int idproducto) {
        this.idproducto = idproducto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getFecha_produccion() {
        return fecha_produccion;
    }

    public void setFecha_produccion(String fecha_produccion) {
        this.fecha_produccion = fecha_produccion;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public double getPrecio_compra() {
        return precio_compra;
    }

    public void setPrecio_compra(double precio_compra) {
        this.precio_compra = precio_compra;
    }

    public double getPrecio_venta() {
        return precio_venta;
    }

    public void setPrecio_venta(double precio_venta) {
        this.precio_venta = precio_venta;
    }
    
    
}
