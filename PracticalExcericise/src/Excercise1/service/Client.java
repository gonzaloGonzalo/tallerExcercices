package Excercise1.service;

import Excercise1.dao.DeviceUserDAO;
import Excercise1.dao.DeviceUserDAOimpl;
import Excercise1.model.Device;
import Excercise1.model.Status;

/**
 * Created by computer on 22/03/17.
 */
public class Client {

    public static void main(String args[]){

        Service service = new Service();
        System.out.println("SERVICE LIST WITH STATUS "+Status.CONNECTED
                +" \n"+service.getDeviceByStatus(Status.CONNECTED));
        System.out.println("USER LIST"
                +" \n"+service.getDevicesBelongUser(2));

    }
}
