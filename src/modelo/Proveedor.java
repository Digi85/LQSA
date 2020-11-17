package modelo;


public class Proveedor {
    private int idproveedor;
    private String razon_social;
    private String ruc;
    private String estado;

    public Proveedor() {
    }

    public Proveedor(int idproveedor, String razon_social, String ruc, String estado) {
        this.idproveedor = idproveedor;
        this.razon_social = razon_social;
        this.ruc = ruc;
        this.estado = estado;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public int getIdproveedor() {
        return idproveedor;
    }

    public void setIdproveedor(int idproveedor) {
        this.idproveedor = idproveedor;
    }

    public String getRazon_social() {
        return razon_social;
    }

    public void setRazon_social(String razon_social) {
        this.razon_social = razon_social;
    }

    public String getRuc() {
        return ruc;
    }

    public void setRuc(String ruc) {
        this.ruc = ruc;
    }
    
    
}
