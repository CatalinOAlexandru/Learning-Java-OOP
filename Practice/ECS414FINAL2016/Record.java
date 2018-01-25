public class Record
{
   private String ID;
   private int length;

   
   public Record(String iid, int len) {
       ID =iid;
       length =len;
    }
    
   public String getID(){
       return ID;      
    }
    
    public int getLength(){
       return length;      
    }

}