package Excercise1.model;

/**
 * Created by computer on 22/03/17.
 */
public enum Status {
    CONNECTED("Connected"),
    DISCONNECTED("Disconnected"),
    DISABLED("Disabled");

    private final String status;

    Status(String status) {
        this.status = status;
    }

    public String status() {
        return status;
    }

}
