
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;

public class File {
    //lecture du fichier texte	
    
   public String chaine="";
   protected String fichier ="lena.pgm";
   
   public File() {
        try{
                InputStream ips=new FileInputStream(fichier); 
                InputStreamReader ipsr=new InputStreamReader(ips);
                BufferedReader br=new BufferedReader(ipsr);
                String ligne;
                while ((ligne=br.readLine())!=null){
                        //System.out.println(ligne);
                        chaine+=ligne+"\n";
                }
                br.close(); 
        }		
        catch (Exception e){
                System.out.println(e.toString());
        }
   }
}