package lld.design.patterns.commanddp;

public class TurnOffCommand implements SoundCommand{

    private SoundSystem soundSystem; 

    public TurnOffCommand(SoundSystem soundSystem){
        this.soundSystem = soundSystem; 
    }

    @Override
    public void execute() {
        this.soundSystem.turOff();       
    }

    @Override
    public void redo() {
        this.soundSystem.turOff();
    }

    @Override
    public void undo() {
        this.soundSystem.turnOn();
    }
        
}
