package Model2a;

/**
 * @author flosant
 */
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
        String inFile = "C:\\Users\\ugflo\\Documents\\NetBeansProjects\\1a\\src\\Model\\Main.java";   
        String outFile = "C:\\Users\\ugflo\\Documents\\NetBeansProjects\\2a\\src\\Model2a\\A.csv";
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
