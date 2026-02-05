import java.util.ArrayList;
import java.util.Collections;

public class Table {
    
    private ArrayList<Row> rows;
    private int size;

    public Table(){

        this.rows = new ArrayList<Row>();
        this.size = 0;
    }

    public Table select(String line){

        Table selectTable = new Table();
        for (Row row : this.rows){
            if (row.getData().contains(line)){
                selectTable.add(row);
            }
        }

        return selectTable;
    }

    public int getSize(){
        return this.size;
    }
    public void setSize(int size){
        this.size = size;
    }
    public ArrayList<Row> getRows(){
        return this.rows;
    }
    public void setRows(ArrayList<Row> rows){
        this.rows = rows;
    }

    public void add(Row row){

        this.rows.add(row);
        this.size += 1;
    }

    public void addRow(String data, int id){

        Row row = new Row(data, id);
        this.rows.add(row);
        this.size += 1; 
    }

    public Table sort(Table table){

        ArrayList<Row> list = new ArrayList<Row>();
        LineCompare lineCompare = new LineCompare();
        list = table.getRows();
        Collections.sort(list, lineCompare);
        table.setRows(list);

        return table;
    }

    public void printTable(int r){
        
        if (r == 0){
            for (Row row : this.rows){
                System.out.println(row.toString());
            }
        }
        else if (r > 0 && r <= this.size){
            for (int i = 0; i < r; i++){
                System.out.println(this.rows.get(i).getData());
            }
        }
        else
            System.out.print("You can not enter a number that is negative or larger than table size");
    }
}
