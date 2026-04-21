package HeJerarquica_Personas;

public class Main {
    public static void main(String[] args){

        Alumno a = new Alumno();
        a.nombre = "Ana";
        a.saludar();
        a.estudiar();

        Profesor p = new Profesor();
        p.nombre = "Carlos";
        p.saludar();
        p.darClases();

        Coordinador c = new Coordinador();
        c.nombre = "Luis";
        c.saludar();
        c.coordinar();

        Secretario s = new Secretario();
        s.nombre = "Marta";
        s.saludar();
        s.atender();

        Bibliotecario b = new Bibliotecario();
        b.nombre = "Pedro";
        b.saludar();
        b.prestarLibro();


    }
}
