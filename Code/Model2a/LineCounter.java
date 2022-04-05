/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model2a;

/**
 *
 * @author ugflo
 */
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
