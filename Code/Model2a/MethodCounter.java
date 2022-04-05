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
public class MethodCounter {

    //*******Variables******************/
    /**
     *
     */
    private int totalMethods;

    /**
     *
     */
    private String[] arrData;

    //*******Metodos******************/
    public int countMethod(String[] dataList, int n) {

        String[] types = {"static", "String", "double", "float", "boolean","int"};
        int t = 0;
        
        for (int i = 0; i < dataList.length; i++) {

            String string = dataList[i];
            arrData = string.split(" ");

            for (int j = 0; j < arrData.length; j++) {
                if (arrData[j].equals("public") || arrData[j].equals("private")) {
                    for(int k=0;k<arrData.length;k++){
                        if(arrData[k].equals(types[t])){
                            t++;
                            for(int l=0;l<arrData.length;l++){
                                //System.out.print(arrData[l]);
                                if(arrData[k].equals("(") ){
                                    System.out.println("Arr "+arrData[l]);
                                }
                            }
                        }
                    }
                }
            }
        }

        return totalMethods;
    }
}
