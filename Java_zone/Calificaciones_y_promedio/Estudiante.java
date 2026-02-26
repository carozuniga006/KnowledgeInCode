package Calificaciones_y_promedio;

public class Estudiante {

    String nombre;
    String matricula;
    double calificacion1;
    double calificacion2;
    double calificacion3;
    double calificacion4;
    double calificacion5;

    public Estudiante(String nombre, String matricula, double calificacion1, double calificacion2, double calificacion3, double calificacion4, double calificacion5){
        this.nombre = nombre;
        this.matricula = matricula;
        this.calificacion1 = calificacion1;
        this.calificacion2 = calificacion2;
        this.calificacion3 = calificacion3;
        this.calificacion4 = calificacion4;
        this.calificacion5 = calificacion5;
    }

    double calcularPromedio() {
        double promedio = (calificacion1 + calificacion2 + calificacion3 + calificacion4 + calificacion5)/5;
        return promedio;
    }

    void mostrarDatos() {

        double promedio = calcularPromedio();
        System.out.println("\nNombre: " + nombre);
        System.out.println("Matricula: " + matricula);
        System.out.println("Promedio: " + promedio);

        if (promedio == 10){
            System.out.println("¡Sigue así!"); }
        else if (promedio > 8){
            System.out.println("Promedio Excelente"); }
        else if (promedio > 6){
            System.out.println("Intenta mejorar el siguiente semestre"); }
        else {
            for (int i = 0; i < 10; i++){
                System.out.println("Necesito ponerme a estudiar mas"); }
        }
    }
}
