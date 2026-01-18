public class RightClickEventListener implements IEventListener{
    @Override
    public void OnEvent() {
        ICommand command;

        // if
        command = new RaiseOneHandCommand();

        // else
        command = new RaiseHandsCommand();

        command.execute();

    }
}