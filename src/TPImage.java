/**
 *
 * @author Sébastien
 */

import java.io.*;

public class TPImage {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       File fichier = new File();

       for(int i=0;i<255;i++) {
        System.out.println(i+ ": "+fichier.nuancier[i]);
       }
    }
   
}
