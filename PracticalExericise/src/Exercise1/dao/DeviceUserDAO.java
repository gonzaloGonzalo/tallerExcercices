package Excercise1.dao;

import Excercise1.model.Device;
import Excercise1.model.User;

import java.util.List;

/**
 * Created by computer on 22/03/17.
 */
public interface DeviceUserDAO {

    public void createDevice(Device device);
    public List<Device> listAllDevices();
    public Device readDevice(int deviceId);
    public void updateDevice(Device device);
    public void deleteDevice(int deviceId);
    public List<User> listAllUsers();
    public User readUser(int userId);
}
