import javax.swing.JOptionPane;

public class Principal {
        public static void main(String [] args) {
        int personas =0;
        int numeroEmpleados = 0;
        Metodos misMetodos=new Metodos();
        
         //personas=Integer.parseInt(JOptionPane.showInputDialog( "Cuantas personas va a agregar"));
        //misMetodos.solicitarDatos(personas);
        
        //misMetodos.sumaArreglo();
        
        numeroEmpleados=Integer.parseInt(JOptionPane.showInputDialog("ingrese el numero de empleados"));
        misMetodos.empresaDescuento(numeroEmpleados);
        }
        
}
