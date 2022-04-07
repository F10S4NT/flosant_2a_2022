/******************************************************************/
/* Program Assignment: 2a */
/* Name: Gustavo Flores de los Santos*/
/* Date: Monday 4th april 2022 */
/* Description: class for count code lines from an array */
/******************************************************************/
package Model2a;


public class LineCounter {
    
    /**
     *
     */
    private int totalLines;
    
    /**
     *
     */
    
    private String arrData;
    
    /**
     *
     */
    
    public int countLines(String[] dataList, int n){
        
        for(int i=0;i<dataList.length;i++){
            if(dataList[i] != null){
                totalLines++;
            }
        } 
        return totalLines;
    }
    
}
