package bridge;

public class BridgeDemo {
    public static void main(String[] args) {
        Remote tvRemote = new BasicRemote(new TV());
        tvRemote.togglePower();
        tvRemote.togglePower();

        Remote radioRemote = new BasicRemote(new Radio());
        radioRemote.togglePower();
    }
}
