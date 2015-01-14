import java.util.Scanner;
import java.util.ArrayList;
import java.util.Date;

import java.io.File;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.BufferedReader;

class crearCalendario {
	
	public static void main(String[] args) {
		
		//Declaro variables
		Scanner sc=new Scanner(System.in);
		ArrayList<Calendario> icalendario=new ArrayList<Calendario>();
		ArrayList<Fotografia> listafotografias=new ArrayList<Fotografia>();
		Calendario calendar=new Calendario();

		int infaño;
		String infpatrocinador;

		int code;
		String nomautor;
		String lugar;
		//Date fechafoto=new Date();


		//Solicito informacion por pantalla
		System.out.println();
		System.out.println("Vas a realizar un calendario.");
		System.out.print("Por favor, introduzca el año: ");
		infaño=sc.nextInt();
		calendar.setAño(infaño);

//Ejercicio 2.
		

		System.out.println();
		System.out.println("A continuación, le pediremos informacion sobre las fotografías.");
		
		//rellenamos el arraylist con 12 fotografías que van a componer el calendario
		for (int i=0;i<=12;i++) {

			Fotografia foto=new Fotografia();
			Date fechafoto=new Date();//cada foto tiene su fecha

			System.out.print("Por favor, introduzca el cógigo: ");
			code=sc.nextInt();
			foto.setCodigo(code);

			System.out.println();
			System.out.print("Introduzca nombre del autor: ");
			nomautor=sc.next();
			foto.setNombreAutor(nomautor);

			System.out.println();
			System.out.print("Introduzca ubicación: ");
			lugar=sc.next();
			foto.setUbicacion(lugar);

			System.out.println();
			System.out.println("Introduzca la fecha: ");
			fechafoto=foto.convertirfecha(sc.next());
			foto.setFechaFoto(fechafoto);

			listafotografias.add(foto);

		}

		calendar.setFotografias(listafotografias);

		System.out.println();
		System.out.print("Introduzca patrocinador: ");
		infpatrocinador=sc.next();
		calendar.setPatrocinador(infpatrocinador);

		icalendario.add(calendar);
		
//Ejercicio 3
		File archivofotos=new File("fotografias.txt");
		


				System.out.println("\nCreando archivo con las fotografias del calendario....");

				try {
						if(archivofotos.createNewFile()){
								System.out.println("Archivo creado correctamente...");
						}
				}
				catch(Exception ioe) {
								System.out.println("Error: "+ioe);
				}

			try {

				System.out.println();
				System.out.println("Escribiendo en el archivo fotografias.txt...");
				FileWriter fw=new FileWriter(archivofotos);

				//el arraylist icalendar solo tiene un objeto calendario pero lo preparo para completar más
				for (int j=0;j<icalendario.size(); j++) {
					fw.write(icalendario.get(j).getAño()+";");
					fw.write(icalendario.get(j).getNombreAutor()+";");
					fw.write(icalendario.get(j).getPatrocinador()+";");

					
					for (int k=0;k<icalendario.get(j).getFotografias().size();k++) {
						fw.write(icalendario.get(j).getFotografias().get(k).getCodigo()+"#");
						fw.write(icalendario.get(j).getFotografias().get(k).getNombreAutor()+"#");
						fw.write(icalendario.get(j).getFotografias().get(k).getUbicacion()+"#");
						fw.write(icalendario.get(j).getFotografias().get(k).getFechaFoto());
					}

				}

				fw.close();
			}

			catch (Exception e) {
				System.out.println("Error"+e.getMessage());
			}
		
		
//Ejercicio 4


	}


} 