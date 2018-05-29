
package artista;

import java.util.Date;

public class Artista {
    
private String nombreArtista;
private Date fechaNacimiento;
private String pais;
private Albun[] albuns;

    public String getNombreArtista() {
        return nombreArtista;
    }

    public void setNombreArtista(String nombreArtista) {
        this.nombreArtista = nombreArtista;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public Albun[] getAlbuns() {
        return albuns;
    }

    public void setAlbuns(Albun[] albuns) {
        this.albuns = albuns;
    }

    String setNombreArtista() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }



    
  
}
