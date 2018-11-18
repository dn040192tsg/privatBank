package HW1011.BD;


import HW1011.PhoneBook.Contact;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class BDPhoneBook {

     public Map map = new HashMap <String, Object > ();


    public void save (){

    }

    public void load (){
        map.put("Vasia Ivanov", new Contact("Vasia Ivanov", new Date(), "Dnepr", new Date(), new String[]{"333", "444"}));
    }

}
