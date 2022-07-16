package run;

import test03.Parking;
import test03.Parking_in;

public class User_use implements User{
    private Parking parking;
    private String User_name;

    public User_use(String user_name){
    this.User_name=user_name;
    };

    public void setParking(Parking parking){
        this.parking=parking;
    }

    public void out(){
       parking.out();
    }

}
