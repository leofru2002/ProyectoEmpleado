package mundo;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		int opc = 0;
		
		Empleado empleado = new Empleado();
		String nombre, apellido, imagen = null;
		int genero, dia, mes, anio =0;
		double salario = 0;
		Fecha fechaNac, fechaIngreso;
		
		do {
			
			System.out.println("|-------------------------MENU---------------------------|");
			System.out.println("|********************************************************|");
			System.out.println("|1. Ingresar datos del empleado.                         |");
			System.out.println("|2. Calcular la edad del empleado.                       |");
			System.out.println("|3. Calcular la antiguedad del empleado en la empresa.   |");
			System.out.println("|4. Calcular las prestaciones del empleado.              |");
			System.out.println("|5. Visualizar la informacion del empleado               |");
			System.out.println("|6. Salir                                                |");
			System.out.println("|********************************************************|");
			

	        do {
	        	try {
					System.out.println("\nEscoja una de las opciones: ");
					System.out.print("=> ");
					opc = scanner.nextInt();
				}
				catch(InputMismatchException e) {
					System.out.println("Debe ingresar solo números ");
					opc = 0;
					scanner.nextLine();
				}
	        }while (opc<1 || opc>6);
			
			switch(opc) {
				case 1:
					
					System.out.println("                 __________________________ ");	
					System.out.println("                |°                        °| ");
					System.out.println("                |INGRESO DATOS DEL EMPLEADO| ");
					System.out.println("                |__________________________| ");				
									
					//Ingreso Nombre (Validado solo letras)
					System.out.println("\n           ------------Ingrese Nombre----------");
					nombre = scanner.next();
					while (!empleado.validarPalabra(nombre )) {
						System.out.println("Debe Ingresar solo letras, ingrese valores nuevamente");
						nombre = scanner.next();	
					}
			        
					//Ingreso Apellido (Validado solo letras)
					System.out.println("           ------------Ingrese Apellido----------");
					apellido = scanner.next();
					while (!empleado.validarPalabra(apellido )) {
						System.out.println("Debe Ingresar solo letras, ingrese valores nuevamente");
						apellido = scanner.next();
						scanner.nextLine();
					}
			        
								        			
			        
					//Ingreso Género
			        System.out.println(" ---------Ingrese Genero (1 para femenino, 2 para masculino)--------- ");
			        do {
			        	try {
							genero= scanner.nextInt();
										
						}
						catch(InputMismatchException e) {
							genero = 0;
							scanner.nextLine();
						}
			        	if (genero<1 || genero>2) {
			        		System.out.println("Debe ingresar solo números 1 o 2 ");
			        	}
			        }while (genero<1 || genero>2);
			        
					
			        //Ingreso Salario
			        System.out.println("          ------------Ingrese Salario----------");
			        do {
						try {	
					        salario = scanner.nextDouble();
						}
						catch(InputMismatchException e) {					
							salario = 0;
							scanner.nextLine();
						}
						if(salario<0.1) {
							System.out.println("Debe ingresar solo números mayores a 0,1. (,) separa decimales ");
						}
					}while (salario<0.1);
					
			        			        
			        // Ingreso día de nacimiento
			        System.out.println("      -----------Ingrese dia de nacimiento(00)----------");
			        do {
			        	try {		        		
					        dia = scanner.nextInt();
			        	}
			        	catch(InputMismatchException e) {						
							dia = 0;
							scanner.nextLine();
			        	}	
			        	if (dia<1 || dia>31) {
			        		System.out.println("Debe ingresar solo números entre 1 y 31");
			        	}
			        }while (dia<1 || dia>31);
			        
			        
			        //Ingreso mes de nacimiento
			        System.out.println("      --------Ingrese mes de nacimiento(números)-------");
			        do {
			        	try {		        		
					        mes = scanner.nextInt();
			        	}
			        	catch(InputMismatchException e) {						
							mes = 0;
							scanner.nextLine();
			        	}
			        	if (mes<1 || mes >12) {
			        		System.out.println("Ingrese solo números entre 1 y 12 ");
			        	}
			        } while (mes<1 || mes >12);
			        
			        
			        //Ingreso año de nacimiento
			        
			        System.out.println("Ingrese año de nacimiento (mayor a 1900 y menor a 2021, formato 0000): ");
			        do {
			        	try {		        		
					        anio = scanner.nextInt();
			        	}
			        	catch(InputMismatchException e) {						
							anio = 0;
							scanner.nextLine();
			        	}
			        	if (anio<1900 || anio>2021) {
			        		System.out.println("Ingrese solo números mayores a 1900 y menores a 2021 ");
			        	}
			        } while (anio<1900 || anio>2021);
			        
			        
			        fechaNac = new Fecha(dia, mes, anio);
			        
			        
			     // Ingreso día de Ingreso
			        System.out.println("      -----------Ingrese dia de Ingreso(00)-------");
			        do {
			        	try {		        		
					        dia = scanner.nextInt();
			        	}
			        	catch(InputMismatchException e) {						
							dia = 0;
							scanner.nextLine();
			        	}	
			        	if (dia<1 || dia>31) {
			        		System.out.println("Debe ingresar solo números entre 1 y 31");
			        	}
			        }while (dia<1 || dia>31);
			        
			        
			        //Ingreso mes de nacimiento
			        System.out.println("      -----------Ingrese mes de ingreso(números)-------");
			        do {
			        	try {		        		
					        mes = scanner.nextInt();
			        	}
			        	catch(InputMismatchException e) {						
							mes = 0;
							scanner.nextLine();
			        	}
			        	if (mes<1 || mes >12) {
			        		System.out.println("Ingrese solo números entre 1 y 12 ");
			        	}
			        } while (mes<1 || mes >12);
			        
			        
			        //Ingreso año de nacimiento
			        
			        System.out.println("Ingrese año de ingreso (mayor a 1900 y menor a 2021, formato 0000): ");
			        do {
			        	try {		        		
					        anio = scanner.nextInt();
			        	}
			        	catch(InputMismatchException e) {						
							anio = 0;
							scanner.nextLine();
			        	}
			        	if (anio<1900 || anio>2021) {
			        		System.out.println("Ingrese solo números mayores a 1900 y menores a 2021 ");
			        	}
			        } while (anio<1900 || anio>2021);
			        
			        fechaIngreso = new Fecha(dia, mes, anio);
			        
			        empleado.setEmpleado(nombre, apellido, genero, imagen, salario, fechaNac, fechaIngreso);
					break;
				case 2:
					System.out.println("Edad del empelado: " + empleado.calcularEdad() +  "años");
					break;
				case 3:
					System.out.println("Antiguedad del empelado: " + empleado.calcularAntiguedad() +  "años");
					break;
				case 4:
					System.out.println("Prestaciones del empelado: " + empleado.calcularPrestaciones());
					break;
				case 5:
					empleado.mostrarInformacion();
					break;
				case 6:
					System.out.println("Ejecucion Terminada");
					break;
				default:
					System.out.println("Ingrese una opción entre 1 y 6");
			}
		} while(opc != 6);
	}
}