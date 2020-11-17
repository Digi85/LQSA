package modeloDAO;
import interfaces.CRUD2;
import java.util.List;
import java.sql.*;
import config.bd.ConectaBd;
import java.util.ArrayList;
import modelo.Proveedor;

public class proveedorDAO implements CRUD2 {

    ConectaBd cn = new ConectaBd();
    Connection con;
    PreparedStatement pst;
    ResultSet rs;
    Proveedor e = new Proveedor ();
    public List listarproveedor() {
        ArrayList<Proveedor> proveedores = new ArrayList<>();
        String consulta = " select * from proveedor ";
        try {
            con = cn.getConnection();
            pst = con.prepareStatement(consulta);
            rs = pst.executeQuery();
            while (rs.next()) {                
                Proveedor proveedor = new Proveedor();
                proveedor.setIdproveedor(rs.getInt("idproveedor"));
                proveedor.setRazon_social(rs.getString("razon social"));
                proveedor.setRuc(rs.getString("ruc"));
                proveedor.setEstado(rs.getString("estado"));
                proveedores.add(proveedor);
            }
        } catch (SQLException e) {
            System.out.println("Error: Problemas con el LISTAR");
            System.out.println(e.getMessage());
        }
        return proveedores;

      //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
