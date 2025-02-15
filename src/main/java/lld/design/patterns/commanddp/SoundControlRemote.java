package lld.design.patterns.commanddp;

import java.util.HashMap;
import java.util.Map;

public class SoundControlRemote {
    
    public static void main(String[] args) {
        Map<Command, SoundCommand> controls = new HashMap<Command, SoundCommand>();     
        SoundSystem soundSystem = new SoundSystem(); 

        controls.put(Command.ON, new TurnOnCommand(soundSystem));
        controls.put(Command.OFF, new TurnOffCommand(soundSystem));
        controls.put(Command.INCRESE, new IncreseVolumeCommand(soundSystem));
        controls.put(Command.DECRESE, new DecreseVolumeCommand(soundSystem)); 
        
        controls.get(Command.ON).execute();
        controls.get(Command.INCRESE).execute();
        controls.get(Command.INCRESE).execute();
        controls.get(Command.INCRESE).undo();
        controls.get(Command.DECRESE).execute();
        controls.get(Command.INCRESE).execute();
        controls.get(Command.INCRESE).undo();
        controls.get(Command.INCRESE).redo();
        controls.get(Command.OFF).execute();
    }
}
