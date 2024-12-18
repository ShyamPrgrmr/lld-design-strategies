package lld.design.patterns.commanddp;

public interface SoundCommand {
    public void execute(); 
    public void undo(); 
    public void redo(); 
}
