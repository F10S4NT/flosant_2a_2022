/******************************************************************/
/* Program Assignment: 2a */
/* Name: Gustavo Flores de los Santos*/
/* Date: Monday 4th april 2022 */
/* Description: Data class for  */
/******************************************************************/

package Model2a;



public class Data {

    private String[] Lista;

    /**
     * @param data
     * @return 
     */
    public String[] saveData(String data) {
        Lista = data.split("\n");
        return Lista;
    }
}
