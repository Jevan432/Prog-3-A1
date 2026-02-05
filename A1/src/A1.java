import java.io.File;
import java.util.Scanner;

public class A1 {
    
    private String filepath = "A1/res/test.txt";

    public void run() throws Exception {
        
        test(read(this.filepath));
    }
    
    public Table read(String filePath) throws Exception {

        File file = new File(filePath);
        Scanner fileScanner = new Scanner(file);
        int idTracker = 0;
        Table table = new Table();
        
        while (fileScanner.hasNextLine()){
            idTracker++;
            String line = fileScanner.nextLine();
            Row row = new Row(line, idTracker);
            table.add(row);
        }

        fileScanner.close();

        return table;
    }

    public void test(Table table){

        System.out.println("The total number of rows is: "  + table.getSize());
        System.out.println("\n-------------------------------------------\n");

        table.sort(table);
        table.printTable(10);
        System.out.println("\n-------------------------------------------\n");
        
        Table theTable = table.select("the");
        theTable.printTable(10);
    }
}
