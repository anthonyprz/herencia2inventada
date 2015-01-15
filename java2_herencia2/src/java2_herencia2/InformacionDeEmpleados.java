package java2_herencia2;
import java.util.Scanner;
public class InformacionDeEmpleados {
	
	public static void main (String [] args){
		
		String codigoInf, codigoLimp, nomb, ape, espe, dpst;
		int eda, añosEmp;
		double sueld;
		
		Informatico informatico = new Informatico();
		Limpiador limpiador = new Limpiador();
		Scanner sc = new Scanner (System.in);
		
		System.out.println("¿que empleado quieres manejar? informatico/limpiador = 1/2");
		int opcion = sc.nextInt();
		switch(opcion){
		case 1:
				try{
		
					
					System.out.println("----------------para informatico--------------------");
					
					System.out.println("ingresa el codigo del empleado informatico");
					codigoInf = sc.next();
					informatico.setCodigoEmpleado(codigoInf);
					System.out.println("ingresa el nombre del empleado informatico");
					nomb = sc.next();
					informatico.setNombre(nomb);
					System.out.println("ingresa el apellido del empleado informatico");
					ape = sc.next();
					informatico.setApellido(ape);
					System.out.println("ingresa la edad del empleado informatico");
					eda = sc.nextInt();
					informatico.setEdad(eda);
					System.out.println("ingresa el sueldo del empleado informatico");
					sueld = sc.nextDouble();
					informatico.setSueldo(sueld);
					System.out.println("ingresa la especialidad del empleado informatico");
					espe = sc.next();
					informatico.setEspecialidad(espe);
					System.out.println("¿cuantos años tiene trabajando en la empresa?");
					añosEmp = sc.nextInt();
					informatico.setAñosEnEmpresa(añosEmp);
					
					double sueldoAños;
					sueldoAños = sueld * añosEmp;
					
					
					
					//mostrar
					
					System.out.println("<><><><><><>informacion de los empleados<><><><><><>");
					System.out.println("codigo del empleado : "+informatico.getCodigoEmpleado());
					System.out.println("nombre : "+informatico.getNombre());
					System.out.println("apellido : "+informatico.getApellido());
					System.out.println("edad : "+informatico.getEdad());
					System.out.println("sueldo : "+informatico.getSueldo());
					System.out.println("especialidad : "+informatico.getEspecialidad());
					System.out.println("años en empresa : "+informatico.getAñosEnEmpresa());
					System.out.println("estas son las ganancias desde que ha empezado a trabajar: " + sueldoAños + "€");
					
				}
				catch(Exception ioe) {
					System.out.println("aqui hay un error: "+ioe);
				}break;
		
		case 2:
			try {
					System.out.println("----------------para limpiador--------------------");
					
					System.out.println("ingresa el codigo del empleado limpiador");
					codigoLimp = sc.next();
					limpiador.setCodigoEmpleado(codigoLimp);
					System.out.println("ingresa el nombre del empleado limpiador");
					nomb = sc.next();
					limpiador.setNombre(nomb);
					System.out.println("ingresa el apellido del empleado limpiador");
					ape = sc.next();
					limpiador.setApellido(ape);
					System.out.println("ingresa la edad del empleado limpiador");
					eda = sc.nextInt();
					limpiador.setEdad(eda);
					System.out.println("ingresa el sueldo del empleado limpiador");
					sueld = sc.nextDouble();
					limpiador.setSueldo(sueld);
					System.out.println("ubicacion del deposito del material");
					dpst = sc.next();
					limpiador.setDepositoDeMaterial(dpst);
					
					//mostrar
					
					System.out.println("<><><><><><>informacion del empleado<><><><><><>");
					System.out.println("codigo del empleado: "+limpiador.getCodigoEmpleado());
					System.out.println("nombre : "+limpiador.getNombre());
					System.out.println("apellido: "+limpiador.getApellido());
					System.out.println("edad: "+limpiador.getEdad());
					System.out.println("sueldo: "+limpiador.getSueldo());
					System.out.println("deposito del material: "+limpiador.getDepositoDeMaterial());
			
			}catch(Exception ioe) {
				System.out.println("aqui hay un error: "+ioe);
			}break;
		default:
			System.out.println("ERROR-----elige entre 1 y 2-------");
		break;

		
		}
	}

}
