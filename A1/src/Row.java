public class Row implements Comparable<Row>{
    
    private String data;
    private int id;

    public Row (String data, int id){

        this.data = data;
        this.id = id;
    }

    public String getData(){
        return this.data;
    }
    public void setData(String data){
        this.data = data;
    }
    public int getId(){
        return this.id;
    }
    public void setId(int id){
        this.id = id;
    }

    public int compareTo(Row other){

        if (this.id == other.getId()){
            return 0;
        }
        else if (this.id > other.getId()){
            return -1;
        }
        else
            return 1;
    }

    public boolean equals(Object other){

        if (other == null){
            return false;
        }
        if (other == this){
            return true;
        }
        Row r = (Row) other;
        
        return this.id == r.getId();
    }

    public String toString(){

        return this.data;
    }

}
