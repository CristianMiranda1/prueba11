package hola;

import java.io.Console;
import java.util.ArrayList;
import java.util.Arrays;

public class prueba {
/* Don José todos los martes y jueves realiza un 20% de descuento en el total de las
compras, crea una función la cual debe recibir un parámetro del día y el arreglo de
valores de los productos a comprar, esta debe retornar el total final de la compra según
corresponda o no descuento. */
public static void main(String[] args) {

Console console = System.console();
String dias = console.readLine("si hoy es martes o jueves presione 1");
int diass = Integer.parseInt(dias);
ArrayList <Integer> miArray = new ArrayList <Integer> (Arrays.asList( 1000,500,650,8000));
ArrayList <Integer> miArray2 = new ArrayList <Integer> (Arrays.asList( 800,400,520,6600));

    if (diass==1){
    System.out.println("los precios de hoy estan con 20% de descuento y estos son  "+miArray2);

     }
     else {
        System.out.println("no hay descuentos hoy los precios son "+miArray);}}




  //*****************************************************************************************************/
               /* Don José hace un 5% de descuento a los clientes que compran más de 3 productos y al
menos uno de ellos tiene un valor mayor a 10.000, realiza una función que calcule el
total verificando si corresponde o no el descuento. */

    
            Console console = System.console();
            String productos = console.readLine("ingrese cantidad de productos a comprar");
            int productoss = Integer.parseInt(productos);
            String valor = console.readLine("ingrese valor de sus productos");
            int valorr = Integer.parseInt(valor);
            while(productoss!=0){
                
                if (productoss>=3 && valorr >10000){

                    System.out.println(valorr*0.95);
                  
                }
               else {
                System.out.println(valorr);
                }
                productoss--;
                   }}
            





