package modeloDAO;

import java.sql.*;
import config.bd.ConectaBd;
import java.util.ArrayList;
import java.util.List;
import modelo.Producto;
import interfaces.CRUD;

public class productoDAO implements CRUD {

    ConectaBd cn = new ConectaBd();
    Connection con;
    PreparedStatement pst;
    ResultSet rs;
    Producto e = new Producto ();
    public List listarproducto() {
    ArrayList<Producto> productos = new ArrayList<>();
        String consulta = " select * from producto ";
        try {
            con = cn.getConnection();
            pst = con.prepareStatement(consulta);
            rs = pst.executeQuery();
            while (rs.next()) {                
                Producto producto = new Producto();
                producto.setIdproducto(rs.getInt("idproducto"));
                producto.setNombre(rs.getString("nombre"));
                producto.setCodigo(rs.getString("codigo"));
                producto.setFecha_produccion(rs.getString("fecha_produccion"));
                producto.setStock(rs.getInt("stock"));
                producto.setPrecio_compra(rs.getDouble("precio_compra"));
                producto.setPrecio_venta(rs.getDouble("precio_venta"));
                producto.setEstado(rs.getString("estado"));
                
                productos.add(producto);
            }
        } catch (SQLException e) {
            System.out.println("Error: Problemas con el LISTAR");
            System.out.println(e.getMessage());
        }
        return productos;
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
