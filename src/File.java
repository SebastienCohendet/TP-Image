import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;

public class File {
    //lecture du fichier texte	
    
   public String chaine="";
   protected String fichier ="lena.pgm";
   public int tailleX=1;
   public int tailleY=1;
   protected int [] nuancier = new int[255];

   
   public File() {
        try{
                InputStream ips=new FileInputStream(fichier); 
                InputStreamReader ipsr=new InputStreamReader(ips);
                BufferedReader br=new BufferedReader(ipsr);
                String ligne;
                int i=0;
                while ((ligne=br.readLine())!=null){
                        //System.out.println(ligne);
                        if (i==2) {
                            String[] entiers= ligne.split(" ");
                            tailleX= Integer.parseInt(entiers[0]);
                            tailleY= Integer.parseInt(entiers[1]);
                        }
                        chaine+=ligne+"\n";
                        if (i>3) {
                            String[] entiers1=ligne.split("	");
                            for(int j=0; j<entiers1.length; j++) {
                                this.nuancier[Integer.parseInt(entiers1[j])]++;
                            }
                        }
                        i++;
                }
                br.close(); 
        }		
        catch (Exception e){
                System.out.println(e.toString());
        }
   }
}