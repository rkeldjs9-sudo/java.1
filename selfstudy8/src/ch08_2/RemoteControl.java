package ch08_2;

public interface RemoteControl {

    public  int MAX_VOLUME = 10;
    public  int MIM_VOLUME = 0;

    public  void turnOn();
    public  void turnOff();
    public  void setVolume(int volume);
}
