package lld.design.patterns.commanddp;

public class TurnOnCommand implements SoundCommand{

    private SoundSystem soundSystem; 

    public TurnOnCommand(SoundSystem soundSystem){
        this.soundSystem = soundSystem; 
    }

    @Override
    public void execute() {
        this.soundSystem.turnOn();       
    }

    @Override
    public void redo() {
        this.soundSystem.turnOn();
    }

    @Override
    public void undo() {
        this.soundSystem.turOff();
    }
        
}
