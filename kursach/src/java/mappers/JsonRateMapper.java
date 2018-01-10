
package mappers;

import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import kursach.model.Rate;
import org.codehaus.jackson.map.ObjectMapper;


public class JsonRateMapper 
{
    public static Rate fromJson(String json)
    {
        try {
            ObjectMapper mapper = new ObjectMapper();
            Rate rate =mapper.readValue(json,Rate.class);
            return rate;
        } catch (IOException ex) {
            Logger.getLogger(JsonRateMapper.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
 
    
    public static String toJson(Rate rate)
    {
        try {
            ObjectMapper mapper = new ObjectMapper();
            String json=mapper.writeValueAsString(rate);
            return json;
        } catch (IOException ex) {
            Logger.getLogger(JsonRateMapper.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
        
    }
    
     public static String toJson(List<Rate> categories)
    {
        try {
            ObjectMapper mapper = new ObjectMapper();
            String json=mapper.writeValueAsString(categories);
            return json;
        } catch (IOException ex) {
            Logger.getLogger(JsonRateMapper.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
        
    }
    
}
