
import java.util.Arrays;
import java.util.HashMap;

import javax.swing.JOptionPane;

public class Metodos {
	String nombre="", profesion="";
	int  documento=0, edad=0, numeroPersonas=0,registradasPersonas=0,ingresadasPersonas=0, mayoresEdad=0, menoresEdad=0;
	

	public void solicitarDatos (int numeroPersonas) {
		String mostrarDatos="";
		
		for (int i = 0; i < numeroPersonas; i++) {
		   
			
			nombre=JOptionPane.showInputDialog("ingrese su nombre "+(i+1));
			profesion=JOptionPane.showInputDialog("ingrese su profesion "+(i+1));
			edad=Integer.parseInt(JOptionPane.showInputDialog("ingrese su edad "+(i+1)));
			documento=Integer.parseInt(JOptionPane.showInputDialog("ingrese su documento "+(i+1)));
			ingresadasPersonas=ingresadasPersonas+1;
			
			
			if ( edad >= 18) {
				mayoresEdad++;
			}
			if (edad < 18) {
			   menoresEdad++;
			}
			registradasPersonas++;	
		}
		mostrarDatos="LISTA DATOS RECOLECTADOS\n";
		mostrarDatos+="total de personas ingresadas: "+ingresadasPersonas+"\n";
		mostrarDatos+="total personas mayores de edad: "+mayoresEdad+"\n";
		mostrarDatos+="total personas menores de edad: "+menoresEdad+"\n";
		mostrarDatos+="total personas registradas: "+registradasPersonas+"\n";
		
		System.out.println(mostrarDatos);
		
		
	}
	
	public void sumaArreglo() {
		String tamañoArreglo=JOptionPane.showInputDialog("ingrese el numero de elementos del arreglo");
		int tamaño=Integer.parseInt(tamañoArreglo);
		
		int [] arreglo1 = new int [tamaño];
		int [] arreglo2 = new int [tamaño];
		int [] resultado = new int [tamaño];
		
		JOptionPane.showMessageDialog(null,"ingrese los elementos del primer arreglo:");
		
		for (int i = 0; i < tamaño; i++) {
			String elementosArreglo =JOptionPane.showInputDialog("elemento " +(i+1) + "  : ");
			arreglo1[i] =Integer.parseInt(elementosArreglo);
			
		}
		System.out.println(Arrays.toString(arreglo1));
		
		JOptionPane.showMessageDialog(null, "ingrese los elementos del segundo arreglo:");
		
		for (int i = 0; i < tamaño; i++) {
			String elementoArreglo =JOptionPane.showInputDialog("elemento " + (i+1) + " : ");
			arreglo2[i] = Integer.parseInt(elementoArreglo);
			
		}
		
			System.out.println(Arrays.toString(arreglo2));
		
		
		
		String resultadoArreglo ="resultado de la suma de los arreglos:\n";
		
		for (int i = 0; i < tamaño; i++) {
			resultado[i]= arreglo1[i] + arreglo2[i];
			resultadoArreglo += resultado[i] + ", ";
		}
		
		
		JOptionPane.showMessageDialog(null, resultadoArreglo);
		
		
	}

	HashMap<String,Integer>mapaEmpleados=new HashMap<String, Integer>();
	HashMap<String,Double>mapaDescuento=new HashMap<String,Double>();
	HashMap<String,Double>mapaDescuentoRealizado=new HashMap<String, Double>();
	
	
	public void empresaDescuento(int empleados) {
		
		mapaDescuento.put("1-2", 0.02);
		mapaDescuento.put("3-4", 0.04);
		mapaDescuento.put("5", 0.08);
		mapaDescuento.put("6", 0.10);
		for (int i = 0; i < empleados; i++) {
			String guardarEmpleados=JOptionPane.showInputDialog("Ingrese el nombre del empleado "+(i+1) + " : ");
			int guardarSueldo=Integer.parseInt(JOptionPane.showInputDialog("ingrese el sueldo del empleado"+(i+1)+" : "));
			mapaEmpleados.put(guardarEmpleados,guardarSueldo);
			
			
			String clave=guardarEmpleados;
			int key1=mapaEmpleados.get(clave);
			String key2=JOptionPane.showInputDialog("ingrese ")
			
		
		}
		
		
		
		String menu="DESCUENTO DE LOS EMPLEADOS";
		 menu+="1.realizar descuento de los empleados\n";
		 menu+="2.salir\n";
		 
		 int opcion= 0;
		 
		 do {
			opcion=Integer.parseInt(JOptionPane.showInputDialog(menu));
			switch (opcion) {
			case 1:
				
				break;
			case 2:
				break;

			default:
				break;
			}
		} while (opcion !=2);
		
	}
}
