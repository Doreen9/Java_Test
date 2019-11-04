package io.turntabl.main;

public class Client {
    private String clientName;
    private Integer clientID;
    private ServiceLabel label;

    public Client(String clientName, Integer clientID, ServiceLabel label) {
        this.clientName = clientName;
        this.clientID = clientID;
        this.label = label;
    }

    public String getClientName() {
        return clientName;
    }

    public Integer getClientID() {
        return clientID;
    }

    public ServiceLabel getLabel() {
        return label;
    }
}
