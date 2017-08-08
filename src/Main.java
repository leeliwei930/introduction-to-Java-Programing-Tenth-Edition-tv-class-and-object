public class Main {



    public static void main(String[] args){
        TV tv1 = new TV();
        tv1.turnOn();
        System.out.println((tv1.getTVState())?"TV is On" : "TV is Off");


        tv1.setChannel(69);
        System.out.println("tv1 channel change to : "+ tv1.getChannel());

        tv1.setVolume(22);
        System.out.println("tv1 current volume level is : " + tv1.getVolumeLevel());


        tv1.channelUp();
        System.out.println("tv1 increase the channel by 1");
        System.out.println("tv1 channel change to : "+ tv1.getChannel());

        tv1.channelDown();
        System.out.println("tv1 decrease the channel by 1");
        System.out.println("tv1 channel change to : "+ tv1.getChannel());

        tv1.volumeUp();
        System.out.println("tv1 increase the volume by 1");
        System.out.println("tv1 current volume level is : " + tv1.getVolumeLevel());


        tv1.volumeDown();
        System.out.println("tv1 decrease the volume by 1");
        System.out.println("tv1 current volume level is : " + tv1.getVolumeLevel());


        tv1.turnOff();
        System.out.println((tv1.getTVState())?"TV is On" : "TV is Off");

    }
}
