package Testing.Connections;

import com.eventuality.controls.*;
import com.eventuality.objects.*;
import java.util.ArrayList;

public class Connetions {
    public static void main(String[] args) {
        try{
            DbConnect db = new DbConnect();
            EventDAO evt = new EventDAO();
            
            ArrayList<Event> arr = new ArrayList();
            
            arr = evt.SelectTable(db.getS());
            db.CloseAll();
            
            for(var i : arr){
                System.out.println(i.toString());
                System.out.println("------------------------------------");
            }
            
        } catch(Exception ex){
            System.out.println("Err" + ex.getMessage());
        }
        
    }
}
