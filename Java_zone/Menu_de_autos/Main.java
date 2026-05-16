package Menu_de_autos;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int opc, cambiar, again, continuar;

        do{
            System.out.println("\n-- MENU DE VEHICULOS --");
            System.out.println("0. Salir del programa. ");
            System.out.println("1. Coche. ");
            System.out.println("2. Camion. ");
            System.out.println("3. Motocicleta. ");
            System.out.println("\nElige una opcion del menú: ");
            opc = sc.nextInt();

            switch (opc){

                case 0:
                    System.out.println("\nSaliendo del programa.......");
                    System.exit(0);

                case 1:
                    System.out.println("\n-- COCHE --");
                    double conslt = 0;
                    double dist = 0;
                    double potencia = 0;
                    for(int i= 0; i <= 3; i++) {
                        System.out.println("Ingresa el consumo por litro del coche: ");
                        conslt = sc.nextDouble();
                        System.out.println("Ingresa la potencia del motor (en caballos de fuerza): ");
                        potencia = sc.nextDouble();
                        System.out.println("Ingresa la distancia recorrida: ");
                        dist = sc.nextDouble();
                        if(conslt > 0 && potencia > 0 && dist > 0){
                            i = 4;
                        }else{
                            System.out.println("ERROR. Todos los valores ingresados deben ser mayor a cero. Intente de nuevo. ");
                        }
                    }
                    if(conslt <= 0 || dist <= 0 || potencia <= 0) {
                        System.out.println("Demasiados intentos. Volviendo al menú.... ");
                        break;
                    }else{
                        Coche c1 = new Coche("Coche", conslt, potencia, dist);

                        c1.setConsxlt(conslt);
                        c1.setPotencia(potencia);
                        c1.setDistancia(dist);

                        c1.mostrarNombre();
                        System.out.println("Consumo por litro: " + c1.getConsxlt());
                        System.out.println("Potencia del motor: " + c1.getPotencia());
                        System.out.println("Consumo total: " + c1.calcularConsumo());
                        System.out.println("Velocidad Maxima: " + c1.calcularVelMax());

                        do{
                            System.out.println("\n¿Deseas realizar una acción con los atributos? (1: GET. 2: SET. 0: Volver al menú): ");
                            cambiar = sc.nextInt();

                            if(cambiar == 1){
                                System.out.println("\n-- COCHE --");
                                c1.mostrarNombre();
                                System.out.println("Consumo por litro: " + c1.getConsxlt());
                                System.out.println("Potencia del motor: " + c1.getPotencia());
                                System.out.println("Consumo total: " + c1.calcularConsumo());
                                System.out.println("Velocidad Maxima: " + c1.calcularVelMax());
                            }else if(cambiar == 2){
                                System.out.println("\n-- MODIFICAR COCHE --");
                                String n;
                                double conslt2, potencia2, dist2;
                                sc.nextLine();
                                System.out.println("Ingrese el nuevo nombre: ");
                                n = sc.nextLine();
                                System.out.println("Ingresa el consumo por litro del coche: ");
                                conslt2 = sc.nextDouble();
                                System.out.println("Ingresa la potencia del motor (en caballos de fuerza): ");
                                potencia2 = sc.nextDouble();
                                System.out.println("Ingresa la distancia recorrida: ");
                                dist2 = sc.nextDouble();

                                c1.setNombre(n);
                                c1.setConsxlt(conslt2);
                                c1.setPotencia(potencia2);
                                c1.setDistancia(dist2);

                                System.out.println("\n-- NUEVO COCHE --");
                                c1.mostrarNombre();
                                System.out.println("Nuevo Consumo por litro: " + c1.getConsxlt());
                                System.out.println("Nueva Potencia del motor: " + c1.getPotencia());
                                System.out.println("Nuevo Consumo total: " + c1.calcularConsumo());
                                System.out.println("Nueva Velocidad Maxima: " + c1.calcularVelMax());
                            }else if(cambiar == 0){
                                System.out.println("Saliendo al menú principal.... ");
                                break;
                            }else{
                                System.out.println("Opcion Invalida. Volviendo al menú. ");
                                break;
                            }
                            System.out.println("\n¿Deseas realizar otra acción? (1: Sí, 0: No): ");
                            again = sc.nextInt();
                        }while(again != 0);

                        System.out.println("\n¿Deseas Calcular otro Vehiculo? (1: SI, 0: NO): ");
                        continuar = sc.nextInt();
                        if(continuar == 1){
                            System.out.println("Volviendo al menú para calcular... ");
                            break;
                        }else if(continuar == 0){
                            System.out.println("OK. Gracias. ");
                            System.exit(0);
                        }else{
                            System.out.println("Opcion NO valida. Programa terminado. ");
                            System.exit(0);
                        }
                    }
                    break;

                case 2:
                    System.out.println("\n-- CAMION --");
                    double clt = 0;
                    double pT = 0;

                    for(int i= 0; i <= 3; i++) {
                        System.out.println("Ingresa el consumo por litro del camion: ");
                        clt = sc.nextDouble();
                        System.out.println("Ingresa el peso total (en toneladas): ");
                        pT = sc.nextDouble();

                        if(clt > 0 && pT > 0){
                            i = 4;
                        }else{
                            System.out.println("ERROR. Todos los valores ingresados deben ser mayor a cero. Intente de nuevo. ");
                        }
                    }
                    if(clt <= 0 || pT <= 0) {
                        System.out.println("Demasiados intentos. Volviendo al menú.... ");
                        break;
                    }else{
                        Camion ca1 = new Camion("Camion", clt, pT);

                        ca1.setConsxtn(clt);
                        ca1.setPesoT(pT);

                        ca1.mostrarNombre();
                        System.out.println("Consumo por litro: " + ca1.getConsxtn());
                        System.out.println("Peso Total: " + ca1.getPesoT());
                        System.out.println("Consumo total: " + ca1.calcularConsumo());
                        System.out.println("Velocidad Maxima: " + ca1.calcularVelMax());

                        do{
                            System.out.println("\n¿Deseas realizar una acción con los atributos? (1: GET. 2: SET. 0: Volver al menú): ");
                            cambiar = sc.nextInt();

                            if(cambiar == 1){
                                System.out.println("\n-- CAMION --");
                                ca1.mostrarNombre();
                                System.out.println("Consumo por litro: " + ca1.getConsxtn());
                                System.out.println("Peso Total: " + ca1.getPesoT());
                                System.out.println("Consumo total: " + ca1.calcularConsumo());
                                System.out.println("Velocidad Maxima: " + ca1.calcularVelMax());
                            }else if(cambiar == 2){
                                System.out.println("\n-- MODIFICAR CAMION --");
                                String n0;
                                double clt2, pT2;
                                sc.nextLine();
                                System.out.println("Ingresa el nuevo nombre: ");
                                n0 = sc.nextLine();
                                System.out.println("Ingresa el consumo por litro del camion: ");
                                clt2 = sc.nextDouble();
                                System.out.println("Ingresa el peso total (en toneladas): ");
                                pT2 = sc.nextDouble();

                                ca1.setNombre(n0);
                                ca1.setConsxtn(clt2);
                                ca1.setPesoT(pT2);

                                System.out.println("\n-- NUEVO CAMION --");
                                ca1.mostrarNombre();
                                System.out.println("Nuevo Consumo por litro: " + ca1.getConsxtn());
                                System.out.println("Nuevo Peso Total: " + ca1.getPesoT());
                                System.out.println("Nuevo Consumo total: " + ca1.calcularConsumo());
                                System.out.println("Nueva Velocidad Maxima: " + ca1.calcularVelMax());
                            }else if(cambiar == 0){
                                System.out.println("Saliendo al menú principal.... ");
                                break;
                            }else{
                                System.out.println("Opcion Invalida. Volviendo al menú. ");
                                break;
                            }
                            System.out.println("\n¿Deseas realizar otra acción? (1: Sí, 0: No): ");
                            again = sc.nextInt();
                        }while(again != 0);

                        System.out.println("\n¿Deseas Calcular otro Vehiculo? (1: SI, 0: NO): ");
                        continuar = sc.nextInt();
                        if(continuar == 1){
                            System.out.println("Volviendo al menú para calcular... ");
                            break;
                        }else if(continuar == 0){
                            System.out.println("OK. Gracias. ");
                            System.exit(0);
                        }else{
                            System.out.println("Opcion NO valida. Programa terminado. ");
                            System.exit(0);
                        }
                    }
                    break;

                case 3:
                    System.out.println("\n-- MOTOCICLETA --");
                    double cl = 0;
                    double dst = 0;
                    double p = 0;
                    for(int i= 0; i <= 3; i++) {
                        System.out.println("Ingresa el consumo por litro de la motocicleta: ");
                        cl = sc.nextDouble();
                        System.out.println("Ingresa la potencia del motor (en caballos de fuerza): ");
                        p = sc.nextDouble();
                        System.out.println("Ingresa la distancia recorrida: ");
                        dst = sc.nextDouble();
                        if(cl > 0 && p > 0 && dst > 0){
                            i = 4;
                        }else{
                            System.out.println("ERROR. Todos los valores ingresados deben ser mayor a cero. Intente de nuevo. ");
                        }
                    }
                    if(cl <= 0 || dst <= 0 || p <= 0) {
                        System.out.println("Demasiados intentos. Volviendo al menú.... ");
                        break;
                    }else{
                        Motocicleta m1 = new Motocicleta("Moto", cl, p, dst);

                        m1.setConslt(cl);
                        m1.setPtc(p);
                        m1.setDist(dst);

                        m1.mostrarNombre();
                        System.out.println("Consumo por litro: " + m1.getConslt());
                        System.out.println("Potencia del motor: " + m1.getPtc());
                        System.out.println("Consumo total: " + m1.calcularConsumo());
                        System.out.println("Velocidad Maxima: " + m1.calcularVelMax());

                        do{
                            System.out.println("\n¿Deseas realizar una acción con los atributos? (1: GET. 2: SET. 0: Volver al menú): ");
                            cambiar = sc.nextInt();

                            if(cambiar == 1){
                                System.out.println("\n-- MOTOCICLETA --");
                                m1.mostrarNombre();
                                System.out.println("Consumo por litro: " + m1.getConslt());
                                System.out.println("Potencia del motor: " + m1.getPtc());
                                System.out.println("Consumo total: " + m1.calcularConsumo());
                                System.out.println("Velocidad Maxima: " + m1.calcularVelMax());
                            }else if(cambiar == 2){
                                System.out.println("\n-- MODIFICAR COCHE --");
                                String n1;
                                double cl2, p2, dst2;
                                sc.nextLine();
                                System.out.println("Ingresa el nuevo nombre: ");
                                n1 = sc.nextLine();
                                System.out.println("Ingresa el consumo por litro de la motocicleta: ");
                                cl2 = sc.nextDouble();
                                System.out.println("Ingresa la potencia del motor (en caballos de fuerza): ");
                                p2 = sc.nextDouble();
                                System.out.println("Ingresa la distancia recorrida: ");
                                dst2 = sc.nextDouble();

                                m1.setNombre(n1);
                                m1.setConslt(cl2);
                                m1.setPtc(p2);
                                m1.setDist(dst2);

                                System.out.println("\n-- NUEVA MOTOCICLETA --");
                                m1.mostrarNombre();
                                System.out.println("Nuevo Consumo por litro: " + m1.getConslt());
                                System.out.println("Nueva Potencia del motor: " + m1.getPtc());
                                System.out.println("Nuevo Consumo total: " + m1.calcularConsumo());
                                System.out.println("Nueva Velocidad Maxima: " + m1.calcularVelMax());
                            }else if(cambiar == 0){
                                System.out.println("Saliendo al menú principal.... ");
                                break;
                            }else{
                                System.out.println("Opcion Invalida. Volviendo al menú. ");
                                break;
                            }
                            System.out.println("\n¿Deseas realizar otra acción? (1: Sí, 0: No): ");
                            again = sc.nextInt();
                        }while(again != 0);

                        System.out.println("\n¿Deseas Calcular otro Vehiculo? (1: SI, 0: NO): ");
                        continuar = sc.nextInt();
                        if(continuar == 1){
                            System.out.println("Volviendo al menú para calcular... ");
                            break;
                        }else if(continuar == 0){
                            System.out.println("OK. Gracias. ");
                            System.exit(0);
                        }else{
                            System.out.println("Opcion NO valida. Programa terminado. ");
                            System.exit(0);
                        }
                    }
                    break;

                default:
                    System.out.println("Opcion NO disponible\nVolviendo al menú.....");
                    break;

            }
        }while(opc != 0);

        sc.close();
    }
}
