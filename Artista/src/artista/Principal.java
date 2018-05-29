package artista;
import java.util.Scanner;
import java.util.Date;
public class Principal {
    
    
      public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
      
       System.out.println("Ingrese el numero de artistas que hay");
       int numeroArtista=scan.nextInt();
       System.out.println("Cuantos albunes hay");
       int numeroAlbun=scan.nextInt();
       Albun[] albun= new Albun[numeroAlbun];
       Artista[] artistan=new Artista[numeroArtista];
      
       
       for(int a=0; a<artistan.length; a++){
           
       
       
       
       System.out.println("Ingrese la informacion del "+(a+1)+"°" +"artista");
       
       scan.nextLine();
       
       System.out.print("Nombre: ");
       String nombreArtista=scan.nextLine();
       
       
       System.out.println();
       
       
       
       System.out.print("Pais: ");
       String pais=scan.nextLine();
       
       
       System.out.println("Albun: ");
       System.out.println("Decea ingresar un nuevo albun?  1 o 0");
       
          boolean desicion=scan.hasNextFloat();
       if(desicion=true){
           
           
           
           
           
           for(int i=0; i<albun.length;i++){
               System.out.println("Ingrese los datos del albun ");
               
               System.out.print("Nombre del albun: ");
               String nombreAlbun= scan.nextLine();
               
               
               System.out.print("Nombre del genero:");
               String genero=scan.nextLine();
               
               
               System.out.print("Nombre del artista: ");
               String artista=scan.nextLine();
               
               System.out.print("Año de lanzamiento: ");
               int añoLanzamiento= scan.nextInt();
               
               System.out.print("Numero de canciones: ");
               int numeroCanciones= scan.nextInt();
               
               }
            
           
       }
           
      
               
               
       
       
       
      
       
    }
       System.out.println("INFORMACION DE LOS ARTISTAS");
       
       for(int i=0; i<artistan.length; i++){
           
           System.out.println("Artista "+ (i+1));
           System.out.println("Nombre del artista: "+ artistan[i].getNombreArtista());
           System.out.println("Pais del artista: "+artistan[i].getPais());
           System.out.println("Albun: ");
           
           for(int j=0; j<albun.length; j++){
               System.out.println("Año de lanzamiento: "+albun[i].getAñoLanzamiento());
               
            System.out.println("Nombre del albun: "+albun[i].getNombreAlbun());
            
            System.out.println("Genero: "+ albun[i].getGenero());
            System.out.println("Artista: "+ albun[i].getArtista());
            System.out.println("Numero de canciones: "+ albun[i].getNumeroCanciones());
            
           }
       }
       
      }
    
}
