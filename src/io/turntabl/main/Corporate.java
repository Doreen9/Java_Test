package io.turntabl.main;

public class Corporate extends Client{
    private String accountManager;

    public Corporate(String clientName, Integer clientID, ServiceLabel label, String accountManager) {
        super(clientName, clientID, label);
        this.accountManager = accountManager;
    }


    @Override
    public String getClientName() {
        return accountManager;
    }

    @Override
    public Integer getClientID() {
        return super.getClientID();
    }

    @Override
    public ServiceLabel getLabel() {
        return super.getLabel();
    }

    @Override
    public String toString() {
        return "Corporate Name: " + getClientName();
    }
}
