import java.util.Scanner;

public class App {  
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        
        // Ciclo del menu selecion de operacion 
        String salir="yes";
        while( salir.equals("yes")){
            System.out.println("----------Calculadora---------");
            System.out.println("1. Sumar \n" 
                            + "2. Restar \n"
                            + "3. Multiplicar \n"
                            + "4. Dividir \n"
                            + "5. Modulo de divisiòn");

            System.out.println("Seleccione la operaciòn que desea realizar");
            int opcion = sc.nextInt();

            // Consume el "Enter" ingresado por teclado
            String saltoLinea = sc.nextLine();

            System.out.println("Ingrese el primer numero");
            Double numA = sc.nextDouble();
            saltoLinea = sc.nextLine();

            System.out.println("Ingrese el segundo numero");
            Double numB = sc.nextDouble();
            saltoLinea = sc.nextLine();

            // Validar el divisor en la operacion Dividir o Modulo de division
            if(opcion != 4 || opcion != 5){
                if(numB == 0){
                    System.out.println("No se puede dividir por cero");
                }else{
                    // Si el divisior no es cero continuamos con la operaciòn
                    // Creamos un objeto Instanciando la clase Operacion y enviamos los argumentos(numA, numB) 
                    Operacion oper = new Operacion(numA, numB);

                    switch(opcion){
                        case 1:
                            // Invocamos el metodo suma y lo guardamos en la variable resultado
                            Double resultado = oper.suma();
                            System.out.println("La suma: "+ numA + "+" + numB + " = " + resultado);
                            break;

                        case 2:
                            // Invocamos el metodo resta y lo guardamos en la variable resultado
                            resultado = oper.resta();
                            System.out.println("La resta: "+ numA + "-" + numB + " = " + resultado);
                            break;

                        case 3:
                            // Invocamos el metodo multiplicar y lo guardamos en la variable resultado
                            resultado = oper.multiplicar();
                            System.out.println("La multiplicaciòn: "+ numA + " X " + numB + " = " + resultado);
                            break;

                        case 4:
                            // Invocamos el metodo dividir y lo guardamos en la variable resultado
                            resultado = oper.dividir();
                            System.out.println("La division: "+ numA + " / " + numB + " = " + resultado);
                            break;

                        case 5:
                            // Invocamos el metodo smodulo y lo guardamos en la variable resultado
                            resultado = oper.modulo();
                            System.out.println("El modulo: "+ numA + " % " + numB + " = " + resultado);
                            break;
                    }
                }

            }
            
            System.out.println("Desea continuar?");
            salir = sc.nextLine();
        }
        sc.close();
    }
}
