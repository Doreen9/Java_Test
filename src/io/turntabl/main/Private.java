package io.turntabl.main;

public class Private extends Client {
    public Private(String name, Integer id, ServiceLabel label) {
        super(name, id, label);
    }

    @Override
    public String getClientName() {
        return super.getClientName();
    }

    @Override
    public Integer getClientID() {
        return super.getClientID();
    }

    @Override
    public ServiceLabel getLabel() {
        return super.getLabel();
    }
}
