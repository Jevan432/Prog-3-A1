import java.util.Comparator;

public class LineCompare implements Comparator<Row>{

    public int compare(Row rowA, Row rowB){
        
        return rowA.getData().compareTo(rowB.getData());
    }
    
}
