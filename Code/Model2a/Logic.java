/******************************************************************/
/* Program Assignment: 2a */
/* Name: Gustavo Flores de los Santos*/
/* Date: Monday 4th april 2022 */
/* Description: Logic class to execute all the classes */
/******************************************************************/
package Model2a;


public class Logic {

    /**
     *
     */
    private int n;

    /**
     *
     */
    private String data;

    /**
     *
     */
    private String[] dataList;

    /**
     *
     */
    private int totalMethods;

    /**
     *
     */
    private int totalLines;

    public void logic2a() {
        String inFile = "C:\\Users\\S0fts4nt!\\Documents\\NetBeansProjects\\1a\\src\\Model\\Main.java"; //reuso de linea 
        String outFile = "C:\\Users\\ugflo\\Documents\\NetBeansProjects\\2a\\src\\Model2a\\A.csv"; //reuso de linea
        Input input = new Input();
        Data myData = new Data();
        LineCounter lineCounter = new LineCounter();
        MethodCounter methodCounter = new MethodCounter();
        //Output out = new Output();
        
        data = input.readData(inFile);
        dataList = myData.saveData(data);
        n = dataList.length;
        totalLines = lineCounter.countLines(dataList,n);
        totalMethods = methodCounter.countMethod(dataList, n);
        System.out.println("Total de metodos: "+totalMethods);
        

        //out.writeData(outpath, "Media: " + media + "\nDesviacion Estandar: " + desv);
    }
}
