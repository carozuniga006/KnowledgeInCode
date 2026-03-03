package Datos_Libro;

public class Libro {
    private String titulo;
    private String autor;
    private int anioPub;

    public Libro(String titulo, String autor, int anioPub){
        this.titulo = titulo;
        this.autor = autor;
        this.anioPub = anioPub;
    }

    public String getTitulo(){
        return titulo;
    }
    public void setTitulo(String titulo){
        this.titulo = titulo;
    }

    public String getAutor(){
        return autor;
    }
    public void setAutor(String autor){
        this.autor = autor;
    }

    public int getAnioPub(){
        return anioPub;
    }
    public void setAnioPub(int anioPub){
        this.anioPub = anioPub;
    }

    public void verifAnio(){
        if(anioPub>2000){
            System.out.println("El libro fue publicado después de los 2000´s\n");
        }
        else {
            System.out.println("El libro fue publicado antes de los 2000´s\n");
        }
    }

}

