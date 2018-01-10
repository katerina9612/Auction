
package mappers;

import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import kursach.model.Lot;
import org.codehaus.jackson.map.ObjectMapper;


public class JsonLotMapper 
{
    public static Lot fromJson(String json)
    {
        try {
            ObjectMapper mapper = new ObjectMapper();
            Lot news =mapper.readValue(json,Lot.class);
            return news;
        } catch (IOException ex) {
            Logger.getLogger(JsonLotMapper.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
 
    
    public static String toJson(Lot news)
    {
        try {
            ObjectMapper mapper = new ObjectMapper();
            String json=mapper.writeValueAsString(news);
            return json;
        } catch (IOException ex) {
            Logger.getLogger(JsonLotMapper.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
        
    }
    
     public static String toJson(List<Lot> lots)
    {
        try {
            ObjectMapper mapper = new ObjectMapper();
            String json=mapper.writeValueAsString(lots);
            return json;
        } catch (IOException ex) {
            Logger.getLogger(JsonLotMapper.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
        
    }
    
}
