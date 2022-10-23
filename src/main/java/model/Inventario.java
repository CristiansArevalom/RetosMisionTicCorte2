package model;

import java.util.Scanner;

public class Inventario {
	private static final int CANTIDAD_BALONES = 100;
	protected Balon balon [] = new Balon [CANTIDAD_BALONES];
	private int n;

	public void procesarComandos() {

		Scanner teclado = new Scanner (System.in);
		while(teclado.hasNextLine()) {
			try {
				String comando=teclado.nextLine();

				String[] comandos=comando.split("&");
				int lengthCommandos=comandos.length;//para arrays es .length; para string es .length();
				if(lengthCommandos>=6 && comandos[0].equals("1")) { //>=6 == atrubutos minimos constructor balon;
					//1&novato&tamaño&velocidadMaxima&serial&Resistenciamáxima
					String tipo= comandos[1];
					int tamaño = Integer.parseInt(comandos[2]);
					int velocidad=Integer.parseInt(comandos[3]);
					String serial=comandos[4];

					if( tipo.equals("Novato")) {
						String resistenciaMaxima=comandos[5];
						//Balon balonNovato= new Novato(tamaño,velocidad,serial,tipo,resistenciaMaxima); //UPCASTING, NO PUEDE ACCEDER A LOS METODOS DE CLASE HIJA
						Novato balonNovato= new Novato(tamaño,velocidad,serial,tipo,resistenciaMaxima); //UPCASTING, NO PUEDE ACCEDER A LOS METODOS DE CLASE HIJA
						agregarBalon(balonNovato);

					}else if(tipo.equals("Profesional")) {
						//1&Profesional&tamaño&velocidadMaxima&serial&color	
						String color=comandos[5];
						Profesional balonProfesional= new Profesional(velocidad,tamaño, serial, tipo, color);

						agregarBalon(balonProfesional);
					}	
				}else if (comando.equals("2")){
					listarBalones();
				}
				else if(comando.equals("3")) {
					teclado.close();
					break;
				}
			}catch(NumberFormatException ne){
				throw new RuntimeException("error, no se ingreso numero + " + ne);
			}
			catch(Exception re) {
				throw new RuntimeException("error" + re);
			}
		}
	}
	public void listarBalones() {
		System.out.println("***Inventario de balones***");
		for (int i =0; i<this.n; i++){
			System.out.println(balon[i].toString());
		}
	}
	public void agregarBalon(Balon b) {
		this.balon[this.n]=b; //COmo profesional y noivato heredan de balon, se pueden agregar a array balon
		this.n++;

	}
	public static void main (String []args) {
		Inventario inventario = new Inventario();
		inventario.procesarComandos();

	}
	/***
	 * CASO PRUEBA
1&Profesional&4&180&FFE000&Rojo
1&Profesional&2&240&GOK223&Azul
1&Profesional&8&160&EEE111&Verde
1&Novato&2&150&FFF222&250
1
2
3

	 * */


}
