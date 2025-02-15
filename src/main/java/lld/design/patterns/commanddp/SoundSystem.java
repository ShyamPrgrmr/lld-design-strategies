package lld.design.patterns.commanddp;

public class SoundSystem {
    private int sound;
    private boolean isOn; 
    
    public SoundSystem(){
        this.sound = 0; 
        this.isOn = false; 
    }
    public void increaseVolume(){ 
        this.sound++;
        System.out.println("Current sound : "+this.sound); 
    }
    public void decreaseVolume(){ 
        this.sound--;
        System.out.println("Current sound : "+this.sound); 
    }
    public void turnOn(){
        this.isOn = true; 
        System.out.println("Sound system is on ?  : "+this.isOn); 
    }
    public void turOff(){
        this.isOn = false; 
        System.out.println("Sound system is on ?  : "+this.isOn);
    }
}
