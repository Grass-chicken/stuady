package run;

import test03.Parking;
import test03.Parking_in;

public class User_use implements User{
    private Parking parking;

    public void setParking(Parking parking){
        this.parking=parking;
    }

    public void out(){
       parking.out();
    }

}
