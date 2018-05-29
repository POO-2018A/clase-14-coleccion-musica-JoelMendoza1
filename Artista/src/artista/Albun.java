package artista;

public class Albun {
    private int añoLanzamiento;
    private String nombreAlbun;
    private Genero genero;
    private Artista artista;
    private int numeroCanciones;

    public Albun(String nombreAlbun, Genero genero, Artista artista, int añoLanzamiento, int numeroCanciones){
        this.nombreAlbun=nombreAlbun;
        this.genero=genero;
        this.artista=artista;
        this.añoLanzamiento=añoLanzamiento;
        this.numeroCanciones=numeroCanciones;
        
    }
    
    //gett and sett
    public int getAñoLanzamiento() {
        return añoLanzamiento;
    }

    public void setAñoLanzamiento(int añoLanzamiento) {
        this.añoLanzamiento = añoLanzamiento;
    }

    public String getNombreAlbun() {
        return nombreAlbun;
    }

    public void setNombreAlbun(String nombreAlbun) {
        this.nombreAlbun = nombreAlbun;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    public Artista getArtista() {
        return artista;
    }

    public void setArtista(Artista artista) {
        this.artista = artista;
    }

    public int getNumeroCanciones() {
        return numeroCanciones;
    }

    public void setNumeroCanciones(int numeroCanciones) {
        this.numeroCanciones = numeroCanciones;
    }
    
    
    
    
    
    
}
