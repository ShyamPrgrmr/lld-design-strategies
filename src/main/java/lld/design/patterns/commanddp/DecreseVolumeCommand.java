package lld.design.patterns.commanddp;

public class DecreseVolumeCommand implements SoundCommand{

    private SoundSystem soundSystem; 

    public DecreseVolumeCommand(SoundSystem soundSystem){
        this.soundSystem = soundSystem; 
    }

    @Override
    public void execute() {
        this.soundSystem.decreaseVolume();
    }

    @Override
    public void redo() {
        this.soundSystem.decreaseVolume();
    }

    @Override
    public void undo() {
        this.soundSystem.increaseVolume();
    }

        
}
