package Examen_Practico;

import  java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int opcion;
        int cambiar;
        int otraAccion;

        do{
            System.out.println("\n-- MENU DE FIGURAS --");
            System.out.println("0. Salir del programa. ");
            System.out.println("1. Cubo ");
            System.out.println("2. Esfera ");
            System.out.println("3. Cilindro ");
            System.out.println("\nElige una opción del menú: ");
            opcion = sc.nextInt();

            switch (opcion) {

                case 0:
                    System.out.println("Finalizando el programa.... ");
                    System.exit(0);

                case 1:
                    System.out.println("\n--CUBO-- ");
                    double lado = 0;

                    for (int i = 0; i < 3; i++) {
                        System.out.println("Ingresa el lado del cubo: ");
                        lado = sc.nextDouble();
                        if (lado > 0) {
                            i= 4;
                        }
                        else {
                            System.out.println("Valor inválido. Intenta de nuevo.");
                        }
                    }
                    if (lado <= 0) {
                        System.out.println("Demasiados intentos inválidos. Regresando al menú.");
                        break;

                    }else{
                        Cubo c1 = new Cubo("Cubo", lado);
                        c1.setLado(lado);
                        c1.mostrarNombre();
                        System.out.println("Volumen: " + c1.calcularVolumen());

                        do{
                            System.out.println("\n¿Deseas realizar una acción con los atributos? (1: Get, 2: Set, 0: Volver al menú principal): ");
                            cambiar = sc.nextInt();
                            if (cambiar == 1) {
                                System.out.println("-- OBTENER DATOS -- ");
                                c1.mostrarNombre();
                                System.out.println("Lado: " + c1.getLado());
                                System.out.println("Volumen: " + c1.calcularVolumen());
                            }else if(cambiar == 2) {
                                double lado1;
                                String nombre;
                                sc.nextLine();
                                System.out.println("Ingresa el nuevo nombre: ");
                                nombre = sc.nextLine();
                                System.out.println("Ingresa el nuevo lado: ");
                                lado1 = sc.nextDouble();
                                c1.setLado(lado1);
                                c1.setNombre(nombre);

                                System.out.println("-- NUEVOS DATOS -- ");
                                c1.mostrarNombre();
                                System.out.println("Nuevo Lado: " + c1.getLado());
                                System.out.println("Volumen Actualizado: " + c1.calcularVolumen());

                            }else if(cambiar == 0){
                                System.out.println("Saliendo al menu principal....");
                                break;
                            }else{
                                System.out.println("Opcion Invalida. ");
                                break;
                            }

                            System.out.println("\n¿Deseas realizar otra reacción? (1: SI, 0: NO) ");
                            otraAccion = sc.nextInt();

                        }while(otraAccion != 0);
                    }

                    break;

                case 2:
                    System.out.println("\n--ESFERA-- ");
                    double radio = 0;

                    for (int i = 0; i < 3; i++) {
                        System.out.println("Ingresa el radio de la esfera: ");
                        radio = sc.nextDouble();
                        if (radio > 0) {
                            i = 4;
                        }
                        else{
                            System.out.println("Valor inválido. Intenta de nuevo.");
                        }
                    }
                    if (radio <= 0) {
                        System.out.println("Demasiados intentos inválidos. Regresando al menú.");
                        break;
                    } else {
                        Esfera e1 = new Esfera("Esfera", radio);
                        e1.setRadio(radio);
                        e1.mostrarNombre();
                        System.out.println("Volumen: " + e1.calcularVolumen());

                        do{
                            System.out.println("\n¿Deseas realizar una acción con los atributos? (1: Get, 2: Set, 0: Volver al menú principal): ");
                            cambiar = sc.nextInt();
                            if (cambiar == 1) {
                                System.out.println("-- OBTENER DATOS -- ");
                                e1.mostrarNombre();
                                System.out.println("Radio: " + e1.getRadio());
                                System.out.println("Volumen: " + e1.calcularVolumen());
                            }else if(cambiar == 2) {
                                double radio1;
                                String nombre;
                                sc.nextLine();
                                System.out.println("Ingresa el nuevo nombre: ");
                                nombre = sc.nextLine();
                                System.out.println("Ingresa el nuevo radio: ");
                                radio1 = sc.nextDouble();
                                e1.setRadio(radio1);
                                e1.setNombre(nombre);

                                System.out.println("-- NUEVOS DATOS -- ");
                                e1.mostrarNombre();
                                System.out.println("Nuevo Radio: " + e1.getRadio());
                                System.out.println("Volumen Actualizado: " + e1.calcularVolumen());

                            }else if(cambiar == 0){
                                System.out.println("Saliendo al menu principal....");
                                break;
                            }else{
                                System.out.println("Opcion Invalida. ");
                                break;
                            }

                            System.out.println("\n¿Deseas realizar otra reacción? (1: SI, 0: NO) ");
                            otraAccion = sc.nextInt();

                        }while(otraAccion != 0);
                    }
                    break;

                case 3:
                    System.out.println("\n--CILINDRO-- ");
                    double rd = 0;
                    double altura = 0;

                    for (int i = 0; i < 3; i++) {
                        System.out.println("Ingresa el radio del Cilindro: ");
                        rd = sc.nextDouble();
                        System.out.println("Ingresa la altura del Cilindro: ");
                        altura = sc.nextDouble();
                        if (rd > 0 && altura > 0) {
                            i = 4;
                        }
                        else {
                            System.out.println("Valor inválido. Intenta de nuevo.");
                        }
                    }
                    if (rd <= 0 || altura <= 0) {
                        System.out.println("Demasiados intentos inválidos. Regresando al menú.");
                        break;
                    } else {
                        Cilindro cl1 = new Cilindro("Cilindro", rd, altura);
                        cl1.setRadio(rd);
                        cl1.mostrarNombre();
                        System.out.println("Volumen: " + cl1.calcularVolumen());

                        do{
                            System.out.println("\n¿Deseas realizar una acción con los atributos? (1: Get, 2: Set, 0: Volver al menú principal): ");
                            cambiar = sc.nextInt();
                            if (cambiar == 1) {
                                System.out.println("-- OBTENER DATOS -- ");
                                cl1.mostrarNombre();
                                System.out.println("Radio: " + cl1.getRadio());
                                System.out.println("Volumen: " + cl1.calcularVolumen());
                            }else if(cambiar == 2) {
                                double radio1;
                                double alt1;
                                String nombre;
                                sc.nextLine();
                                System.out.println("Ingresa el nuevo nombre: ");
                                nombre = sc.nextLine();
                                System.out.println("Ingresa el nuevo radio: ");
                                radio1 = sc.nextDouble();
                                System.out.println("Ingresa la nuevo altura: ");
                                alt1 = sc.nextDouble();

                                cl1.setRadio(radio1);
                                cl1.setAltura(alt1);
                                cl1.setNombre(nombre);

                                System.out.println("-- NUEVOS DATOS -- ");
                                cl1.mostrarNombre();
                                System.out.println("Nuevo Radio: " + cl1.getRadio());
                                System.out.println("Nuevo Radio: " + cl1.getAltura());
                                System.out.println("Volumen Actualizado: " + cl1.calcularVolumen());

                            }else if(cambiar == 0){
                                System.out.println("Saliendo al menu principal....");
                                break;
                            }else{
                                System.out.println("Opcion Invalida. ");
                                break;
                            }

                            System.out.println("\n¿Deseas realizar otra reacción? (1: SI, 0: NO) ");
                            otraAccion = sc.nextInt();

                        }while(otraAccion != 0);
                    }
                    break;

                default:
                    System.out.println("Opcion Invalida del Menu. \n");
                    break;

            }
        }while(opcion != 0);

        sc.close();
    }
}

