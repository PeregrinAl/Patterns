package Command;
// command interface
public interface ICommand {
    Boolean execute();
    void saveBackup();
    void undo();
    String getName();
}
