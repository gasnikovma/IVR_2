package app.gasnikov.helper;

import java.util.HashMap;
import java.util.Map;

public class User {
    public String fullname,email,blood_type,rh_factor,cd,ar,id;
    public User(){

    }
    public User(String fullname, String email,String blood_type,String rh_factor,String cd,String ar,String id){
        this.blood_type=blood_type;
        this.fullname=fullname;
        this.email=email;
        this.id=id;
        this.rh_factor=rh_factor;
        this.cd=cd;
        this.ar=ar;
    }


    public String getFullname() {
        return fullname;
    }

    public String getId() {
        return id;
    }
}
