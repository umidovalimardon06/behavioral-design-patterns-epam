public class LeftClickListener implements IEventListener{
    @Override
    public void OnEvent() {
        var command = new RaiseOneHandCommand();
        command.execute();
    }
}