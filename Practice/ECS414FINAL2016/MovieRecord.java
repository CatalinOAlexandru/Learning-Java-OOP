
public class MovieRecord extends Record
{
    private String genre;
    private String[] keywords;
    
    public MovieRecord(String iid, int len, String gen, String[] key)
    {
        super(iid, len);
        genre = gen;
        keywords = key;
    }
    
    public int getRating()
    {
        for(int i = 0; i<=keywords.length; i++)
        {
            if(keywords[i].equals("violence")){return 16;}
        }
        return 0;
    }
    
    public String getGenre(){return genre;}
    public String[] getKeywords(){return keywords;}
}
