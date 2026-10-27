import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedWriter;

public class Viajes{
public static void main (String[] args){

Scanner teclado = new Scanner (System.in);
String nombre="",cedula="",fecha_viaje="",nombre_destino="", tipo_maleta="";
double valor_viaje= 0, acompañantes= 0;
int opcion = 0, maleta=0, destino=0;
final int MB =285325,MP=325650 ;


while (opcion != 2){

System.out.println("=================================");
System.out.println("     Seleccione una opcion  ");
System.out.println("=================================");
System.out.println("1. Registrar Usuario");
System.out.println("2. SALIR");

System.out.println("Selecciona una opcion");
opcion= teclado.nextInt();
teclado.nextLine();
switch (opcion) {
case 1 :
System.out.println("Ingrese su nombre completo");
nombre= teclado.nextLine();
System.out.println("Ingrese el numero de su documento de identidad");
cedula= teclado.nextLine();
System.out.println("Ingrese la fecha de su viaje (DD/MM/AAAA)");
fecha_viaje= teclado.nextLine();

System.out.println("Ingrese el numero de personas que iran con usted");
acompañantes= teclado.nextInt();
System.out.println("Escoja que tipo de maleta llevara (Selecciona el numero)");
System.out.println("1. Maleta basica  (MB) ");
System.out.println("2. Maleta premium (MP) ");
maleta=teclado.nextInt();
teclado.nextLine();

System.out.println("=============================");
System.out.println("    Selecciona un destino    ");
System.out.println("=============================");
System.out.println("1. Cartagena / Colombia");
System.out.println("2. Buenos Aires / Argentina");
System.out.println("3. Barcelona / España");
System.out.println("4. Ciudad de Mexico / Mexico");
System.out.println("5. Paris / Francia");
System.out.println("6. Roma / Italia");
System.out.println("7. Tokio / Japon");
System.out.println("8. Lima / Peru");
System.out.println("9. Rio de Janeiro / Brasil");
System.out.println("10. Londres / Reino Unido");
destino=teclado.nextInt();
teclado.nextLine();

switch (destino) {
case 1:
nombre_destino="Cartagena / Colombia";   // CAMBIO
System.out.println("¡Destino guardado con éxito!");
break;
case 2:
nombre_destino="Buenos Aires / Argentina";
System.out.println("¡Destino guardado con éxito!");
break;
case 3:
nombre_destino="Barcelona / España";
System.out.println("¡Destino guardado con éxito!");
break;
case 4:
nombre_destino="Ciudad de Mexico / Mexico";
System.out.println("¡Destino guardado con éxito!");
break;
case 5:
nombre_destino="Paris / Francia";
System.out.println("¡Destino guardado con éxito!");
break;
case 6:
nombre_destino="Roma / Italia";
System.out.println("¡Destino guardado con éxito!");
break;
case 7:
nombre_destino="Tokio / Japon";
System.out.println("¡Destino guardado con éxito!");
break;
case 8:
nombre_destino="Lima / Peru";
System.out.println("¡Destino guardado con éxito!");
break;
case 9:
nombre_destino="Rio de Janeiro / Brasil";
System.out.println("¡Destino guardado con éxito!");
break;
case 10:
nombre_destino="Londres / Reino Unido";
System.out.println("¡Destino guardado con éxito!");
break;
default:
System.out.println("Opción no válida. Por favor selecciona un número entre 1 y 10.");
break;
}


if(maleta==1){
valor_viaje= (acompañantes+1) * MB;
tipo_maleta= "Basica";
}
if(maleta==2){
valor_viaje= (acompañantes+1) * MP;
tipo_maleta= "Premium";
}

try {

FileWriter fw = new FileWriter("C:\\Users\\soyol\\OneDrive\\Desktop\\Recibo.txt");
BufferedWriter bw = new BufferedWriter (fw);
bw.write("Recibo de viaje");
bw.write("\n");
bw.write("\n");
bw.write("\n");
bw.write("Nombre: " + nombre + "\n");
bw.write("Documento: " + "C.C " + cedula +"\n");
bw.write("Fecha del viaje : " + fecha_viaje +"\n");
bw.write("Destino: " + nombre_destino + "\n");
bw.write("Numero de pasajeros: " + (acompañantes+1) + "\n");
bw.write("Tipo de maleta: " + tipo_maleta + "\n");
bw.write("Precio total: $"+ valor_viaje + "\n");
bw.write("\n");
bw.write("\n");

bw.close();
fw.close();
}

catch (IOException error) {
System.out.println("ALERTA VERIFICAR RESPALDO"+ error.getMessage());
}


}}}}