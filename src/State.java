public interface State {
    String getName();
    void handleEntry();
    void handleExit();
    void handleDo();
    public void setCurrentState(State s);
}
