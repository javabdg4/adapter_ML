package com.sda.adapter.adapter;

public class SocketObjectAdapterImpl implements SocketAdapter {

    private Socket socket = new Socket();

    public Volt get120Volt() {
        return socket.getVolt();
    }

    public Volt get12Volt() {

        Volt v = socket.getVolt();
        return convertVolt(v, 10);
    }

    public Volt get3Volt() {

        Volt v = socket.getVolt();
        return convertVolt(v, 40);
    }

    public Volt convertVolt(Volt v, int volt) {
        return new Volt(v.getVolts() / volt);
    }
}
