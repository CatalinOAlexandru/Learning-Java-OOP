public class Record
{
   private String ID;
   private int length;

   public static void main(String[] args)
   {
       String[] keyws={"a","violence"};
       System.out.println(new MovieRecord("a",1,"b",keyws).getRating());
   }
   
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