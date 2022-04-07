/******************************************************************/
/* Program Assignment: 2a */
/* Name: Gustavo Flores de los Santos*/
/* Date: Monday 4th april 2022 */
/* Description: class for make txt file printing output data */
/******************************************************************/
package Model2a;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;


public class Output {


    /**
     * @param outFile
     * @param outText
     */
    
    public void writeData(String outFile, String outText) {
        try {
            File file = new File(outFile);
            // Si el archivo no existe es creado
            if (!file.exists()) {
                file.createNewFile();
            }
            FileWriter fw = new FileWriter(file);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(outText);
            bw.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

