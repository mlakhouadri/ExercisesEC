package Exercise2;

public class RadioDevice {

    void receive() {

        RadioMessage message1 = new RadioMessage();

        RadioMessage message2 = new RadioMessage();

        Antenna3G antenna3G = new Antenna3G();
        Antenna5G antenna5G = new Antenna5G();

        if (message1.getFrequency() == antenna3G.getFrequency()) {
            System.out.println(message1.getMessage());
        } else if (message2.getFrequency() == antenna5G.getFrequency()){
            System.out.println(message2.getMessage());
        } else {
            System.out.println("Wrong frequency");
        }


    }

}
