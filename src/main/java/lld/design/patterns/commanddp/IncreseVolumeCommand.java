package lld.design.patterns.commanddp;

public class IncreseVolumeCommand implements SoundCommand{

    private SoundSystem soundSystem; 

    public IncreseVolumeCommand(SoundSystem soundSystem){
        this.soundSystem = soundSystem; 
    }

    @Override
    public void execute() {
        this.soundSystem.increaseVolume();
    }

    @Override
    public void redo() {
        this.soundSystem.increaseVolume();
    }

    @Override
    public void undo() {
        this.soundSystem.decreaseVolume();
    }
    
}
