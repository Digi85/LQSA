package vistacontrol;

import java.util.List;
import modeloDAO.productoDAO;
import utils.leer;
import modelo.Producto;
import modeloDAO.proveedorDAO;
import modelo.Proveedor;

public class index {
     public static void listarproductos()
    {
        productoDAO productoDAO = new productoDAO();
        List<Producto>productos = productoDAO.listarproducto();
        System.out.println("Listado de productos");
        for (Producto producto : productos) {
            System.out.println(producto.getIdproducto()+ "\t"+
                               darFormato(producto.getNombre())+ "\t"+
                               darFormato(producto.getCodigo())+"\t"+
                               darFormato(producto.getFecha_produccion())+
                               (producto.getStock())+"\t"+
                               (producto.getPrecio_compra())+"\t"+
                               (producto.getPrecio_venta())+"\t"+                              
                              darFormato( producto.getEstado())
                    
                    );
        }
    }
     public static void listarproveedores()
    {
        proveedorDAO proveedorDAO = new proveedorDAO();
        List<Proveedor>proveedores = proveedorDAO.listarproveedor();
        System.out.println("Listado de proveedores");
        for (Proveedor proveedor : proveedores) {
            System.out.println(proveedor.getIdproveedor()+ "\t"+
                               darFormato(proveedor.getRazon_social())+ "\t"+
                               darFormato(proveedor.getRuc())+"\t"+
                               darFormato(proveedor.getEstado())                              
                    );
        }
    }
     
     public static String darFormato(String cadena){
        if (cadena.length()>=15) {
            cadena = cadena.substring(0,12) + "  "+" ";
        }else if (cadena.length()>=8) {
        	cadena = cadena + "";
        }else if (cadena.length()>=4) {
            cadena = cadena + "\t";
        }else if (cadena.length()>=2){
            cadena = cadena + "\t\t";
        }
        else if (cadena.length()==7) {
        	cadena = cadena + "\t";
        }
         else {
            cadena = cadena + "\t";
        }
        
        return cadena;
    }
     
    public static void menu()
     {
         System.out.println("1.Listar Productos");
         System.out.println("2.Listar Proveedor");
         System.out.println("3.Salir");
     }
    public static void salir()
    {
        System.out.println("Gracias por su visita....");
    }
    public static void inicio()
     {
         int op;
         do {             
             menu();
             op = leer.entero();
             switch(op)
             {
                 case 1:
                 listarproductos();
                  break;
                  case 2:
                   listarproveedores();
                    break;
                    case 3:
                        salir();
                  break;
                    default:
                        System.out.println("ERROR");
                  break;
             }
         } while (op != 3);
     }
    public static void main(String[] args) {
        inicio();
    }
}
